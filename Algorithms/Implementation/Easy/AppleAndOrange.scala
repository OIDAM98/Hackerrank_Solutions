object Solution {

    def countFruitInside(s: Int, t: Int, start: Int, fruit: Array[Int]): Int =  {
        var counter = 0
        for(i <- 0 to fruit.length - 1){
            val pos = start + fruit(i)
            if(pos >= s && pos <= t) counter += 1
        }
        counter
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.nextInt();
        var t = sc.nextInt();
        var a = sc.nextInt();
        var b = sc.nextInt();
        var m = sc.nextInt();
        var n = sc.nextInt();
        var apple = new Array[Int](m);

        for(apple_i <- 0 to m-1) {
           apple(apple_i) = sc.nextInt();
        }

        var orange = new Array[Int](n);

        for(orange_i <- 0 to n-1) {
           orange(orange_i) = sc.nextInt();
        }

        val applesInsideHouse = countFruitInside(s, t, a, apple)
        println(applesInsideHouse)

        val orangesInsideHouse = countFruitInside(s, t, b, orange)
        println(orangesInsideHouse)
    }
}
