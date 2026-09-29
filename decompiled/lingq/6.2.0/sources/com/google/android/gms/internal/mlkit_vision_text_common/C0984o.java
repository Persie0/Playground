package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p000.ao2;
import p000.e59;
import p000.fb5;
import p000.gkd;
import p000.h1d;
import p000.jo0;
import p000.nb1;
import p000.okd;
import p000.tld;
import p000.wkd;
import p000.z06;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C0984o {

    /* JADX INFO: renamed from: k */
    public static zzbk f12058k;

    /* JADX INFO: renamed from: l */
    public static final zzbm f12059l;

    /* JADX INFO: renamed from: a */
    public final String f12060a;

    /* JADX INFO: renamed from: b */
    public final String f12061b;

    /* JADX INFO: renamed from: c */
    public final gkd f12062c;

    /* JADX INFO: renamed from: d */
    public final e59 f12063d;

    /* JADX INFO: renamed from: e */
    public final tld f12064e;

    /* JADX INFO: renamed from: f */
    public final tld f12065f;

    /* JADX INFO: renamed from: g */
    public final String f12066g;

    /* JADX INFO: renamed from: h */
    public final int f12067h;

    /* JADX INFO: renamed from: i */
    public final HashMap f12068i = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashMap f12069j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        f12059l = new zzcj(objArr);
    }

    public C0984o(Context context, e59 e59Var, gkd gkdVar, String str) {
        this.f12060a = context.getPackageName();
        this.f12061b = nb1.m17309a(context);
        this.f12063d = e59Var;
        this.f12062c = gkdVar;
        wkd.m24042f();
        this.f12066g = str;
        C1172a c1172aM6770a = C1172a.m6770a();
        z06 z06Var = new z06(this, 9);
        c1172aM6770a.getClass();
        this.f12064e = C1172a.m6771b(z06Var);
        C1172a c1172aM6770a2 = C1172a.m6770a();
        Objects.requireNonNull(e59Var);
        h1d h1dVar = new h1d(e59Var, 3);
        c1172aM6770a2.getClass();
        this.f12065f = C1172a.m6771b(h1dVar);
        zzbm zzbmVar = f12059l;
        this.f12067h = zzbmVar.containsKey(str) ? ao2.m2950d(context, (String) zzbmVar.get(str), false) : -1;
    }

    /* JADX INFO: renamed from: a */
    public static long m5478a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m5479b(okd okdVar, zzov zzovVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m5481d(zzovVar, jElapsedRealtime)) {
            this.f12068i.put(zzovVar, Long.valueOf(jElapsedRealtime));
            C1172a.m6772c().execute(new jo0(this, okdVar.zza(), zzovVar, m5480c(), 13, false));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5480c() {
        tld tldVar = this.f12064e;
        if (tldVar.mo5971m()) {
            return (String) tldVar.mo5967i();
        }
        return fb5.f38790c.m11703a(this.f12066g);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5481d(zzov zzovVar, long j) {
        HashMap map = this.f12068i;
        return map.get(zzovVar) == null || j - ((Long) map.get(zzovVar)).longValue() > 30000;
    }
}
