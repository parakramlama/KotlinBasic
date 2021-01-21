package KotlinBasic

/*fun main() {
    //increment of 1
    for (i in 1..10) {
        println(i)
    }
    for(i in 1 until 10){
        println("i is $i")
    }

    //increment by 2
    for(i:Int in 1..10 step 2){
        println(i)
    }
    //decrement by 1
    for(i: Int in 10 downTo 1){
        println(i)
    }
    //decrement by 2
    for(i: Int in 10 downTo 1 step 2){
        println(i)
    }
}

 */


/* loop in general
        for(int i=1; i<=10 ; i++)
   loop in kotlin
        for(i in 1..10){
            println(i)
        }
*/


//while loop
/*fun main(args:Array<String>){
    var i = 1

    while (i<=5){
        println("line $i")
        ++i
    }
}
*/


//do while loop
/*
fun main(args: Array<String>){
    var sum : Int = 0
    var input : String

    do{
        print("Enter an integer:")
        input = readLine()!!
        sum += input.toInt()
    }
    while (input != "0")
    println("sum = $sum")
}
 */

//for(int i=1;i<=10;i++) i.e. inclusive 10
/*fun main(){
    for(i in 1..10){
        println(i)
    }
}*/


//for(int i=1;i<11;i++) until 11
fun main(){
    for(i in 1 until 11){
        println(i)
    }
}









