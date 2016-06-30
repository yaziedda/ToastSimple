package com.dizzay.toastsimpleutil;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 6/30/16.
 */
public class ToastSimple {

    public static void ToastSimpleShow(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void ToastSimpleShow(Context context, String message, boolean fast) {
        if(fast){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }

    public static void ToastSimpleShow(Context context, String message, int interval) {
        Toast.makeText(context, message, interval).show();
    }
}
