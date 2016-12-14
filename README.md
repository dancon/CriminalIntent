# Frament

每个 Android 项目都有两个 build.gradle 文件， 一个是管理整个项目的，一个用于应用模块。

Android 模块的依赖可以通过 Maven 坐标模式：

```
    groupId:artifactId:version
```

其中 groupId 是包名，比如添加 support 库 `com.android.support:support-v4:25.0.1`, `com.android.support` 就是 groupId.

artifactId 是特定的库名， `support-v4` 就是 artifactId.

version 就是版本号。

Fragment 的视图的实例化是在 onCreateView 生命周期方法中完成的。

我们可以通过 style 属性来为组件设置自定义的样式。

res 目录下在 style.xml 中设置样式如下：

```
    <style name="BigTextSize">
        <item name="android:textSize">20dp</item>
        <item name="android:padding">10dp</item>
        <item name="android:textColor">@color/colorFont</item>
    </style>
```

组件中通过 `@style/BigTextSize` 来引用。

不以 layout_ 开头的属性作用于组件。

以 layout_ 开头的属性作用于组件的负组件。