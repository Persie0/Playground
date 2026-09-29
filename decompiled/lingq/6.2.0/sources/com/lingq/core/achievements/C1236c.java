package com.lingq.core.achievements;

import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.do7;
import p000.du0;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.ob1;
import p000.oo4;
import p000.vma;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.achievements.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1236c extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f14226b;

    /* JADX INFO: renamed from: c */
    public final oo4 f14227c;

    /* JADX INFO: renamed from: d */
    public final ob1 f14228d;

    /* JADX INFO: renamed from: e */
    public final nn1 f14229e;

    /* JADX INFO: renamed from: f */
    public final C3244l f14230f;

    /* JADX INFO: renamed from: g */
    public final c18 f14231g;

    /* JADX INFO: renamed from: h */
    public final C3211a f14232h;

    /* JADX INFO: renamed from: i */
    public final du0 f14233i;

    /* JADX INFO: renamed from: j */
    public final C3244l f14234j;

    /* JADX INFO: renamed from: k */
    public final c18 f14235k;

    /* JADX INFO: renamed from: l */
    public final C3244l f14236l;

    /* JADX INFO: renamed from: m */
    public final c18 f14237m;

    /* JADX INFO: renamed from: n */
    public final C3211a f14238n;

    /* JADX INFO: renamed from: o */
    public final du0 f14239o;

    public C1236c(vma vmaVar, oo4 oo4Var, ob1 ob1Var, nn1 nn1Var, cma cmaVar, nl8 nl8Var) {
        vmaVar.getClass();
        oo4Var.getClass();
        ob1Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f14226b = cmaVar;
        this.f14227c = oo4Var;
        this.f14228d = ob1Var;
        this.f14229e = nn1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(nl8Var.m17488b("streak"));
        this.f14230f = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f14231g = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f14232h = c3211aM10525a;
        this.f14233i = AbstractC3224d.m15519A(c3211aM10525a);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f14234j = c3244lM17114d2;
        this.f14235k = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, bool);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f14236l = c3244lM17114d3;
        this.f14237m = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, null);
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f14238n = c3211aM10525a2;
        this.f14239o = AbstractC3224d.m15519A(c3211aM10525a2);
        wfb.m23926u(lda.m16103C(this), null, null, new RepairStreakViewModel$1(vmaVar, this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new RepairStreakViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f14226b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f14226b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f14226b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f14226b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f14226b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f14226b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f14226b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f14226b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f14226b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f14226b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f14226b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f14226b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f14226b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f14226b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f14226b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f14226b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f14226b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f14226b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f14226b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f14226b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f14226b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f14226b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f14226b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f14226b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f14226b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f14226b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f14226b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f14226b.mo4598w2();
    }
}
