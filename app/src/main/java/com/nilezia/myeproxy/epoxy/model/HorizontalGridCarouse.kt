package com.nilezia.myeproxy.epoxy.model

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.ModelView


@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
internal class HorizontalGridCarouse @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Carousel(context, attrs, defStyleAttr) {

    override fun createLayoutManager(): LayoutManager {
        return GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
    }
}