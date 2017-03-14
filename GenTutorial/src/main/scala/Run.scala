object Run {
   implicit class IntTimes(x: Int) {
      def times [A](f: =>A): Unit = {
         def loop(current: Int): sca =
         
         if(current > 0){
            f
            loop(current - 1)
         }
         loop(x)
      }
   }
}