object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt()

        var function = new scala.collection.mutable.HashMap[Int, Int]()

        for(y <- 1 to n){
            val x = sc.nextInt()
            function += (x -> y)
        }

        for(i <- 1 to n){
            println(function.get(function.get(i).get).get)
        }
    }
}
