package com.grouter.kotlinextensions

import android.app.Activity
import com.grouter.GActivityUtils

//fun Activity.

/**
 * 从右边离开
 * 对应 [com.grouter.GActivityUtils).asRightIn]
 */
fun Activity.finishAsRightOut() {
    GActivityUtils.finishAsRightOut(this)
}

/**
 * 从左边离开
 * 对应 [com.grouter.GActivityUtils).asLeftIn]
 */
fun Activity.finishAsLeftOut() {
    GActivityUtils.finishAsLeftOut(this)
}

/**
 * 从底部离开
 * 对应 [com.grouter.GActivityUtils).asBottomIn]
 */
fun Activity.finishAsBottomOut() {
    GActivityUtils.finishAsBottomOut(this)
}

/**
 * 从顶部离开
 * 对应 [com.grouter.GActivityUtils).asTopIn]
 */
fun Activity.finishAsTopOut() {
    GActivityUtils.finishAsTopOut(this)
}


/**
 * 淡出
 * 对应 [com.grouter.GActivityUtils).asFadeIn]
 */
fun Activity.finishAsFadeOut() {
    GActivityUtils.finishAsFadeOut(this)
}