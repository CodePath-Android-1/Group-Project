package com.codepath.android.recipeserver

import kotlinx.serialization.SerialName

data class Food(
    @SerialName("name")
    val webUrl: String?,
    @SerialName("image")
    val pubDate: String?,

)
