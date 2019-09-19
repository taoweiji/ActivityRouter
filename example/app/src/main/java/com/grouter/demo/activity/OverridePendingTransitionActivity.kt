package com.grouter.demo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView

import com.grouter.RouterActivity
import com.grouter.demo.R
import android.widget.ArrayAdapter
import com.grouter.GActivityCenter
import kotlinx.android.synthetic.main.activity_override_pending_transition.*


@RouterActivity
class OverridePendingTransitionActivity : AppCompatActivity(), AdapterView.OnItemClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_override_pending_transition)
        title = javaClass.simpleName
        val data = arrayOf("从右进入", "从左进入", "顶部进入", "底部进入", "淡入")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        list_view.adapter = adapter
        list_view.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val builder = GActivityCenter.OverridePendingTransitionTargetActivity()
        when (position) {
            0 -> builder.asRightIn()
            1 -> builder.asLeftIn()
            2 -> builder.asTopIn()
            3 -> builder.asBottomIn()
            4 -> builder.asFadeIn()
        }
        builder.start(this)
    }
}
