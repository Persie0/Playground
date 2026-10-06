package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jit {

    /* JADX INFO: renamed from: a */
    public static Boolean f34139a;

    /* JADX INFO: renamed from: b */
    public static Boolean f34140b;

    /* JADX INFO: renamed from: c */
    private static Boolean f34141c;

    /* JADX INFO: renamed from: d */
    private static Boolean f34142d;

    /* JADX INFO: renamed from: a */
    public static boolean m13233a(Context context) {
        return m13234b(context.getPackageManager());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13234b(PackageManager packageManager) {
        if (f34141c == null) {
            f34141c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f34141c.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13235c(Context context) {
        if (f34142d == null) {
            f34142d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f34142d.booleanValue();
    }
}
