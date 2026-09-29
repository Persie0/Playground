package com.google.firebase.messaging;

import ae.C0065e;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import cf.InterfaceC2005b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p073df.AbstractC5165g;
import p073df.InterfaceC5162d;
import p115fb.C5486b;
import p115fb.C5496l;
import p115fb.C5499o;
import p115fb.C5500p;
import p115fb.C5501q;
import p115fb.ExecutorC5503s;
import p136gc.AbstractC5751g;
import p136gc.C5761q;
import p169i4.ExecutorC6178d;
import p200jf.InterfaceC6475g;
import p260m8.C7499b;
import p295ob.C8032b;
import p402u0.C9371n;

/* JADX INFO: renamed from: com.google.firebase.messaging.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3249l {

    /* JADX INFO: renamed from: a */
    public final C0065e f16400a;

    /* JADX INFO: renamed from: b */
    public final C3252o f16401b;

    /* JADX INFO: renamed from: c */
    public final C5486b f16402c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2005b<InterfaceC6475g> f16403d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2005b<HeartBeatInfo> f16404e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5162d f16405f;

    public C3249l(C0065e c0065e, C3252o c3252o, InterfaceC2005b<InterfaceC6475g> interfaceC2005b, InterfaceC2005b<HeartBeatInfo> interfaceC2005b2, InterfaceC5162d interfaceC5162d) {
        c0065e.m437a();
        C5486b c5486b = new C5486b(c0065e.f171a);
        this.f16400a = c0065e;
        this.f16401b = c3252o;
        this.f16402c = c5486b;
        this.f16403d = interfaceC2005b;
        this.f16404e = interfaceC2005b2;
        this.f16405f = interfaceC5162d;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5751g<String> m9265a(AbstractC5751g<Bundle> abstractC5751g) {
        return abstractC5751g.mo12104f(new ExecutorC6178d(2), new C9371n(12, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m9266b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i10;
        String str3;
        String str4;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatMo9185b;
        PackageInfo packageInfoM9272b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C0065e c0065e = this.f16400a;
        c0065e.m437a();
        bundle.putString("gmp_app_id", c0065e.f173c.f184b);
        C3252o c3252o = this.f16401b;
        synchronized (c3252o) {
            if (c3252o.f16412d == 0 && (packageInfoM9272b = c3252o.m9272b("com.google.android.gms")) != null) {
                c3252o.f16412d = packageInfoM9272b.versionCode;
            }
            i10 = c3252o.f16412d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        C3252o c3252o2 = this.f16401b;
        synchronized (c3252o2) {
            try {
                if (c3252o2.f16410b == null) {
                    c3252o2.m9274d();
                }
                str3 = c3252o2.f16410b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver", str3);
        C3252o c3252o3 = this.f16401b;
        synchronized (c3252o3) {
            try {
                if (c3252o3.f16411c == null) {
                    c3252o3.m9274d();
                }
                str4 = c3252o3.f16411c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str4);
        C0065e c0065e2 = this.f16400a;
        c0065e2.m437a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c0065e2.f172b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strMo10938a = ((AbstractC5165g) Tasks.m8537a(this.f16405f.mo9190a())).mo10938a();
            if (TextUtils.isEmpty(strMo10938a)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo10938a);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.m8537a(this.f16405f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f16404e.get();
        InterfaceC6475g interfaceC6475g = this.f16403d.get();
        if (heartBeatInfo != null && interfaceC6475g != null && (heartBeatMo9185b = heartBeatInfo.mo9185b()) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatMo9185b.getCode()));
            bundle.putString("Firebase-Client", interfaceC6475g.mo13080a());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final AbstractC5751g<Bundle> m9267c(String str, String str2, Bundle bundle) {
        int i10;
        int i11;
        PackageInfo packageInfoM15900b;
        try {
            m9266b(str, str2, bundle);
            C5486b c5486b = this.f16402c;
            C5501q c5501q = c5486b.f34076c;
            synchronized (c5501q) {
                if (c5501q.f34112b == 0) {
                    try {
                        packageInfoM15900b = C8032b.m15902a(c5501q.f34111a).m15900b("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e10) {
                        String strValueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("Failed to find package ");
                        sb2.append(strValueOf);
                        Log.w("Metadata", sb2.toString());
                        packageInfoM15900b = null;
                    }
                    if (packageInfoM15900b != null) {
                        c5501q.f34112b = packageInfoM15900b.versionCode;
                    }
                }
                i10 = c5501q.f34112b;
            }
            if (i10 >= 12000000) {
                C5500p c5500pM11726a = C5500p.m11726a(c5486b.f34075b);
                synchronized (c5500pM11726a) {
                    i11 = c5500pM11726a.f34110d;
                    c5500pM11726a.f34110d = i11 + 1;
                }
                return c5500pM11726a.m11727b(new C5499o(i11, bundle)).mo12104f(ExecutorC5503s.f34117a, C7499b.f41428c);
            }
            if (c5486b.f34076c.m11728a() != 0) {
                return c5486b.m11716a(bundle).mo12105g(ExecutorC5503s.f34117a, new C5496l(c5486b, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            C5761q c5761q = new C5761q();
            c5761q.m12122p(iOException);
            return c5761q;
        } catch (InterruptedException | ExecutionException e11) {
            C5761q c5761q2 = new C5761q();
            c5761q2.m12122p(e11);
            return c5761q2;
        }
    }
}
