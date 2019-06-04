# MAnim

#### 介绍
最近做微信小游戏的时候接触了一下白鹭引擎，然后才明白什么才叫动画，Android为啥做个动画就这么难呢？我希望从这个项目开始让安卓的动画也能简单起来，这就是我这个开源项目的初衷。持续更新，功能慢慢添加...

录制的 GIF 太难看，点击[查看视频](http://192.144.156.10/manim.mp4)


#### 用法 V1.0.0

1.如果你想执行个缩放动画该怎么用？
```
 MAnim.getInstance()
       .with(imageView)
       .scaleXY(2000, 1f, 3f, 1f)
       .start()
```
2.如果你想执行个透明度动画该怎么用？
```
 MAnim.getInstance()
       .with(imageView)
       .alpha(2000, 1f, 0.1f, 1f)
       .start()
```
3.如果你想执行个X轴移动的动画该怎么用？
```
 MAnim.getInstance()
       .with(imageView)
       .rotationX(2000, 0f, 360f, 0f)
       .start()
```
... 

想必大家也都知道用法了吧 

| 动画名称 | 动画|
|---|---|
|  X轴缩放 | scaleX|
|  Y轴缩放 | scaleY|
|  整体缩放 | scaleXY|
|  透明度 | alpha|
|  绕X轴旋转 | rotationX|
|  绕Y轴旋转 | rotationY|
|  绕X轴和Y轴的对称线旋转 | rotationXY |
|  绕中心点旋转 |rotation|
|  X轴方向移动 |translationX |
|  Y轴方向移动 | translationY|
|  XY轴对称线方向移动 |translationXY |
|  -XY轴对称线方向移动 | translationYX|


那么如果我想按照顺序执行一系列的动画怎么办？
```
  MAnim.getInstance()
       .with(imageView)
       .scaleXY(2000, 1f, 3f, 1f)
       .alpha(2000, 1f, 0.1f, 1f)
       .rotationX(2000, 0f, 360f, 0f)
       .rotationY(2000, 0f, 360f, 0f)
       .rotationXY(2000, 0f, 360f, 0f)
       .rotation(2000, 0f, 720f, 0f)
       .translationX(2000, 0f, 300f, -300f, 0f)
       .translationY(2000, 0f, 300f, -300f, 0f)
       .translationXY(2000, 0f, 300f, -300f, 0f)
       .translationYX(2000, 0f, -300f, 300f, 0f)
       .start()
```
并且我还想每执行完一段动画都要有一个操作，那有没有动画执行完之后的回调方法呀？
答案肯定是有的呀，就照着这个写就可以啦
```
 MAnim.getInstance()
      .with(imageView)
      .scaleXY(2000, 1f, 3f, 1f)
      .call {
           //执行完scaleXY动画后的回调         
      }
      .alpha(2000, 1f, 0.1f, 1f)
      .call {
            //执行完alpha动画后的回调   
      }
      .rotationX(2000, 0f, 360f, 0f)
      .call {
            //执行完rotationX动画后的回调   
      }
      .start()
```

具体参数可以查看源码.

那是不是到了这里就没了？不不不，我们还有硬菜呢，有的童鞋会问，如果我想同时执行两个动画或者多个动画，行不行？能不能满足？
答案当然是可以的呀。
例如：一个图片，在执行缩放动画的时候同时执行透明度变换还要沿着X轴向右移动
```
 MAnim.getInstance()
       .with(imageView)
       .scaleXY(2000, 1f, 3f, 1f)
       .start()
 MAnim.getInstance()
       .with(imageView)
       .alpha(2000, 1f, 0.1f, 1f)
       .start()
 MAnim.getInstance()
       .with(imageView)
       .rotationX(2000, 0f, 360f, 0f)
       .start()
```
是不是很简单？

由于JCenter还没弄好，所以就先提供aar文件，大家下载引用一下即可。

[下载V1.0.0 aar文件](/manim/aar/manim-release-v1.0.0.aar)

#### 写在最后
现在的V1.0.0已经完成，使用方式的话我相信大多数人都会觉得这样来执行一个动画似乎简单多了，但大家也看出来了目前来说动画的执行局限
还有很多，那么接下来的时间我会一直来更新维护这个项目，目的就是让android的动画简单化，bug是避免不了的，所以希望大家能一起交流
有问题可以提交个Issue,以及大家希望添加的功能也都可以留言。我会尽可能的完善大家提交的bug和功能，预计每周一个小版本，两周一个大版本。



