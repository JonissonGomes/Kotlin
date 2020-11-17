package activites

import kotlin.text.StringBuilder

fun reverseUsingSB(string: String): String {
    return StringBuilder(string).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var frase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
        frase.append(str[i])
        i--
    }
    return frase.toString()
}