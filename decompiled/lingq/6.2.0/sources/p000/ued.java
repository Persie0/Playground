package p000;

import android.view.Gravity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ued {
    /* JADX INFO: renamed from: a */
    public static int m22721a(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22722b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
