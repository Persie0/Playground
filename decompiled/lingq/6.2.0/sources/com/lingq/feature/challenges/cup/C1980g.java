package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cx1;
import p000.dm3;
import p000.eh9;
import p000.ew1;
import p000.g23;
import p000.g41;
import p000.hi8;
import p000.lda;
import p000.lv1;
import p000.m58;
import p000.ns1;
import p000.q41;
import p000.vqb;
import p000.web;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.yo1;
import p000.yw1;

/* JADX INFO: renamed from: com.lingq.feature.challenges.cup.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1980g extends wta implements cma {
    private static final yw1 Companion = new yw1();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f24706b;

    /* JADX INFO: renamed from: c */
    public final q41 f24707c;

    /* JADX INFO: renamed from: d */
    public final m58 f24708d;

    /* JADX INFO: renamed from: e */
    public final g23 f24709e;

    /* JADX INFO: renamed from: f */
    public final hi8 f24710f;

    /* JADX INFO: renamed from: g */
    public final vqb f24711g;

    /* JADX INFO: renamed from: h */
    public final dm3 f24712h;

    /* JADX INFO: renamed from: i */
    public final ns1 f24713i;

    /* JADX INFO: renamed from: j */
    public final C3244l f24714j;

    /* JADX INFO: renamed from: k */
    public final C3244l f24715k;

    /* JADX INFO: renamed from: l */
    public final C3244l f24716l;

    /* JADX INFO: renamed from: m */
    public final C3244l f24717m;

    /* JADX INFO: renamed from: n */
    public final c18 f24718n;

    /* JADX INFO: renamed from: o */
    public final c18 f24719o;

    public C1980g(dm3 dm3Var, web webVar, dm3 dm3Var2, q41 q41Var, m58 m58Var, g23 g23Var, hi8 hi8Var, vqb vqbVar, dm3 dm3Var3, ns1 ns1Var, cma cmaVar) {
        cmaVar.getClass();
        this.f24706b = cmaVar;
        this.f24707c = q41Var;
        this.f24708d = m58Var;
        this.f24709e = g23Var;
        this.f24710f = hi8Var;
        this.f24711g = vqbVar;
        this.f24712h = dm3Var3;
        this.f24713i = ns1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f24714j = c3244lM17114d;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f24715k = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f24716l = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f24717m = c3244lM17114d4;
        yo1 yo1VarM10472a = dm3Var.m10472a();
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(yo1VarM10472a, g41VarM16103C, c3243k, null);
        this.f24718n = c18VarM15520B;
        this.f24719o = AbstractC3224d.m15520B(AbstractC3224d.m15531j(c18VarM15520B, AbstractC3224d.m15520B(webVar.m23870G(), lda.m16103C(this), c3243k, EmptyList.f47638a), new C3228h(AbstractC3224d.m15520B(((C1291g) dm3Var2.f35822a).m7194g(null), lda.m16103C(this), c3243k, null), AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new cx1(c18VarM15520B, 0)), new CupViewModel$special$$inlined$flatMapLatest$1(null, dm3Var2)), lda.m16103C(this), c3243k, null), new CupViewModel$contributorsData$1(3, null)), AbstractC3224d.m15531j(c3244lM17114d, c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, new CupViewModel$uiFlags$1(5, null)), new CupViewModel$state$1(this, null)), lda.m16103C(this), c3243k, new lv1(null, false, null, null, null, null, null, null, null, false, false, null, 4095));
        m8845Y2(false);
        ns1Var.m17611b("Cup");
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$1(this, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static Integer m8842V2(String str) {
        Object failure;
        try {
            int iBetween = (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(str));
            if (iBetween < 0) {
                iBetween = 0;
            }
            failure = Integer.valueOf(iBetween);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Integer) failure;
    }

    /* JADX INFO: renamed from: W2 */
    public static int m8843W2(ew1 ew1Var) {
        Object failure;
        try {
            failure = Integer.valueOf((int) ChronoUnit.DAYS.between(LocalDate.parse(ew1Var.f37977c), LocalDate.parse(ew1Var.f37978d)));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24706b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24706b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24706b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24706b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f24706b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f24706b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24706b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f24706b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f24706b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f24706b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f24706b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24706b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24706b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f24706b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24706b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f24706b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24706b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8844X2() {
        ew1 ew1Var = (ew1) ((C3244l) this.f24718n.f9311a).getValue();
        if (ew1Var == null) {
            return;
        }
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$openSignup$1(this, ew1Var, null), 3);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m8845Y2(boolean z) {
        C3244l c3244l;
        Object value;
        if (z) {
            do {
                c3244l = this.f24715k;
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.TRUE));
        }
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$refresh$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$refresh$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$refresh$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CupViewModel$refresh$5(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f24706b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f24706b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f24706b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f24706b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f24706b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f24706b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24706b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f24706b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24706b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f24706b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f24706b.mo4598w2();
    }
}
