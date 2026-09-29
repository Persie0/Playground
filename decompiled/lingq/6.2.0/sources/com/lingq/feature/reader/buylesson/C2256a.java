package com.lingq.feature.reader.buylesson;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3513qw;
import p000.c18;
import p000.cma;
import p000.kk0;
import p000.mk0;
import p000.nm7;
import p000.ry7;
import p000.un1;
import p000.wfb;
import p000.xi9;
import p000.xx4;

/* JADX INFO: renamed from: com.lingq.feature.reader.buylesson.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2256a {

    /* JADX INFO: renamed from: a */
    public final mk0 f27858a;

    /* JADX INFO: renamed from: b */
    public final C1525a f27859b;

    /* JADX INFO: renamed from: c */
    public final cma f27860c;

    /* JADX INFO: renamed from: d */
    public final un1 f27861d;

    /* JADX INFO: renamed from: e */
    public final c18 f27862e;

    public C2256a(mk0 mk0Var, C1525a c1525a, nm7 nm7Var, cma cmaVar, un1 un1Var) {
        mk0Var.getClass();
        nm7Var.getClass();
        cmaVar.getClass();
        un1Var.getClass();
        this.f27858a = mk0Var;
        this.f27859b = c1525a;
        this.f27860c = cmaVar;
        this.f27861d = un1Var;
        this.f27862e = AbstractC3224d.m15520B(new C3513qw(mk0Var.mo9319C2(), 17), un1Var, xi9.f68262a, new kk0(false, xx4.f68925a));
    }

    /* JADX INFO: renamed from: a */
    public final void m9247a(int i, int i2, ry7 ry7Var) {
        wfb.m23926u(this.f27861d, null, null, new ReaderBuyLessonManager$buyLesson$1(this, i2, i, ry7Var, null), 3);
    }
}
