package com.lingq.core.domain.library;

import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.l83;
import p000.xo1;
import p000.y95;
import p000.yl3;

/* JADX INFO: renamed from: com.lingq.core.domain.library.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1388c {

    /* JADX INFO: renamed from: a */
    public final y95 f18832a;

    /* JADX INFO: renamed from: b */
    public final xo1 f18833b;

    public C1388c(y95 y95Var, xo1 xo1Var) {
        y95Var.getClass();
        xo1Var.getClass();
        this.f18832a = y95Var;
        this.f18833b = xo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m8004a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(new l83(AbstractC1543a.m8226a(new yl3(this, i, 1), new GetCourseUseCase$invoke$2(this, str, i, null)), new GetCourseUseCase$invoke$3(3, null), 1));
    }
}
