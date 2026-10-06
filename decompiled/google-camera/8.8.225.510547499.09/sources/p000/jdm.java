package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdm {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f33802c = 0;

    /* JADX INFO: renamed from: d */
    private static boolean f33803d = false;

    /* JADX INFO: renamed from: a */
    static boolean f33800a = false;

    /* JADX INFO: renamed from: b */
    @Deprecated
    static final AtomicBoolean f33801b = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private static final AtomicBoolean f33804e = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static int m12929a(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C0100R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", CswIK.FMjTYzvvMwCsQbn);
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f33804e.get()) {
            synchronized (jhw.f34093a) {
                if (!jhw.f34094b) {
                    jhw.f34094b = true;
                    try {
                        Bundle bundle = jiz.m13300b(context).m14247m(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            jhw.f34095c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i2 = jhw.f34095c;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 230608000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        if (jit.m13235c(context)) {
            z = false;
        } else {
            if (jit.f34139a == null) {
                boolean z2 = context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
                jit.f34139a = Boolean.valueOf(z2);
            }
            if (jit.f34139a.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        jib.m13196a(true);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                return 9;
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            jdn.m12933a(context);
            if (!jdn.m12935c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(voNZjxiJou.EEQ));
                return 9;
            }
            if (z) {
                jib.m13205j(packageInfo);
                if (!jdn.m12935c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    return 9;
                }
            }
            if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                return 9;
            }
            if (jiy.m13278e(packageInfo2.versionCode) >= jiy.m13278e(i)) {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e3) {
                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
            return 2;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12930b(Context context) {
        try {
            if (!f33800a) {
                PackageInfo packageInfoM14248n = jiz.m13300b(context).m14248n("com.google.android.gms", 64);
                jdn.m12933a(context);
                if (packageInfoM14248n == null || jdn.m12935c(packageInfoM14248n, false) || !jdn.m12935c(packageInfoM14248n, true)) {
                    f33803d = false;
                } else {
                    f33803d = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f33800a = true;
        }
        return f33803d || !"user".equals(Build.TYPE);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static boolean m12931c(Context context, int i) {
        if (i == 1) {
            return m12932d(context);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12932d(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            try {
                return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
