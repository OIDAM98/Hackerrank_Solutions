object Solution {

    def viralAdvertising(n: Int): Int =  {
        var people = 5
        var sum = 0
        for(i <- 0 until n){
            people = (Math.floor(people / 2)).toInt
            sum += people
            people *= 3
        }
        sum
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val result = viralAdvertising(n);
        println(result)
    }
}
