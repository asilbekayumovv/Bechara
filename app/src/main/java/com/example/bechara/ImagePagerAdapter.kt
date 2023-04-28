package com.example.bechara

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.bechara.databinding.ItemPageBinding


class ImagePagerAdapter(val list:MutableList<String>):PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): View {
        val view = ItemPageBinding.inflate(LayoutInflater.from(container.context), container, false)
        Glide.with(container.context).load(list[position]).into(view.item);
        container.addView(view.root)
        return view.root
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
}

