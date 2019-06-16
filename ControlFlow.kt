package com.example.colletion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       for (x in 1..100) {
           if(x % 3 == 0 && x % 5 == 0){
               println("FizzBuzz")
           }else if(x % 3 == 0) {
               println("Fizz")
           }else if(x % 5 == 0) {
               println("Buzz")
           }else {
               println(x)
           }
       }
    }
}
