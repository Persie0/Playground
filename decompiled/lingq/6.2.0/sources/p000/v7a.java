package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v7a implements Runnable {

    /* JADX INFO: renamed from: g */
    public static final Object f64983g = new Object();

    /* JADX INFO: renamed from: h */
    public static Boolean f64984h;

    /* JADX INFO: renamed from: i */
    public static Boolean f64985i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64986a = 1;

    /* JADX INFO: renamed from: b */
    public final long f64987b;

    /* JADX INFO: renamed from: c */
    public final Object f64988c;

    /* JADX INFO: renamed from: d */
    public final Object f64989d;

    /* JADX INFO: renamed from: e */
    public final Object f64990e;

    /* JADX INFO: renamed from: f */
    public final Object f64991f;

    public v7a(t7a t7aVar, Context context, lj1 lj1Var, long j) {
        this.f64991f = t7aVar;
        this.f64988c = context;
        this.f64987b = j;
        this.f64989d = lj1Var;
        this.f64990e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23155a(Context context) {
        boolean zBooleanValue;
        synchronized (f64983g) {
            try {
                Boolean bool = f64985i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m23156b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f64985i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23156b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23157c(Context context) {
        boolean zBooleanValue;
        synchronized (f64983g) {
            try {
                Boolean bool = f64984h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m23156b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f64984h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m23158d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f64988c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM23157c;
        int i = this.f64986a;
        Object obj = this.f64990e;
        Object obj2 = this.f64989d;
        Object obj3 = this.f64991f;
        Object obj4 = this.f64988c;
        switch (i) {
            case 0:
                t7a t7aVar = (t7a) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (m23157c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    t7aVar.m21891d(true);
                    if (!((lj1) obj2).m16249e()) {
                        t7aVar.m21891d(false);
                        if (!zM23157c) {
                            return;
                        }
                    } else if (!m23155a(context) || m23158d()) {
                        if (t7aVar.m21892e()) {
                            t7aVar.m21891d(false);
                        } else {
                            t7aVar.m21893f(this.f64987b);
                        }
                        if (!zM23157c) {
                            return;
                        }
                    } else {
                        new u7a(this, this).m22521a();
                        if (!zM23157c) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    t7aVar.m21891d(false);
                    if (!zM23157c) {
                        return;
                    }
                } finally {
                    if (m23157c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                j0d j0dVar = (j0d) obj3;
                rad radVar = ((kjc) j0dVar.f60774a).f47441i;
                kjc.m15278j(radVar);
                j0dVar.m14239J((bzc) obj2, (bzc) obj, this.f64987b, true, radVar.m20531N("screen_view", bundle, null, false));
                return;
        }
    }

    public v7a(j0d j0dVar, Bundle bundle, bzc bzcVar, bzc bzcVar2, long j) {
        this.f64988c = bundle;
        this.f64989d = bzcVar;
        this.f64990e = bzcVar2;
        this.f64987b = j;
        Objects.requireNonNull(j0dVar);
        this.f64991f = j0dVar;
    }
}
