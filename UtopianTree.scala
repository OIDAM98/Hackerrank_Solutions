object Solution {

    def utopianTree(n: Int): Int =  {
        (Math.pow(2, ((n + (n % 2)) / 2) + 1) - (1 + (n % 2))).toInt
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            val result = utopianTree(n);
            println(result)
            a0+=1;
        }
    }
}
