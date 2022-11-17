package com.yullg.util.android.boot.hw

import com.yullg.util.android.res.*
import com.yullg.util.excel.ExcelReader
import com.yullg.util.excel.ExcelWriter
import java.io.File
import java.util.*

fun main(args: Array<String>) {
    insertOrUpdatesFromExcel()
    println("------- over ------")
}

/**
 * 单次添加（读取Excel）
 */
private fun insertOrUpdatesFromExcel() =
    ExcelReader(File("C:\\Users\\YU\\Downloads\\iOS翻译(2)(1)(1).xlsx")).use { reader ->
        // 项目模块位置
        val dir = StringResourceDir.APP
        // 字符资源名称
        val name = "app_main_workouts_gps_total_calories"
        // 工作表索引
        val sheetIndex = 0
        // 行索引
        val rowIndex = 567
        // 默认语言
        val defValue = reader.readString(sheetIndex, rowIndex, 3)!!
        // 阿拉伯语
        val arValue = reader.readString(sheetIndex, rowIndex, 8)!!
        // 孟加拉语
        val bnValue = reader.readString(sheetIndex, rowIndex, 14)!!
        // 捷克语
        val csValue = reader.readString(sheetIndex, rowIndex, 12)!!
        // 德语
        val deValue = reader.readString(sheetIndex, rowIndex, 4)!!
        // 西班牙语
        val esValue = reader.readString(sheetIndex, rowIndex, 5)!!
        // 法语
        val frValue = reader.readString(sheetIndex, rowIndex, 6)!!
        // 印地语
        val hiValue = reader.readString(sheetIndex, rowIndex, 9)!!
        // 印度尼西亚语
        val inValue = reader.readString(sheetIndex, rowIndex, 18)!!
        // 意大利语
        val itValue = reader.readString(sheetIndex, rowIndex, 7)!!
        // 波兰语
        val plValue = reader.readString(sheetIndex, rowIndex, 10)!!
        // 葡萄牙语
        val ptValue = reader.readString(sheetIndex, rowIndex, 16)!!
        // 俄语
        val ruValue = reader.readString(sheetIndex, rowIndex, 11)!!
        // 泰语
        val thValue = reader.readString(sheetIndex, rowIndex, 15)!!
        // 土耳其语
        val trValue = reader.readString(sheetIndex, rowIndex, 17)!!
        // 越南语
        val viValue = reader.readString(sheetIndex, rowIndex, 13)!!
        // 简体中文
        val zhValue = reader.readString(sheetIndex, rowIndex, 1)!!
        // 繁体中文
        val zhRHKValue = reader.readString(sheetIndex, rowIndex, 2)!!
        // 高棉语
        val kmValue = reader.readString(sheetIndex, rowIndex, 19)!!
        // 希伯来语
        val iwValue = reader.readString(sheetIndex, rowIndex, 20)!!
        // 波斯语
        val faValue = reader.readString(sheetIndex, rowIndex, 21)!!
        /*-----------------------------------------------------------*/
        insertOrUpdate(dir, StringResourceLanguage.DEF, name, defValue)
        insertOrUpdate(dir, StringResourceLanguage.AR, name, arValue)
        insertOrUpdate(dir, StringResourceLanguage.BN, name, bnValue)
        insertOrUpdate(dir, StringResourceLanguage.CS, name, csValue)
        insertOrUpdate(dir, StringResourceLanguage.DE, name, deValue)
        insertOrUpdate(dir, StringResourceLanguage.ES, name, esValue)
        insertOrUpdate(dir, StringResourceLanguage.FR, name, frValue)
        insertOrUpdate(dir, StringResourceLanguage.HI, name, hiValue)
        insertOrUpdate(dir, StringResourceLanguage.IN, name, inValue)
        insertOrUpdate(dir, StringResourceLanguage.IT, name, itValue)
        insertOrUpdate(dir, StringResourceLanguage.PL, name, plValue)
        insertOrUpdate(dir, StringResourceLanguage.PT, name, ptValue)
        insertOrUpdate(dir, StringResourceLanguage.RU, name, ruValue)
        insertOrUpdate(dir, StringResourceLanguage.TH, name, thValue)
        insertOrUpdate(dir, StringResourceLanguage.TR, name, trValue)
        insertOrUpdate(dir, StringResourceLanguage.VI, name, viValue)
        insertOrUpdate(dir, StringResourceLanguage.ZH, name, zhValue)
        insertOrUpdate(dir, StringResourceLanguage.ZH_RHK, name, zhRHKValue)
        insertOrUpdate(dir, StringResourceLanguage.KM, name, kmValue)
        insertOrUpdate(dir, StringResourceLanguage.IW, name, iwValue)
        insertOrUpdate(dir, StringResourceLanguage.FA, name, faValue)
    }

