import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numberOfOperations = sc.nextInt()
    val list = generateSequence {
        sc.next()
    }.take(numberOfOperations).toList()

    val stack = Stack<String>()
    list.forEach {
        stack.push(it)
    }

    println(bitPlusPlus(stack))
}

fun bitPlusPlus(stack: Stack<String>): Int {
    var initialValue = 0
    stack.forEach {
        when {
            it.contains("X++") || it.contains("++X") -> initialValue += 1
            it.contains("--X") || it.contains("X--") -> initialValue -= 1
            else ->{}
        }
    }
    return initialValue
}
