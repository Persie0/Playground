package com.lingq.feature.vocabulary;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.vocabulary.state.C2860b;
import com.lingq.feature.vocabulary.state.C2862d;
import kotlin.coroutines.Continuation;
import p000.C3386nv;
import p000.b0b;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.exa;
import p000.f41;
import p000.fxa;
import p000.hf6;
import p000.hm5;
import p000.lda;
import p000.nl8;
import p000.r32;
import p000.sca;
import p000.swa;
import p000.vj6;
import p000.wfb;
import p000.wta;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2824b extends wta implements cma, r32 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r32 f33525c;

    /* JADX INFO: renamed from: d */
    public final C2862d f33526d;

    /* JADX INFO: renamed from: e */
    public final C2860b f33527e;

    /* JADX INFO: renamed from: f */
    public final vj6 f33528f;

    /* JADX INFO: renamed from: g */
    public final sca f33529g;

    /* JADX INFO: renamed from: h */
    public final b0b f33530h;

    /* JADX INFO: renamed from: i */
    public final c18 f33531i;

    /* JADX INFO: renamed from: j */
    public final c18 f33532j;

    /* JADX INFO: renamed from: k */
    public final c18 f33533k;

    public C2824b(f41 f41Var, hm5 hm5Var, C2862d c2862d, C2860b c2860b, vj6 vj6Var, sca scaVar, cma cmaVar, r32 r32Var, nl8 nl8Var) {
        String str;
        f41Var.getClass();
        hm5Var.getClass();
        c2862d.getClass();
        c2860b.getClass();
        scaVar.getClass();
        cmaVar.getClass();
        r32Var.getClass();
        nl8Var.getClass();
        this.f33524b = cmaVar;
        this.f33525c = r32Var;
        this.f33526d = c2862d;
        this.f33527e = c2860b;
        this.f33528f = vj6Var;
        this.f33529g = scaVar;
        b0b.Companion.getClass();
        String str2 = "";
        if (nl8Var.m17487a("vocabularyLanguageFromDeeplink")) {
            str = (String) nl8Var.m17488b("vocabularyLanguageFromDeeplink");
            if (str == null) {
                C3386nv.m17626m("Argument \"vocabularyLanguageFromDeeplink\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        if (nl8Var.m17487a("lotd") && (str2 = (String) nl8Var.m17488b("lotd")) == null) {
            C3386nv.m17626m("Argument \"lotd\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f33530h = new b0b(str, str2);
        this.f33531i = c2862d.f33809o;
        this.f33532j = c2860b.f33781j;
        this.f33533k = c2860b.f33783l;
        m24153Q2(f41Var);
        ((C1240a) hm5Var).m7025f("Vocabulary tab visited", null);
        c2860b.m9765d();
        wfb.m23926u(lda.m16103C(this), null, null, new VocabularyViewModel$observeActiveLanguage$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33524b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33524b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33524b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33524b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33524b.mo4575D0(continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f33525c.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33524b.mo4576F1(str, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f33525c.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33524b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33524b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33524b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33524b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33524b.mo4581L0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f33525c.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33524b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33524b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33524b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33524b.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f33525c.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f33525c.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33524b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9744V2(fxa fxaVar) {
        fxaVar.getClass();
        if (fxaVar instanceof exa) {
            wfb.m23926u(lda.m16103C(this), null, null, new VocabularyViewModel$playTts$1(this, ((exa) fxaVar).f38056a, null), 3);
        } else {
            if (fxaVar instanceof swa) {
                mo8240E2();
            }
            this.f33526d.m9771d(fxaVar);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33524b.mo4587X();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f33525c.mo8245Z1(hf6Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33524b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33524b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33524b.mo4590d0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f33525c.mo8247e0(str, j);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33524b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f33525c.mo8248h1();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f33525c.mo8249k();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33524b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33524b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33524b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33524b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33524b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33524b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33524b.mo4598w2();
    }
}
