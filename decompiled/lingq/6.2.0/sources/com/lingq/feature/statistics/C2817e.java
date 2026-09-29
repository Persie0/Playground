package com.lingq.feature.statistics;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.stats.C1527b;
import com.lingq.core.player.C1808b;
import com.lingq.feature.statistics.domain.C2814a;
import com.lingq.feature.statistics.domain.C2815b;
import com.lingq.feature.statistics.domain.C2816c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.C2992f8;
import p000.C3540rl;
import p000.b4b;
import p000.bt0;
import p000.c18;
import p000.c83;
import p000.cm3;
import p000.cma;
import p000.e80;
import p000.eh9;
import p000.g41;
import p000.hm5;
import p000.lda;
import p000.m58;
import p000.m83;
import p000.nl8;
import p000.nn1;
import p000.oj9;
import p000.p33;
import p000.ph4;
import p000.sj9;
import p000.vj6;
import p000.vqb;
import p000.wfb;
import p000.wta;
import p000.x41;
import p000.xi9;
import p000.y75;

/* JADX INFO: renamed from: com.lingq.feature.statistics.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2817e extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33436b;

    /* JADX INFO: renamed from: c */
    public final C1808b f33437c;

    /* JADX INFO: renamed from: d */
    public final nn1 f33438d;

    /* JADX INFO: renamed from: e */
    public final C2814a f33439e;

    /* JADX INFO: renamed from: f */
    public final C2814a f33440f;

    /* JADX INFO: renamed from: g */
    public final C2815b f33441g;

    /* JADX INFO: renamed from: h */
    public final m58 f33442h;

    /* JADX INFO: renamed from: i */
    public final C2816c f33443i;

    /* JADX INFO: renamed from: j */
    public final C1527b f33444j;

    /* JADX INFO: renamed from: k */
    public final vqb f33445k;

    /* JADX INFO: renamed from: l */
    public final C2816c f33446l;

    /* JADX INFO: renamed from: m */
    public final C2816c f33447m;

    /* JADX INFO: renamed from: n */
    public final C2814a f33448n;

    /* JADX INFO: renamed from: o */
    public final vj6 f33449o;

    /* JADX INFO: renamed from: p */
    public final p33 f33450p;

    /* JADX INFO: renamed from: q */
    public final c18 f33451q;

    /* JADX INFO: renamed from: r */
    public final c18 f33452r;

    /* JADX INFO: renamed from: s */
    public final c18 f33453s;

    /* JADX INFO: renamed from: t */
    public final C3244l f33454t;

    /* JADX INFO: renamed from: u */
    public final c18 f33455u;

    /* JADX INFO: renamed from: v */
    public final c18 f33456v;

    /* JADX INFO: renamed from: w */
    public final c18 f33457w;

    /* JADX INFO: renamed from: x */
    public final c18 f33458x;

    /* JADX INFO: renamed from: y */
    public final c18 f33459y;

    /* JADX INFO: renamed from: z */
    public final c18 f33460z;

    public C2817e(hm5 hm5Var, C1808b c1808b, nn1 nn1Var, C2814a c2814a, C2814a c2814a2, C2815b c2815b, cm3 cm3Var, m58 m58Var, C2816c c2816c, C1527b c1527b, vqb vqbVar, C2816c c2816c2, C2816c c2816c3, C2814a c2814a3, vj6 vj6Var, p33 p33Var, cma cmaVar, nl8 nl8Var) {
        hm5Var.getClass();
        c1808b.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f33436b = cmaVar;
        this.f33437c = c1808b;
        this.f33438d = nn1Var;
        this.f33439e = c2814a;
        this.f33440f = c2814a2;
        this.f33441g = c2815b;
        this.f33442h = m58Var;
        this.f33443i = c2816c;
        this.f33444j = c1527b;
        this.f33445k = vqbVar;
        this.f33446l = c2816c2;
        this.f33447m = c2816c3;
        this.f33448n = c2814a3;
        this.f33449o = vj6Var;
        this.f33450p = p33Var;
        c83 c83VarM15536o = AbstractC3224d.m15536o(new ph4(new C3540rl(cmaVar.mo4572B0(), 5), 1));
        C3235e c3235eM15521C = AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f33451q = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, oj9.f54467a);
        this.f33452r = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$2(this, null)), lda.m16103C(this), c3243k, sj9.f60941a);
        this.f33453s = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$3(this, null)), lda.m16103C(this), c3243k, b4b.f7939a);
        LanguageProgressPeriod languageProgressPeriod = LanguageProgressPeriod.Today;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(languageProgressPeriod);
        this.f33454t = c3244lM17114d;
        this.f33455u = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$4(this, null)), lda.m16103C(this), c3243k, new C2992f8(languageProgressPeriod));
        this.f33456v = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c83VarM15536o, new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$5(this, null)), lda.m16103C(this), c3243k, y75.f69407a);
        this.f33457w = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$6(this, null)), lda.m16103C(this), c3243k, bt0.f8961a);
        this.f33458x = AbstractC3224d.m15520B(AbstractC3224d.m15521C(cmaVar.mo4572B0(), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$7(null, cm3Var)), lda.m16103C(this), c3243k, null);
        this.f33459y = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$8(this, null)), lda.m16103C(this), c3243k, e80.f36830a);
        this.f33460z = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LanguageStatsUpdateViewModel$special$$inlined$flatMapLatest$9(this, null)), lda.m16103C(this), c3243k, x41.f67745a);
        ((C1240a) hm5Var).m7025f("stats page viewed", null);
        AbstractC3224d.m15545x(new m83(c83VarM15536o, new LanguageStatsUpdateViewModel$1(this, null), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new LanguageStatsUpdateViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LanguageStatsUpdateViewModel$3(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33436b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33436b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33436b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33436b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33436b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33436b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33436b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33436b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33436b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33436b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33436b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33436b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33436b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33436b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33436b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33436b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33436b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33436b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33436b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33436b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33436b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33436b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33436b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33436b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33436b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33436b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33436b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33436b.mo4598w2();
    }
}
