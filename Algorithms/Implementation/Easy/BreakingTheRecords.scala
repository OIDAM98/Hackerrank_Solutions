object Solution {

    def countBest(score: Array[Int]): Int = {
        var counter = 0;
        var most = score(0)
        for(i <- score){
            if(i > most){
                most = i
                counter += 1
            }
        }
        counter
    }

    def countWorst(score: Array[Int]): Int = {
        var counter = 0
        var least = score(0)
        for(i <- score){
            if(i < least){
                least = i
                counter += 1
            }
        }
        counter
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var score = new Array[Int](n);
        for(score_i <- 0 to n-1) {
           score(score_i) = sc.nextInt();
        }

        val most = countBest(score)
        val least = countWorst(score)
        println(s"$most $least")


    }
}
