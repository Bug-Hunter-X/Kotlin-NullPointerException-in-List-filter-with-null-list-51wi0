```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size) // This will print 2

    val emptyList = emptyList<Int>()
    val evenNumbersInEmptyList = emptyList.filter { it % 2 == 0 }
    println(evenNumbersInEmptyList.size) // This will print 0, as expected

    val nullList: List<Int>? = null
    val evenNumbersInNullList = nullList?.filter { it % 2 == 0 } ?: emptyList()
    println(evenNumbersInNullList.size) // This will throw NullPointerException
}
```