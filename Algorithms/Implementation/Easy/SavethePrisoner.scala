object Solution {

    def saveThePrisioner(n: Int, m: Int, s: Int): Int = {
        //Original formula is (m + s) % n
        //each minus one is because counting of prisoners start at 1, not 0
        //plus one because modular arithmetics starts at 0, not 1
        ((m - 1) + (s - 1)) % n + 1
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var t = sc.nextInt();
        var a0 = 0;
        while(a0 < t){
            var n = sc.nextInt();
            var m = sc.nextInt();
            var s = sc.nextInt();
            println(saveThePrisioner(n, m, s))
            a0+=1;
        }
    }
}
