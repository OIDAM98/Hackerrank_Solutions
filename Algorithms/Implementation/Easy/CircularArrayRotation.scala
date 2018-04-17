object Solution {

  def calculateIndex(n: Int, rot: Int, m: Int): Int =  {
    (n - rot + m) % n
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var q = sc.nextInt();
    var a = new Array[Int](n);
    val numRot = k % n
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }
    var m = new Array[Int](q);

    for(i <- 0 until q){
      val m = sc.nextInt()
      val index = calculateIndex(n, numRot, m);
      println(a(index))
    }
  }
}
