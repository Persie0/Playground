package com.lingq.core.domain.dictionaries;

import com.lingq.core.data.repository.C1297m;
import com.lingq.core.domain.util.AbstractC1543a;
import p000.C3577sk;
import p000.kk8;
import p000.xf2;

/* JADX INFO: renamed from: com.lingq.core.domain.dictionaries.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1375a {

    /* JADX INFO: renamed from: a */
    public final xf2 f18633a;

    /* JADX INFO: renamed from: b */
    public final C1297m f18634b;

    public C1375a(xf2 xf2Var, C1297m c1297m) {
        xf2Var.getClass();
        c1297m.getClass();
        this.f18633a = xf2Var;
        this.f18634b = c1297m;
    }

    /* JADX INFO: renamed from: a */
    public final kk8 m7981a(String str) {
        str.getClass();
        return AbstractC1543a.m8226a(new C3577sk(19, this, str), new GetAvailableDictionaryLocalesUseCase$invoke$2(this, null));
    }
}
