package com.lingq.feature.review.activities;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.du0;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.sca;
import p000.wfb;
import p000.wta;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2749d extends wta implements cma, sca {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32350b;

    /* JADX INFO: renamed from: c */
    public final d65 f32351c;

    /* JADX INFO: renamed from: d */
    public final C1307w f32352d;

    /* JADX INFO: renamed from: e */
    public final sca f32353e;

    /* JADX INFO: renamed from: f */
    public final nn1 f32354f;

    /* JADX INFO: renamed from: g */
    public final int f32355g;

    /* JADX INFO: renamed from: h */
    public final int f32356h;

    /* JADX INFO: renamed from: i */
    public final C3244l f32357i;

    /* JADX INFO: renamed from: j */
    public final c18 f32358j;

    /* JADX INFO: renamed from: k */
    public final C3244l f32359k;

    /* JADX INFO: renamed from: l */
    public final c18 f32360l;

    /* JADX INFO: renamed from: m */
    public final C3244l f32361m;

    /* JADX INFO: renamed from: n */
    public final du0 f32362n;

    public C2749d(d65 d65Var, C1307w c1307w, sca scaVar, nn1 nn1Var, nn1 nn1Var2, cma cmaVar, nl8 nl8Var) {
        d65Var.getClass();
        c1307w.getClass();
        scaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f32350b = cmaVar;
        this.f32351c = d65Var;
        this.f32352d = c1307w;
        this.f32353e = scaVar;
        this.f32354f = nn1Var2;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        this.f32355g = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) nl8Var.m17488b("sentenceIndex");
        int iIntValue = num2 != null ? num2.intValue() : -1;
        this.f32356h = iIntValue;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f32357i = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f32358j = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d("");
        this.f32359k = c3244lM17114d2;
        this.f32360l = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, "");
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f32361m = c3244lM17114d3;
        AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, null);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f32362n = AbstractC3224d.m15519A(c3211aM7042a);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityUnscrambleViewModel$1(this, null), 3);
        if (iIntValue != -1) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityUnscrambleViewModel$fetchSentence$1(this, null), 3);
        } else {
            c3211aM7042a.mo4677k(xfa.f68157a);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32350b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32350b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32350b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32350b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32350b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32350b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32350b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32350b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32350b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32350b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32350b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32350b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32350b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f32353e.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32350b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32350b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32350b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f32353e.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32350b.mo4587X();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.f32353e.mo8484Y0(str, z, f, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32350b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32350b.mo4589b2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f32353e.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f32353e.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32350b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32350b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32350b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f32353e.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f32353e.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32350b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32350b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32350b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32350b.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f32353e.mo8494u();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32350b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32350b.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f32353e.mo8495y1(set);
    }
}
