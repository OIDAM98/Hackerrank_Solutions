object Solution {

    def encryption(s: String): String =  {
        val trimmed = s.trim
        val tlength: Double = trimmed.length
        val rows: Int = Math.floor(Math.sqrt(tlength)).toInt
        val columns: Int = Math.ceil(Math.sqrt(tlength)).toInt
        //println(s"rows: $rows columns: $columns ")

        var result = new String
        for(i <- 0 to columns - 1){
            for(x <- 0 to columns - 1){
                if(i + x * columns < tlength) result += trimmed(i + x * columns)
            }
            result += " "
        }

        result
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.next();
        val result = encryption(s);
        println(result)
    }
}
