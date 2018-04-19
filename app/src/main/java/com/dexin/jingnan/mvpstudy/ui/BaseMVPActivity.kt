package com.dexin.jingnan.mvpstudy.ui

import com.dexin.jingnan.mvpstudy.basepresenter.view.BasePresenter
import com.dexin.jingnan.mvpstudy.basepresenter.view.BaseView

/**
 * @author fanjingnan
 * create at 2018/4/19
 * description:
 */
open class BaseMVPActivity<T:BasePresenter<*>>:BaseActivity(), BaseView{
    lateinit var mPresenter: T
    override fun hideLoading() {

    }

    override fun showLoading() {
    }

    override fun error() {
    }
}