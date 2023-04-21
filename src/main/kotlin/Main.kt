fun main( ) {
    println(statement(listOf("Beautiful", "Girls", "are", "born", "in", "February")))
    println(sumofnumbers(33,90))
    println(totalsum(arrayOf(30,45,23,44,12,26)))
    println(siblings(arrayOf("Barnabas","Warenly","Sharyden","Louise","Walter")))
    println(multiply(listOf(30,9,2,4,17,41)))
    println(statements(arrayOf("Becky","Wairimu","Shawn","Pincate","Mechack")))
    println(averageNumber(listOf(22.2,52.0,55.3,32.0,7.6,18.5,9.8,12.2)))
    println(elements(listOf(43,38,40,7,58,78,53,56,32)))
    println(Numbers(listOf(19,50,45,90,77,12,45,110,5,45,24)))

}
//Write a function that takes a list of strings as a parameter
// and returns the concatenation of all the strings.
fun statement(Words:List<String>):String{
    var x = " "
    for(i in Words){
        x += i
    }
    return x
}
//Write a function that takes two integers as
//parameters and returns their sum.
fun sumofnumbers(num1:Int,num2:Int):Int{
    var sum =num1+num2
    return sum
}
//Write a function that takes an array of integers as a parameter and
// returns the sum of all the elements.
fun  totalsum (Array: Array<Int>):Int{
    var sums =Array.sum()
    return sums

}
//Write a function that takes a list of integers as a parameter
// and returns the product of all the elements.
fun multiply(list: List<Int>):Int {
    var result = 1
    for (x in list) {
        result *= x
    }
    return result
}
//Write a function that takes an array of strings as a parameter and
// returns the length of the shortest string.
fun siblings(names: Array<String>):Int {

    var minlength=0
    for(x in names ){
        if(x.length > minlength)
            minlength = x.length
    }
   return minlength
}
//Write a function that takes an array of strings as a parameter and
// returns the length of the longest string.
fun statements(names: Array<String>):Int{
        var maxlength=0
    for(x in names){
        if(x.length  > maxlength){
            maxlength = x.length
        }
    }
    return maxlength

}
//Write a function that takes a list of integers as a parameter
// and returns the average of all the elements.
fun averageNumber(lists: List<Double>):Double{
    var Average=lists.average()
    return Average
}
//Write a function that takes a list of integers as a parameter
//and returns a new list with all the elements that are divisible by a given number.
fun elements(List:List<Int>):List<Int>{
    var newList= mutableListOf<Int>()
    for (i in List){
        if(i % 3==0){
            newList.add(i)
        }
    }
    return newList
}
//Write a function that takes a list of integers as a parameter
// and returns a new list with all the elements in descending order
fun Numbers(lists: List<Int>):List<Int>{
    var newlists= lists.sorted()
    return newlists
}

