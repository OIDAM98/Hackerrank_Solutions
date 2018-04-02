object Solution {

    def solve(year: Int): String = {
        if(year == 1918) "26.09.1918"
        else if(isLeap(year)) "12.09." + year
        else "13.09." + year
    }

    def isLeap(year: Int): Boolean = {
        if(year % 4 != 0) false
        else if(year > 1918 && year % 100 == 0 && year % 400 != 0) false
        else true
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var year = sc.nextInt();

        println(solve(year))
    }
}
