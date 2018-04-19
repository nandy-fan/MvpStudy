package com.dexin.jingnan.mvpstudy.presenter

import com.dexin.jingnan.mvpstudy.basepresenter.view.BasePresenter
import com.dexin.jingnan.mvpstudy.presenter.view.LoginView

/**
 * @author fanjingnan
 * create at 2018/4/19
 * description:
 */
class LoginPresenter: BasePresenter<LoginView>() {

    fun login(name : String,password :String){

        mView.loginResult(true)
    }
}