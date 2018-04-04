import java.io.PrintWriter

object Solution {

    def catAndMouse(x: Int, y: Int, z: Int): String = {
        val catA = Math.abs(x - z)
        val catB = Math.abs(y - z)
        if(catA < catB) "Cat A" else if (catB < catA) "Cat B" else "Mouse C"

    }


    def main(args: Array[String]) {
        val scan = scala.io.StdIn

        val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

        val q = scan.readLine.trim.toInt

        for (qItr <- 1 to q) {
            val xyz = scan.readLine.split(" ")

            val x = xyz(0).trim.toInt

            val y = xyz(1).trim.toInt

            val z = xyz(2).trim.toInt

            val result = catAndMouse(x, y, z)

            fw.println(result)
        }

        fw.close()
    }
}
