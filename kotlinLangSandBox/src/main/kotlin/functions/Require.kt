package functions

/**
 * Created by victor888 on 3/13/2017.
 */
fun RequireBiggerThan10(k:Int)
{
    require(k>10,{"K Should be greater than 10"})
}
fun main(args: Array<String>) {
   RequireBiggerThan10(20)
}