package com.dexin.jingnan.mvpstudy.basepresenter.view

/**
 * @author fanjingnan
 * create at 2018/4/19
 * description:
 */
open class BasePresenter<T:BaseView> {
   lateinit var mView :T
}