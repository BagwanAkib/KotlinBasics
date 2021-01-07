
> What's the difference between .kt and .kts files in Kotlin. When should we use .kts file over .kt file?
[sorce stackoverflow](https://stackoverflow.com/a/61834182/8002731)

`.kt` — normal source files, `.kts` — script files

The `.kts` files are those that run as script files, without a need for separate compilation. it is run using the following command:

```
kotlinc -script <filename>.kts
```
You don't need main function in a .kts file, It will be executed line by line just like a bash/python script.



> Difference between var and val [source stakoverflow](https://stackoverflow.com/a/44200189/8002731)

`var` is like general variable and it's known as a mutable variable in kotlin and can be assigned multiple times.

`val` is like Final variable and it's known as immutable in kotlin and can be initialized only single time. 


> Comments

* Multiline comment
```kotlin
    /*
    * Multiline comment
    * */
 ```
* Single line comment
```kotlin   
    // Single line comment
```


> Constants in Kotlin
[source stackoverflow](https://stackoverflow.com/a/46729715/8002731)
In Kotlin, if you want to create the local constants which are supposed to be used with in the class then you can create it like below

```kotlin
val MY_CONSTANT = "Constants"
```

And if you want to create a public constant in kotlin like public static final in java, you can create it as follow.
```kotlin
companion object{
     const val MY_CONSTANT = "Constants"
}
```

If you want to use through the Class below is example
```kotlin
public class DbConstants {
    companion object {
        val TABLE_USER_ATTRIBUTE_EMPID = "_id"
        val TABLE_USER_ATTRIBUTE_DATA = "data"
    }
}
```
To access them globally like this: `DbConstants.TABLE_USER_ATTRIBUTE_EMPID`

