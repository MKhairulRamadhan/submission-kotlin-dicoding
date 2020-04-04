fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for second letter")
}

// TODO 1
fun String.getFirstAndLast(): Map<String, Char>{
    var first = this.first()
    var last = this.last()
    return mapOf("first" to first, "last" to last)
}