package com.yullg.util.android.boot.hw

import java.io.File

fun main(args: Array<String>) {
    val resourceDirectory = ResourceDirectory.SERVICE
    val fromPath = "C:\\Users\\YU\\Downloads\\Navigation-icon_slices"
    val fromName = "Navigation-icon.png"
    val toName = "service_map_my_location_icon.png"
    for (entry in directoryMap) {
        val fromFile = File(File(fromPath, entry.key), fromName)
        val toFile = File(File(resourceDirectory.file, entry.value), toName)
        toFile.parentFile?.mkdirs()
        println("$fromFile >>> $toFile >>> ${fromFile.renameTo(toFile)}")
    }
    println("------- over ------")
}

private val directoryMap = mapOf(
    "mipmap-mdpi" to "drawable-mdpi",
    "mipmap-hdpi" to "drawable-hdpi",
    "mipmap-xhdpi" to "drawable-xhdpi",
    "mipmap-xxhdpi" to "drawable-xxhdpi",
    "mipmap-xxxhdpi" to "drawable-xxxhdpi"
)