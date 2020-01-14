package com.betting.lazycustomviewexample

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.view_lazy_custom.view.*

class LazyCustomView : ConstraintLayout {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val service = Context.LAYOUT_INFLATER_SERVICE
        val li = getContext().getSystemService(service) as LayoutInflater
        li.inflate(R.layout.view_lazy_custom, this, true)

        val a = context.obtainStyledAttributes(attrs, R.styleable.LazyCustomView)
        title.text = a.getString(R.styleable.LazyCustomView_tittle)
        a.recycle()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
    }


    fun setTittle(text: String) {
        title.text = text
    }

}
