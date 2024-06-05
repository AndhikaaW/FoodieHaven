package com.example.foodiehaven

import android.content.ContentValues
import android.content.Context
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import com.example.foodiehaven.database.Historydb
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

fun exportToExcel(context: Context, historyList: List<Historydb>): Boolean {
    return try {
        val workbook = XSSFWorkbook()
        val sheet = workbook.createSheet("History Data")

        val headerRow = sheet.createRow(0)
        headerRow.createCell(0).setCellValue("ID")
        headerRow.createCell(1).setCellValue("Nama Pelanggan")
        headerRow.createCell(2).setCellValue("Tanggal Pesan")
        headerRow.createCell(3).setCellValue("Alamat Pelanggan")
        headerRow.createCell(4).setCellValue("No Telp Pelanggan")

        historyList.forEachIndexed { index, history ->
            val row = sheet.createRow(index + 1)
            row.createCell(0).setCellValue(history.id.toString())
            row.createCell(1).setCellValue(history.namaPelanggan)
            row.createCell(2).setCellValue(history.tanggalPesan)
            row.createCell(3).setCellValue(history.alamatPelanggan)
            row.createCell(4).setCellValue(history.noTelpPelanggan)
        }

        val fileName = "HistoryDataCatering.xlsx"
        val outputStream = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            getOutputStreamForAndroid10AndAbove(context, fileName)
        } else {
            getOutputStreamForAndroid9AndBelow(context, fileName)
        }

        outputStream?.use {
            workbook.write(it)
            workbook.close()
            true
        } ?: false
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }
}


private fun getOutputStreamForAndroid10AndAbove(context: Context, fileName: String): OutputStream? {
    return try {
        val resolver = context.contentResolver
        val contentValues = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
            put(MediaStore.MediaColumns.MIME_TYPE, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
            put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOCUMENTS)
        }
        val uri = resolver.insert(MediaStore.Files.getContentUri("external"), contentValues)
        resolver.openOutputStream(uri!!)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

private fun getOutputStreamForAndroid9AndBelow(context: Context, fileName: String): OutputStream? {
    return try {
        val filePath = File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), fileName)
        FileOutputStream(filePath)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}