/**
 * 单次添加（手动复制）
 */
private fun insertOrUpdates() {
    // 项目模块位置
    val dir = StringResourceDir.INTERACTION
    // 字符资源名称
    val name = "name"
    // 默认语言
    val defValue = "defValue&#@"
    // 阿拉伯语
    val arValue = "arValue"
    // 孟加拉语
    val bnValue = "bnValue"
    // 捷克语
    val csValue = "csValue"
    // 德语
    val deValue = "deValue"
    // 西班牙语
    val esValue = "esValue"
    // 法语
    val frValue = "frValue"
    // 印地语
    val hiValue = "hiValue"
    // 印度尼西亚语
    val inValue = "inValue"
    // 意大利语
    val itValue = "itValue"
    // 波兰语
    val plValue = "plValue"
    // 葡萄牙语
    val ptValue = "ptValue"
    // 俄语
    val ruValue = "ruValue"
    // 泰语
    val thValue = "thValue"
    // 土耳其语
    val trValue = "trValue"
    // 越南语
    val viValue = "viValue"
    // 简体中文
    val zhValue = arrayOf("zhValue1", "zhValue2", "zhValue3")
    // 繁体中文
    val zhRHKValue = "zhRHKValue"
    // 高棉语
    val kmValue = "kmValue"
    // 希伯来语
    val iwValue = "iwValue"
    // 波斯语
    val faValue = "faValue"
    /*-----------------------------------------------------------*/
    insertOrUpdate(dir, StringResourceLanguage.DEF, name, defValue)
    insertOrUpdate(dir, StringResourceLanguage.AR, name, arValue)
    insertOrUpdate(dir, StringResourceLanguage.BN, name, bnValue)
    insertOrUpdate(dir, StringResourceLanguage.CS, name, csValue)
    insertOrUpdate(dir, StringResourceLanguage.DE, name, deValue)
    insertOrUpdate(dir, StringResourceLanguage.ES, name, esValue)
    insertOrUpdate(dir, StringResourceLanguage.FR, name, frValue)
    insertOrUpdate(dir, StringResourceLanguage.HI, name, hiValue)
    insertOrUpdate(dir, StringResourceLanguage.IN, name, inValue)
    insertOrUpdate(dir, StringResourceLanguage.IT, name, itValue)
    insertOrUpdate(dir, StringResourceLanguage.PL, name, plValue)
    insertOrUpdate(dir, StringResourceLanguage.PT, name, ptValue)
    insertOrUpdate(dir, StringResourceLanguage.RU, name, ruValue)
    insertOrUpdate(dir, StringResourceLanguage.TH, name, thValue)
    insertOrUpdate(dir, StringResourceLanguage.TR, name, trValue)
    insertOrUpdate(dir, StringResourceLanguage.VI, name, viValue)
    insertOrUpdate(dir, StringResourceLanguage.ZH, name, zhValue)
    insertOrUpdate(dir, StringResourceLanguage.ZH_RHK, name, zhRHKValue)
    insertOrUpdate(dir, StringResourceLanguage.KM, name, kmValue)
    insertOrUpdate(dir, StringResourceLanguage.IW, name, iwValue)
    insertOrUpdate(dir, StringResourceLanguage.FA, name, faValue)
}

