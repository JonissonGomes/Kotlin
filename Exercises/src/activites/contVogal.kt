package activites

fun contVogal(str: String) : Int{
    val vogais = "aeiou"
    var totalVogais = 0

    for (letter in str){
        if (letter.toLowerCase() in vogais){
            totalVogais++
        }
    }
    return totalVogais
}

fun contConsoantes(str: String) : Int{
    val consoantes = "bcdfghjklmnpqrstvxz"
    var totalConsoantes = 0

    for (letter in str){
        if (letter.toLowerCase() in consoantes){
            totalConsoantes++
        }
    }
    return totalConsoantes
}