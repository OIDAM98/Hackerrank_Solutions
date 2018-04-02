object Solution {

    def solve(arr: Array[Int], d: Int, m: Int): Int = {
        if(m > arr.length) 0
        else {
            var count = 0
            var sum = 0
            for(i <- 0 to arr.length - m){
                sum = 0
                for(j <- i until i + m){
                    sum += arr(j)
                }
                if(sum == d) count += 1
            }
            count
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var s = new Array[Int](n);
        for(s_i <- 0 to n-1) {
           s(s_i) = sc.nextInt();
        }
        var d = sc.nextInt();
        var m = sc.nextInt();

        val result = solve(s, d, m)
        println(s"$result")
    }
}
