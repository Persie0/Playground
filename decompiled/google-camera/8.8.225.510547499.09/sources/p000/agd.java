package p000;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agd {

    /* JADX INFO: renamed from: a */
    public static Field f292a;

    /* JADX INFO: renamed from: b */
    public static Field f293b;

    /* JADX INFO: renamed from: c */
    public static Field f294c;

    /* JADX INFO: renamed from: d */
    public static boolean f295d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f292a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f293b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f294c = declaredField3;
            declaredField3.setAccessible(true);
            f295d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
