object Solution {

    def solve(n: Int, p: Int): Int = {
        val turnFront = p/2
        val turnBack = (n/2 - p/2)
        if(turnFront < turnBack) turnFront else turnBack
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var p = sc.nextInt();
        println(solve(n, p))
    }
}
