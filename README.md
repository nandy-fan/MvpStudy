# mvp配置总结
![来自慕课网.png](https://upload-images.jianshu.io/upload_images/3404918-d22181427c9b0775.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## mvp架构分析
1. BasePresenter <T>对BaseView的持有。
![Baseview的创建](https://upload-images.jianshu.io/upload_images/3404918-4e251d89c080b13b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![p持有b](https://upload-images.jianshu.io/upload_images/3404918-8d58b64ebd70d934.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

2. Activity承载
>知识点插入
>泛型通配符?本意就表示符合条件的任意一个对象。比较一下另外一个通配符\*，它表示符合条件的所有对象的集合，似乎在Java泛型中没有什么场合需要通配符\*。
>*lateinit 只用于 var，而 lazy 只用于 val
>*lazy 应用于单例模式(if-null-then-init-else-return)，而且当且仅当变量被第一次调用的时候，委托方法才会执行。
*lateinit 则用于只能生命周期流程中进行获取或者初始化的变量，比如 Android 的 onCreate()
![承载activity](https://upload-images.jianshu.io/upload_images/3404918-de6e353c83e864bc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
3. 注册一个RegisterActivity继承BaseActivity<RegisterPresenter>
![](https://upload-images.jianshu.io/upload_images/3404918-97d1cd767eaf30d1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
4. 创建RegisterPresenter和RegiseterView，承载的RegisterActivity
![](https://upload-images.jianshu.io/upload_images/3404918-9aa963b33924aefe.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](https://upload-images.jianshu.io/upload_images/3404918-21dc6a1407ed0478.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![](https://upload-images.jianshu.io/upload_images/3404918-975f3bc637779a72.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
>总结Mvp，首先创建接口（意图）写出来baseview，将想法实现过程就是basepresenter，展示出来承载的baseActivity。
