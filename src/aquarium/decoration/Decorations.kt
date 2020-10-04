package aquarium.decoration

fun main(args:Array<String>){
    makeDecorations()
}

fun makeDecorations() {

    val d5 = Decorations2("crystal","wood","diver")
    println(d5)

    val(rock,wood,diver) = d5
    println(rock)
    println(wood)
    println(diver)


}

data class Decorations2(val crystal:String, val wood:String, val diver:String){}