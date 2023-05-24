import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numOfWords = sc.nextInt()
    val listOfWords: MutableList<String> = mutableListOf<String>()
    for (i in 0 until numOfWords) {
        val word = sc.next()
        listOfWords.add(word)
    }
    wayTooLongWord(listOfWords)
}


fun wayTooLongWord(input: MutableList<String>) {
    val output = input.map { word ->
        val wordLength = word.length
        val firstLetter = word.substring(0, 1)
        val lastLetter = word.substring(wordLength - 1, wordLength)
        if (wordLength > 10)
            firstLetter + (wordLength - 2) + lastLetter else word
    }
    println(output.joinToString("\n"))
}
