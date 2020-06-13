package com.kikappsmx.hiltexample.tea

import javax.inject.Inject


class TeaMakerImpl @Inject constructor(
    private val tea: Tea
): TeaMaker {
    override fun getTeaName() = tea.name
}
