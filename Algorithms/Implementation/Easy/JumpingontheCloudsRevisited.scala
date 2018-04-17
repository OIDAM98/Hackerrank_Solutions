object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var c = new Array[Int](n);
        for(c_i <- 0 to n-1) {
           c(c_i) = sc.nextInt();
        }

        var energy = 100

        for(i <- 0 until n by k){
            if(c(i % n) == 0) energy -= 1 else energy -= 3
        }
        println(energy)
    }
}
