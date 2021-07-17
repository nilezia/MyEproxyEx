package com.nilezia.myeproxy.epoxy.model

import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.nilezia.myeproxy.R
import com.nilezia.myeproxy.data.AnimeModel
import com.nilezia.myeproxy.epoxy.KotlinEpoxyHolder

@EpoxyModelClass(layout = R.layout.view_item_new_anime)
abstract class AnimeViewEpoxy : EpoxyModelWithHolder<AnimeViewEpoxy.Holder>() {

    @EpoxyAttribute
    lateinit var anime: AnimeModel

    var onclick: ((AnimeModel) -> Unit?)? = null
    override fun bind(holder: Holder) = with(holder) {
        thumbImageView.setImageDrawable(

            getView().context.let {
                ContextCompat.getDrawable(
                    it,
                    anime.imgPoster
                )
            }
        )

        holder.titleTextView.text = anime.titleName

        getView().setOnClickListener {
            onclick?.invoke(anime)
        }

    }
  inner  class Holder : KotlinEpoxyHolder() {
        val thumbImageView by bind<ImageView>(R.id.thumbImageView)
        val titleTextView by bind<TextView>(R.id.titleNameTextView)

    }
}

