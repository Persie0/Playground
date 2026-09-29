package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.util.HashMap;
import java.util.Objects;
import p000.ao2;
import p000.cdb;
import p000.e59;
import p000.fb5;
import p000.h1d;
import p000.jo0;
import p000.mkd;
import p000.nb1;
import p000.tld;
import p000.xjd;
import p000.z06;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_document_scanner.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0969a {

    /* JADX INFO: renamed from: i */
    public static zzx f11984i;

    /* JADX INFO: renamed from: j */
    public static final zzz f11985j;

    /* JADX INFO: renamed from: a */
    public final String f11986a;

    /* JADX INFO: renamed from: b */
    public final String f11987b;

    /* JADX INFO: renamed from: c */
    public final xjd f11988c;

    /* JADX INFO: renamed from: d */
    public final e59 f11989d;

    /* JADX INFO: renamed from: e */
    public final tld f11990e;

    /* JADX INFO: renamed from: f */
    public final tld f11991f;

    /* JADX INFO: renamed from: g */
    public final String f11992g;

    /* JADX INFO: renamed from: h */
    public final int f11993h;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        f11985j = new zzag(objArr);
    }

    public C0969a(Context context, e59 e59Var, xjd xjdVar) {
        new HashMap();
        new HashMap();
        this.f11986a = context.getPackageName();
        this.f11987b = nb1.m17309a(context);
        this.f11989d = e59Var;
        this.f11988c = xjdVar;
        mkd.m16909o();
        this.f11992g = "play-services-mlkit-document-scanner";
        C1172a c1172aM6770a = C1172a.m6770a();
        z06 z06Var = new z06(this, 8);
        c1172aM6770a.getClass();
        this.f11990e = C1172a.m6771b(z06Var);
        C1172a c1172aM6770a2 = C1172a.m6770a();
        Objects.requireNonNull(e59Var);
        h1d h1dVar = new h1d(e59Var, 2);
        c1172aM6770a2.getClass();
        this.f11991f = C1172a.m6771b(h1dVar);
        zzz zzzVar = f11985j;
        this.f11993h = zzzVar.containsKey("play-services-mlkit-document-scanner") ? ao2.m2950d(context, (String) zzzVar.get("play-services-mlkit-document-scanner"), false) : -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m5463a(cdb cdbVar, zznu zznuVar) {
        String strM11703a;
        tld tldVar = this.f11990e;
        if (tldVar.mo5971m()) {
            strM11703a = (String) tldVar.mo5967i();
        } else {
            strM11703a = fb5.f38790c.m11703a(this.f11992g);
        }
        C1172a.m6772c().execute(new jo0(this, cdbVar, zznuVar, strM11703a, 12, false));
    }
}
