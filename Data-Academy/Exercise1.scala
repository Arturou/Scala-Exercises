package package1

object Exercise1 {
  //create a list of integers
  //Create a method to print  the sum of all integers in a list
  //Create a method to print the sum of all integers above 35
  //Create a method to print the sum of all integer below 35
  //Implement selector
  //Implement arr.head and arr.tail in code
  def main(args: Array[String]): Unit = {
    var listOfNum = List(10,20,30,40,50,60)
    println("Sum of list ", sum(0, listOfNum.length-1, listOfNum, {num => true}))
    println("Sum of list ", sum(0, listOfNum.length-1, listOfNum, {num => num < 35}))
    println("Sum of list ", sum(0, listOfNum.length-1, listOfNum, {num => num > 35}))
  }
  
  def sum(summation: Int, i: Int, arr: List[Int], selector: Int => Boolean): Int ={
    if(i == -1)
      summation
    else if(selector(arr(i)))
    	sum(summation + arr(i), i-1, arr, selector)
    else
      sum(summation, i-1, arr, selector)
  }
  
  def sum(summation: Int, arr: List[Int], selector: Int => Boolean): Int ={
    if(arr.length == 0)
      summation
    else if(selector(arr.head))
      sum(summation+arr.head, arr.tail, selector)
    else
      sum(summation, arr.tail, selector)
  }
}