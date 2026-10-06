package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oew {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f45814a = 0;

    /* JADX INFO: renamed from: b */
    private static final Class f45815b;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("android.view.DisplayCutout");
        } catch (Exception e) {
            Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            cls = null;
        }
        f45815b = cls;
    }

    /* JADX INFO: renamed from: a */
    public static final int m18445a(String str, Object obj) {
        try {
            return ((Integer) f45815b.getDeclaredMethod(str, new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (Exception e) {
            return 0;
        }
    }
}
