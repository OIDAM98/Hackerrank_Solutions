object Solution {

    def timeConversion(s: String): String =  {
        //00:00:00##
        //HOUR:MIN:SEC:TZ
        val shour = s.substring(0, 2)
        var hour = shour.toInt

        var time = s.substring(0, s.length - 2)

        val timezone = s.substring(s.length - 2)

        var temp: String = ""

        if(timezone == "AM" && hour == 12){
            temp = "00"
            time = time.replace(shour, temp)
        }
        else if(timezone == "PM" && hour != 12){
            hour += 12
            temp = hour.toString
            time = time.replace(shour, temp)
        }
        time
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        val result = timeConversion(s);
        println(result)
    }
}
