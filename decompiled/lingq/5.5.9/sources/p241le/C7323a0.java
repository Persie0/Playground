package p241le;

import ae.C0065e;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.kochava.tracker.BuildConfig;
import p136gc.C5752h;

/* JADX INFO: renamed from: le.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7323a0 {

    /* JADX INFO: renamed from: a */
    public final C0065e f41021a;

    /* JADX INFO: renamed from: d */
    public boolean f41024d;

    /* JADX INFO: renamed from: e */
    public final Boolean f41025e;

    /* JADX INFO: renamed from: b */
    public final Object f41022b = new Object();

    /* JADX INFO: renamed from: c */
    public final C5752h<Void> f41023c = new C5752h<>();

    /* JADX INFO: renamed from: f */
    public final C5752h<Void> f41026f = new C5752h<>();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7323a0(C0065e c0065e) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f41024d = false;
        c0065e.m437a();
        Context context = c0065e.f171a;
        this.f41021a = c0065e;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f41024d = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            if (boolValueOf2 == null) {
                this.f41024d = false;
                boolValueOf = null;
            } else {
                this.f41024d = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f41025e = boolValueOf;
        synchronized (this.f41022b) {
            if (m14737a()) {
                this.f41023c.m12116d(null);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m14737a() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f41025e;
            zBooleanValue = bool != null ? bool.booleanValue() : this.f41021a.m440g();
            m14738b(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m14738b(boolean z10) {
        Object obj;
        String str = z10 ? "ENABLED" : "DISABLED";
        if (this.f41025e == null) {
            obj = "global Firebase setting";
        } else {
            obj = this.f41024d ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String str2 = String.format("Crashlytics automatic data collection %s by %s.", str, obj);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }
}
