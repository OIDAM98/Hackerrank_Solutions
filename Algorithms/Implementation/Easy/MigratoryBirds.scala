import scala.collection.mutable

object Solution {

    def migratoryBirds(arr: Array[Int]): Int = {
        val check = arr.sorted
        val hmap = mutable.HashMap[Int, Int]()

        var max = Integer.MIN_VALUE
        var mode = 0

        for(i <- 0 until check.length){
            if(!hmap.get(check(i)).isEmpty){
                var counter = hmap.get(check(i)).get
                counter += 1
                hmap += (check(i) -> counter)

                if(counter > max) max = counter
            }
            else hmap += (check(i) -> 1)
        }

        for( (key, value) <- hmap){
            if(value == max) return key
        }
        mode
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in)
        var n = sc.nextInt()
        var ar = new Array[Int](n)
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextInt()
        }

        println(migratoryBirds(ar))

    }
}
