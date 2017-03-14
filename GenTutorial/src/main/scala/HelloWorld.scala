object HelloWorld {
   /* This is my first java program.  
   * This will print 'Hello World' as the output
   */
   var field1:String = "I am field of HelloWorld";
   def main(args: Array[String]) {
      println("Hello, world!") // prints Hello World
      println(field1+"\t used in main");
      test(10);
   }

   def test(a:Int){
        var var1:String = "abc";
        var var2:Int = 10;
        val var3 =  10.9 ;      // will take type by default as Double in this case,
        
        val (var4, var5) = Pair(1,"def");
        println("arg1:\f"+a);        
        println("varaible1:\f"+var1);
        println("varible 2:\f"+var2);
        println("varible 3:\f"+var3);
        println("varible 4:\f"+var4);
        println("varible 5:\f"+var5);

        println(field1+"\t used in test");
        

    }
}

