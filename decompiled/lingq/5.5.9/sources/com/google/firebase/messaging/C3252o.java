package com.google.firebase.messaging;

import ae.C0065e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: renamed from: com.google.firebase.messaging.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3252o {

    /* JADX INFO: renamed from: a */
    public final Context f16409a;

    /* JADX INFO: renamed from: b */
    public String f16410b;

    /* JADX INFO: renamed from: c */
    public String f16411c;

    /* JADX INFO: renamed from: d */
    public int f16412d;

    /* JADX INFO: renamed from: e */
    public int f16413e = 0;

    public C3252o(Context context) {
        this.f16409a = context;
    }

    /* JADX INFO: renamed from: a */
    public static String m9271a(C0065e c0065e) {
        c0065e.m437a();
        String str = c0065e.f173c.f187e;
        if (str != null) {
            return str;
        }
        c0065e.m437a();
        String str2 = c0065e.f173c.f184b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: b */
    public final PackageInfo m9272b(String str) {
        try {
            return this.f16409a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9273c() {
        int i10;
        synchronized (this) {
            try {
                i10 = this.f16413e;
                if (i10 == 0) {
                    PackageManager packageManager = this.f16409a.getPackageManager();
                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                        i10 = 0;
                    } else {
                        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            this.f16413e = 2;
                        } else {
                            this.f16413e = 2;
                        }
                        i10 = 2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10 != 0;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m9274d() {
        PackageInfo packageInfoM9272b = m9272b(this.f16409a.getPackageName());
        if (packageInfoM9272b != null) {
            this.f16410b = Integer.toString(packageInfoM9272b.versionCode);
            this.f16411c = packageInfoM9272b.versionName;
        }
    }
}
