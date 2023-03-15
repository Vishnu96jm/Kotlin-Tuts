

fun main(args: Array<String>) {

    var ref = MyClass(5, "Hello Priyanka")
    println("a value ${ref.a}")
    ref.a = ref.a - 2
    println("after changing a value ${ref.a}")
    println("str value ${ref.str}")

    var ref1 = MyClass(10, "Hello World")
    println("a value ${ref1.a}")
    println("str value ${ref1.str}")

    println("count value ${MyClass.count}")
    MyClass.count = MyClass.count + 10
    println("count value ${MyClass.count}")

   // MyClass.count
//
    println(MyClass.typeOfCustomers())
}

class MyClass(var a : Int, var str: String) {

    companion object {

        var count: Int = 5            // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }
}