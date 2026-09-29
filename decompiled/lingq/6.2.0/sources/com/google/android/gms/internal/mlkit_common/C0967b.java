package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.HashMap;
import java.util.Objects;
import p000.ao2;
import p000.e59;
import p000.h1d;
import p000.nb1;
import p000.nid;
import p000.z06;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_common.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0967b {

    /* JADX INFO: renamed from: b */
    public static final zzai f11924b = zzaq.m5455a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* JADX INFO: renamed from: a */
    public final String f11925a;

    public C0967b(Context context, e59 e59Var) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        nb1.m17309a(context);
        synchronized (nid.class) {
            if (nid.f52784a == null) {
                nid.f52784a = new nid();
            }
        }
        this.f11925a = "common";
        C1172a c1172aM6770a = C1172a.m6770a();
        z06 z06Var = new z06(this, 7);
        c1172aM6770a.getClass();
        C1172a.m6771b(z06Var);
        C1172a c1172aM6770a2 = C1172a.m6770a();
        Objects.requireNonNull(e59Var);
        h1d h1dVar = new h1d(e59Var, 1);
        c1172aM6770a2.getClass();
        C1172a.m6771b(h1dVar);
        zzai zzaiVar = f11924b;
        if (zzaiVar.containsKey("common")) {
            ao2.m2950d(context, (String) zzaiVar.get("common"), false);
        }
    }
}
