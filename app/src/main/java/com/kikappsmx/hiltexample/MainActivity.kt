package com.kikappsmx.hiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kikappsmx.hiltexample.coffee.CoffeeMaker
import com.kikappsmx.hiltexample.soda.SodaMaker
import com.kikappsmx.hiltexample.tea.TeaMaker
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffeeMaker: CoffeeMaker

    @Inject
    lateinit var sodaMaker: SodaMaker

    @Inject
    lateinit var teaMaker: TeaMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeName = coffeeMaker.getCoffeeName()
        Toast.makeText(
            this,
            "This $coffeeName tastes good",
            Toast.LENGTH_SHORT
        ).show()

        val sodaName = sodaMaker.getSodaName()
        Toast.makeText(
            this,
            "This $sodaName tastes good",
            Toast.LENGTH_SHORT
        ).show()

        val teaName = teaMaker.getTeaName()
        Toast.makeText(
            this,
            "This $teaName tastes good",
            Toast.LENGTH_SHORT
        ).show()
    }
}
