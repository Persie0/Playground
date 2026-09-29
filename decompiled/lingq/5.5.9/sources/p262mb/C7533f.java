package p262mb;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C2550e;
import com.google.android.gms.common.C2551f;
import p295ob.C8031a;
import p295ob.C8032b;

/* JADX INFO: renamed from: mb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7533f {
    /* JADX INFO: renamed from: a */
    public static boolean m15045a(Context context, int i10) {
        if (!m15046b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C2551f c2551fM7592a = C2551f.m7592a(context);
            c2551fM7592a.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!C2551f.m7594d(packageInfo, false)) {
                if (C2551f.m7594d(packageInfo, true)) {
                    if (!C2550e.honorsDebugCertificates(c2551fM7592a.f13924a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: b */
    public static boolean m15046b(Context context, int i10, String str) {
        C8031a c8031aM15902a = C8032b.m15902a(context);
        c8031aM15902a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c8031aM15902a.f43660a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
