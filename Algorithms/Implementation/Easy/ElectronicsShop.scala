object Solution {

    def moneySpent(keyboards: Array[Int], drives: Array[Int], s: Int): Int = {
        var maxCost = -1
        val sortedKey = keyboards.sortWith(_ > _) //Sorting keyboards in inverse order
        val sortedDrives = drives.sortWith(_ < _) //Sorted drives
        for(k <- sortedKey; d <- sortedDrives; if((k + d) <= s)){ //For loop with filter inside
            if(k + d > maxCost) maxCost = k + d
        }
        maxCost
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var s = sc.nextInt();
        var n = sc.nextInt();
        var m = sc.nextInt();
        var keyboards = new Array[Int](n);
        for(keyboards_i <- 0 to n-1) {
           keyboards(keyboards_i) = sc.nextInt();
        }
        var drives = new Array[Int](m);
        for(drives_i <- 0 to m-1) {
           drives(drives_i) = sc.nextInt();
        }

        println(moneySpent(keyboards, drives, s))
    }
}
