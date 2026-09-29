package com.lingq.feature.chat.settings;

import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.settings.domain.C1869h;
import com.lingq.feature.chat.domain.C1998c;
import com.lingq.feature.chat.domain.C2000e;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3513qw;
import p000.bo5;
import p000.c18;
import p000.cma;
import p000.eo5;
import p000.lda;
import p000.oz8;
import p000.rm3;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.chat.settings.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2010a extends wta {

    /* JADX INFO: renamed from: b */
    public final oz8 f25320b;

    /* JADX INFO: renamed from: c */
    public final rm3 f25321c;

    /* JADX INFO: renamed from: d */
    public final C1869h f25322d;

    /* JADX INFO: renamed from: e */
    public final C2000e f25323e;

    /* JADX INFO: renamed from: f */
    public final C2000e f25324f;

    /* JADX INFO: renamed from: g */
    public final cma f25325g;

    /* JADX INFO: renamed from: h */
    public final c18 f25326h;

    public C2010a(C1998c c1998c, oz8 oz8Var, rm3 rm3Var, C1869h c1869h, C2000e c2000e, C2000e c2000e2, cma cmaVar) {
        cmaVar.getClass();
        this.f25320b = oz8Var;
        this.f25321c = rm3Var;
        this.f25322d = c1869h;
        this.f25323e = c2000e;
        this.f25324f = c2000e2;
        this.f25325g = cmaVar;
        this.f25326h = AbstractC3224d.m15520B(new C3513qw(c1998c.m8861a(), 13), lda.m16103C(this), xi9.f68262a, new eo5((31 & 1) == 0, true, LqTheme.System, true, true));
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8931V2(bo5 bo5Var) {
        bo5Var.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new LynxSettingsViewModel$handleAction$1(bo5Var, this, null), 3);
    }
}
