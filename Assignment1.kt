package assignment1

fun main(){
    print("Enter the whole number")
    val number: Int = readLine()!!.toInt()

    if (number > 100)
        print("$number is greater than 100")
    else
        print("$number is not greater than 100")
}