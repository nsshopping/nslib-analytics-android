
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
    implementation "com.github.nsshopping:nslib-security-android:$latest_release"
}
```
<br>

## Usage
### form
#### Transparent
###### Notification bar Transparent status processing

```
setTransparentBar(activity)
```
activity : Activity

<br>

#### Contrast
###### Display the icon of the notification bar and the background in a contrasting color
```
setContrastBar(activity, colorInt)
```
activity : Activity<br>
colorInt : Notification statusBar color
<br>
<br>

### Example
#### Transparent
```
setTransparentBar(this)
```

<br>

#### Contrast
```
setContrastBar(this, Color.parseColor("#FFFFFF"))
setContrastBar(this, Color.parseColor("#000000"))
```

<br>

### Licensed under the [MIT License](LICENSE)

```
MIT License

Copyright (c) 2021 ParkSangSun

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
