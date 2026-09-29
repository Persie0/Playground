package com.lingq.feature.onboarding.auth.registration;

import android.os.Bundle;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$RegistrationMethod;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.Continuation;
import org.joda.time.DateTime;
import p000.C3509qs;
import p000.c83;
import p000.cma;
import p000.cx6;
import p000.eh9;
import p000.h48;
import p000.hm5;
import p000.hy3;
import p000.km7;
import p000.lda;
import p000.lm4;
import p000.nl8;
import p000.ob1;
import p000.pg9;
import p000.qw4;
import p000.si7;
import p000.t66;
import p000.u91;
import p000.un1;
import p000.wfb;
import p000.wm5;
import p000.wta;
import p000.xc9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.registration.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2196e extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27154b;

    /* JADX INFO: renamed from: c */
    public final km7 f27155c;

    /* JADX INFO: renamed from: d */
    public final hm5 f27156d;

    /* JADX INFO: renamed from: e */
    public final C3509qs f27157e;

    /* JADX INFO: renamed from: f */
    public final ob1 f27158f;

    /* JADX INFO: renamed from: g */
    public final t66 f27159g;

    /* JADX INFO: renamed from: h */
    public pg9 f27160h;

    public C2196e(km7 km7Var, lm4 lm4Var, si7 si7Var, un1 un1Var, hm5 hm5Var, C3509qs c3509qs, ob1 ob1Var, cma cmaVar, nl8 nl8Var) {
        km7Var.getClass();
        lm4Var.getClass();
        si7Var.getClass();
        un1Var.getClass();
        hm5Var.getClass();
        c3509qs.getClass();
        ob1Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f27154b = cmaVar;
        this.f27155c = km7Var;
        this.f27156d = hm5Var;
        this.f27157e = c3509qs;
        this.f27158f = ob1Var;
        wm5 wm5Var = wm5.f67054a;
        this.f27159g = AbstractC0278f.m1260j(new h48(false, wm5Var, wm5Var));
    }

    /* JADX INFO: renamed from: Y2 */
    public static void m9123Y2(C2196e c2196e, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        AbstractC1263a.m7046a(c2196e.f27160h);
        c2196e.f27160h = wfb.m23926u(lda.m16103C(c2196e), null, null, new OnboardingRegistrationViewModel$validateFields$1(c2196e, str, str2, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27154b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27154b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27154b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27154b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27154b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27154b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27154b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27154b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27154b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27154b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27154b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27154b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27154b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27154b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27154b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27154b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final h48 m9124V2() {
        return (h48) ((xc9) this.f27159g).getValue();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9125W2(String str) {
        this.f27156d.getClass();
        qw4 qw4Var = LearningLevel.Companion;
        String str2 = cx6.f34683b;
        qw4Var.getClass();
        qw4.m20188a(str2);
        u91.m22596N0(cx6.f34685d, null, null, null, null, 63);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27154b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9126X2(int i) {
        String value;
        Bundle bundle = new Bundle();
        String str = cx6.f34682a;
        bundle.putString("Registration started client", "android");
        bundle.putString("Registration started date", hy3.f43148E.m14766a(new DateTime()));
        bundle.putString("Registration started language", str);
        if (i == 1) {
            value = LqAnalyticsValues$RegistrationMethod.Email.getValue();
        } else if (i != 2) {
            value = i != 3 ? LqAnalyticsValues$RegistrationMethod.Email.getValue() : LqAnalyticsValues$RegistrationMethod.Google.getValue();
        } else {
            value = LqAnalyticsValues$RegistrationMethod.Facebook.getValue();
        }
        bundle.putString("Registration started method", value);
        ((C1240a) this.f27156d).m7025f("Registration started", bundle);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27154b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27154b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27154b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27154b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27154b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27154b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27154b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27154b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27154b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27154b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27154b.mo4598w2();
    }
}
