package com.yullg.util.android.boot.hw

import java.io.File

enum class ResourceDirectory(val file: File) {
    SERVICE(File("D:\\Workspace\\huawo\\android\\hawofit\\module-service\\src\\main\\res")),
    INTERACTION(File("D:\\Workspace\\huawo\\android\\hawofit\\module-interaction\\src\\main\\res")),
    APP(File("D:\\Workspace\\huawo\\android\\hawofit\\app\\src\\main\\res")),
    APP_UFIT(File("D:\\Workspace\\huawo\\android\\hawofit\\app-ufit\\src\\main\\res"))
}