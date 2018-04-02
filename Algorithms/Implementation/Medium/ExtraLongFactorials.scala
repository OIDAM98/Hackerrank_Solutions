object Solution {

    def extraLongFactorials(n: Int): BigInt =  {
        var result = BigInt(1)
        for(i <- 2 to n){
            val toMult = BigInt(i)
            result = result * toMult
        }
        result
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        println(extraLongFactorials(n));
    }
}
