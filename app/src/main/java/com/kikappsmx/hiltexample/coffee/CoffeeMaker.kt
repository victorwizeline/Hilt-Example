package com.kikappsmx.hiltexample.coffee

import javax.inject.Inject

class CoffeeMaker @Inject constructor(
    private val coffee: Coffee
) {
    fun getCoffeeName() = coffee.name
}
