fun main() {
    val listOfDouble=listOf<Double>(7.0,4.0,5.0,6.0,3.0,8.0,10.0)

    // imprative
    //listOfDouble.forEach {x-> println(substractTen(square(addOne(x)))) }
    listOfDouble.map { x->addOne(x) }.map { x->square(x) }.filter { x->x<70 }
    .sorted()
    .take(2)
    .map { x->substractTen(x) }.toList().forEach{
        x->println(x)
    }
    
}

fun addOne(x:Double): Double = x + 1
fun square(x:Double): Double = x * x
fun substractTen(x:Double): Double = x - 10
