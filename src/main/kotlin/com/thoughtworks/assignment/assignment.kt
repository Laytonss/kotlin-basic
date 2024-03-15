package com.thoughtworks.assignment


fun convertToString(numm: Int): String {
    var num = numm
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