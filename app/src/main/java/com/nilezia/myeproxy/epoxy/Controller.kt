package com.nilezia.myeproxy.epoxy

import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.Toast
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyModel
import com.nilezia.myeproxy.data.AdsBannerModel
import com.nilezia.myeproxy.data.AnimeModel
import com.nilezia.myeproxy.epoxy.model.*
import kotlin.coroutines.coroutineContext
import kotlin.properties.Delegates.observable


class Controller : EpoxyController() {

    var onclickItem: ((AnimeModel) -> Unit?)? = null
    var seeMoreClick: (() -> Unit?)? = null

    init {
        Carousel.setDefaultGlobalSnapHelperFactory(null)
    }

    var animeItemList by observable(emptyList<AnimeModel>()) { _, _, _ ->
        requestModelBuild()
    }
    var animeItemList2 by observable(emptyList<AnimeModel>()) { _, _, _ ->
        requestModelBuild()
    }
    var animeItemList3 by observable(emptyList<AdsBannerModel>()) { _, _, _ ->
        requestModelBuild()
    }

    override fun buildModels() {

        BannerViewEpoxyModel_().id("BANNER_VIEW").addTo(this)

        HorizontalGridCarouseModel_().id("").models(animeItemList3.map { animation ->
            AnimSquareEpoxy_().apply {
                id(animation.imgId)
                anime(animation)
            }
        }).addTo(this)
        HeaderWithSeemoreEpoxyModel_()
            .id("HEADER_WITH_SEE_MORE").title("Top Anime")
            .clickListener { _ ->
                seeMoreClick?.invoke()
            }
            .addTo(this)

        CarouselModel_()
            .id("ANIMATE_LIST")
            .numViewsToShowOnScreen(3f)
            .paddingDp(8)
            .models(animeItemList.map { animetion ->
                AnimeViewEpoxy_().apply {
                    id(animetion.imgId)
                    anime(animetion)
                    onclick = { animeModel ->
                        onclickItem?.invoke(animeModel)
                    }
                }
            })
            .addTo(this)

        HeaderDefaultEpoxyModel_()
            .id("HEADER_DEFAULT").title("Movie").addTo(this)

        CarouselModel_()
            .id("ANIMATE_LIST2")
            .numViewsToShowOnScreen(2.2f)
            .paddingDp(8)
            .models(animeItemList2.map { animetion ->
                AnimeViewEpoxy_().apply {
                    id(animetion.imgId)
                    anime(animetion)
                    this.onclick = { animeModel ->
                        onclickItem?.invoke(animeModel)
                    }
                }
            })
            .addTo(this)

        HeaderWithSeemoreEpoxyModel_()
            .id("HEADER_WITH_SEE_MORE").title("Top Anime")
            .clickListener { _ ->
                seeMoreClick?.invoke()
            }
            .addTo(this)
        CarouselModel_()
            .id("ANIMATE_LIST3")
            .numViewsToShowOnScreen(4.2f)
            .paddingDp(8)
            .models(animeItemList2.map { animation ->
                AnimeViewEpoxy_().apply {
                    id(animation.imgId)
                    anime(animation)
                    this.onclick = { animeModel ->
                        onclickItem?.invoke(animeModel)
                    }
                }
            })
            .addTo(this)
    }
}