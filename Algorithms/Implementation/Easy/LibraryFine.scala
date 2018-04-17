object Solution {

    def libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int =  {
        if(y1 > y2) 10000
        else if(y2 > y1) 0
        else if(m1 > m2) 500 * (m1 - m2)
        else if(m2 > m1) 0
        else if(d1 > d2) 15 * (d1 - d2)
        else 0
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var d1 = sc.nextInt();
        var m1 = sc.nextInt();
        var y1 = sc.nextInt();
        var d2 = sc.nextInt();
        var m2 = sc.nextInt();
        var y2 = sc.nextInt();
        val result = libraryFine(d1, m1, y1, d2, m2, y2);
        println(result)
    }
}
