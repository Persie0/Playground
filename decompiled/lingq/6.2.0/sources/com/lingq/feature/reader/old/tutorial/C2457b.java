package com.lingq.feature.reader.old.tutorial;

import android.graphics.Rect;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.TokenPopupData;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3509qs;
import p000.ao0;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.do7;
import p000.du0;
import p000.e7a;
import p000.eh9;
import p000.hm5;
import p000.l3a;
import p000.lda;
import p000.nl8;
import p000.s7b;
import p000.si7;
import p000.ui3;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.y5a;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2457b extends wta implements e7a, cma, bia, l3a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e7a f29646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f29647c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f29648d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l3a f29649e;

    /* JADX INFO: renamed from: f */
    public final s7b f29650f;

    /* JADX INFO: renamed from: g */
    public final ao0 f29651g;

    /* JADX INFO: renamed from: h */
    public final int f29652h;

    /* JADX INFO: renamed from: i */
    public final String[] f29653i;

    /* JADX INFO: renamed from: j */
    public final int f29654j;

    /* JADX INFO: renamed from: k */
    public final C3244l f29655k;

    /* JADX INFO: renamed from: l */
    public final c18 f29656l;

    /* JADX INFO: renamed from: m */
    public final C3211a f29657m;

    /* JADX INFO: renamed from: n */
    public final du0 f29658n;

    public C2457b(e7a e7aVar, s7b s7bVar, ao0 ao0Var, hm5 hm5Var, C3509qs c3509qs, si7 si7Var, cma cmaVar, l3a l3aVar, bia biaVar, nl8 nl8Var) {
        e7aVar.getClass();
        s7bVar.getClass();
        ao0Var.getClass();
        hm5Var.getClass();
        c3509qs.getClass();
        si7Var.getClass();
        cmaVar.getClass();
        l3aVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f29646b = e7aVar;
        this.f29647c = cmaVar;
        this.f29648d = biaVar;
        this.f29649e = l3aVar;
        this.f29650f = s7bVar;
        this.f29651g = ao0Var;
        Integer num = (Integer) nl8Var.m17488b("page");
        this.f29652h = num != null ? num.intValue() : -1;
        String[] strArr = (String[]) nl8Var.m17488b("words");
        this.f29653i = strArr == null ? new String[0] : strArr;
        Integer num2 = (Integer) nl8Var.m17488b("lessonId");
        this.f29654j = num2 != null ? num2.intValue() : -1;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f29655k = c3244lM17114d;
        this.f29656l = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, null);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f29657m = c3211aM10525a;
        this.f29658n = AbstractC3224d.m15519A(c3211aM10525a);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f29647c.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f29646b.mo8733A0(z);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f29649e.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f29649e.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f29647c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f29647c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f29647c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f29647c.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f29646b.mo8736D1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f29649e.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f29649e.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f29649e.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f29647c.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29646b.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f29647c.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f29649e.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f29647c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f29647c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f29647c.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29646b.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f29647c.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f29649e.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f29648d.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f29647c.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f29647c.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29646b.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f29646b.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f29647c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f29647c.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f29649e.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f29647c.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f29649e.mo8747U1();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9353V2(List list) {
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        int i = this.f29652h;
        if (!zIsEmpty && i == -1) {
            wfb.m23926u(lda.m16103C(this), null, null, new LessonDealWithWordsViewModel$setupWords$1(this, list, null), 3);
        } else {
            if (this.f29653i.length == 0 || i == -1) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new LessonDealWithWordsViewModel$setupWords$2(this, null), 3);
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f29649e.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f29649e.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f29647c.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f29648d.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29646b.mo8753Z0(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f29647c.mo4588a0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f29649e.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f29647c.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f29649e.mo8758c();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f29647c.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f29646b.mo8759d1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f29649e.mo8761f();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f29646b.mo8763g();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f29647c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f29649e.mo8765i();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f29646b.mo8766i1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f29649e.mo8767j();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f29646b.mo8768j0(z);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f29648d.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f29648d.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f29647c.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f29649e.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f29647c.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f29649e.mo8770p1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f29646b.mo8771q0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f29649e.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f29649e.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f29648d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f29647c.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f29649e.mo8774r2(i);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f29646b.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f29648d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f29647c.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f29649e.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f29647c.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f29646b.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f29646b.mo8778u0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f29649e.mo8779v2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f29646b.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f29647c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f29647c.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f29646b.mo8781y0();
    }
}
