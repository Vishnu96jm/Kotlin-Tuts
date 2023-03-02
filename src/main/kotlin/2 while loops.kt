

/*
* Loops
* Mechanism which allows you to run the same piece of code multiple times
* It has exit / break condition*/

fun main() {
    var counter = 1
    while (counter < 10) {
        println(counter)
        //counter = counter + 1
        counter += 1 //augmented assignment operator.
    }
    println(counter)

    println("Counting again")

    // counter = 1
    counter = 10

    do {
        println(counter)
        counter += 1
    } while (counter < 10)


    //Challenge

    /*Create a simple countdown from 10 to 1
    * when the countdown completes, write "Blast Off!"
    *
    * Note: The word "Blast Off!" can be printed outside the loop*/

}