
/*
*   1. Map and HashMap
* */
fun main(args: Array<String>) {

    // Map Tutorial: Key-Value pair
//    var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
//    var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size
    var myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap.put(4, "Yogi")
    myMap.put(43, "Manmohan")
    myMap.put(7, "Vajpayee")

    myMap.put(43, "Modi")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }

    /*Task:
Create a map where each key is the name of a pet you have or had, and the value is the animal type that pet is.
E.g. Key: "Max", Value: "German Shepard Dog".
Add the values to the map, then remove a value.
Finally, iterate over the map, printing out the entries.
 */
}