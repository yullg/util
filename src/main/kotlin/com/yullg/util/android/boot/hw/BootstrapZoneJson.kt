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

private fun importFromExcel() =
    ExcelReader(File("D:\\workspace\\huawo\\多语言翻译\\世界时钟（高棉语，希伯来语，波斯语）.xlsx")).use { reader ->
        val jsonFile = File("D:\\workspace\\huawo\\多语言翻译\\timezones.json")
        val languageName = "fa"
        val sheetIndex = 0
        val identifyColumnIndex = 0
        val nameColumnIndex = 3
        val firstRowNum = 1
        val lastRowNum = 558
        val json = Gson().fromJson(jsonFile.readText(), JsonObject::class.java)
        val jsonArray = JsonArray()
        for (rowNum in firstRowNum..lastRowNum) {
            val identify = reader.readString(sheetIndex, rowNum, identifyColumnIndex)!!
            val name = reader.readString(sheetIndex, rowNum, nameColumnIndex)!!
            jsonArray.add(JsonObject().apply {
                addProperty("identify", identify)
                addProperty("name", name)
            })
        }
        json.add(languageName, jsonArray)
        val jsonText = GsonBuilder().apply {
            setPrettyPrinting()
        }.create().toJson(json)
        jsonFile.writeText(jsonText)
    }