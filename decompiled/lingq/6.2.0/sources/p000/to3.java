package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class to3 {

    /* JADX INFO: renamed from: b */
    public static boolean f62635b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f62636c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f62638e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f62634a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f62637d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static boolean m22258a(Context context) {
        try {
            if (!f62636c) {
                PackageInfo packageInfoM23949b = m9b.m16702a(context).m23949b(134217792, "com.google.android.gms");
                wo3.m24090a(context);
                if (packageInfoM23949b == null || wo3.m24091d(packageInfoM23949b, false) || !wo3.m24091d(packageInfoM23949b, true)) {
                    f62635b = false;
                } else {
                    f62635b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f62636c = true;
        }
        return f62635b || !"user".equals(Build.TYPE);
    }
}
