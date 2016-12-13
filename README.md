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