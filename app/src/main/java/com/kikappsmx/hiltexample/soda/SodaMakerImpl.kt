package com.kikappsmx.hiltexample.soda

class SodaMakerImpl(private val sodaName: String) : SodaMaker {
    override fun getSodaName() = sodaName
}
