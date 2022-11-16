package com.yullg.util.android.boot.hw

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.yullg.util.excel.ExcelReader
import java.io.File

fun main(args: Array<String>) {
    importFromExcel()
    println("------- over ------")
}

private fun importFromExcel() = ExcelReader(File("E:\\世界时钟.xlsx")).use { reader ->
    val jsonFile = File("D:\\Workspace\\huawo\\android\\hawofit\\module-service\\src\\main\\assets\\timezones.json")
    val languageName = "fa"
    val baseLanguageName = "en"
    val sheetIndex = 0
    val identifyColumnIndex = 0
    val nameColumnIndex = 3
    val firstRowNum = reader.getFirstRowNum(sheetIndex)
    val lastRowNum = reader.getLastRowNum(sheetIndex)
    val json = Gson().fromJson(jsonFile.readText(), JsonObject::class.java)
    val jsonArray = JsonArray()
    json.getAsJsonArray(baseLanguageName).forEach { baseJsonElement ->
        val baseIdentify = baseJsonElement.asJsonObject.get("identify").asString
        for (rowNum in firstRowNum..lastRowNum) {
            val identify = reader.readString(sheetIndex, rowNum, identifyColumnIndex)
            if (identify != null && baseIdentify == identify) {
                val name = reader.readString(sheetIndex, rowNum, nameColumnIndex)!!
                jsonArray.add(JsonObject().apply {
                    addProperty("identify", identify)
                    addProperty("name", name)
                })
                break
            }
        }
    }
    if (jsonArray.size() != json.getAsJsonArray(baseLanguageName).size()) throw IllegalArgumentException()
    json.add(languageName, jsonArray)
    val jsonText = GsonBuilder().apply {
        setPrettyPrinting()
    }.create().toJson(json)
    jsonFile.writeText(jsonText)
}