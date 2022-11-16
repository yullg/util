package com.yullg.util.android.res

sealed interface StringResource {
    val language: StringResourceLanguage
    val name: String
}

data class NoneStringResource(
    override val language: StringResourceLanguage,
    override val name: String
) : StringResource

data class SimpleStringResource(
    override val language: StringResourceLanguage,
    override val name: String,
    val value: String
) : StringResource

data class ArrayStringResource(
    override val language: StringResourceLanguage,
    override val name: String,
    val values: Array<String>
) : StringResource {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArrayStringResource

        if (language != other.language) return false
        if (name != other.name) return false
        if (!values.contentEquals(other.values)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = language.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + values.contentHashCode()
        return result
    }

}

fun ArrayStringResource.toSimpleStringResourceArray(): List<SimpleStringResource> {
    val result = arrayListOf<SimpleStringResource>()
    for ((index, value) in values.withIndex()) {
        result.add(SimpleStringResource(language, "$name#$index", value))
    }
    return result
}