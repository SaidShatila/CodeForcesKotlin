import java.util.*
import kotlin.collections.HashSet

fun main() {
    val sc = Scanner(System.`in`)
    val numberOfParticipants = sc.nextInt()
    val numberOfMinScore = sc.nextInt()
    println(whoQualified(numberOfParticipants, numberOfMinScore, sc))
}

fun whoQualified(numOfPart: Int, numOfMinScore: Int, scanner: Scanner): Int {
    var numOfQualified = 0
    val countSameScore: MutableList<Int> = mutableListOf()
    for (i in 0 until numOfPart) {
        val score = scanner.nextInt()
        if (score > numOfMinScore) numOfQualified += 1
        countSameScore.add(score)
    }
    val countOfPartcip = countSameScore.count { it == numOfMinScore }
    val sameScore = countSameScore.count { it == countSameScore.iterator().next() }
    val areTheyInSequence = countSameScore.sort()
    val firstValue = countSameScore.max()
    if (countOfPartcip == numOfPart || sameScore == numOfPart && numOfPart == numOfMinScore /*|| areTheyInSequence*/) numOfQualified =
        numOfPart

    return numOfQualified
}
