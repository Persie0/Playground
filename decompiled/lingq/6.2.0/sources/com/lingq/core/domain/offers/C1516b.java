package com.lingq.core.domain.offers;

import com.lingq.core.data.repository.C1301q;
import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3584sr;
import p000.aq6;
import p000.c83;
import p000.cl9;
import p000.cma;
import p000.kv4;
import p000.ui3;
import p000.vk9;
import p000.xp6;
import p000.yo1;

/* JADX INFO: renamed from: com.lingq.core.domain.offers.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1516b {

    /* JADX INFO: renamed from: a */
    public final aq6 f19877a;

    /* JADX INFO: renamed from: b */
    public final c83 f19878b;

    public C1516b(aq6 aq6Var, cma cmaVar) {
        aq6Var.getClass();
        cmaVar.getClass();
        this.f19877a = aq6Var;
        this.f19878b = cmaVar.mo4596t();
    }

    /* JADX INFO: renamed from: a */
    public static String m8192a(String str) {
        return (cl9.m4833P(str, "Z", false) || vk9.m23380c0(str, "+", false) || vk9.m23393p0(str, '-', 0, 6) > 10) ? str : str.concat("Z");
    }

    /* JADX INFO: renamed from: b */
    public final c83 m8193b(String str) {
        final String string;
        if (str == null || (string = vk9.m23376L0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new ui3() { // from class: com.lingq.core.domain.offers.a
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C1516b c1516b = this.f19875a;
                xp6 xp6Var = ((C1301q) c1516b.f19877a).f16530a;
                return new C3228h(AbstractC3224d.m15536o(new yo1(AbstractC3584sr.m21590A(xp6Var.f68493K, false, new String[]{"OfferEntity"}, new kv4(xp6Var, 10)), 4)), c1516b.f19878b, new GetActiveOfferUseCase$invoke$1$1(string, c1516b, null));
            }
        }, new GetActiveOfferUseCase$invoke$2(this, null)));
    }
}
