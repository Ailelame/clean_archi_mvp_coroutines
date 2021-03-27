package com.stormbirdmedia.cleanarchi.application

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.src(url: String) {
    Glide.with(this).load(url).into(this)
}