/**
 * 从Excel导入
 */
private fun importFromExcel() = ExcelReader(File("E:\\Android翻译-翻译.xlsx")).use { reader ->
    // 导入的模块
    val dir = StringResourceDir.APP_UFIT
    // 导入的语言
    val lan = StringResourceLanguage.FA
    // 导入基于的参考语言
    val baseLan = StringResourceLanguage.DEF
    // 工作表索引
    val sheetIndex = 3
    // name列索引
    val nameColumnIndex = 0
    // value列索引
    val valueColumnIndex = 5
    /*--------------------------实现层分隔线--------------------------*/
    val firstRowNum = reader.getFirstRowNum(sheetIndex)
    val lastRowNum = reader.getLastRowNum(sheetIndex)
    if (firstRowNum < 0 || lastRowNum < 0 || firstRowNum > lastRowNum) throw IllegalArgumentException()
    val baseData = read(baseLan, getStringResourceFile(dir, baseLan))
    val data = arrayListOf<StringResource>()
    for (baseStringResource in baseData) {
        if (baseStringResource is ArrayStringResource) {
            val values = arrayListOf<String>()
            for (baseValueIndex in 0 until baseStringResource.values.size) {
                for (rowNum in firstRowNum..lastRowNum) {
                    val name = reader.readString(sheetIndex, rowNum, nameColumnIndex)
                    if ("${baseStringResource.name}#$baseValueIndex" == name) {
                        values.add(reader.readString(sheetIndex, rowNum, valueColumnIndex)!!)// 数组元素不接受NULL值
                        break
                    }
                }
            }
            if (baseStringResource.values.size != values.size) throw IllegalArgumentException()
            data.add(ArrayStringResource(lan, baseStringResource.name, values.toTypedArray()))
        } else {
            for (rowNum in firstRowNum..lastRowNum) {
                val name = reader.readString(sheetIndex, rowNum, nameColumnIndex)
                if (name == baseStringResource.name) {
                    val value = reader.readString(sheetIndex, rowNum, valueColumnIndex)
                    if (value != null) {
                        data.add(SimpleStringResource(lan, name, value))
                    } else {
                        data.add(NoneStringResource(lan, name))
                    }
                    break
                }
            }
        }
    }
    write(getStringResourceFile(dir, lan), data)
}

/**
 * 导出到Excel
 */
private fun exportToExcel() {
    // 导出文件位置
    val excelFile = File("E:\\Android翻译.xlsx")
    // 需要导出的模块
    val dirArr = arrayOf(
        StringResourceDir.SERVICE,
        StringResourceDir.INTERACTION,
        StringResourceDir.APP,
        StringResourceDir.APP_UFIT
    )
    // 需要导出的语言
    val lanArr = arrayOf(
        StringResourceLanguage.DEF,
        StringResourceLanguage.ZH
    )
    // 准备数据
    val data = arrayListOf<Pair<StringResourceDir, List<List<StringResource>>>>()
    dirArr.forEach { dir ->
        val lanAndFilePairList = mutableListOf<Pair<StringResourceLanguage, File>>()
        lanArr.forEach { lan ->
            lanAndFilePairList.add(Pair(lan, getStringResourceFile(dir, lan)))
        }
        data.add(Pair(dir, reads(lanAndFilePairList)))
    }
    // 开始导出
    ExcelWriter(excelFile).use { writer ->
        for ((dirAndStringResourceListListPairIndex, dirAndStringResourceListListPair) in data.withIndex()) {
            // 为每个导出模块创建一个工作表
            writer.createSheet(dirAndStringResourceListListPair.first.name)
            // 在工作表中创建表头
            writer.addData(dirAndStringResourceListListPairIndex, 0, 0, "NAME")
            lanArr.forEachIndexed { index, stringResourceLanguage ->
                writer.addData(dirAndStringResourceListListPairIndex, 0, index + 1, stringResourceLanguage.name)
            }
            // 在工作表中填充数据
            val excelData = generateExcelDataForExport(dirAndStringResourceListListPair.second)
            for ((rowIndex, rowData) in excelData.withIndex()) {
                for ((columnIndex, columnData) in rowData.withIndex()) {
                    writer.addData(dirAndStringResourceListListPairIndex, rowIndex + 1, columnIndex, columnData)
                }
            }
        }
        // 写到文件
        writer.write()
    }
}

