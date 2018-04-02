object Solution {

    def plusMinus(arr: Array[Int]):Unit = {
        var positive: Double = 0;
        var negative: Double = 0;
        var zero: Double = 0;
        for(i <- 0 to arr.length - 1){
            if(arr(i) > 0) positive += 1 else if(arr(i) < 0) negative += 1 else zero += 1
        }
        var resPos = positive/arr.length
        var resNeg = negative/arr.length
        var resZer = zero/arr.length
        println(resPos)
        println(resNeg)
        println(resZer)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        plusMinus(arr);
    }
}
