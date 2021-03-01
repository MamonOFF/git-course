class Rectangle(val height:Int,val width:Int){
    val isSquare: Boolean = height==width
    var depth:Int = 0
}

fun main() {
    val r = Rectangle(12,20)
    println(r.isSquare)
    println(r.depth)
    r.depth = 55
    println(r.depth)
    println(r.depth)
    println(r.depth)
}