package aquarium

import kotlin.math.PI

open class Aquarium {
    var height:Int = 20
    val width :Int = 20
    val length =20



   open var vol:Int
    get() = width*height*length / 1000
    set(value) { height = (value*1000)/(width*length) }

   open var water = vol * 0.9

}

class TowerTank : Aquarium(){

    override var vol: Int
        get() = (width*height*length/1000* PI).toInt()
        set(value) {
            height = (value*1000)/(width*length)
        }


    override var water = vol*0.8


}