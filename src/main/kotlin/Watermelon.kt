import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val weight = sc.nextInt()
    println(watermelon(weight))
}

fun watermelon(weight: Int): String {
    return if (weight >= 4 && weight % 2 == 0) "YES" else "NO"
}


