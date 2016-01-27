
def sumLeaf(list: List[Any]) : Int = {
	(for(elem <- list) yield ( 
		elem match {
			case x: List[Int] => sumLeaf(x)   //Generic information is erased during runtime, also don't match List(List(1,2),3) .Should be List[_]
			case x: Int => x
			case _ => 0
		}
	)).sum
}

val x = List(List(3, 8), 2, List(5))

println(x)
println(sumLeaf(x))
