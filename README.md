# Aquarium


### Kotlin Bootcamp


### Constructors:
If you define a secondary constructor then you then it must contain a call to the primary constructor by using # this().
You can have multple init() blocks and they run before any secondary constructors and executed in order from top of the class to bottom.

### Inheritance :
Firstly make the superclass # open. Just like classes members are not available for subclassing by default hence make them open.

### Interface :
can not be instantiated on its own means you can not create objects of those types yet. Interfaces can not have any constructor logic. 
abstract classes can have constructors. Both can contain implementations of methods. On interfaces we call them default implementations.

The main difference between abstract classes and interfaces is how and when we use them. 
Use Interface when you have a lot of methods and one or two default implementations.
Use abstract class whenever you cant complete a class

### Interface Delegation :
Interface Delegation lets you add features to a class via composition. Composition is when you use an instance of another class as opposed to inheriting from it. 
Use Interface Delegation whenever you might need to use abstract class in another language. It lets you use composition to plugin behaviours.

### Data classes :
Two dataclasses are compareable. methos copy() can be used to make a new object with the same property values.
To get at the properties and assign them to variables Data classes lets you use decomposiotn. Number of variables must match the number of properties or will get an compiler error.

#### Example decomposition :

fun makeDecorations() {
    val d5 = Decorations2("crystal","wood","diver")
    println(d5)
    
    val(rock,wood,diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations2(val crystal:String, val wood:String, val diver:String){}


### Enums:
Kotlin also supports enums, which allow you to enumerate something and refer to it by name, much like in other languages. Declare an enum by prefixing the declaration with the keyword enum. A basic enum declaration only needs a list of names, but you can also define one or more fields associated with each name.

- Example:
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}

- Output :
⇒ EAST
2
90




### Sealed Class :
A sealed class is a class that can be subclassed, but only inside the file in which it's declared. If you try to subclass the class in a different file, you get an error.

- Example:
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
   return when(seal) {
       is Walrus -> "walrus"
       is SeaLion -> "sea lion"
   }
}

sealed classes are great for returning success or error from a network API.


