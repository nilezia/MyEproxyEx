package com.nilezia.myeproxy.epoxy.model

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.CallbackProp
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.nilezia.myeproxy.R
import kotlinx.android.synthetic.main.view_header_seemore.view.*

@ModelView(defaultLayout = R.layout.view_header_seemore, fullSpan = false)
class HeaderWithSeemoreEpoxy @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @CallbackProp
    fun clickListener(listener: OnClickListener?) {
       setOnClickListener(listener)
    }

    @TextProp
    fun setTitle(label: CharSequence?) {
        titleHeaderTextView.text = label
    }
}