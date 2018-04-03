object Solution {

    def howManyGames(p: Int, d: Int, m: Int, s: Int): Int =  {
        // Return the number of games you can buy
        var spent = 0
        var times = 0
        var currentCost = 0
        var done = false
        while(!done){
            currentCost = if((p - d * times) >= m) p - d * times else m
            if(spent + currentCost <= s){
                spent += currentCost
                times += 1
            }
            else{
                done = true
            }
        }
        times
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var p = sc.nextInt();
        var d = sc.nextInt();
        var m = sc.nextInt();
        var s = sc.nextInt();
        val answer = howManyGames(p, d, m, s);
        println(answer)
    }
}
