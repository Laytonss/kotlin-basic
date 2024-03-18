package com.thoughtworks.assignment


private const val ZZZ_NUMBER = 18278
private const val ERROR_MESSAGE = "生成序列超过ZZZ"

fun convertToString(givenNumber: Int): String {
    if (givenNumber > ZZZ_NUMBER) throw RuntimeException(ERROR_MESSAGE)
    var num = givenNumber
    val stringBuilder = StringBuilder()
    while (num > 0) {
        num--
        val remainder = num % 26
        stringBuilder.append((remainder + 65).toChar())
        num /= 26
    }
    return stringBuilder.reverse().toString()
}

fun getSequenceList(startNums: Int, resNums: Int): List<String> {
    val resList = ArrayList<String>()
    for (i in startNums..<startNums + resNums) {
        resList.add(convertToString(i))
    }
    return resList
}