package com.example.kevinchen.mymvcsample.Model

import android.content.Context
import android.util.Log
import com.example.kevinchen.mymvcsample.Listener.MyModelListener
import com.example.kevinchen.mymvcsample.R

/**
 * create by kevin in 2018/12/10
 * MyModelImp
 * */

class MyModelImp:MyModel{
    val TAG  = this@MyModelImp.javaClass.simpleName

    /**
     * 透過MyModelListener，並透過其interface來回傳成功或失敗
     */
    fun startRequest(mMyModelListener:MyModelListener){
        Log.i(TAG,"startRequest")
        //可以處理request 並回傳成功或是失敗
        mMyModelListener.onSuccess()
    }


    /**
     * 透過MyModel interface 實作 getMyLog() 並於Logcat印出"getMyLog"
     */
    override fun getMyLog() {
        Log.i(TAG,"getMyLog")
    }

    /**
     * 透過MyModel interface 實作 getMyStringText() 並回傳固定值
     */
    override fun getMyStringText(): String {
        return  "getMyStringText"
    }

    /**
     * 透過MyModel interface 實作 getStringFromRes() 並透過Context 取得資源並回傳
     */
    override fun getStringFromRes(mContext:Context): String {
        return mContext.getString(R.string.mvc_sample_text)
    }

}



