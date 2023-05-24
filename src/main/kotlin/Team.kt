import java.util.*
import kotlin.collections.HashMap

fun main() {
    val sc = Scanner(System.`in`)
    val numberOfProblems = sc.nextInt()
    println(team(fillTheMap(numberOfProblems, scanner = sc)))

}

fun fillTheMap(numberOfProblems: Int, scanner: Scanner): HashMap<Int, MutableList<Int>> {
    val mapOfListProblems = hashMapOf<Int, MutableList<Int>>()
    val listOfSolution = generateSequence {
        scanner.nextInt()
    }.take(numberOfProblems * 3).toList()

    listOfSolution.chunked(3).forEachIndexed { index, ints ->
        mapOfListProblems[index] = ints.toMutableList()
    }

    return mapOfListProblems

}


fun team(mapOfValues: HashMap<Int, MutableList<Int>>): Int {
    var numberOfAcceptedSolution = 0

    mapOfValues.forEach { map ->
        numberOfAcceptedSolution =
            if (map.value.count { it == 1 } >= 2) numberOfAcceptedSolution.inc() else numberOfAcceptedSolution

    }
    return numberOfAcceptedSolution
}

