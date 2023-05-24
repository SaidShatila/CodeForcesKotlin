import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    val n = sc.nextInt()
    println(dominoPiling(m, n))
}

fun dominoPiling(m: Int, n: Int): Int = (m * n).floorDiv(2)