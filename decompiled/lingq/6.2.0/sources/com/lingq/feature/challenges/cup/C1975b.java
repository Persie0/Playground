package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.c18;
import p000.dm3;
import p000.hi8;
import p000.it1;
import p000.lda;
import p000.nl8;
import p000.ns1;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1975b extends wta {

    /* JADX INFO: renamed from: b */
    public final hi8 f24681b;

    /* JADX INFO: renamed from: c */
    public final String f24682c;

    /* JADX INFO: renamed from: d */
    public final c18 f24683d;

    public C1975b(dm3 dm3Var, dm3 dm3Var2, hi8 hi8Var, ns1 ns1Var, nl8 nl8Var) {
        nl8Var.getClass();
        this.f24681b = hi8Var;
        String str = (String) nl8Var.m17488b("languageCode");
        this.f24682c = str;
        this.f24683d = AbstractC3224d.m15520B(new C3228h(((C1291g) dm3Var.f35822a).m7194g(str), dm3Var2.m10472a(), new CupContributorsViewModel$state$1(this, null)), lda.m16103C(this), xi9.f68262a, new it1(null, 127));
        wfb.m23926u(lda.m16103C(this), null, null, new CupContributorsViewModel$refresh$1(this, null), 3);
        ns1Var.m17611b("Top 50 Contributors");
    }
}
