package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p326q.C8446b;
import p326q.C8452h;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2886w4 {

    /* JADX INFO: renamed from: f */
    public static final Object f14484f = new Object();

    /* JADX INFO: renamed from: g */
    public static volatile C2643e4 f14485g;

    /* JADX INFO: renamed from: h */
    public static final AtomicInteger f14486h;

    /* JADX INFO: renamed from: a */
    public final C2847t4 f14487a;

    /* JADX INFO: renamed from: b */
    public final String f14488b;

    /* JADX INFO: renamed from: c */
    public final Object f14489c;

    /* JADX INFO: renamed from: d */
    public volatile int f14490d = -1;

    /* JADX INFO: renamed from: e */
    public volatile Object f14491e;

    static {
        new AtomicReference();
        f14486h = new AtomicInteger();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public /* synthetic */ AbstractC2886w4(C2847t4 c2847t4, String str, Object obj) {
        if (c2847t4.f14436a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14487a = c2847t4;
        this.f14488b = str;
        this.f14489c = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo8154a(String str);

    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[PHI: r2
      0x0062: PHI (r2v1 com.google.android.gms.internal.measurement.zzii) = 
      (r2v0 com.google.android.gms.internal.measurement.zzii)
      (r2v6 com.google.android.gms.internal.measurement.zzii)
      (r2v6 com.google.android.gms.internal.measurement.zzii)
     binds: [B:8:0x0019, B:10:0x0029, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Object m8330b() {
        String str;
        Object objMo8154a;
        C2727k4 c2727k4;
        int i10 = f14486h.get();
        if (this.f14490d < i10) {
            synchronized (this) {
                try {
                    if (this.f14490d < i10) {
                        C2643e4 c2643e4 = f14485g;
                        zzii zziiVar = zzie.f14537a;
                        Object objMo8154a2 = null;
                        if (c2643e4 != null) {
                            zziiVar = (zzii) c2643e4.f14168b.zza();
                            if (zziiVar.mo8477b()) {
                                C2699i4 c2699i4 = (C2699i4) zziiVar.mo8476a();
                                Uri uri = this.f14487a.f14436a;
                                String str2 = this.f14488b;
                                c2699i4.getClass();
                                if (uri != null) {
                                    C8452h c8452h = (C8452h) c2699i4.f14250a.getOrDefault(uri.toString(), null);
                                    if (c8452h != null) {
                                        str = (String) c8452h.getOrDefault("".concat(str2), null);
                                    }
                                }
                                str = null;
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (c2643e4 == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri2 = this.f14487a.f14436a;
                        if (uri2 == null) {
                            C8446b c8446b = C2899x4.f14505a;
                            throw null;
                        }
                        C2671g4 c2671g4M7843a = C2755m4.m8063a(c2643e4.f14167a, uri2) ? C2671g4.m7843a(c2643e4.f14167a.getContentResolver(), this.f14487a.f14436a, new Runnable() { // from class: com.google.android.gms.internal.measurement.o4
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC2886w4.f14486h.incrementAndGet();
                            }
                        }) : null;
                        if (c2671g4M7843a != null) {
                            String str3 = (String) c2671g4M7843a.m7845b().get(this.f14488b);
                            if (str3 != null) {
                                objMo8154a = mo8154a(str3);
                            } else {
                                objMo8154a = null;
                            }
                        } else {
                            objMo8154a = null;
                        }
                        if (objMo8154a == null) {
                            if (!this.f14487a.f14437b) {
                                Context context = c2643e4.f14167a;
                                synchronized (C2727k4.class) {
                                    try {
                                        if (C2727k4.f14288c == null) {
                                            C2727k4.f14288c = C8573r0.m16691P(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2727k4(context) : new C2727k4();
                                        }
                                        c2727k4 = C2727k4.f14288c;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                String strM7918a = c2727k4.m7918a(this.f14487a.f14437b ? null : this.f14488b);
                                if (strM7918a != null) {
                                    objMo8154a2 = mo8154a(strM7918a);
                                }
                            }
                            if (objMo8154a2 == null) {
                                objMo8154a = this.f14489c;
                            } else {
                                objMo8154a = objMo8154a2;
                            }
                        }
                        if (zziiVar.mo8477b()) {
                            if (str == null) {
                                objMo8154a = this.f14489c;
                            } else {
                                objMo8154a = mo8154a(str);
                            }
                        }
                        this.f14491e = objMo8154a;
                        this.f14490d = i10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f14491e;
    }
}
