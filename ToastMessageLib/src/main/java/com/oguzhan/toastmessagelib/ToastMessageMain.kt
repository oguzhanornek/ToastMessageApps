package com.oguzhan.toastmessagelib

import android.content.Context
import android.widget.Toast

class ToastMessageMain {
    fun showLongToastMessage(context: Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
    fun showShortToastMessage(context: Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}