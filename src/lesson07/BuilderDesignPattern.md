# Context
* Different attribute data set
* If constructor overloading  -> multiple contractors
* If only constructor (true, null)  -> Logic become more complex


# Builder Design Patter
* Using the concept Encapsulation
* In main Class from Constructor, attributes: private
* INNER static class Builder: same attributes with main class,
Service methods (attribute) -> return Builder
* Finally in Builder class: build() -> House -> house: Immutable Object

# Real situation:
*Data: TrackingDataEvent
*Controller (common flow): TrackingDataEvent
*Runner: test(TrackingDataEvent, ...)

# OOP concepts
* Encapsulation: hiding attributes value and allow some method access to change value or not.
* Inheritance
* Abstraction
* Polymorphism