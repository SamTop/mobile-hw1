import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>) {
    ex1()
    ex2()
    ex3()
    ex4(-1)
    ex4(4)
    ex4(0)
    ex5()
    ex6(4f, 5f)
    ex7()
    ex8()
    ex9()
    ex10()
}

fun ex1() {
    println("---------------------------------------------------")
    println("Exercise 1")
    var arr: Array<Int> = emptyArray()
    for (i in 0..10)
        arr += i
    println("Contents of Array:")
    for (n in arr)
        print("$n ")
    println()

    val list: MutableList<Int> = mutableListOf()
    for (i in 0..10)
        list += i
    println("Contents of List:")
    for (n in list)
        print("$n ")
    println()
}

fun ex2() {
    println("---------------------------------------------------")
    println("Exercise 2")
    var s = ""
    s += "Test"
    s = s.uppercase(Locale.getDefault())
    s += s
    s.substring(3..5)
    println("Modified string: $s")
}

fun ex3() {
    println("---------------------------------------------------")
    println("Exercise 3")
    val m: Map<Int, String> = mapOf(
        0 to "MON",
        1 to "TUE",
        2 to "WED",
        3 to "THU",
        4 to "FRI",
        5 to "SAT",
        6 to "SUN",
    )

    m.forEach {
        entry -> println(entry.key.toString() + " -> " + entry.value)
    }
}

fun ex4(num: Int) {
    println("---------------------------------------------------")
    println("Exercise 4")
    var s = ""
    s = if (num == 0)
        "zero"
    else if (num > 0)
        "positive"
    else
        "negative"
    println("$num is $s")
}

fun ex5() {
    println("---------------------------------------------------")
    println("Exercise 5")

    val reader = Scanner(System.`in`)
    print("Enter name: ")
    val name: String = reader.nextLine()
    print("Enter age: ")
    val age = reader.nextInt()

    if (age < 0)
        println("See ya in future $name")
    else if (age < 20)
        println("Hi there $name")
    else if (age < 50)
        println("Hello dear $name")
    else
        println("Greetings $name")
}

fun ex6(divident: Float, divisor: Float) {
    println("---------------------------------------------------")
    println("Exercise 6")

    if (divisor == 0f)
        println("Cannot divide by 0")
    else
        println("$divident / $divisor = " + (divident / divisor))
}

fun ex7() {
    println("---------------------------------------------------")
    println("Exercise 7")

    val current = LocalDateTime.now()

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current.format(formatter)

    println("Current Date and Time is: $formatted")
}

open class Person(n: String, a: Int) {
    val name: String
    val age: Int

    init {
        name = n
        age = a
    }
}

fun ex8() {
    println("---------------------------------------------------")
    println("Exercise 8")

    val p = Person("Vardush", 59)
    println("${p.name} is ${p.age} years old")
}

class PersonExt(n: String, a: Int) : Person(n, a) {
    fun stage(): String {
        return if (age <= 10) {
            "child"
        } else if (age <= 20) {
            "teenager"
        } else {
            "adult"
        }
    }
}

fun ex9() {
    println("---------------------------------------------------")
    println("Exercise 9")

    val p = PersonExt("Vardush", 43)
    println("${p.name} is ${p.stage()}")
}

fun ex10() {
    println("---------------------------------------------------")
    println("Exercise 10")

    val nums = listOf(1, 3 ,5, 2, 23, 32, 3, 2)
    val evenNums = nums.filter{ n -> n % 2 == 0 }

    println("All numbers")
    for (n in nums) {
        print("$n ")
    }
    println()

    println("Even numbers")
    for (n in evenNums) {
        print("$n ")
    }
    println()
}