/*
 * 嵌套List模拟二维表数据，通常情况下每个表格对应一个Excel单元格，特殊情况下一个表格对应多个分布在不同行的单元格；
 * 若一行的第一列是一对多关系，那么剩余列也必须是一对多关系，且对应的数量应保持一致；产生适用于Excel的二维数据。
 * 将在每一行的第一列放置name属性。
 */
private fun generateExcelDataForExport(stringResourceListList: List<List<StringResource>>): List<List<String?>> {
    val result = arrayListOf<List<String?>>()
    if (stringResourceListList.isNotEmpty()) {
        // 使用第一行的列数校验后续所有行都有相同数量的列
        val firstColumnCount = stringResourceListList.first().size
        for (stringResourceList in stringResourceListList) {
            // 校验这一行的列数和第一行相等
            if (firstColumnCount != stringResourceList.size) throw IllegalArgumentException()
            if (stringResourceList.first() is ArrayStringResource) {
                // 如果这一行的第一列是一对多关系，那么假设后续所有列都是一对多关系，将产生多个结果行
                // 1：分解这一行的所有列数据，产生一个二维列表，一维表示原始列，二维表示每个原始列分解出来的行
                val rowOriginData = arrayListOf<List<SimpleStringResource>>()
                for (stringResource in stringResourceList) {
                    rowOriginData.add((stringResource as ArrayStringResource).toSimpleStringResourceArray())
                }
                // 2：将二维列表转换成Excel二维数据，假设所有第二维度中具有相同数量的数据
                for (rowIndex in 0 until rowOriginData.first().size) {
                    val rowData = arrayListOf<String?>(rowOriginData.first()[rowIndex].name)
                    for (columnIndex in 0 until rowOriginData.size) {
                        rowData.add(rowOriginData[columnIndex][rowIndex].value)
                    }
                    result.add(rowData)
                }
            } else {
                // 如果这一行的第一列不是一对多关系，那么假设后续所有列都不是一对多关系，将仅产生一个结果行
                val rowData = arrayListOf<String?>(stringResourceList.first().name)
                for (stringResource in stringResourceList) {
                    when (stringResource) {
                        is SimpleStringResource -> rowData.add(stringResource.value)
                        else -> rowData.add(null)
                    }
                }
                result.add(rowData)
            }
        }
    }
    return result
}

private fun insertOrUpdate(dir: StringResourceDir, lan: StringResourceLanguage, name: String, value: String) {
    val file = getStringResourceFile(dir, lan)
    update(file, Collections.singletonList(SimpleStringResource(lan, name, value)))
}

private fun insertOrUpdate(dir: StringResourceDir, lan: StringResourceLanguage, name: String, values: Array<String>) {
    val file = getStringResourceFile(dir, lan)
    update(file, Collections.singletonList(ArrayStringResource(lan, name, values)))
}

private fun getStringResourceFile(dir: StringResourceDir, lan: StringResourceLanguage): File {
    val suffix = if (null == lan.code) "" else "-${lan.code}"
    return File(dir.file, "values$suffix\\strings.xml")
}

enum class StringResourceDir(val file: File) {
    SERVICE(File("D:\\Workspace\\huawo\\android\\hawofit\\module-service\\src\\main\\res")),
    INTERACTION(File("D:\\Workspace\\huawo\\android\\hawofit\\module-interaction\\src\\main\\res")),
    APP(File("D:\\Workspace\\huawo\\android\\hawofit\\app\\src\\main\\res")),
    APP_UFIT(File("D:\\Workspace\\huawo\\android\\hawofit\\app-ufit\\src\\main\\res"))
}