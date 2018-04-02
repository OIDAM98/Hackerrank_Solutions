object Solution {

    def timeInWords(h: Int, m: Int): String =  {
        val minutes = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five",
                         6 -> "six", 7 -> "seven", 8 -> "eigth", 9 -> "nine", 10 -> "ten",
                         11 -> "eleven", 12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen", 15 -> "quarter",
                         16 -> "sixteen", 17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen", 20 -> "tweenty",
                         21 -> "twenty one", 22 -> "twenty two", 23 -> "twenty three", 24 -> "twenty four",
                         25 -> "twenty five", 26 -> "tenty six", 27 -> "twenty seven", 28 -> "twenty eigth",
                         29 -> "twenty nine", 30 -> "half")
        //minutes.foreach(pair => println(pair._1 + " --> " + pair._2))

        var nMin = new String
        var nHour = new String
        var result  = ""

        if(m == 1){
            nMin = minutes.get(m).get
            nHour = minutes.get(h).get
            result = nMin + " minute past " + nHour
        }
        else if(m == 15 || m == 30){
            nMin = minutes.get(m).get
            nHour = minutes.get(h).get
            result = nMin + " past " + nHour
        }
        else if(m > 0 && m > 30){
            nMin = minutes.get(60 - m).get
            nHour = minutes.get(h + 1).get
            if(nMin == "quarter") result = nMin + " to " + nHour
            else result = nMin + " minutes to " + nHour
        }
        else if (m > 0 && m <= 30){
            nMin = minutes.get(m).get
            nHour = minutes.get(h).get
            result = nMin + " minutes past " + nHour
        }
        else{
            nHour = minutes.get(h).get
            result = nHour + " o' clock"
        }

        result
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var h = sc.nextInt();
        var m = sc.nextInt();
        val result = timeInWords(h, m);
        println(result)
    }
}
