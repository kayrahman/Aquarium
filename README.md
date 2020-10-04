# Aquarium
###Kotlin Bootcamp


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
