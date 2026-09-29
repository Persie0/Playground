package com.lingq.feature.onboarding;

import com.android.billingclient.api.Purchase;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.onboarding.domain.C2207a;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.dk5;
import p000.eh9;
import p000.fs6;
import p000.g41;
import p000.hm5;
import p000.lda;
import p000.lm4;
import p000.m83;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.ot6;
import p000.pha;
import p000.si7;
import p000.u91;
import p000.un1;
import p000.v18;
import p000.wfb;
import p000.wm5;
import p000.wta;
import p000.xi9;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2197b extends wta implements cma, pha {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pha f27162c;

    /* JADX INFO: renamed from: d */
    public final nm7 f27163d;

    /* JADX INFO: renamed from: e */
    public final dk5 f27164e;

    /* JADX INFO: renamed from: f */
    public final C2207a f27165f;

    /* JADX INFO: renamed from: g */
    public final fs6 f27166g;

    /* JADX INFO: renamed from: h */
    public final y95 f27167h;

    /* JADX INFO: renamed from: i */
    public final lm4 f27168i;

    /* JADX INFO: renamed from: j */
    public final un1 f27169j;

    /* JADX INFO: renamed from: k */
    public final nn1 f27170k;

    /* JADX INFO: renamed from: l */
    public final si7 f27171l;

    /* JADX INFO: renamed from: m */
    public final hm5 f27172m;

    /* JADX INFO: renamed from: n */
    public final un1 f27173n;

    /* JADX INFO: renamed from: o */
    public final C3244l f27174o;

    /* JADX INFO: renamed from: p */
    public final C3244l f27175p;

    /* JADX INFO: renamed from: q */
    public final C3244l f27176q;

    /* JADX INFO: renamed from: r */
    public final c18 f27177r;

    public C2197b(nm7 nm7Var, dk5 dk5Var, C2207a c2207a, fs6 fs6Var, y95 y95Var, lm4 lm4Var, un1 un1Var, nn1 nn1Var, si7 si7Var, hm5 hm5Var, un1 un1Var2, cma cmaVar, pha phaVar, nl8 nl8Var) {
        String str;
        Boolean bool;
        nm7Var.getClass();
        y95Var.getClass();
        lm4Var.getClass();
        un1Var.getClass();
        si7Var.getClass();
        hm5Var.getClass();
        un1Var2.getClass();
        cmaVar.getClass();
        phaVar.getClass();
        nl8Var.getClass();
        this.f27161b = cmaVar;
        this.f27162c = phaVar;
        this.f27163d = nm7Var;
        this.f27164e = dk5Var;
        this.f27165f = c2207a;
        this.f27166g = fs6Var;
        this.f27167h = y95Var;
        this.f27168i = lm4Var;
        this.f27169j = un1Var;
        this.f27170k = nn1Var;
        this.f27171l = si7Var;
        this.f27172m = hm5Var;
        this.f27173n = un1Var2;
        ot6.Companion.getClass();
        String str2 = "";
        if (nl8Var.m17487a("username")) {
            String str3 = (String) nl8Var.m17488b("username");
            if (str3 == null) {
                C3386nv.m17626m("Argument \"username\" is marked as non-null but was passed a null value");
                throw null;
            }
            str = str3;
        } else {
            str = "";
        }
        if (nl8Var.m17487a("password") && (str2 = (String) nl8Var.m17488b("password")) == null) {
            C3386nv.m17626m("Argument \"password\" is marked as non-null but was passed a null value");
            throw null;
        }
        String str4 = str2;
        if (nl8Var.m17487a("isSocial")) {
            bool = (Boolean) nl8Var.m17488b("isSocial");
            if (bool == null) {
                C3386nv.m17626m("Argument \"isSocial\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        boolean zBooleanValue = bool.booleanValue();
        wm5 wm5Var = wm5.f67054a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(wm5Var);
        this.f27174o = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, wm5Var);
        this.f27175p = AbstractC3352my.m17114d(Boolean.FALSE);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(wm5Var);
        this.f27176q = c3244lM17114d2;
        this.f27177r = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, wm5Var);
        AbstractC3224d.m15545x(new m83(c3244lM17114d, new OnboardingEndViewModel$1(this, null), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new OnboardingEndViewModel$login$1(this, zBooleanValue, str, str4, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static final LibraryTab m9127V2(C2197b c2197b, LibraryShelf libraryShelf) {
        Object next;
        List list = libraryShelf.f19495c;
        if (list.size() == 1) {
            return (LibraryTab) u91.m22589G0(list);
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((LibraryTab) next).f19504d);
        LibraryTab libraryTab = (LibraryTab) next;
        return libraryTab == null ? (LibraryTab) u91.m22589G0(list) : libraryTab;
    }

    /* JADX INFO: renamed from: W2 */
    public static void m9128W2(C2197b c2197b, String str, String str2, LibraryShelf libraryShelf, LibraryTab libraryTab) {
        wfb.m23926u(c2197b.f27169j, null, null, new OnboardingEndViewModel$fetchLessonsNetwork$1(c2197b, str, libraryShelf, libraryTab, str2, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27161b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27161b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27161b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27161b.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f27162c.mo8549D(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27161b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27161b.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f27162c.mo8550F2(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27161b.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f27162c.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27162c.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f27162c.mo8553I();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f27162c.mo8554I1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27161b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27161b.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f27162c.mo8555K0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27161b.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f27162c.mo8556K2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27161b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27161b.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f27162c.mo8557N1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27161b.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f27162c.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f27162c.mo8559P2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27161b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27161b.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f27162c.mo8560R0(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f27162c.mo8561S0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27161b.mo4586T0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f27162c.mo8562V0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f27162c.mo8564W1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27161b.mo4587X();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f27162c.mo8565Y();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27161b.mo4588a0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f27162c.mo8566b1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27161b.mo4589b2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f27162c.mo8567c0(purchase);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27161b.mo4590d0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f27162c.mo8568f1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27161b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f27162c.mo8569i2(i);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f27162c.mo8570k1(list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f27162c.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f27162c.mo8572l1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27161b.mo4592m0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f27162c.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f27162c.mo8574o0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27161b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27161b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27161b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27161b.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f27162c.mo8575v();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27161b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27161b.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f27162c.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f27162c.mo8577y2();
    }
}
