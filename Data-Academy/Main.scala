
import scala.util.control.Breaks
/*
 * Scala crash course (functional programming with OOP)
 * as a good practice try to keep variable as constants
 * */
object Main {
  
  /*Return type Unit or void in java
   *Avoid Unit return functions while developing apps
   * */
  def main(args: Array[String]): Unit = {
    helloworld()
    println("Variable declaration: "+varDeclaration())
    println("Constant variable declaration: "+valDeclaration())
    println("Variable declaration types"+variableDeclarationTypes())
  }
  
  /*
   * Hello world example
   * */
  def helloworld(){
    println("Hello Taco!")
  }
  
  //Variable
  def varDeclaration(): String = {
    var x: String = "Hi";
    return x
  }
  
  //Constant variable
  def valDeclaration(): String = {
    val x: String = "Hi" //semicolon is optional
    x //return is optional in scala
  }
  
  def variableDeclarationTypes(){
    var a: Int = 10
    val b: String = "with datatype declaration"
    var c = 20
    val d = "without datatype declaration"
  }
  
  def ifElseExample(){
    var x = 1
    if (x == 2){
      print("It's a two")
    }else if (x == 1){
      print("It's a one")
    }else{
      print("I don't know!")
    }
  }
  
  def doWhile(){
    var i = 0
    do{
      println(i)
      i+=1
    }while(i<20)
  }
  
  def forLoop(){
    //0 -> 10
    for(i <- 0 to 10){
      println(i)
    }
    //0 -> 9
    for(i <- 0 until 10){
      println(i)
    }
    
    val numList = List(1,2,3,4,5)
    for(a <- numList if a != 3; if a < 8){
       println(a)
    }
    
   }
  
  def forNestedLoop(){
    for(x <- 1 to 10; y <- 6 to 10){
      println(x)
      println(y)
    }
  }
  
  def forLoopWithBreak(){
    val breakLoop = new Breaks
    breakLoop.breakable {
      for(i <- 1 to 10){
        if(i == 5){
          breakLoop.break()
        }
        println(i)
      }
    }
  }
  
  //it creates a list using a for with filters applied to it
  def forLoopWithYeild(){
    val numList = List(1,2,3,4,5)
    var retVal = for(a <- numList if a != 3; if a < 8) yield a
    for(a <- retVal){
      print(a)
    }
  }
  
  
}