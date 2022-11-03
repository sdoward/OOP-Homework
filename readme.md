This homework is design as a framework so that you can explore ideas such as encapsulation, polymorphism and 
inheritance. There is no strictly correct way of completing it. Try to submit code that uses some of the 
patterns that we went over in Wednesdays class.

1. Encapsulate some of the functionality that is currently in `Main`. This might mean that you have a `LengthCaculator`,
`InputHandler`.
2. Introduce an interface...
```
interface DistanceConverter {

    double convert(int centimeters);

}
```
3. Create an implementation of the interface that converts cms to inches. Use the interface in your code
4. Create another implementation of the interface that converts to a different measurement use it in your code
5. Extend one of the implementations and add functionality (e.g. it could print something whilst doing the conversion) use it in your code
