package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p290o6.C7967l0;
import p326q.AbstractC8451g;
import p326q.C8446b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2671g4 {

    /* JADX INFO: renamed from: h */
    public static final C8446b f14206h = new C8446b();

    /* JADX INFO: renamed from: i */
    public static final String[] f14207i = {"key", "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f14208a;

    /* JADX INFO: renamed from: b */
    public final Uri f14209b;

    /* JADX INFO: renamed from: c */
    public final Runnable f14210c;

    /* JADX INFO: renamed from: d */
    public final C2657f4 f14211d;

    /* JADX INFO: renamed from: e */
    public final Object f14212e;

    /* JADX INFO: renamed from: f */
    public volatile Map f14213f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f14214g;

    public C2671g4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2657f4 c2657f4 = new C2657f4(this);
        this.f14211d = c2657f4;
        this.f14212e = new Object();
        this.f14214g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f14208a = contentResolver;
        this.f14209b = uri;
        this.f14210c = runnable;
        contentResolver.registerContentObserver(uri, false, c2657f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C2671g4 m7843a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C2671g4 c2671g4;
        synchronized (C2671g4.class) {
            C8446b c8446b = f14206h;
            c2671g4 = (C2671g4) c8446b.getOrDefault(uri, null);
            if (c2671g4 == null) {
                try {
                    C2671g4 c2671g5 = new C2671g4(contentResolver, uri, runnable);
                    try {
                        c8446b.put(uri, c2671g5);
                    } catch (SecurityException unused) {
                    }
                    c2671g4 = c2671g5;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c2671g4;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m7844c() {
        for (C2671g4 c2671g4 : (AbstractC8451g.e) f14206h.values()) {
            c2671g4.f14208a.unregisterContentObserver(c2671g4.f14211d);
        }
        f14206h.clear();
    }

    /* JADX INFO: renamed from: b */
    public final Map m7845b() {
        Map map;
        Object objM15810k;
        Map map2 = this.f14213f;
        if (map2 == null) {
            synchronized (this.f14212e) {
                map2 = this.f14213f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            C7967l0 c7967l0 = new C7967l0(this);
                            try {
                                objM15810k = c7967l0.m15810k();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objM15810k = c7967l0.m15810k();
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                } catch (Throwable th2) {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    throw th2;
                                }
                            }
                            map = (Map) objM15810k;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = null;
                    }
                    this.f14213f = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }
}
