object Solution {

    def staircase(n: Int): Unit  =  {
        for(i <- 0 to n - 1){
            for(j <- i to n - 2){
                print(" ")
            }
            for(j <- 0 to i){
                print("#")
            }
            println()
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        staircase(n);
    }
}
