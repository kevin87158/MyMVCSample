package com.example.kevinchen.mymvcsample.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kevinchen.mymvcsample.Listener.MyModelListener
import com.example.kevinchen.mymvcsample.Model.MyModelImp
import com.example.kevinchen.mymvcsample.R
import kotlinx.android.synthetic.main.activity_main.*


/**
 * create by kevin in 2018/12/10
 * MVC & Interface & Listener Sample
 * */

class MainActivity : AppCompatActivity() {
    val TAG  = this@MainActivity.javaClass.simpleName
    var myModelImp = MyModelImp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getMyModelLog()
        getString()
        getStringFromRes()
        sendRequest()

    }


    /**
     * 印出Log
     * */
    private fun getMyModelLog(){
        if(myModelImp == null){
            myModelImp = MyModelImp()
        }
        myModelImp.getMyLog()
    }

    /**
     *取得固定值 並設定在msgTv
     * */
    private fun getString(){
        if(myModelImp == null){
            myModelImp = MyModelImp()
        }
        //固定string 設定 textView
        msgTv.text = myModelImp.getMyStringText()
    }

    /**
     *取得res資源，並設定在msgTv
     * */
    private fun getStringFromRes(){
        if(myModelImp == null){
            myModelImp = MyModelImp()
        }
        //透過 context 取得getString 設定 textView
        msgTv.text = myModelImp.getStringFromRes(this)
    }

    /**
     *發起一個request並實作成功與失敗處理
     * */
    private fun sendRequest(){
        if(myModelImp == null){
            myModelImp = MyModelImp()
        }
        //建立一個request並實作成功與失敗處理
        myModelImp.startRequest(object : MyModelListener{
            //MyModelListener
            override fun onSuccess() {
                Log.i(TAG,"onSuccess")
                msgTv.text = "onSuccess"
            }

            override fun onFail() {
                Log.i(TAG,"onFail")
                msgTv.text = "onFail"
            }
        })
    }


}
