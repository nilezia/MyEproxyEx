package com.nilezia.myeproxy.factory

import com.nilezia.myeproxy.R
import com.nilezia.myeproxy.data.AdsBannerModel
import com.nilezia.myeproxy.data.AnimeModel

object DataFactory {
    fun getTopAnime() = listOf(
        AnimeModel("001", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("002", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("003", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("004", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("005", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("006", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("007", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("008", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", "")
    )

    fun getTopAnime2() = listOf(
        AnimeModel("001", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("002", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("003", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("004", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("005", R.drawable.hunter,"hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("006", R.drawable.hunter,"hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("007", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", ""),
        AnimeModel("008", R.drawable.hunter, "hunter x hunter", "Ninja Story in the world", "")
    )

    fun getAdsBanner() = listOf(
        AdsBannerModel("001", R.drawable.facebookadvertising),
        AdsBannerModel("002", R.drawable.facebookadvertising),
        AdsBannerModel("003", R.drawable.facebookadvertising),
        AdsBannerModel("004", R.drawable.facebookadvertising),
        AdsBannerModel("005", R.drawable.facebookadvertising),
        AdsBannerModel("006", R.drawable.facebookadvertising)
    )


    fun getTopAnimeSong() = listOf(
        AnimeModel("001", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("002", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("003", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("004", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", ""),
        AnimeModel("005", R.drawable.pos_naruto, "Naruto", "Ninja Story in the world", "")
    )
}



