package p000;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aaq {
    /* JADX INFO: renamed from: a */
    static void m33a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* JADX INFO: renamed from: b */
    static void m34b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: c */
    static boolean m35c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX INFO: renamed from: d */
    public static int m36d(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }
}
