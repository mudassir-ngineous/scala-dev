// object Demo {
//    def main(args: Array[String]) {
//       println(matchTest(10))
//    }
   
//    def matchTest(x: Int): String = x match {
//       case 1 => "one"
//       case 2 => "two"
//       case 3 => "three"
//       case _ => "many"
//    }
// }

object Demo {
   def main(args: Array[String]) {
      println(matchTest("two"))
      println(matchTest("test"))
      println(matchTest(1))
      println(matchTest(5))
   }
   
   def matchTest(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
}