package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun genrateNum(){
        val dice = Dice(6)
        val rollRes = dice.roll()
        assertTrue("the value of result not between 1 and 6",rollRes in 1..6)
    }
}