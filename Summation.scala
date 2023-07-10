object Summation {
  def sum(n:Int):Int = n match
    case 0 => return 0;
    case _ => return n + sum(n-1)
  
  def main(args:Array[String])={
    println(sum(5))
  }
}
