package com.yullg.util.android.boot.hw

import com.yullg.util.android.res.StringArrayItem
import com.yullg.util.android.res.StringItem
import com.yullg.util.android.res.update
import com.yullg.util.excel.ExcelReader
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
    ExcelReader(File("D:\\Workspace\\huawo\\other\\translate\\IOS多语言翻译.xlsx")).use { reader ->
        // 项目模块位置
        val dir = StringResourceDir.INTERACTION
        // 字符资源名称
        val name = "name"
        // 工作表索引
        val sheetIndex = 0
        // 行索引
        val rowIndex = 1
        // 默认语言
        val defValue = reader.readString(sheetIndex, rowIndex, 0)
        // 阿拉伯语
        val arValue = reader.readString(sheetIndex, rowIndex, 1)
        // 孟加拉语
        val bnValue = reader.readString(sheetIndex, rowIndex, 2)
        // 捷克语
        val csValue = reader.readString(sheetIndex, rowIndex, 3)
        // 德语
        val deValue = reader.readString(sheetIndex, rowIndex, 4)
        // 西班牙语
        val esValue = reader.readString(sheetIndex, rowIndex, 5)
        // 法语
        val frValue = reader.readString(sheetIndex, rowIndex, 6)
        // 印地语
        val hiValue = reader.readString(sheetIndex, rowIndex, 7)
        // 印度尼西亚语
        val inValue = reader.readString(sheetIndex, rowIndex, 8)
        // 意大利语
        val itValue = reader.readString(sheetIndex, rowIndex, 9)
        // 韩语
        val koValue = reader.readString(sheetIndex, rowIndex, 10)
        // 波兰语
        val plValue = reader.readString(sheetIndex, rowIndex, 11)
        // 葡萄牙语
        val ptValue = reader.readString(sheetIndex, rowIndex, 12)
        // 俄语
        val ruValue = reader.readString(sheetIndex, rowIndex, 13)
        // 泰语
        val thValue = reader.readString(sheetIndex, rowIndex, 14)
        // 土耳其语
        val trValue = reader.readString(sheetIndex, rowIndex, 15)
        // 越南语
        val viValue = reader.readString(sheetIndex, rowIndex, 16)
        // 简体中文
        val zhValue = reader.readString(sheetIndex, rowIndex, 17)
        // 繁体中文
        val zhRHKValue = reader.readString(sheetIndex, rowIndex, 18)
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
        insertOrUpdate(dir, StringResourceLanguage.KO, name, koValue)
        insertOrUpdate(dir, StringResourceLanguage.PL, name, plValue)
        insertOrUpdate(dir, StringResourceLanguage.PT, name, ptValue)
        insertOrUpdate(dir, StringResourceLanguage.RU, name, ruValue)
        insertOrUpdate(dir, StringResourceLanguage.TH, name, thValue)
        insertOrUpdate(dir, StringResourceLanguage.TR, name, trValue)
        insertOrUpdate(dir, StringResourceLanguage.VI, name, viValue)
        insertOrUpdate(dir, StringResourceLanguage.ZH, name, zhValue)
        insertOrUpdate(dir, StringResourceLanguage.ZH_RHK, name, zhRHKValue)
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
    // 韩语
    val koValue = "koValue"
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
    insertOrUpdate(dir, StringResourceLanguage.KO, name, koValue)
    insertOrUpdate(dir, StringResourceLanguage.PL, name, plValue)
    insertOrUpdate(dir, StringResourceLanguage.PT, name, ptValue)
    insertOrUpdate(dir, StringResourceLanguage.RU, name, ruValue)
    insertOrUpdate(dir, StringResourceLanguage.TH, name, thValue)
    insertOrUpdate(dir, StringResourceLanguage.TR, name, trValue)
    insertOrUpdate(dir, StringResourceLanguage.VI, name, viValue)
    insertOrUpdate(dir, StringResourceLanguage.ZH, name, zhValue)
    insertOrUpdate(dir, StringResourceLanguage.ZH_RHK, name, zhRHKValue)
}

/*------------------------------------------以下为实现层代码-----------------------------------------------------------*/

private fun insertOrUpdate(dir: StringResourceDir, lan: StringResourceLanguage, name: String, value: String) {
    val suffix = if (null == lan.code) "" else "-${lan.code}"
    val file = File(dir.file, "values$suffix\\strings.xml")
    update(file, Collections.singletonList(StringItem(name, value)))
}

private fun insertOrUpdate(dir: StringResourceDir, lan: StringResourceLanguage, name: String, values: Array<String>) {
    val suffix = if (null == lan.code) "" else "-${lan.code}"
    val file = File(dir.file, "values$suffix\\strings.xml")
    update(file, Collections.singletonList(StringArrayItem(name, values)))
}

enum class StringResourceDir(val file: File) {
    SERVICE(File("D:\\Workspace\\huawo\\android\\hawofit\\module-service\\src\\main\\res")),
    INTERACTION(File("D:\\Workspace\\huawo\\android\\hawofit\\module-interaction\\src\\main\\res")),
    APP(File("D:\\Workspace\\huawo\\android\\hawofit\\app\\src\\main\\res")),
    APP_UFIT(File("D:\\Workspace\\huawo\\android\\hawofit\\app-ufit\\src\\main\\res"))
}

enum class StringResourceLanguage(val code: String?) {
    /**
     * 默认语言
     */
    DEF(null),

    /**
     * 阿拉伯语
     */
    AR("ar"),

    /**
     * 孟加拉语
     */
    BN("bn"),

    /**
     * 捷克语
     */
    CS("cs"),

    /**
     * 德语
     */
    DE("de"),

    /**
     * 西班牙语
     */
    ES("es"),

    /**
     * 法语
     */
    FR("fr"),

    /**
     * 印地语
     */
    HI("hi"),

    /**
     * 印度尼西亚语
     */
    IN("in"),

    /**
     * 意大利语
     */
    IT("it"),

    /**
     * 韩语
     */
    KO("ko"),

    /**
     * 波兰语
     */
    PL("pl"),

    /**
     * 葡萄牙语
     */
    PT("pt"),

    /**
     * 俄语
     */
    RU("ru"),

    /**
     * 泰语
     */
    TH("th"),

    /**
     * 土耳其语
     */
    TR("tr"),

    /**
     * 越南语
     */
    VI("vi"),

    /**
     * 简体中文
     */
    ZH("zh"),

    /**
     * 繁体中文
     */
    ZH_RHK("zh-rHK")
}