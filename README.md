
Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        //...omitted for brevity
        maven { url 'https://jitpack.io' }
    }
}
```



Add the dependency

```groovy
dependencies {
    implementation "com.github.nsshopping:nslib-analytics-android:$latest_release"
}
```
<br>


