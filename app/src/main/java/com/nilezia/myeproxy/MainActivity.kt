package com.nilezia.myeproxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.appbar.AppBarLayout
import com.nilezia.myeproxy.epoxy.Controller
import com.nilezia.myeproxy.factory.DataFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , AppBarLayout.OnOffsetChangedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = Controller().apply {
            animeItemList = DataFactory.getTopAnime()
            animeItemList2 = DataFactory.getTopAnime2()
            animeItemList3 = DataFactory.getSquareAnime()
        }
        controller.onclickItem = { anime ->
            Toast.makeText(this, "${anime.titleName}", Toast.LENGTH_LONG).show()
        }
        controller.seeMoreClick = {
            Toast.makeText(this, "seeMoreClick", Toast.LENGTH_LONG).show()
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(false)
        recyclerView.setController(controller)

    }
    override fun onOffsetChanged(appbar: AppBarLayout, verticalOffset: Int) {
        val alpha = (appBar.y / appbar.totalScrollRange) * -1
      //  cardViewBox.alpha = 1.0f - alpha
        //toolbar.alpha = alpha
    }

    override fun onResume() {
        super.onResume()
        appBar.addOnOffsetChangedListener(this)
    }

    override fun onStop() {
        super.onStop()

        appBar.removeOnOffsetChangedListener(this)
    }

}