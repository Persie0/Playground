package com.lingq.core.premium;

import android.os.CountDownTimer;
import com.android.billingclient.api.Purchase;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.offers.C1516b;
import com.lingq.core.premium.delegate.UpgradeTier;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3540rl;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.e4b;
import p000.eh9;
import p000.eia;
import p000.fa4;
import p000.fs6;
import p000.lda;
import p000.m83;
import p000.nl8;
import p000.pha;
import p000.qn7;
import p000.uk8;
import p000.v18;
import p000.vj6;
import p000.vk8;
import p000.vk9;
import p000.wia;
import p000.wta;
import p000.xi9;
import p000.yia;

/* JADX INFO: renamed from: com.lingq.core.premium.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C1853l extends wta implements cma, pha, qn7, e4b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f22538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pha f22539c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qn7 f22540d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e4b f22541e;

    /* JADX INFO: renamed from: f */
    public final vj6 f22542f;

    /* JADX INFO: renamed from: g */
    public final yia f22543g;

    /* JADX INFO: renamed from: h */
    public final C3244l f22544h;

    /* JADX INFO: renamed from: i */
    public final c18 f22545i;

    /* JADX INFO: renamed from: j */
    public CountDownTimer f22546j;

    /* JADX INFO: renamed from: k */
    public final String f22547k;

    /* JADX INFO: renamed from: l */
    public final boolean f22548l;

    public C1853l(pha phaVar, qn7 qn7Var, e4b e4bVar, C1516b c1516b, vj6 vj6Var, fs6 fs6Var, cma cmaVar, nl8 nl8Var) {
        String str;
        Boolean bool;
        C3509qs c3509qs = (C3509qs) fs6Var.f39591c;
        phaVar.getClass();
        qn7Var.getClass();
        e4bVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f22538b = cmaVar;
        this.f22539c = phaVar;
        this.f22540d = qn7Var;
        this.f22541e = e4bVar;
        this.f22542f = vj6Var;
        yia.Companion.getClass();
        if (!nl8Var.m17487a("attemptedAction")) {
            C3386nv.m17626m("Required argument \"attemptedAction\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str2 = (String) nl8Var.m17488b("attemptedAction");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"attemptedAction\" is marked as non-null but was passed a null value");
            throw null;
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
        if (nl8Var.m17487a("plusDefault")) {
            bool = (Boolean) nl8Var.m17488b("plusDefault");
            if (bool == null) {
                C3386nv.m17626m("Argument \"plusDefault\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.f22543g = new yia(str2, str, zBooleanValue);
        LqAnalyticsValues$UpgradePopupSource lqAnalyticsValues$UpgradePopupSource = LqAnalyticsValues$UpgradePopupSource.Registration;
        boolean z = !str2.equals(lqAnalyticsValues$UpgradePopupSource.getValue()) ? false : c3509qs.f58118b.getBoolean("active_onboarding_multipage_paywall_flow", false);
        boolean z2 = !str2.equals(lqAnalyticsValues$UpgradePopupSource.getValue()) ? false : c3509qs.f58118b.getBoolean("active_onboarding_multipage_paywall_reminder_choice_flow", false);
        wia wiaVar = new wia((1409535 & 1) != 0 ? "" : "fr", "en", EmptyList.f47638a, false, new vk8(0, 0, 0, 0, 31), (1409535 & 32) != 0 ? UpgradeTier.FREE : null, "", false, UpgradeUserType.Free, (1409535 & 512) != 0 ? "" : zBooleanValue ? phaVar.mo8561S0() : phaVar.mo8551H1(), (1409535 & 1024) != 0 ? "" : zBooleanValue ? phaVar.mo8574o0() : phaVar.mo8555K0(), (1409535 & 2048) != 0 ? "" : phaVar.mo8551H1(), (1409535 & 4096) != 0 ? "" : phaVar.mo8555K0(), (1409535 & 8192) != 0 ? "" : phaVar.mo8561S0(), (1409535 & 16384) != 0 ? "" : phaVar.mo8574o0(), false, false, (131072 & 1409535) != 0 ? false : zBooleanValue, null, (524288 & 1409535) != 0 ? false : z, false);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(wiaVar);
        this.f22544h = c3244lM17114d;
        this.f22545i = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, wiaVar);
        str = vk9.m23391n0(str) ? null : str;
        this.f22547k = str;
        this.f22548l = eia.m11163b(str2, str);
        phaVar.mo8549D(str2);
        Object objM17488b = nl8Var.m17488b("upgrade_page_visited_logged");
        Boolean bool2 = Boolean.TRUE;
        if (!fa4.m11650l(objM17488b, bool2)) {
            nl8Var.m17490d(bool2, "upgrade_page_visited_logged");
            vj6Var.m23350z(str2, z2 ? "Go from curious to confident (trial reminder choice)" : z ? "Go from curious to confident" : "Reach your goals with LingQ Premium");
        }
        int i = 2;
        AbstractC3224d.m15545x(new m83(new C3540rl(cmaVar.mo4572B0(), 5), new UpgradeViewModel$1(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8559P2(), new UpgradeViewModel$2(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8566b1(), new UpgradeViewModel$3(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8554I1(), new UpgradeViewModel$4(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8564W1(), new UpgradeViewModel$5(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(qn7Var.getState(), new UpgradeViewModel$6(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1516b.m8193b(str), new UpgradeViewModel$7(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3540rl(phaVar.mo8575v(), 5), new UpgradeViewModel$8(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8576x2(), new UpgradeViewModel$9(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8572l1(), new UpgradeViewModel$10(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(phaVar.mo8562V0(), new UpgradeViewModel$11(this, null), i), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15546y(c3244lM17114d, new UpgradeViewModel$12(2, null)), new UpgradeViewModel$13(this, null), i), lda.m16103C(this));
    }

    /* JADX INFO: renamed from: V2 */
    public static final vk8 m8580V2(C1853l c1853l, long j) {
        long j2 = j / 86400000;
        long millis = j - TimeUnit.DAYS.toMillis(j2);
        long j3 = millis / 3600000;
        long millis2 = millis - TimeUnit.HOURS.toMillis(j3);
        long j4 = millis2 / 60000;
        return new vk8((int) j2, (int) j3, (int) j4, (int) ((millis2 - TimeUnit.MINUTES.toMillis(j4)) / 1000), 16);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22538b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22538b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22538b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22538b.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f22539c.mo8549D(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22538b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22538b.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f22539c.mo8550F2(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22538b.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f22539c.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22539c.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f22539c.mo8553I();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f22539c.mo8554I1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22538b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22538b.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f22539c.mo8555K0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22538b.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f22539c.mo8556K2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22538b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22538b.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f22539c.mo8557N1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22538b.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f22539c.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f22539c.mo8559P2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22538b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22538b.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f22539c.mo8560R0(str);
    }

    @Override // p000.e4b
    /* JADX INFO: renamed from: S */
    public final uk8 mo8581S() {
        return this.f22541e.mo8581S();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f22539c.mo8561S0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22538b.mo4586T0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f22539c.mo8562V0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f22539c.mo8564W1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22538b.mo4587X();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f22539c.mo8565Y();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22538b.mo4588a0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f22539c.mo8566b1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22538b.mo4589b2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f22539c.mo8567c0(purchase);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22538b.mo4590d0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f22539c.mo8568f1();
    }

    @Override // p000.qn7
    public final eh9 getState() {
        return this.f22540d.getState();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22538b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f22539c.mo8569i2(i);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f22539c.mo8570k1(list);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f22539c.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f22539c.mo8572l1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22538b.mo4592m0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f22539c.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f22539c.mo8574o0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22538b.mo4593p0();
    }

    @Override // p000.qn7
    /* JADX INFO: renamed from: p2 */
    public final Object mo8578p2(Continuation continuation) {
        return this.f22540d.mo8578p2(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22538b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22538b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22538b.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f22539c.mo8575v();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22538b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22538b.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f22539c.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f22539c.mo8577y2();
    }
}
