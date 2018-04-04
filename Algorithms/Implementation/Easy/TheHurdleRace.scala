object Solution {

    def hurdleRace(k: Int, height: Array[Int]): Int =  {
        val sorted = height.sortWith(_ > _)
        if(k >= sorted(0)) 0 else (sorted(0) - k)
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var k = sc.nextInt();
        var height = new Array[Int](n);
        for(height_i <- 0 to n-1) {
           height(height_i) = sc.nextInt();
        }
        val result = hurdleRace(k, height);
        println(result)
    }
}
