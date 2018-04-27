package package1

object Exercise2 {
  //Create a list of 5 name
  //write a method to find which name is the longest
  def main(args: Array[String]): Unit = {
		  val names = List("Ana", "Arturo", "Nick", "Chabelo")
      val longest = findLongest(names.head, names.tail)
      println("The longest name in the list is: "+longest)
      val longest2 = names.reduce((x, y) => if(x.length() > y.length()) x else y)
      println("The longest name in the list is: "+longest2)
  }
  
  def findLongest(longest: String, arr: List[String]): String ={
    if(arr.length == 0)
      longest
    else if(longest.length() < arr.head.length())
      findLongest(arr.head, arr.tail)
    else
      findLongest(longest, arr.tail)
  }
}