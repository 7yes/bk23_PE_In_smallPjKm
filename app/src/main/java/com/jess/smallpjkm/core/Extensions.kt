package com.jess.smallpjkm.core

import android.app.Activity
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun String.happy():String {
    return "$this + ;)"
}

// get color
//fun Activity.color(@ColorRes color:Int)= ContextCompat.getColor(this,color)

// check int nullability
fun Any?.isNull() = this == null

//Toast
fun Activity.toast(text:String, length:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,text,length).show()
}

//fun ImageView.load(url:String){
//    if(url.isNotEmpty()){
//        Glide.with(this.context).load(url).into(this)
//    }
//}

//Picasso
fun ImageView.load(url:String) {
    if (url.isNotEmpty()) {
        Picasso.get().load(url).into(this)
    }
}
