import Array._


object MatrixEx{
    def main(args:Array[String]){
        var A = ofDim[Int](3,2);        // ofDim is method defined in Array._ package to declare matrix of required dimenstions

        for(i<-0 to 2){
            for(j<-0 to 1){
                A(i)(j) = j;
            }
        }

        for(i<-0 to 2){
            for(j<-0 to 1){
                print(j+"\t");
            }
            println();
        }
        
    }
}