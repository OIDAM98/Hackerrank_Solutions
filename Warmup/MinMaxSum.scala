//First Solution

object Solution {

    def miniMaxSum(arr: Array[Long]): Unit =  {
        var minSum = arr(0);
        var maxSum = arr(0);
        for(i <- 0 to arr.length - 1){
            if(arr(i) < minSum) minSum = arr(i)
            if(arr(i) > maxSum) maxSum = arr(i)
        }
        println(s"$minSum $maxSum")
    }

    def sumArr(arr: Array[Int]): Array[Long] = {
        var sums = new Array[Long](arr.length)
        for(i <- 0 to arr.length - 1){
            for(j <- 0 to arr.length - 1){
                if(j != i) sums(i) += arr(j)
            }
        }
        sums
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = new Array[Int](5);
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt();
        }
        val arrSum = sumArr(arr)
        miniMaxSum(arrSum);
    }
}

//Second Solution

object Solution {

    def miniMaxSum(arr: Array[Long]): Unit =  {
        var minSum = arr(arr.length - 1);
        var maxSum = arr(0);
        println(s"$minSum $maxSum")
    }

    def sumArr(arr: Array[Int]): Array[Long] = {
        var sums = new Array[Long](arr.length)
        for(i <- 0 to arr.length - 1){
            for(j <- 0 to arr.length - 1){
                if(j != i) sums(i) += arr(j)
            }
        }
        sums
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = new Array[Int](5);
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt();
        }
        val arrSum = sumArr(arr.sorted)
        miniMaxSum(arrSum);
    }
}

//Third Solution

object Solution {

    def miniMaxSum(arr: Array[Long]): Unit =  {
        var sol = (arr(arr.length - 1), arr(0));
        println(sol._1 + " " + sol._2)
    }

    def sumArr(arr: Array[Int]): Array[Long] = {
        var sums = new Array[Long](arr.length)
        for(i <- 0 to arr.length - 1){
            for(j <- 0 to arr.length - 1){
                if(j != i) sums(i) += arr(j)
            }
        }
        sums
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = new Array[Int](5);
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt();
        }
        val arrSum = sumArr(arr.sorted)
        miniMaxSum(arrSum);
    }
}
