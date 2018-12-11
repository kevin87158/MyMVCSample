package com.example.kevinchen.mymvcsample.Model

import android.content.Context

/**
 * create by kevin in 2018/12/10
 * MyModel Interface
 * */
interface MyModel {
    fun getMyLog()
    fun getMyStringText() :String
    fun getStringFromRes(mContext: Context) :String
}
