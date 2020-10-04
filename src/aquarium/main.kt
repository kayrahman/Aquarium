package aquarium

fun main(args:Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium = Aquarium()
    println("volume ${aquarium.vol}")
    aquarium.vol = 50

    println("volume ${aquarium.vol}")
    println("height ${aquarium.height}")


}
