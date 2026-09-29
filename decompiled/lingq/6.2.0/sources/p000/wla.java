package p000;

import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class wla extends wta implements cma, jka {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f67021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jka f67022c;

    /* JADX INFO: renamed from: d */
    public final C3244l f67023d;

    /* JADX INFO: renamed from: e */
    public final c18 f67024e;

    public wla(jka jkaVar, cma cmaVar, nl8 nl8Var) {
        String str;
        String str2;
        jkaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f67021b = cmaVar;
        this.f67022c = jkaVar;
        ula.Companion.getClass();
        String str3 = "";
        if (nl8Var.m17487a("url")) {
            str = (String) nl8Var.m17488b("url");
            if (str == null) {
                C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        if (nl8Var.m17487a("title")) {
            str2 = (String) nl8Var.m17488b("title");
            if (str2 == null) {
                C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str2 = "";
        }
        if (nl8Var.m17487a("fileUri") && (str3 = (String) nl8Var.m17488b("fileUri")) == null) {
            C3386nv.m17626m("Argument \"fileUri\" is marked as non-null but was passed a null value");
            throw null;
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new n02(str2, str, str3));
        this.f67023d = c3244lM17114d;
        this.f67024e = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, null);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f67021b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f67021b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f67021b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f67021b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f67021b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f67021b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f67021b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f67021b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f67021b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f67021b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f67021b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f67021b.mo4582N();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: N0 */
    public final void mo9011N0(ika ikaVar) {
        this.f67022c.mo9011N0(ikaVar);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f67021b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f67021b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f67021b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f67021b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f67021b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f67021b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f67021b.mo4589b2();
    }

    @Override // p000.jka
    public final void clear() {
        this.f67022c.clear();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f67021b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f67021b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: l0 */
    public final eh9 mo9013l0() {
        return this.f67022c.mo9013l0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f67021b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f67021b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f67021b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f67021b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f67021b.mo4596t();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: u2 */
    public final eh9 mo9014u2() {
        return this.f67022c.mo9014u2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f67021b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f67021b.mo4598w2();
    }
}
