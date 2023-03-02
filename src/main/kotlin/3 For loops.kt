

/*
* For loops, compared to while and do while, are used when you know the
* number of iterations you will have within the loop.
* To achieve this, they use the concept of Ranges.*/


fun main() {
    /*This is known as an inclusive or closed range.
    It takes in both sides of the expression, and includes them as numbers in the range.*/
    val rangeFromZeroToTen = 0..10
    println(rangeFromZeroToTen)

    /*If you don’t want to include the last number of the range.
    This is called a half-opened range, and you can create one using the until() function like so:*/
    val exclusiveRange = 0 until 10
    println(exclusiveRange)

    for (index in rangeFromZeroToTen) { //$ - String interpolation
        print("$index ")
    }

    println("")

    /*In Kotlin, using ranges saves us from writing additional boilerplate code.*/

    for (index in rangeFromZeroToTen step 2) {
        print("$index ")
    }

    println("") //At the end you’re printing out an empty string in a new line to act as a separator.

    for (index in 10 downTo 0) {
        print("$index ")
    }

    println("")

    // More Loop Features
    /*Using continue and break statements.
    With continue, you can stop the current iteration of a loop, and move onto the next one.
    Using break, you can break out of a loop entirely, and stop all the future iterations. */

    for (num in 0..14) {
        if (num%2 == 0) {
            continue
        }

        println(num)

        if (num == 7) {
            println("Get some rest")
            break
        }
    }

    row@ for (row in 0..5) {
        column@ for (column in 0..5) {
            if (column == 2 && row ==2) {
                break@row
            }
            print("x\t")
        }
        println()
    }

    /*
Challenge 1:
Create a range of 20 numbers, and iterate over it, printing out the numbers.

Challenge 2:
Iterate over the range in Challenge 1 again, but print every third number.

Challenge 3:
Create a decreasing range of 15 numbers, and print every second number.
 */

}