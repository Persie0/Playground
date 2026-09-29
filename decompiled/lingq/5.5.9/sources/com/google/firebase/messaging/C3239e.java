package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3239e {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f16378a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public static boolean m9254a(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
