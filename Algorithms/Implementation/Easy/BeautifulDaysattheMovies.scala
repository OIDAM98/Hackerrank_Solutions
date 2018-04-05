object Solution {

    def beautifulDays(i: Int, j: Int, k: Int): Int =  {
        var counter = 0;
        for(index <- i to j){
            if(Math.abs(index - reversal(index)) % k == 0) counter += 1;
        }
        counter
    }

    def reversal(x: Int): Int = {
        val temp = x.toString
        var sb = new StringBuilder
        sb.append(temp)
        sb = sb.reverse
        sb.toString.toInt
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var i = sc.nextInt();
        var j = sc.nextInt();
        var k = sc.nextInt();
        val result = beautifulDays(i, j, k);
        println(result)
    }
}
