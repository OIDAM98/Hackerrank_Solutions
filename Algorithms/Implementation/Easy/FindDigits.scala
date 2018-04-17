object Solution {

    def findDigits(n: Int): Int =  {
        var counter = 0
        val temp = n.toString

        temp.foreach(current => {
            val number = current.asDigit
            if(number != 0 && n % number == 0) counter += 1
        })

        counter
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            val result = findDigits(n);
            println(result)
            a0+=1;
        }
    }
}
