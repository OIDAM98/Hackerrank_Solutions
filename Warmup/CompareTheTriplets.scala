object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();

        var Alice = 0
        var Bob = 0

        if(a0 > b0) Alice += 1 else if (a0 < b0) Bob += 1
        if(a1 > b1) Alice += 1 else if (a1 < b1) Bob += 1
        if(a2 > b2) Alice += 1 else if (a2 < b2) Bob += 1

        println(s"$Alice $Bob")

    }
}
