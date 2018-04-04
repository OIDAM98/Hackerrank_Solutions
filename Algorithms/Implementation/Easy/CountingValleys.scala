object Solution {

    def countingValleys(n: Int, s: String): Int =  {
        var numberValleys = 0
        var currentLvl = 0
        for(currStep <- s){
            if(currStep == 'U') currentLvl += 1
            if(currStep == 'D') currentLvl -= 1
            if(currentLvl == 0 && currStep == 'U') numberValleys += 1
        }
        numberValleys
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var s = sc.next();
        val result = countingValleys(n, s);
        println(result)
    }
}
