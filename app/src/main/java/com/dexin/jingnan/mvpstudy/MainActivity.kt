package com.dexin.jingnan.mvpstudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.dexin.jingnan.mvpstudy.presenter.LoginPresenter
import com.dexin.jingnan.mvpstudy.presenter.view.LoginView
import com.dexin.jingnan.mvpstudy.ui.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseMVPActivity<LoginPresenter>(),LoginView {
    override fun loginResult(m: Boolean) {
        Log.i("jingnan","success")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        initData()

    }

    private fun initData() {
        mBtn.setOnClickListener(){
            mPresenter.login("","")
        }
    }

    private fun init() {
        mPresenter = LoginPresenter()
        mPresenter.mView = this

    }
}
