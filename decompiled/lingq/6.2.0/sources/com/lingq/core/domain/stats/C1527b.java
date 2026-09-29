package com.lingq.core.domain.stats;

import com.lingq.core.data.repository.C1285a;
import com.lingq.core.data.repository.C1298n;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.b80;
import p000.i93;
import p000.jm3;
import p000.n83;
import p000.ql4;
import p000.uy5;
import p000.xy5;

/* JADX INFO: renamed from: com.lingq.core.domain.stats.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1527b {
    private static final jm3 Companion = new jm3();

    /* JADX INFO: renamed from: a */
    public final xy5 f19985a;

    /* JADX INFO: renamed from: b */
    public final b80 f19986b;

    public C1527b(xy5 xy5Var, b80 b80Var) {
        xy5Var.getClass();
        b80Var.getClass();
        this.f19985a = xy5Var;
        this.f19986b = b80Var;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m8206a(String str) {
        str.getClass();
        C1298n c1298n = (C1298n) this.f19985a;
        c1298n.getClass();
        uy5 uy5Var = c1298n.f16520a;
        uy5Var.getClass();
        i93 i93VarM21590A = AbstractC3584sr.m21590A(uy5Var.f64534K, false, new String[]{"MilestoneStatsEntity"}, new ql4(str, 5));
        c1298n.getClass();
        uy5 uy5Var2 = c1298n.f16520a;
        uy5Var2.getClass();
        return AbstractC3224d.m15532k(i93VarM21590A, AbstractC3584sr.m21590A(uy5Var2.f64534K, false, new String[]{"MilestoneEntity"}, new ql4(str, 6)), ((C1285a) this.f19986b).m7098b(str), new GetLevelStatsUseCase$invoke$1(this, null));
    }
}
