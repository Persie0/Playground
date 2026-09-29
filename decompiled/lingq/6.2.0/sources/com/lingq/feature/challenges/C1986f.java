package com.lingq.feature.challenges;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.cm3;
import p000.cma;
import p000.eh9;
import p000.et0;
import p000.g41;
import p000.lda;
import p000.m58;
import p000.n83;
import p000.nl8;
import p000.nn1;
import p000.tl3;
import p000.ue4;
import p000.us0;
import p000.wfb;
import p000.wta;
import p000.x13;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.challenges.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1986f extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f24761b;

    /* JADX INFO: renamed from: c */
    public final tl3 f24762c;

    /* JADX INFO: renamed from: d */
    public final x13 f24763d;

    /* JADX INFO: renamed from: e */
    public final ue4 f24764e;

    /* JADX INFO: renamed from: f */
    public final nn1 f24765f;

    /* JADX INFO: renamed from: g */
    public final m58 f24766g;

    /* JADX INFO: renamed from: h */
    public final us0 f24767h;

    /* JADX INFO: renamed from: i */
    public final C3244l f24768i;

    /* JADX INFO: renamed from: j */
    public final C3244l f24769j;

    /* JADX INFO: renamed from: k */
    public final C3244l f24770k;

    /* JADX INFO: renamed from: l */
    public final C3244l f24771l;

    /* JADX INFO: renamed from: m */
    public final c18 f24772m;

    public C1986f(tl3 tl3Var, x13 x13Var, ue4 ue4Var, nn1 nn1Var, cm3 cm3Var, m58 m58Var, cma cmaVar, nl8 nl8Var) {
        String str;
        cmaVar.getClass();
        nl8Var.getClass();
        this.f24761b = cmaVar;
        this.f24762c = tl3Var;
        this.f24763d = x13Var;
        this.f24764e = ue4Var;
        this.f24765f = nn1Var;
        this.f24766g = m58Var;
        us0.Companion.getClass();
        if (nl8Var.m17487a("languageFromDeeplink")) {
            str = (String) nl8Var.m17488b("languageFromDeeplink");
            if (str == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        this.f24767h = new us0(str);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f24768i = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(Boolean.TRUE);
        this.f24769j = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f24770k = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f24771l = c3244lM17114d4;
        n83 n83VarM15530i = AbstractC3224d.m15530i(c3244lM17114d2, c3244lM17114d3, c3244lM17114d, c3244lM17114d4, AbstractC3224d.m15521C(cmaVar.mo4572B0(), new ChallengesViewModel$special$$inlined$flatMapLatest$1(null, cm3Var)), new ChallengesViewModel$challengesUiState$1(null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        boolean z = (63 & 1) != 0;
        int i = 63 & 8;
        EmptyList emptyList = EmptyList.f47638a;
        this.f24772m = AbstractC3224d.m15520B(n83VarM15530i, g41VarM16103C, c3243k, new et0(z, false, false, i != 0 ? emptyList : null, null, emptyList));
        m8853V2(false);
        wfb.m23926u(lda.m16103C(this), null, null, new ChallengesViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ChallengesViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24761b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24761b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24761b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24761b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f24761b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f24761b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24761b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f24761b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f24761b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f24761b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f24761b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24761b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24761b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f24761b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24761b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f24761b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8853V2(boolean z) {
        C3244l c3244l;
        Object value;
        g41 g41VarM16103C = lda.m16103C(this);
        ChallengesViewModel$observeChallenges$1 challengesViewModel$observeChallenges$1 = new ChallengesViewModel$observeChallenges$1(this, null);
        nn1 nn1Var = this.f24765f;
        AbstractC1263a.m7047b(g41VarM16103C, nn1Var, "activeChallenges", challengesViewModel$observeChallenges$1);
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "networkChallenges", new ChallengesViewModel$networkChallenges$1(this, null));
        do {
            c3244l = this.f24770k;
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.valueOf(z)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24761b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f24761b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f24761b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f24761b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f24761b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f24761b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f24761b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24761b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f24761b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24761b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f24761b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f24761b.mo4598w2();
    }
}
