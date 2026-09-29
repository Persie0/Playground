package com.lingq.feature.statistics;

import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.hn4;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.oo4;
import p000.wfb;
import p000.wta;
import p000.xh9;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.statistics.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810a extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33377b;

    /* JADX INFO: renamed from: c */
    public final oo4 f33378c;

    /* JADX INFO: renamed from: d */
    public final nn1 f33379d;

    /* JADX INFO: renamed from: e */
    public final C3244l f33380e;

    /* JADX INFO: renamed from: f */
    public final C3244l f33381f;

    /* JADX INFO: renamed from: g */
    public final c18 f33382g;

    public C2810a(oo4 oo4Var, nn1 nn1Var, cma cmaVar, nl8 nl8Var) {
        LanguageProgressPeriod languageProgressPeriod;
        oo4Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f33377b = cmaVar;
        this.f33378c = oo4Var;
        this.f33379d = nn1Var;
        hn4.Companion.getClass();
        if (!nl8Var.m17487a("period")) {
            languageProgressPeriod = LanguageProgressPeriod.Today;
        } else {
            if (!Parcelable.class.isAssignableFrom(LanguageProgressPeriod.class) && !Serializable.class.isAssignableFrom(LanguageProgressPeriod.class)) {
                C3386nv.m17636w(LanguageProgressPeriod.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                throw null;
            }
            languageProgressPeriod = (LanguageProgressPeriod) nl8Var.m17488b("period");
            if (languageProgressPeriod == null) {
                C3386nv.m17626m("Argument \"period\" is marked as non-null but was passed a null value");
                throw null;
            }
        }
        new hn4(languageProgressPeriod);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(languageProgressPeriod);
        this.f33380e = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f33381f = c3244lM17114d2;
        this.f33382g = AbstractC3224d.m15520B(new C3228h(c3244lM17114d, c3244lM17114d2, new LanguageStatsAllViewModel$statsAllUiState$1(3, null)), lda.m16103C(this), xi9.f68262a, new xh9(LanguageProgressPeriod.Today));
        wfb.m23926u(lda.m16103C(this), null, null, new LanguageStatsAllViewModel$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33377b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33377b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33377b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33377b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33377b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33377b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33377b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33377b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33377b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33377b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33377b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33377b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33377b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33377b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33377b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33377b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33377b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33377b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33377b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33377b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33377b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33377b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33377b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33377b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33377b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33377b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33377b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33377b.mo4598w2();
    }
}
