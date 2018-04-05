object Solution {

    def angryProfessor(k: Int, a: Array[Int]): String =  {
        var onTime = 0
        a.foreach(student => if(student <= 0) onTime += 1)
        if(onTime >= k) "NO" else "YES"
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var k = sc.nextInt();
            var a = new Array[Int](n);
            for(a_i <- 0 to n-1) {
               a(a_i) = sc.nextInt();
            }
            val result = angryProfessor(k, a);
            println(result)
            a0+=1;
        }
    }
}
