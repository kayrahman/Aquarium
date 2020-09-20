package aquarium

class Aquarium {
    var height:Int = 20
    val width :Int = 20
    val length =20

    var vol:Int
    get() = width*height*length / 1000
    set(value) { height = (value*1000)/(width*length) }

}