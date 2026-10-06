package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdn {

    /* JADX INFO: renamed from: a */
    public static volatile Set f33805a;

    /* JADX INFO: renamed from: d */
    private static jdn f33806d;

    /* JADX INFO: renamed from: b */
    public final Context f33807b;

    /* JADX INFO: renamed from: c */
    public volatile String f33808c;

    public jdn(Context context) {
        this.f33807b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static jdn m12933a(Context context) {
        jib.m13205j(context);
        synchronized (jdn.class) {
            if (f33806d == null) {
                jdh.m12920a(context);
                f33806d = new jdn(context);
            }
        }
        return f33806d;
    }

    /* JADX INFO: renamed from: b */
    static final jhr m12934b(PackageInfo packageInfo, jhr... jhrVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        jde jdeVar = new jde(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < jhrVarArr.length; i++) {
            if (jhrVarArr[i].equals(jdeVar)) {
                return jhrVarArr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12935c(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m12934b(packageInfo, jdg.f33778a) : m12934b(packageInfo, jdg.f33778a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
