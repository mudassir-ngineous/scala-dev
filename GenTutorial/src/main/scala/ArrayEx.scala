import Array._
object ArrayEx {
    def main(args:Array[String]){
        var myList = Array(1,2,3,4,5,6);
        var myList2 = Array(7,8,9,0);
        var sum = 0;
        for(x<-myList){
            println(x);
            sum+=x;
        }

        println("sum is: "+sum);

        var max = myList(0);
        for(i <- 1 to myList.length-1){
            if(myList(i)>max){
                max = myList(i);
            }
        }

        println("max is: "+max);

        // concat two arrays
        var myList_concat = concat(myList, myList2);
        printAll(myList_concat,"myList_concat");

        // Array with Range
        var myArray = range(10,20,2);
        var myArray1 = range(10,20);
        printAll(myArray,"myArray");
        printAll(myArray1,"myArray1");
    }

    def printAll(arr:Array[Int], tag:String){
        println(tag);
        for(i<-0 to arr.length-1){
            println("\t"+arr(i));
        }
    }
}