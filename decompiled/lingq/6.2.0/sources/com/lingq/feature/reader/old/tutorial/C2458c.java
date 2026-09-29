package com.lingq.feature.reader.old.tutorial;

import android.graphics.Rect;
import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.TokenPopupData;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ao0;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.e7a;
import p000.eh9;
import p000.g41;
import p000.hm5;
import p000.l3a;
import p000.lda;
import p000.nl8;
import p000.s7b;
import p000.ui3;
import p000.w3a;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.y5a;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2458c extends wta implements e7a, cma, l3a, bia {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e7a f29659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f29660c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l3a f29661d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bia f29662e;

    /* JADX INFO: renamed from: f */
    public final s7b f29663f;

    /* JADX INFO: renamed from: g */
    public final ao0 f29664g;

    /* JADX INFO: renamed from: h */
    public final w3a f29665h;

    /* JADX INFO: renamed from: i */
    public final int f29666i;

    /* JADX INFO: renamed from: j */
    public final List f29667j;

    /* JADX INFO: renamed from: k */
    public final Locale f29668k;

    /* JADX INFO: renamed from: l */
    public final C3244l f29669l;

    /* JADX INFO: renamed from: m */
    public final c18 f29670m;

    /* JADX INFO: renamed from: n */
    public final C3244l f29671n;

    /* JADX INFO: renamed from: o */
    public final c18 f29672o;

    /* JADX INFO: renamed from: p */
    public final C3244l f29673p;

    /* JADX INFO: renamed from: q */
    public final C3211a f29674q;

    /* JADX INFO: renamed from: r */
    public final du0 f29675r;

    public C2458c(e7a e7aVar, s7b s7bVar, ao0 ao0Var, w3a w3aVar, hm5 hm5Var, cma cmaVar, l3a l3aVar, bia biaVar, nl8 nl8Var) {
        e7aVar.getClass();
        s7bVar.getClass();
        ao0Var.getClass();
        w3aVar.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        l3aVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f29659b = e7aVar;
        this.f29660c = cmaVar;
        this.f29661d = l3aVar;
        this.f29662e = biaVar;
        this.f29663f = s7bVar;
        this.f29664g = ao0Var;
        this.f29665h = w3aVar;
        Integer num = (Integer) nl8Var.m17488b("page");
        this.f29666i = num != null ? num.intValue() : -1;
        List list = (List) nl8Var.m17488b("words");
        EmptyList emptyList = EmptyList.f47638a;
        this.f29667j = list == null ? emptyList : list;
        this.f29668k = Locale.forLanguageTag(cmaVar.mo4589b2());
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f29669l = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f29670m = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f29671n = c3244lM17114d2;
        this.f29672o = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29673p = c3244lM17114d3;
        AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f29674q = c3211aM7042a;
        this.f29675r = AbstractC3224d.m15519A(c3211aM7042a);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonMoveKnownViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonMoveKnownViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f29660c.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f29659b.mo8733A0(z);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f29661d.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f29661d.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f29660c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f29660c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f29660c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f29660c.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f29659b.mo8736D1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f29661d.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f29661d.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f29661d.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f29660c.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29659b.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f29660c.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f29661d.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f29660c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f29660c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f29660c.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29659b.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f29660c.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f29661d.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f29662e.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f29660c.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f29660c.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29659b.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f29659b.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f29660c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f29660c.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f29661d.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f29660c.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f29661d.mo8747U1();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9354V2(List list) {
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        int i = this.f29666i;
        if (!zIsEmpty && i == -1) {
            wfb.m23926u(lda.m16103C(this), null, null, new LessonMoveKnownViewModel$setupWords$1(this, list, null), 3);
        } else {
            if (this.f29667j.isEmpty() || i == -1) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new LessonMoveKnownViewModel$setupWords$2(this, null), 3);
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f29661d.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f29661d.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f29660c.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f29662e.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29659b.mo8753Z0(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f29660c.mo4588a0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f29661d.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f29660c.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f29661d.mo8758c();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f29660c.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f29659b.mo8759d1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f29661d.mo8761f();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f29659b.mo8763g();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f29660c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f29661d.mo8765i();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f29659b.mo8766i1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f29661d.mo8767j();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f29659b.mo8768j0(z);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f29662e.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f29662e.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f29660c.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f29661d.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f29660c.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f29661d.mo8770p1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f29659b.mo8771q0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f29661d.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f29661d.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f29662e.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f29660c.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f29661d.mo8774r2(i);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f29659b.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f29662e.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f29660c.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f29661d.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f29660c.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f29659b.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f29659b.mo8778u0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f29661d.mo8779v2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f29659b.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f29660c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f29660c.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f29659b.mo8781y0();
    }
}
