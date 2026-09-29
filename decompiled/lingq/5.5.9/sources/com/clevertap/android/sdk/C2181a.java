package com.clevertap.android.sdk;

import android.util.Log;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: com.clevertap.android.sdk.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2181a {

    /* JADX INFO: renamed from: a */
    public final int f11017a;

    public C2181a(int i10) {
        this.f11017a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static void m6449a(String str) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6450b(String str, String str2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap:" + str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6451c(String str) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap", str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6452d(String str, String str2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
            if (str2.length() > 4000) {
                Log.d(C0204c.m852k("CleverTap:", str), str2.substring(0, 4000));
                m6452d(str, str2.substring(4000));
            } else {
                Log.d("CleverTap:" + str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m6453e(String str, String str2, Throwable th2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.d("CleverTap:" + str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m6454f(String str) {
        if (CleverTapAPI.f10977c >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap", str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6455h(String str) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m6456i(String str, String str2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap:" + str, str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m6457j(String str, Throwable th2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str, th2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m6458k(String str) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m6459l(String str, Exception exc) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap", str, exc);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m6460m(String str, String str2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            if (str2.length() > 4000) {
                Log.v(C0204c.m852k("CleverTap:", str), str2.substring(0, 4000));
                m6460m(str, str2.substring(4000));
            } else {
                Log.v("CleverTap:" + str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m6461n(String str, String str2, Throwable th2) {
        if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.DEBUG.intValue()) {
            Log.v("CleverTap:" + str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6462g(String str, String str2) {
        if (this.f11017a >= CleverTapAPI.LogLevel.INFO.intValue()) {
            Log.i("CleverTap:" + str, str2);
        }
    }
}
