object Solution {

    def designerPdfViewer(h: Array[Int], word: String): Int =  {
        val length = word.length
        var max = 0
        word.foreach(current => {
            max = if(max < h(current - 97)) h(current - 97) else max
        })

        max * length
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var h = new Array[Int](26);
        for(h_i <- 0 to 26-1) {
           h(h_i) = sc.nextInt();
        }
        var word = sc.next();
        val result = designerPdfViewer(h, word);
        println(result)
    }
}
