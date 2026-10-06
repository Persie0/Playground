package p000;

import android.app.ActivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fex {

    /* JADX INFO: renamed from: a */
    public static final few f21589a = new few();

    /* JADX INFO: renamed from: a */
    public static boolean m8318a(ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }
}
