object Solution {

    def birthdayCakeCandles(n: Int, ar: Array[Int]): Int =  {
        var sum = 0
        var max = ar(0)
        for(i <- 0 to ar.length - 1){
            if(ar(i) > max) max = ar(i)
        }
        for(i <- 0 to ar.length - 1){
            if(ar(i) == max) sum += 1
        }
        sum
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        val result = birthdayCakeCandles(n, ar);
        println(result)
    }
}
