package com.google.p020vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;
import p000.oev;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        String str = oev.f45813a;
        if (((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            Window window = activity.getWindow();
            if (window == null) {
                Log.e(oev.f45813a, "Activity does not have a window");
            } else {
                window.setSustainedPerformanceMode(z);
            }
        }
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return oev.m18443a(activity, z);
    }
}
