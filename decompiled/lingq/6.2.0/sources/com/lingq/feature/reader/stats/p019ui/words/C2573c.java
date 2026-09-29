package com.lingq.feature.reader.stats.p019ui.words;

import android.graphics.Rect;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.TokenPopupData;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.ao0;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.e7a;
import p000.eh9;
import p000.g41;
import p000.hm5;
import p000.l3a;
import p000.lda;
import p000.nl8;
import p000.s7b;
import p000.sca;
import p000.si7;
import p000.ui3;
import p000.vj6;
import p000.wta;
import p000.xi9;
import p000.xy4;
import p000.y5a;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.words.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2573c extends wta implements e7a, cma, bia, l3a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e7a f31119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f31120c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f31121d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l3a f31122e;

    /* JADX INFO: renamed from: f */
    public final d65 f31123f;

    /* JADX INFO: renamed from: g */
    public final s7b f31124g;

    /* JADX INFO: renamed from: h */
    public final ao0 f31125h;

    /* JADX INFO: renamed from: i */
    public final sca f31126i;

    /* JADX INFO: renamed from: j */
    public final vj6 f31127j;

    /* JADX INFO: renamed from: k */
    public final xy4 f31128k;

    /* JADX INFO: renamed from: l */
    public final c18 f31129l;

    /* JADX INFO: renamed from: m */
    public final c18 f31130m;

    /* JADX INFO: renamed from: n */
    public final c18 f31131n;

    public C2573c(e7a e7aVar, d65 d65Var, s7b s7bVar, ao0 ao0Var, sca scaVar, si7 si7Var, vj6 vj6Var, hm5 hm5Var, cma cmaVar, l3a l3aVar, bia biaVar, nl8 nl8Var) {
        e7aVar.getClass();
        d65Var.getClass();
        s7bVar.getClass();
        ao0Var.getClass();
        scaVar.getClass();
        si7Var.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        l3aVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f31119b = e7aVar;
        this.f31120c = cmaVar;
        this.f31121d = biaVar;
        this.f31122e = l3aVar;
        this.f31123f = d65Var;
        this.f31124g = s7bVar;
        this.f31125h = ao0Var;
        this.f31126i = scaVar;
        this.f31127j = vj6Var;
        xy4.Companion.getClass();
        if (!nl8Var.m17487a("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        if (num == null) {
            C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
            throw null;
        }
        this.f31128k = new xy4(num.intValue());
        c18 c18VarM17489c = nl8Var.m17489c(num, "lessonId");
        ((C1240a) hm5Var).m7025f("lesson complete known words screen viewed", null);
        C3235e c3235eM15521C = AbstractC3224d.m15521C(c18VarM17489c, new LessonCompleteDealBlueViewModel$tokenWords$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f31129l = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, null);
        this.f31130m = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c18VarM17489c, new LessonCompleteDealBlueViewModel$hasCards$1(this, null)), lda.m16103C(this), c3243k, null);
        this.f31131n = AbstractC3224d.m15520B(AbstractC3224d.m15546y(((C1368a) si7Var).f18353K0, new LessonCompleteDealBlueViewModel$moveKnown$1(2, null)), lda.m16103C(this), c3243k, Boolean.FALSE);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f31120c.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f31119b.mo8733A0(z);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f31122e.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f31122e.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f31120c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f31120c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f31120c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f31120c.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f31119b.mo8736D1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f31122e.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f31122e.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f31122e.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f31120c.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f31119b.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f31120c.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f31122e.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f31120c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f31120c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f31120c.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f31119b.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f31120c.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f31122e.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f31121d.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f31120c.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f31120c.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f31119b.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f31119b.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f31120c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f31120c.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f31122e.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f31120c.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f31122e.mo8747U1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f31122e.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f31122e.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f31120c.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f31121d.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f31119b.mo8753Z0(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f31120c.mo4588a0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f31122e.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f31120c.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f31122e.mo8758c();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f31120c.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f31119b.mo8759d1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f31122e.mo8761f();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f31119b.mo8763g();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f31120c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f31122e.mo8765i();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f31119b.mo8766i1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f31122e.mo8767j();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f31119b.mo8768j0(z);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f31121d.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f31121d.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f31120c.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f31122e.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f31120c.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f31122e.mo8770p1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f31119b.mo8771q0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f31122e.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f31122e.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f31121d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f31120c.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f31122e.mo8774r2(i);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f31119b.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f31121d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f31120c.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f31122e.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f31120c.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f31119b.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f31119b.mo8778u0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f31122e.mo8779v2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f31119b.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f31120c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f31120c.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f31119b.mo8781y0();
    }
}
