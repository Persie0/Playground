package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import com.lingq.core.database.dao.C1317e;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3741x;
import p000.bx0;
import p000.c18;
import p000.dm3;
import p000.g23;
import p000.g41;
import p000.lda;
import p000.m58;
import p000.n83;
import p000.ns1;
import p000.qt1;
import p000.vqb;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.yo1;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1977d extends wta {

    /* JADX INFO: renamed from: b */
    public final m58 f24684b;

    /* JADX INFO: renamed from: c */
    public final g23 f24685c;

    /* JADX INFO: renamed from: d */
    public final vqb f24686d;

    /* JADX INFO: renamed from: e */
    public final ns1 f24687e;

    /* JADX INFO: renamed from: f */
    public final C3244l f24688f;

    /* JADX INFO: renamed from: g */
    public final C3244l f24689g;

    /* JADX INFO: renamed from: h */
    public final c18 f24690h;

    public C1977d(dm3 dm3Var, g23 g23Var, m58 m58Var, g23 g23Var2, vqb vqbVar, ns1 ns1Var) {
        this.f24684b = m58Var;
        this.f24685c = g23Var2;
        this.f24686d = vqbVar;
        this.f24687e = ns1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f24688f = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f24689g = c3244lM17114d2;
        C3228h c3228h = new C3228h(c3244lM17114d, c3244lM17114d2, new CupDailyPrizeViewModel$uiFlags$1(3, null));
        yo1 yo1VarM10472a = dm3Var.m10472a();
        C1317e c1317e = ((C1291g) g23Var.f40075a).f16481b;
        n83 n83VarM15532k = AbstractC3224d.m15532k(yo1VarM10472a, new bx0(AbstractC3584sr.m21590A(c1317e.f17014a, false, new String[]{"CupPrizeEntity"}, new C3741x(c1317e, 15)), 2), c3228h, new CupDailyPrizeViewModel$state$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        boolean z = (63 & 1) != 0;
        int i = 63 & 4;
        EmptyList emptyList = EmptyList.f47638a;
        if (i == 0) {
            emptyList = null;
        }
        this.f24690h = AbstractC3224d.m15520B(n83VarM15532k, g41VarM16103C, c3243k, new qt1(z, null, emptyList, (63 & 8) != 0 ? emptyList : null, false, null));
        wfb.m23926u(lda.m16103C(this), null, null, new CupDailyPrizeViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CupDailyPrizeViewModel$2(this, null), 3);
        ns1Var.m17611b("Daily Prize");
    }
}
