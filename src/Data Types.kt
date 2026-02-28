
// fun is used to declare a function .
// The main() function is where your program starts from .
fun main(){
    // Introduction to Data Types :

   /* In programming, a Data Type defines the type of information a variable can store.
    Example: integers, text, or logical values.
    In Kotlin, every variable has a type, which helps the compiler know: * /
   / *  How much memory to allocate
    What operations are allowed on the variable
    How to prevent errors in the program  */



   /*   1- Integers  ->  Byte , Short , Int , Long
     In Kotlin, integer types are used to store whole numbers (without decimals).
     They differ by memory size and range of values.
    */

     // Int is the most commonly used integer type

                                     // For example:

    val box :Int= 10     /* box  -> The variable name
                            You can choose any meaningful name
                            : Int ->  Data type of the variable.
                            Int means integer number.
                            = 10 -> The value assigned to the variable. */

    /* ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ */



    /*  2- Floating-point numbers  ->  Float , Double
     In Kotlin, if we want to store numbers with decimals, we use Float or Double.
     Double is the most commonly used floating-point type.
     Float is used to save memory.
     Must add f or F at the end for Float.
     */

                                    // For example:

    val price: Double = 19.99
    val currentTemp: Float = 24.5f        /* currentTemp and price  -> Variable names should be meaningful:
                                             currentTemp = current temperature
                                             price = some item price.

                                             Float and Double ->
                                            Float: smaller decimal number (~6-7 decimal digits), needs f at the end.
                                           Double: bigger decimal number (~15 decimal digits), more precise, no f needed.

                                           Assigned values ->
                                            currentTemp = 24.5
                                            price = 19.99   */

/* ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ */
    /* 3- Booleans ->  Boolean
    In Kotlin , Boolean is a data type used to store true or false values only.
     */

                                     // For example:

    val isEnabled: Boolean = true
    val hasPermission: Boolean = false          /*  isEnabled and hasPermission -> Variable names should be meaningful
                                                   isEnabled = is the feature enabled?
                                                   hasPermission = does the user have permission?
                                                   : Boolean - > The data type is Boolean, meaning the variable can have:
                                                    true → yes / enabled
                                                    false → no / disabled

                                                    Assigned values ->
                                                    isEnabled = true → feature is enabled
                                                    hasPermission = false → no permission   */

  /* ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ */

    /* 4-  Characters -> Char
          Char is a data type used to store a single character only,
          whether it is a letter, digit, or symbol. */

                                            // For example:

    val separator: Char = ','               /* separator ->  Variable name.
                                               Name is meaningful: stores a separator character.
                                               : Char ->
                                               The data type is Char, which can store only one character.
                                               = ','
                                               The assigned value: a comma ,
                                               Char values must be surrounded by single quotes ' ' . */

 /* ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ */


    /*  5 - Strings  -> String
           String is a data type used to store a sequence of characters,
           including letters, digits, symbols, or a combination.
           Features of String:
           Stores short or long text
           Surrounded by double quotes " "
           Can be concatenated, sliced, or individual characters extracted  */

                                              // For example:

    val message: String = "Hello, world!"      /*  message ->  Variable name.
                                                   The name is meaningful: this variable stores a text message.

                                                   : String
                                                   The data type is String, meaning the variable stores text or a sequence of characters.
                                                   Text must be surrounded by double quotes " ".

                                                   = "Hello, world!"
                                                   The assigned value: the text "Hello, world!"  */

 // Print All

    println(box)
    println(price)
    println(currentTemp)
    println(isEnabled)
    println(hasPermission)
    println(separator)
    println(message)



}