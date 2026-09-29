package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.HashMap;
import p000.a3d;
import p000.ao2;
import p000.e59;
import p000.h1d;
import p000.nb1;
import p000.tld;
import p000.y0d;
import p000.z06;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_common.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0968a {

    /* JADX INFO: renamed from: j */
    public static zzp f11951j;

    /* JADX INFO: renamed from: k */
    public static final zzr f11952k;

    /* JADX INFO: renamed from: a */
    public final String f11953a;

    /* JADX INFO: renamed from: b */
    public final String f11954b;

    /* JADX INFO: renamed from: c */
    public final y0d f11955c;

    /* JADX INFO: renamed from: d */
    public final e59 f11956d;

    /* JADX INFO: renamed from: e */
    public final tld f11957e;

    /* JADX INFO: renamed from: f */
    public final tld f11958f;

    /* JADX INFO: renamed from: g */
    public final String f11959g;

    /* JADX INFO: renamed from: h */
    public final int f11960h;

    /* JADX INFO: renamed from: i */
    public final HashMap f11961i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f11952k = new zzz(objArr);
    }

    public C0968a(Context context, e59 e59Var, y0d y0dVar) {
        new HashMap();
        this.f11953a = context.getPackageName();
        this.f11954b = nb1.m17309a(context);
        this.f11956d = e59Var;
        this.f11955c = y0dVar;
        a3d.m80r();
        this.f11959g = "vision-common";
        C1172a c1172aM6770a = C1172a.m6770a();
        z06 z06Var = new z06(this, 6);
        c1172aM6770a.getClass();
        this.f11957e = C1172a.m6771b(z06Var);
        C1172a c1172aM6770a2 = C1172a.m6770a();
        e59Var.getClass();
        h1d h1dVar = new h1d(e59Var, 0);
        c1172aM6770a2.getClass();
        this.f11958f = C1172a.m6771b(h1dVar);
        zzr zzrVar = f11952k;
        this.f11960h = zzrVar.containsKey("vision-common") ? ao2.m2950d(context, (String) zzrVar.get("vision-common"), false) : -1;
    }
}
