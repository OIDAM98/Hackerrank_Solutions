object Solution {

    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = {
        if(v1 <= v2) false else Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var x1 = sc.nextInt();
        var v1 = sc.nextInt();
        var x2 = sc.nextInt();
        var v2 = sc.nextInt();

        val result = kangaroo(x1, v1, x2, v2)
        if(result) println("YES") else println("NO")
    }
}
