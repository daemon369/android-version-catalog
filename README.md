# gradle-dependency-version-catalog

## 使用要求

`0.0.1`-`0.0.4`要求使用`gradle7.0`以上版本并开启特性预览：

```
// settings.gradle(.kts)
enableFeaturePreview("VERSION_CATALOGS")
```

`0.0.5`以上要求使用`gradle7.2`以上版本并同样开启特性预览

## 版本号

| 版本号名称          | 当前版本号  | 发布版本 | 说明 |
| --- | --- | --- | --- |
| ~~kotlin-std~~    | 1.5.31    | 0.0.1 | kotlin版本号 |
| kotlin            | 1.5.31    | 0.0.5 | kotlin版本号 |
| kotlin-coroutines | 1.5.2     | 0.0.4 | kotlin协程版本号 |
| x-lifecycle       | 2.4.0     | 0.0.3 | androidX lifecycle版本号 |
| | | | |

## 库

| 库别名                                     | 具体库                                                     | 库版本号    | 发布版本 | 说明 |
| ---                                       | ---                                                       | ---       | ---   | --- |
| gradle                                    | com.android.tools.build:gradle                            | 7.0.2     | 0.0.3 | android gradle插件库 |
| ~~kotlin-std~~                            | org.jetbrains.kotlin:kotlin-stdlib                        | 1.5.31    | 0.0.1 | kotlin标准库 |
| kotlin                                    | org.jetbrains.kotlin:kotlin-stdlib                        | 1.5.31    | 0.0.5 | kotlin标准库 |
| ~~kotlin-coroutines~~                     | org.jetbrains.kotlinx:kotlinx-coroutines-android          | 1.5.2     | 0.0.1 | kotlin协程库 |
| kotlin-coroutines-core                    | org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm         | 1.5.2     | 0.0.4 | kotlin协程库 |
| kotlin-coroutines-android                 | org.jetbrains.kotlinx:kotlinx-coroutines-android          | 1.5.2     | 0.0.4 | kotlin协程库 |
| kotlin-plugin                             | org.jetbrains.kotlin:kotlin-gradle-plugin                 | 1.5.31    | 0.0.1 | kotlin插件库 |
| x-annotation                              | androidx.annotation:annotation                            | 1.3.0     | 0.0.2 | AndroidX注解库 |
| ~~x-core-core~~                           | androidx.core:core                                        | 1.7.0     | 0.0.2 |  |
| x-core                                    | androidx.core:core                                        | 1.7.0     | 0.0.5 |  |
| x-core-ktx                                | androidx.core:core-ktx                                    | 1.7.0     | 0.0.2 |  |
| x-appcompat                               | androidx.appcompat:appcompat                              | 1.3.1     | 0.0.2 |  |
| x-lifecycle-common                        | androidx.lifecycle:lifecycle-common                       | 2.4.0     | 0.0.2 |  |
| x-lifecycle-livedata                      | androidx.lifecycle:lifecycle-livedata                     | 2.4.0     | 0.0.2 |  |
| x-lifecycle-viewmodel                     | androidx.lifecycle:lifecycle-viewmodel                    | 2.4.0     | 0.0.2 |  |
| x-activity                                | androidx.activity:activity                                | 1.4.0     | 0.0.2 |  |
| x-fragment                                | androidx.fragment:fragment                                | 1.3.6     | 0.0.2 |  |
| x-constraintlayout                        | androidx.constraintlayout:constraintlayout                | 2.1.1     | 0.0.2 |  |
| x-junit                                   | androidx.test.ext:junit                                   | 1.1.2     | 0.0.4 |  |
| x-espresso-core                           | androidx.test.espresso:espresso-core                      | 3.3.0     | 0.0.4 |  |
| junit                                     | junit:junit                                               | 4.13.2    | 0.0.4 |  |
|                                           |                                                           |           |       |  |
| daemon-annotation                         | io.github.daemon369:annotation                            | 0.1.0     | 0.0.2 | 注解库 |
| daemon-infrastructure-application         | io.github.daemon369:android-infrastructure-application    | 0.1.1     | 0.0.2 | 基础库，提供Application全局实例 |
| ~~daemon-infrastructure-infrastructure~~  | io.github.daemon369:android-infrastructure                | 0.3.0     | 0.0.2 | 基础库，提供基础工具 |
| daemon-infrastructure                     | io.github.daemon369:android-infrastructure                | 0.3.0     | 0.0.5 | 基础库，提供基础工具 |
| daemon-view                               | io.github.daemon369:android-view-common                   | 0.3.0     | 0.0.2 | 基础UI库 |
| | | | | |

## 插件

| 插件别名 | 具体插件 | 当前版本号 | 发布版本 | 说明 |
| --- | --- | --- | --- | --- |
| | | | | |

## 包

| 包名 | 包含的库 | 发布版本 | 说明 |
| --- | --- | --- | --- |
| | | | |
