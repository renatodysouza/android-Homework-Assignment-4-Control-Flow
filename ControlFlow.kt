package com.example.colletion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       for (x in 1..100) {
           if(x % 3 == 0 && x % 5 == 0){ /** first verify if number is multiple of 3 and 5 */
               println("FizzBuzz")
           }else if(x % 3 == 0) { /** if not, verify if number is only of 3 */
               println("Fizz")
           }else if(x % 5 == 0) { /** if not, verify if number is only multiple of 5  */
               println("Buzz")
           }else {  /** in the end, print the number */
               println(x)
           }
       }
    }
}
