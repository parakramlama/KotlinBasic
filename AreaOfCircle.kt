package KotlinBasic

fun main(){
    print("Enter radius")
    val radius = readLine()!!.toFloat()

    //named argument
    val area = calculateAreaOfCircle(_radius = radius)
    print("Area of $radius is $area")
}

fun calculateAreaOfCircle(pi : Float = 3.14F, _radius : Float)
        :Float{
    return pi*_radius*_radius
}