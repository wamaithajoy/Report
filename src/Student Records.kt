fun main() {
    var printName = ("Hello Joy")
    println(printName)
    var result= getRemainder(7,3)
    println(result)
    var sum= sum(5,6,8,2)
    println(sum)
    printInterestingFunFact("football")
}




    fun printName(name: String){
        println("Hello"  +" " + name)

    }
    fun getRemainder(num1:Int,num2:Int):Int{
        var modulus =num1 % num2
        return modulus
    }
fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum =a+b+c+d
    return sum
}
fun printInterestingFunFact(fact:String){
    println("I love" + " " + fact)
}


















