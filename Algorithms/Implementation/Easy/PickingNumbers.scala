object Solution {

    def pickingNumbers(a: Array[Int]): Int =  {
        val toCheck = a.sortWith(_ < _)
        var max = 0
        for(i <- 0 until toCheck.length){
            var counter = 0
            for(j <- i until toCheck.length){
                if(Math.abs(toCheck(i) - toCheck(j)) <= 1) counter += 1
            }

            if( counter > max) max = counter

        }
        max
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        val result = pickingNumbers(a);
        println(result)
    }
}
