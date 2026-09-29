package com.lingq.feature.review;

import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ao0;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.nl8;
import p000.vs3;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.review.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2757e extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32472b;

    /* JADX INFO: renamed from: c */
    public final ao0 f32473c;

    /* JADX INFO: renamed from: d */
    public final C1530a f32474d;

    /* JADX INFO: renamed from: e */
    public final int f32475e;

    /* JADX INFO: renamed from: f */
    public final int f32476f;

    /* JADX INFO: renamed from: g */
    public final C3244l f32477g;

    /* JADX INFO: renamed from: h */
    public final C3244l f32478h;

    /* JADX INFO: renamed from: i */
    public final C3244l f32479i;

    /* JADX INFO: renamed from: j */
    public final C3244l f32480j;

    /* JADX INFO: renamed from: k */
    public final c18 f32481k;

    public C2757e(ao0 ao0Var, C1530a c1530a, cma cmaVar, nl8 nl8Var) {
        ao0Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f32472b = cmaVar;
        this.f32473c = ao0Var;
        this.f32474d = c1530a;
        Integer num = (Integer) nl8Var.m17488b("numberOfActivities");
        this.f32475e = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) nl8Var.m17488b("numberOfCorrectActivities");
        this.f32476f = num2 != null ? num2.intValue() : 0;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f32477g = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f32478h = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f32479i = c3244lM17114d3;
        vs3 vs3Var = zz7.f72431f;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(vs3Var);
        this.f32480j = c3244lM17114d4;
        AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, vs3Var);
        this.f32481k = AbstractC3224d.m15520B(AbstractC3224d.m15533l(c3244lM17114d, c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, new ReviewSessionCompleteViewModel$items$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewSessionCompleteViewModel$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32472b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32472b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32472b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32472b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32472b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32472b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32472b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32472b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32472b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32472b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32472b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32472b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32472b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32472b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32472b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32472b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32472b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32472b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32472b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32472b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32472b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32472b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32472b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32472b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32472b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32472b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32472b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32472b.mo4598w2();
    }
}
