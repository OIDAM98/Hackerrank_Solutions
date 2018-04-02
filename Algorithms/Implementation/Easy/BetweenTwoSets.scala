object Solution {

    def getMin(arr: Array[Int]): Int = {
        var min = arr(0)
        for(i <- arr){
            if(i < min) min = i
        }
        min
    }

    def getMax(arr: Array[Int]): Int = {
        var max = arr(0)
        for(i <- arr){
            if(i > max) max = i
        }
        max
    }

    def isFactorOfA(x: Int, a: Array[Int]): Boolean = {
        for(i <- a){
            if(x % i != 0) return false
        }
        return true
    }

    def isFactorOfB(x: Int, b: Array[Int]): Boolean = {
        for(i <- b){
            if(i % x != 0) return false
        }
        return true
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
           a(a_i) = sc.nextInt();
        }
        var b = new Array[Int](m);
        for(b_i <- 0 to m-1) {
           b(b_i) = sc.nextInt();
        }

        var min = getMin(b)
        var max = getMax(a)

        if(min > max){
            val temp = min
            min = max
            max = temp
        }

        var total = 0

        for(i <- min to max){
            if(isFactorOfA(i, a) && isFactorOfB(i, b)) total += 1
        }

        println(total)

    }
}
