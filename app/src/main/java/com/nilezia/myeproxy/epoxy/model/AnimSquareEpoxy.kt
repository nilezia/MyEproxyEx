package com.nilezia.myeproxy.epoxy.model

import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.nilezia.myeproxy.R
import com.nilezia.myeproxy.data.AdsBannerModel
import com.nilezia.myeproxy.data.AnimeModel
import com.nilezia.myeproxy.epoxy.KotlinEpoxyHolder

@EpoxyModelClass(layout = R.layout.view_item_square)
abstract class AnimSquareEpoxy : EpoxyModelWithHolder<AnimSquareEpoxy.Holder>() {

    @EpoxyAttribute
    lateinit var anime: AdsBannerModel

    var onclick: ((AdsBannerModel) -> Unit?)? = null
    override fun bind(holder: Holder) = with(holder) {
        imageViewSquarer.setImageDrawable(

            getView().context.let {
                ContextCompat.getDrawable(
                    it,
                    anime.imgRes
                )
            }
        )
        getView().setOnClickListener {
            onclick?.invoke(anime)
        }
    }

    inner class Holder : KotlinEpoxyHolder() {
        val imageViewSquarer by bind<ImageView>(R.id.imageViewSquarer)

    }
}

