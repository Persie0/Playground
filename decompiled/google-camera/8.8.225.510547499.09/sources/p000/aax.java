package p000;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aax {
    /* JADX INFO: renamed from: a */
    public static Intent m66a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m67b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m68c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* JADX INFO: renamed from: d */
    public static int m69d(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: e */
    public static float m70e(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }
}
