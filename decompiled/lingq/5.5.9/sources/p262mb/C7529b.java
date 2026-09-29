package p262mb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;

/* JADX INFO: renamed from: mb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7529b {

    /* JADX INFO: renamed from: a */
    public static Boolean f41599a;

    /* JADX INFO: renamed from: b */
    public static Boolean f41600b;

    /* JADX INFO: renamed from: c */
    public static Boolean f41601c;

    /* JADX INFO: renamed from: d */
    public static Boolean f41602d;

    @SideEffectFree
    @TargetApi(20)
    /* JADX INFO: renamed from: a */
    public static boolean m15040a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f41599a == null) {
            f41599a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f41599a.booleanValue();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: b */
    public static boolean m15041b(Context context) {
        m15040a(context);
        if (f41600b == null) {
            f41600b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f41600b.booleanValue()) {
            if (Build.VERSION.SDK_INT >= 30) {
                return true;
            }
        }
        return false;
    }
}
