package com.yullg.util.excel

import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.DateUtil
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.File

class ExcelReader(private val file: File) : AutoCloseable {

    private val workbook: Workbook = WorkbookFactory.create(file, null, true)

    fun getFirstRowNum(sheetIndex: Int): Int {
        return workbook.getSheetAt(sheetIndex).firstRowNum
    }

    fun getLastRowNum(sheetIndex: Int): Int {
        return workbook.getSheetAt(sheetIndex).lastRowNum
    }

    fun readString(sheetIndex: Int, rowIndex: Int, columnIndex: Int): String? {
        val cell = workbook.getSheetAt(sheetIndex).getRow(rowIndex)?.getCell(columnIndex) ?: return null
        return when (cell.cellType) {
            CellType.BOOLEAN -> cell.booleanCellValue.toString()
            CellType.NUMERIC -> if (DateUtil.isCellDateFormatted(cell)) {
                cell.dateCellValue.toLocaleString()
            } else {
                cell.numericCellValue.toString()
            }
            else -> cell.stringCellValue
        }
    }

    override fun close() {
        workbook.close()
    }

}