package com.nilezia.myeproxy.data

import androidx.annotation.DrawableRes

data class AnimeModel(
    var imgId: String,
    @DrawableRes var imgPoster: Int,
    var titleName: String,
    var description: String,
    var rating: String
)