package com.lingq.feature.onboarding.auth.login;

import com.lingq.core.common.network.C1262a;
import com.lingq.core.datastore.C1372e;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.onboarding.domain.C2207a;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3509qs;
import p000.bk5;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cu6;
import p000.dk5;
import p000.eh9;
import p000.fi6;
import p000.g41;
import p000.hm5;
import p000.lda;
import p000.m58;
import p000.n83;
import p000.nl8;
import p000.ob1;
import p000.s2b;
import p000.vk9;
import p000.wfb;
import p000.wm5;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2177b extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27058b;

    /* JADX INFO: renamed from: c */
    public final dk5 f27059c;

    /* JADX INFO: renamed from: d */
    public final C2207a f27060d;

    /* JADX INFO: renamed from: e */
    public final dk5 f27061e;

    /* JADX INFO: renamed from: f */
    public final ob1 f27062f;

    /* JADX INFO: renamed from: g */
    public final hm5 f27063g;

    /* JADX INFO: renamed from: h */
    public final C1262a f27064h;

    /* JADX INFO: renamed from: i */
    public final C3244l f27065i;

    /* JADX INFO: renamed from: j */
    public final C3244l f27066j;

    /* JADX INFO: renamed from: k */
    public final C3244l f27067k;

    /* JADX INFO: renamed from: l */
    public final c18 f27068l;

    public C2177b(dk5 dk5Var, C2207a c2207a, dk5 dk5Var2, ob1 ob1Var, C3509qs c3509qs, hm5 hm5Var, C1262a c1262a, m58 m58Var, cma cmaVar, nl8 nl8Var) {
        String str;
        ob1Var.getClass();
        c3509qs.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f27058b = cmaVar;
        this.f27059c = dk5Var;
        this.f27060d = c2207a;
        this.f27061e = dk5Var2;
        this.f27062f = ob1Var;
        this.f27063g = hm5Var;
        this.f27064h = c1262a;
        cu6.Companion.getClass();
        if (nl8Var.m17487a("authCode")) {
            str = (String) nl8Var.m17488b("authCode");
            if (str == null) {
                C3386nv.m17626m("Argument \"authCode\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        wm5 wm5Var = wm5.f67054a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(wm5Var);
        this.f27065i = c3244lM17114d;
        C3235e c3235eM15546y = AbstractC3224d.m15546y(c3244lM17114d, new OnboardingLoginViewModel$_userData$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15546y, g41VarM16103C, c3243k, wm5Var);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f27066j = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(0);
        this.f27067k = c3244lM17114d3;
        n83 n83VarM15530i = AbstractC3224d.m15530i(c3244lM17114d2, c3244lM17114d, c18VarM15520B, c3244lM17114d3, ((C1372e) ((s2b) m58Var.f50618b)).f18596g, new OnboardingLoginViewModel$loginUiState$1(this, null));
        g41 g41VarM16103C2 = lda.m16103C(this);
        fi6 fi6Var = fi6.f39147b;
        wm5 wm5Var2 = wm5.f67054a;
        this.f27068l = AbstractC3224d.m15520B(n83VarM15530i, g41VarM16103C2, c3243k, new bk5(false, 0, wm5Var2, wm5Var2, "", fi6Var));
        String string = c3509qs.f58118b.getString("deeplinkURL", "");
        String str2 = string != null ? string : "";
        if (!vk9.m23391n0(str2)) {
            c3509qs.m20134h(str2);
        }
        if (vk9.m23391n0(str)) {
            return;
        }
        m9112V2(this, null, null, str, LoginAuthType.CODE, 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static void m9112V2(C2177b c2177b, String str, String str2, String str3, LoginAuthType loginAuthType, int i) {
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        c2177b.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        loginAuthType.getClass();
        wfb.m23926u(lda.m16103C(c2177b), null, null, new OnboardingLoginViewModel$login$1(c2177b, str4, str5, str6, loginAuthType, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27058b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27058b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27058b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27058b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27058b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27058b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27058b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27058b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27058b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27058b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27058b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27058b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27058b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27058b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27058b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27058b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27058b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27058b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27058b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27058b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27058b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27058b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27058b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27058b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27058b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27058b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27058b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27058b.mo4598w2();
    }
}
