object Solution {

    def diagonalDifference(n: Int, a: Array[Array[Int]]): Int =  {
        var firstDiag = 0
        var secondDiag = 0
        for(i <- 0 to n - 1){
            firstDiag += a(i)(i)
            secondDiag += a(i)((n - 1) - i)
        }
        val res = Math.abs(firstDiag - secondDiag)
        res
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        val result = diagonalDifference(n, a);
        println(result)
    }
}
