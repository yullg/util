package com.yullg.util.excel

import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.DateUtil
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.File

class ExcelReader(private val file: File) : AutoCloseable {

    private val workbook: Workbook

    init {
        this.workbook = WorkbookFactory.create(file, null, true)
    }

    fun readString(sheetIndex: Int, rowIndex: Int, cellIndex: Int): String {
        val cell = workbook.getSheetAt(sheetIndex).getRow(rowIndex).getCell(cellIndex)
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