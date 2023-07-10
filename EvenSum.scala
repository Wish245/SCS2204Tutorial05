object EvenSum {
    def sum(n:Int):Int= n match
        case x if x==0 => return 0
        case x if x%2 ==0 => return x + sum(x-2)
        case _ => return sum(n-1)
    def main(args:Array[String])={
        println(sum(11))
    }
}
