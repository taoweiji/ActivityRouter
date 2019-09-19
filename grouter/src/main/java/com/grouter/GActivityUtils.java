package com.grouter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;

import com.grouter.core.R;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.List;


@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class GActivityUtils {


    /**
     * 从右边离开
     * 对应 {@linkplain GActivityBuilder#asRightIn}
     */
    public static void finishAsRightOut(Activity activity) {
        if (!activity.isFinishing()){
            activity.finish();
        }
        activity.overridePendingTransition(R.anim.activity_left_to_right_enter,R.anim.activity_left_to_right_exit);
    }

    /**
     * 从左边离开
     * 对应 {@linkplain GActivityBuilder#asLeftIn}
     */
    public static void finishAsLeftOut(Activity activity) {
        if (!activity.isFinishing()){
            activity.finish();
        }
        activity.overridePendingTransition(R.anim.activity_right_to_left_enter,R.anim.activity_right_to_left_exit);
    }

    /**
     * 从底部离开
     * 对应 {@linkplain GActivityBuilder#asBottomIn}
     */
    public static void finishAsBottomOut(Activity activity) {
        if (!activity.isFinishing()){
            activity.finish();
        }
        activity.overridePendingTransition(R.anim.activity_top_to_bottom_enter,R.anim.activity_top_to_bottom_exit);
    }

    /**
     * 从顶部离开
     * 对应 {@linkplain GActivityBuilder#asTopIn}
     */
    public static void finishAsTopOut(Activity activity) {
        if (!activity.isFinishing()){
            activity.finish();
        }
        activity.overridePendingTransition(R.anim.activity_bottom_to_top_enter,R.anim.activity_bottom_to_top_exit);
    }


    /**
     * 淡出
     * 对应 {@linkplain GActivityBuilder#asFadeIn}
     */
    public static void finishAsFadeOut(Activity activity) {
        if (!activity.isFinishing()){
            activity.finish();
        }
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}