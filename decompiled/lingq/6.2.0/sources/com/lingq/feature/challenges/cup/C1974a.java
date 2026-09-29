package com.lingq.feature.challenges.cup;

import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c18;
import p000.dm3;
import p000.lda;
import p000.m58;
import p000.ns1;
import p000.vs1;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.yz0;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1974a extends wta {

    /* JADX INFO: renamed from: b */
    public final m58 f24679b;

    /* JADX INFO: renamed from: c */
    public final c18 f24680c;

    public C1974a(dm3 dm3Var, m58 m58Var, ns1 ns1Var) {
        this.f24679b = m58Var;
        this.f24680c = AbstractC3224d.m15520B(new yz0(dm3Var.m10472a(), 1), lda.m16103C(this), xi9.f68262a, new vs1(false, 0, 0, 0, null, null, 1023));
        wfb.m23926u(lda.m16103C(this), null, null, new CupBadgesViewModel$1(this, null), 3);
        ns1Var.m17611b("Badges");
    }
}
