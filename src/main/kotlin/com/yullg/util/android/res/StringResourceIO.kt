package com.yullg.util.android.res

import org.springframework.util.xml.TransformerUtils
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun read(file: File): List<StringResource> {
    val result = arrayListOf<StringResource>()
    val documentBuilder = DocumentBuilderFactory.newInstance().apply {
        isIgnoringComments = true
    }.newDocumentBuilder()
    val document = documentBuilder.parse(file)
    val stringNodeList = document.getElementsByTagName("string")
    for (index in 0 until stringNodeList.length) {
        val element = stringNodeList.item(index) as Element
        result.add(
            StringItem(
                element.getAttribute("name").trim(), (element.textContent ?: "").trim()
            )
        )
    }
    val stringArrayNodeList = document.getElementsByTagName("string-array")
    for (index in 0 until stringArrayNodeList.length) {
        val element = stringArrayNodeList.item(index) as Element
        val itemNodeList = element.getElementsByTagName("item")
        val itemValueList = arrayListOf<String>()
        for (itemIndex in 0 until itemNodeList.length) {
            val itemElement = itemNodeList.item(itemIndex) as Element
            itemValueList.add((itemElement.textContent ?: "").trim())
        }
        result.add(
            StringArrayItem(
                element.getAttribute("name").trim(), itemValueList.toTypedArray()
            )
        )
    }
    return result
}

fun write(file: File, stringResourceList: List<StringResource>) {
    val documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    val document = documentBuilder.newDocument()
    val rootElement = document.createElement("resources")
    for (stringResource in stringResourceList) {
        when (stringResource) {
            is StringItem -> {
                val stringElement = document.createElement("string")
                stringElement.setAttribute("name", stringResource.name)
                stringElement.textContent = stringResource.value
                rootElement.appendChild(stringElement)
            }
            is StringArrayItem -> {
                val stringArrayElement = document.createElement("string-array")
                stringArrayElement.setAttribute("name", stringResource.name)
                stringResource.values.forEach {
                    stringArrayElement.appendChild(document.createElement("item").apply {
                        textContent = it
                    })
                }
                rootElement.appendChild(stringArrayElement)
            }
        }
    }
    document.appendChild(rootElement)
    val source = DOMSource(document)
    val target = StreamResult(file)
    TransformerFactory.newInstance().newTransformer().apply {
        TransformerUtils.enableIndenting(this, 4)
        transform(source, target)
    }
}

fun update(file: File, stringResourceList: List<StringResource>) {
    val documentBuilder = DocumentBuilderFactory.newInstance().apply {
        isIgnoringComments = true
        isIgnoringElementContentWhitespace = true
    }.newDocumentBuilder()
    val document = documentBuilder.parse(file)
    val rootElement = document.documentElement
    for (stringResource in stringResourceList) {
        when (stringResource) {
            is StringItem -> {
                val stringElement = document.createElement("string")
                stringElement.setAttribute("name", stringResource.name)
                stringElement.textContent = stringResource.value
                val oldNode = findStringResourceNode(document, stringResource.name)
                if (oldNode != null) {
                    rootElement.replaceChild(stringElement, oldNode)
                } else {
                    rootElement.appendChild(stringElement)
                }
            }
            is StringArrayItem -> {
                val stringArrayElement = document.createElement("string-array")
                stringArrayElement.setAttribute("name", stringResource.name)
                stringResource.values.forEach {
                    stringArrayElement.appendChild(document.createElement("item").apply {
                        textContent = it
                    })
                }
                val oldNode = findStringResourceNode(document, stringResource.name)
                if (oldNode != null) {
                    rootElement.replaceChild(stringArrayElement, oldNode)
                } else {
                    rootElement.appendChild(stringArrayElement)
                }
            }
        }
    }
    val source = DOMSource(document)
    val target = StreamResult(file)
    TransformerFactory.newInstance().newTransformer().apply {
        TransformerUtils.enableIndenting(this, 4)
        transform(source, target)
    }
    // 删除多余的空白行
    val stringBuilder = StringBuilder()
    file.forEachLine {
        if (it.isNotBlank()) {
            stringBuilder.appendLine(it)
        }
    }
    file.writeText(stringBuilder.toString())
}

private fun findStringResourceNode(document: Document, name: String): Node? {
    val stringNodeList = document.getElementsByTagName("string")
    for (index in 0 until stringNodeList.length) {
        val element = stringNodeList.item(index) as Element
        if (name == element.getAttribute("name").trim()) {
            return element
        }
    }
    val stringArrayNodeList = document.getElementsByTagName("string-array")
    for (index in 0 until stringArrayNodeList.length) {
        val element = stringArrayNodeList.item(index) as Element
        if (name == element.getAttribute("name").trim()) {
            return element
        }
    }
    return null
}