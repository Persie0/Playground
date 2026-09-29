package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class tz1 {

    /* JADX INFO: renamed from: a */
    public boolean f63122a;

    /* JADX INFO: renamed from: b */
    public final Object f63123b;

    /* JADX INFO: renamed from: c */
    public Object f63124c;

    /* JADX INFO: renamed from: d */
    public Object f63125d;

    /* JADX INFO: renamed from: e */
    public Object f63126e;

    /* JADX INFO: renamed from: f */
    public Object f63127f;

    public tz1(q43 q43Var) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f63124c = new Object();
        this.f63125d = new wr9();
        this.f63122a = false;
        this.f63126e = new wr9();
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        this.f63123b = q43Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f63122a = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                this.f63122a = false;
                boolValueOf = null;
            } else {
                this.f63122a = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f63127f = boolValueOf;
        synchronized (this.f63124c) {
            try {
                if (m22354a()) {
                    ((wr9) this.f63125d).m24140d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m22354a() {
        boolean zM19648h;
        Boolean bool = (Boolean) this.f63127f;
        if (bool != null) {
            zM19648h = bool.booleanValue();
        } else {
            try {
                zM19648h = ((q43) this.f63123b).m19648h();
            } catch (IllegalStateException unused) {
                zM19648h = false;
            }
        }
        m22355b(zM19648h);
        return zM19648h;
    }

    /* JADX INFO: renamed from: b */
    public void m22355b(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f63127f) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f63122a ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strM22991n = ux5.m22991n("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM22991n, null);
        }
    }

    public tz1(int i, float f, AbstractC0150d abstractC0150d) {
        this.f63123b = abstractC0150d;
        this.f63125d = AbstractC0278f.m1257g(i);
        this.f63126e = AbstractC0278f.m1256f(f);
        this.f63127f = new eu4(i, 30, 100);
    }

    public tz1(Context context, pc0 pc0Var, qfa qfaVar) {
        this.f63123b = context;
        this.f63124c = pc0Var;
        this.f63125d = qfaVar;
        this.f63126e = new qfb(this, true);
        this.f63127f = new qfb(this, false);
    }

    public tz1(Context context) {
        this.f63123b = context;
        C3627tx c3627tx = C3627tx.f63029f;
    }
}
