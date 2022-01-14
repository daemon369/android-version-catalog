# gradle-dependency-version-catalog

## 使用要求

`0.0.5`以上要求使用`gradle7.2`以上版本并开启特性预览：

```
// settings.gradle(.kts)
enableFeaturePreview("VERSION_CATALOGS")
```

`0.0.1`-`0.0.4`要求使用`gradle7.0`以上版本并同样开启特性预览

## 版本号

| 版本号名称          | 当前版本号  | 发布版本 | 说明 |
| --- | --- | --- | --- |
| kotlin            | 1.6.10    | 0.0.8     | kotlin版本号 |
| kotlin-coroutines | 1.6.0     | 0.0.8     | kotlin协程版本号 |
| x-lifecycle       | 2.4.0     | 0.0.3     | androidX lifecycle版本号 |
| x-room            | 2.4.1     | 0.0.12    | androidX room版本号 |
| | | | |

## 库

| 库别名                                     | 具体库                                                     | 库版本号    | 发布版本 | 说明 |
| ---                                       | ---                                                       | ---       | ---       | --- |
| gradle                                    | com.android.tools.build:gradle                            | 7.0.4     | 0.0.8     | android gradle插件库 |
| kotlin                                    | org.jetbrains.kotlin:kotlin-stdlib                        | 1.6.10    | 0.0.8     | kotlin标准库 |
| kotlin-coroutines-core                    | org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm         | 1.6.0     | 0.0.8     | kotlin协程库 |
| kotlin-coroutines-android                 | org.jetbrains.kotlinx:kotlinx-coroutines-android          | 1.6.0     | 0.0.8     | kotlin协程库 |
| kotlin-plugin                             | org.jetbrains.kotlin:kotlin-gradle-plugin                 | 1.6.10    | 0.0.8     | kotlin插件库 |
| x-annotation                              | androidx.annotation:annotation                            | 1.3.0     | 0.0.2     | AndroidX注解库 |
| x-core                                    | androidx.core:core                                        | 1.7.0     | 0.0.5     |  |
| x-core-ktx                                | androidx.core:core-ktx                                    | 1.7.0     | 0.0.2     |  |
| x-appcompat                               | androidx.appcompat:appcompat                              | 1.4.1     | 0.0.12    |  |
| x-lifecycle-common                        | androidx.lifecycle:lifecycle-common                       | 2.4.0     | 0.0.2     |  |
| x-lifecycle-livedata                      | androidx.lifecycle:lifecycle-livedata                     | 2.4.0     | 0.0.2     |  |
| x-lifecycle-livedata-ktx                  | androidx.lifecycle:lifecycle-livedata-ktx                 | 2.4.0     | 0.0.11    |  |
| x-lifecycle-viewmodel                     | androidx.lifecycle:lifecycle-viewmodel                    | 2.4.0     | 0.0.2     |  |
| x-lifecycle-viewmodel-ktx                 | androidx.lifecycle:lifecycle-viewmodel-ktx                | 2.4.0     | 0.0.11    |  |
| x-activity                                | androidx.activity:activity                                | 1.4.0     | 0.0.2     |  |
| x-activity-ktx                            | androidx.activity:activity-ktx                            | 1.4.0     | 0.0.10    |  |
| x-fragment                                | androidx.fragment:fragment                                | 1.4.0     | 0.0.9     |  |
| x-fragment-ktx                            | androidx.fragment:fragment-ktx                            | 1.4.0     | 0.0.10    |  |
| x-room-runtime                            | androidx.room:room-runtime                                | 2.4.0     | 0.0.10    |  |
| x-room-compiler                           | androidx.room:room-compiler                               | 2.4.0     | 0.0.10    |  |
| x-constraintlayout                        | androidx.constraintlayout:constraintlayout                | 2.1.2     | 0.0.6     |  |
| x-recyclerview                            | androidx.recyclerview:recyclerview                        | 1.2.1     | 0.0.10    |  |
| x-junit                                   | androidx.test.ext:junit                                   | 1.1.2     | 0.0.4     |  |
| x-espresso-core                           | androidx.test.espresso:espresso-core                      | 3.3.0     | 0.0.4     |  |
| junit                                     | junit:junit                                               | 4.13.2    | 0.0.4     |  |
|                                           |                                                           |           |           |  |
| daemon-annotation                         | io.github.daemon369:annotation                            | 0.1.0     | 0.0.2     | 注解库 |
| daemon-infrastructure-application         | io.github.daemon369:android-infrastructure-application    | 1.1.0     | 0.0.9     | 基础库，提供Application全局实例 |
| daemon-infrastructure                     | io.github.daemon369:android-infrastructure                | 0.3.0     | 0.0.5     | 基础库，提供基础工具 |
| daemon-logger-api                         | io.github.daemon369:logger-api                            | 0.3.0     | 0.0.8     | Logger API |
| daemon-logger                             | io.github.daemon369:android-logger                        | 0.3.0     | 0.0.8     | Logger |
| daemon-view                               | io.github.daemon369:android-view-common                   | 0.3.0     | 0.0.2     | 基础UI库 |
| | | | | |

## 插件

| 插件别名 | 具体插件 | 当前版本号 | 发布版本 | 说明 |
| --- | --- | --- | --- | --- |
| | | | | |

## 包

| 包名 | 包含的库 | 发布版本 | 说明 |
| --- | --- | --- | --- |
| | | | |

# 已废弃的

已废弃的版本号、库、插件、包查看文档[OBSOLETED.md](OBSOLETED.md)
