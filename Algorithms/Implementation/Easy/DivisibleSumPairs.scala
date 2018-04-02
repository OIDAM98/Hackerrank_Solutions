object Solution {

    def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int =  {
        var count = 0;
        for(i <- 0 until ar.length){
            for(j <- i + 1 until ar.length){
                if((ar(i) + ar(j)) % k == 0) count += 1
            }
        }
        count
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        val result = divisibleSumPairs(n, k, ar);
        println(result)
    }
}
