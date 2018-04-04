object Solution {

    def sockMerchant(arr: Array[Int]): Int = {
        var counter = 0
        val checked = Array.ofDim[Boolean](arr.length)

        for(i <- 0 until arr.length){
            if(!checked(i)){
                for(j <- i + 1 until arr.length){
                    if(!checked(i) && !checked(j) && arr(i) == arr(j)){
                        checked(i) = true
                        checked(j) = true
                        counter += 1
                    }
                }
            }
        }
        counter
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var ar = new Array[Int](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt();
        }
        println(sockMerchant(ar))
    }
}
