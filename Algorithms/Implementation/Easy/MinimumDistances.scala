object Solution {

    def minimumDistances(a: Array[Int]): Int =  {
        // Complete this function
        var check = List[Int]()
        for(i <- 0 until a.length - 1){
            for(j <- i + 1 until a.length){
                if(a(i) == a(j)){
                    check ::= Math.abs(i - j)
                }
            }
        }

        if(!check.isEmpty) check.min else -1

    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        val result = minimumDistances(a);
        println(result)
    }
}
