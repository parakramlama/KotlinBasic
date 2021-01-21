package KotlinBasic
/*class MyFirst{
    //entry point  java
    public static void main(string abc[])
}*/


/*for kotlin entry point
fun main(args:Array<String>){
    println("Hello World!")
}*/

//all primitive datatype are class in kotlin
//args:Array<String> : array of string
//fun main(parameter)
//println: print output same as system.out.println("Hello World")


/*var declaration in java
fun main(){
    int a; //in kotlin  var  var a : Int
    a=2;
    int b;
    b=3;
    int c = a+b;
    print(c)
}*/


/*var declaration in kotlin
var = mutable (value can be changed)
val = immutable (value cannot be changed)
 */
//mutable
/*
fun main(){
    var a /* value*/: Int/*data type*/
    var b  : Int
    a = 3
    b = 4
    var c : Int = a + b
    print("Sum is : " + c)
}*/

//immutable
/*fun main(){
    val a : Int = 3/*data type*/
    val b : Int = 2
    val c = a + b
    print("Sum is : " + c)
}*/


/*fun main(){
    val a  = 3.5
    val b : Int = 6
    val c = a + b
    print("Sum is : " + c)
    // 'c' print numeric value if one of 'a' or 'b' have numeric value
}*/

/*fun main(){
    val a = "a"
    val b = "b"
    val c = a + b
    print("Sum is : " + c)
    //'+' concatenation

    //'c' print string value by concatenation if any of 'a' or 'b' have string value
}*/

/*fun main(){
    val a = "a"
    val b = "b"
    val c = a + b
    print("Sum is : " + c)

    // print("Sum is : $c") this process is string interpolation

    //'c' print string value by concatenation if any of 'a' or 'b' have string value
}*/

/*fun main(){
    val a = 9
    val b = 4
    val c = a + b

    print("Sum of $a and $b is $c")/*concatenation*/
    //print("sum of" + a + "and" + b + "is" +c)

    // print("Sum is : $c") this process is string interpolation

    //'c' print string value by concatenation if any of 'a' or 'b' have string value
}*/

//simple intrest
/*fun main(){
    val principle = 1000
    val rate = 4.5
    val time = 4
    val si = (principle*rate*time)/100

    print("Si is $si")
}*/

//simple interest by taking input from user
/*fun main(){
    print("Enter principle")
    val principal = readLine()!!.toFloat() /* !!->is not null and convert to floati.e other datatype type convertion*/
    print("Enter rate")
    val rate = readLine()!!.toFloat()
    print("Enter time")
    val time = readLine()!!.toFloat()

    val si = (principal*rate*time)/100

    print("Si is $si")
}*/


/*
//create function and value pass
//return type function
fun main(){
    print("Enter principal")
    val principal = readLine()!!.toFloat()
    print("Enter rate")
    val rate = readLine()!!.toFloat()
    print("Enter time")
    val time = readLine()!!.toFloat()
    val si = calculateSi(principal, rate, time)
    print("Si is $si")
}

//in case of function datatype are required in parameter
//parameterized function with parameters and return type. here ': Float' is return type
fun calculateSi(p : Float, r : Float, t : Float) : Float{
    return (p*r*t)/100
}*/


//no return function
/*
fun main(){
    print("Enter principal")
    val principal = readLine()!!.toFloat()
    print("Enter rate")
    val rate = readLine()!!.toFloat()
    print("Enter time")
    val time = readLine()!!.toFloat()
    calculateSimple(principal, rate, time)
}

//in case of function datatype are required in parameter
//Unit mean don't return anything
//parameterized function with parameters and np-return type. here ': Unit' is no-eturn type i.e. like void
//we have and don't have to write 'Unit' in this case of no return
fun calculateSimple(p : Float, r : Float, t : Float) : Unit{
    val si = (p*r*t)/100
    print("Si is $si")
}*/

//readLine -> to take input from user


//named parameter with default value
fun main(){
    print("enter first no")
    val a = readLine()!!.toInt()
    print("enter second no")
    val b = readLine()!!.toString()

    //named parameter
    val c = add(_b = b,_a = a)
    //string interpolation
    println("sum of $a and $b is $c")
}
//add(a+b) argument

fun add(_a : Int = 0 ,_b : Int = 0) /* parameter with default value 0*/
: Int{
    return _a + _b
}










