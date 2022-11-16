package com.yullg.util.excel

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileOutputStream

class ExcelWriter(private val file: File) : AutoCloseable {

    private val workbook: Workbook = XSSFWorkbook()

    fun createSheet(sheetName: String) {
        workbook.createSheet(sheetName)
    }

    fun addData(sheetIndex: Int, rowIndex: Int, columnIndex: Int, value: String?) {
        getOrCreateCell(sheetIndex, rowIndex, columnIndex).setCellValue(value)
    }

    fun write() {
        FileOutputStream(file).use {
            workbook.write(it)
        }
    }

    override fun close() {
        workbook.close()
    }

    private fun getOrCreateCell(sheetIndex: Int, rowIndex: Int, columnIndex: Int): Cell {
        val sheet = workbook.getSheetAt(sheetIndex)
        val row = sheet.getRow(rowIndex) ?: sheet.createRow(rowIndex)
        return row.getCell(columnIndex) ?: row.createCell(columnIndex)
    }

}