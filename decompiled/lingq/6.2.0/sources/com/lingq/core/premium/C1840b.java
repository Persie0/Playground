package com.lingq.core.premium;

import com.android.billingclient.api.Purchase;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.offers.C1516b;
import com.lingq.core.premium.domain.TrialReminderChoice;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.AbstractC3432a;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3513qw;
import p000.C3540rl;
import p000.c13;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.fa4;
import p000.fs6;
import p000.k12;
import p000.lda;
import p000.li3;
import p000.m83;
import p000.nl8;
import p000.pha;
import p000.qn7;
import p000.rh3;
import p000.v18;
import p000.vj6;
import p000.vk9;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.premium.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1840b extends wta implements cma, pha {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f22409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pha f22410c;

    /* JADX INFO: renamed from: d */
    public final vj6 f22411d;

    /* JADX INFO: renamed from: e */
    public final String f22412e;

    /* JADX INFO: renamed from: f */
    public final String f22413f;

    /* JADX INFO: renamed from: g */
    public final boolean f22414g;

    /* JADX INFO: renamed from: h */
    public final C3244l f22415h;

    /* JADX INFO: renamed from: i */
    public final c18 f22416i;

    public C1840b(pha phaVar, cma cmaVar, C1516b c1516b, qn7 qn7Var, fs6 fs6Var, vj6 vj6Var, nl8 nl8Var) {
        Boolean bool;
        String str;
        C3509qs c3509qs = (C3509qs) fs6Var.f39591c;
        phaVar.getClass();
        cmaVar.getClass();
        qn7Var.getClass();
        nl8Var.getClass();
        this.f22409b = cmaVar;
        this.f22410c = phaVar;
        this.f22411d = vj6Var;
        rh3.Companion.getClass();
        if (!nl8Var.m17487a("attemptedAction")) {
            C3386nv.m17626m("Required argument \"attemptedAction\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str2 = (String) nl8Var.m17488b("attemptedAction");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"attemptedAction\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (nl8Var.m17487a("isPlusDefault")) {
            bool = (Boolean) nl8Var.m17488b("isPlusDefault");
            if (bool == null) {
                C3386nv.m17626m("Argument \"isPlusDefault\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (nl8Var.m17487a("offer")) {
            str = (String) nl8Var.m17488b("offer");
            if (str == null) {
                C3386nv.m17626m("Argument \"offer\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        boolean zBooleanValue = bool.booleanValue();
        int i = 7;
        DateTime dateTimeM18333f = new DateTime().m18333f(7);
        LocalDateTime localDateTime = new LocalDateTime(dateTimeM18333f.mo18366b(), dateTimeM18333f.mo18365a());
        k12 k12VarM14769d = AbstractC3432a.m18451a("MMM dd").m14769d(Locale.getDefault());
        this.f22412e = k12VarM14769d.m14767b(localDateTime);
        str = vk9.m23391n0(str) ? null : str;
        this.f22413f = str;
        c83 c83VarM8193b = c1516b.m8193b(str);
        LqAnalyticsValues$UpgradePopupSource lqAnalyticsValues$UpgradePopupSource = LqAnalyticsValues$UpgradePopupSource.Registration;
        boolean z = !str2.equals(lqAnalyticsValues$UpgradePopupSource.getValue()) ? false : c3509qs.f58118b.getBoolean("active_onboarding_multipage_paywall_flow", false);
        boolean z2 = !str2.equals(lqAnalyticsValues$UpgradePopupSource.getValue()) ? false : c3509qs.f58118b.getBoolean("active_onboarding_multipage_paywall_reminder_choice_flow", false);
        this.f22414g = z2;
        String strM14767b = k12VarM14769d.m14767b(localDateTime.m18372f(2));
        String strM14767b2 = k12VarM14769d.m14767b(localDateTime.m18372f(3));
        int i2 = 1;
        li3 li3Var = new li3((471551 & 1) != 0 ? "" : "$99.99", (471551 & 2) != 0 ? "" : "$199.99", (471551 & 4) != 0 ? "" : "$7.99", (471551 & 8) != 0 ? EmptyList.f47638a : null, false, "", false, null, (471551 & 256) == 0, (471551 & 512) != 0 ? false : zBooleanValue, (471551 & 1024) != 0 ? false : z, (471551 & 2048) != 0 ? false : z2, (471551 & 4096) != 0 ? FreeTrialOnboardingPage.Timeline : null, TrialReminderChoice.TwoDaysBefore, (471551 & 16384) != 0 ? "" : strM14767b, (32768 & 471551) != 0 ? "" : strM14767b2, "", "", null);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(li3Var);
        this.f22415h = c3244lM17114d;
        this.f22416i = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, li3Var);
        Object objM17488b = nl8Var.m17488b("upgrade_page_visited_logged");
        Boolean bool2 = Boolean.TRUE;
        if (!fa4.m11650l(objM17488b, bool2)) {
            nl8Var.m17490d(bool2, "upgrade_page_visited_logged");
            vj6Var.m23350z(str2, z2 ? "Go from curious to confident (trial reminder choice)" : z ? "Go from curious to confident" : "How your free trial works");
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.getClass();
        currencyInstance.setMaximumFractionDigits(2);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15530i(phaVar.mo8559P2(), phaVar.mo8566b1(), phaVar.mo8572l1(), AbstractC3224d.m15536o(new c13(c3244lM17114d, i2)), c83VarM8193b, new FreeTrialViewModel$2(this, currencyInstance, null)), new FreeTrialViewModel$3(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3228h(c83VarM8193b, qn7Var.getState(), new FreeTrialViewModel$4(3, null)), new FreeTrialViewModel$5(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3540rl(phaVar.mo8575v(), 5), new FreeTrialViewModel$6(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3513qw(phaVar.mo8576x2(), i), new FreeTrialViewModel$8(this, null), 2), lda.m16103C(this));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22409b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22409b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22409b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22409b.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f22410c.mo8549D(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22409b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22409b.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f22410c.mo8550F2(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22409b.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f22410c.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22410c.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f22410c.mo8553I();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f22410c.mo8554I1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22409b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22409b.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f22410c.mo8555K0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22409b.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f22410c.mo8556K2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22409b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22409b.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f22410c.mo8557N1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22409b.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f22410c.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f22410c.mo8559P2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22409b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22409b.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f22410c.mo8560R0(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f22410c.mo8561S0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22409b.mo4586T0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f22410c.mo8562V0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8563V2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f22415h;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, li3.m16234a((li3) value, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, 524223)));
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f22410c.mo8564W1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22409b.mo4587X();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f22410c.mo8565Y();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22409b.mo4588a0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f22410c.mo8566b1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22409b.mo4589b2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f22410c.mo8567c0(purchase);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22409b.mo4590d0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f22410c.mo8568f1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22409b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f22410c.mo8569i2(i);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f22410c.mo8570k1(list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f22410c.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f22410c.mo8572l1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22409b.mo4592m0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f22410c.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f22410c.mo8574o0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22409b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22409b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22409b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22409b.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f22410c.mo8575v();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22409b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22409b.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f22410c.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f22410c.mo8577y2();
    }
}
