package com.lingq.feature.review.activities;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ao0;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.n58;
import p000.nl8;
import p000.nn1;
import p000.s7b;
import p000.sca;
import p000.wfb;
import p000.wta;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2747b extends wta implements cma, sca {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32319b;

    /* JADX INFO: renamed from: c */
    public final ao0 f32320c;

    /* JADX INFO: renamed from: d */
    public final C1307w f32321d;

    /* JADX INFO: renamed from: e */
    public final n58 f32322e;

    /* JADX INFO: renamed from: f */
    public final sca f32323f;

    /* JADX INFO: renamed from: g */
    public final String[] f32324g;

    /* JADX INFO: renamed from: h */
    public final C3244l f32325h;

    /* JADX INFO: renamed from: i */
    public final c18 f32326i;

    /* JADX INFO: renamed from: j */
    public final du0 f32327j;

    /* JADX INFO: renamed from: k */
    public final C3244l f32328k;

    public C2747b(ao0 ao0Var, s7b s7bVar, C1307w c1307w, n58 n58Var, sca scaVar, nn1 nn1Var, nn1 nn1Var2, cma cmaVar, nl8 nl8Var) {
        ao0Var.getClass();
        s7bVar.getClass();
        c1307w.getClass();
        scaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f32319b = cmaVar;
        this.f32320c = ao0Var;
        this.f32321d = c1307w;
        this.f32322e = n58Var;
        this.f32323f = scaVar;
        String[] strArr = (String[]) nl8Var.m17488b("terms");
        strArr = strArr == null ? new String[0] : strArr;
        this.f32324g = strArr;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f32325h = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f32326i = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f32327j = AbstractC3224d.m15519A(c3211aM7042a);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f32328k = c3244lM17114d2;
        AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, null);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityMatchingViewModel$1(this, null), 3);
        if (strArr.length == 3) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityMatchingViewModel$fetchCards$1(this, null), 3);
        } else {
            c3211aM7042a.mo4677k(xfa.f68157a);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32319b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32319b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32319b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32319b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32319b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32319b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32319b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32319b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32319b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32319b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32319b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32319b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32319b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f32323f.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32319b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32319b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32319b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f32323f.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32319b.mo4587X();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityMatchingViewModel$speak$1(this, str, z, f, z2, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32319b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32319b.mo4589b2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f32323f.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f32323f.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32319b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32319b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32319b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f32323f.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f32323f.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32319b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32319b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32319b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32319b.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f32323f.mo8494u();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32319b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32319b.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f32323f.mo8495y1(set);
    }
}
