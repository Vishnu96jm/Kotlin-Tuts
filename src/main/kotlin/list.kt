
/*
*   1. List and ArrayList
* */
fun main(args: Array<String>) {

    // Elements :
    // Index    :   0   1   2   3   4

//    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements
    var list: ArrayList<String> = ArrayList<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Yogi")        // 0
    list.add("Manmohan")    // 1
    list.add("Vajpayee")    // 2

//    list.remove("Manmohan")
//    list.add("Vajpayee")

    list[1] = "Modi"

    for (element in list) {             // Using individual elements (Objects)
        println(element)
    }


    /*
Task: Use array and lists
Create an Array of your five favorite movies.
Change an element within the Array, and print out the second movie.
After that, transform the array to a list that can change its contents, and add two more movies you'd like to watch.
Then remove a movie you've watched most recently.
Finally, print out the list of movies you ended up with!
 */
}