
  // fun is used to declare a function .
  // The main() function is where your program starts from .
  fun main(){

    // Read-only variables with val
   //  Mutable variables with var

                                 // For example:

      val box = 10       /*  val stands for value.
                             It creates a read-only (immutable) variable.
                             Once assigned, its value cannot be changed.
                             Similar to final in Java. */

      // box = 15 ❌ Error: Val cannot be reassigned



      var customers = 20     /* var stands for variable.
                                It creates a mutable variable.
                                Its value can be changed later. */


      customers = 17  // ✅ This is allowed




      println("There are $customers customers")


  }
