package com.lingq.feature.statistics;

import android.os.Parcelable;
import com.lingq.core.domain.model.language.LanguageProgressChartEntry;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3540rl;
import p000.c13;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cn4;
import p000.eh9;
import p000.g41;
import p000.gm5;
import p000.hm5;
import p000.ii9;
import p000.io4;
import p000.lda;
import p000.m83;
import p000.mo4;
import p000.n83;
import p000.nl8;
import p000.nn1;
import p000.oo4;
import p000.p33;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.zn4;

/* JADX INFO: renamed from: com.lingq.feature.statistics.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2812c extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33387b;

    /* JADX INFO: renamed from: c */
    public final oo4 f33388c;

    /* JADX INFO: renamed from: d */
    public final p33 f33389d;

    /* JADX INFO: renamed from: e */
    public final hm5 f33390e;

    /* JADX INFO: renamed from: f */
    public final nn1 f33391f;

    /* JADX INFO: renamed from: g */
    public final zn4 f33392g;

    /* JADX INFO: renamed from: h */
    public final C3244l f33393h;

    /* JADX INFO: renamed from: i */
    public final C3244l f33394i;

    /* JADX INFO: renamed from: j */
    public final C3244l f33395j;

    /* JADX INFO: renamed from: k */
    public final c18 f33396k;

    public C2812c(oo4 oo4Var, p33 p33Var, hm5 hm5Var, nn1 nn1Var, cma cmaVar, nl8 nl8Var) {
        LanguageProgressPeriod languageProgressPeriod;
        LanguageProgressMetric languageProgressMetric;
        cn4 cn4Var;
        oo4Var.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f33387b = cmaVar;
        this.f33388c = oo4Var;
        this.f33389d = p33Var;
        this.f33390e = hm5Var;
        this.f33391f = nn1Var;
        zn4.Companion.getClass();
        if (!nl8Var.m17487a("period")) {
            languageProgressPeriod = LanguageProgressPeriod.Last7Days;
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
        if (!nl8Var.m17487a("metric")) {
            languageProgressMetric = LanguageProgressMetric.KnownWords;
        } else {
            if (!Parcelable.class.isAssignableFrom(LanguageProgressMetric.class) && !Serializable.class.isAssignableFrom(LanguageProgressMetric.class)) {
                C3386nv.m17636w(LanguageProgressMetric.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                throw null;
            }
            languageProgressMetric = (LanguageProgressMetric) nl8Var.m17488b("metric");
            if (languageProgressMetric == null) {
                C3386nv.m17626m("Argument \"metric\" is marked as non-null but was passed a null value");
                throw null;
            }
        }
        this.f33392g = new zn4(languageProgressPeriod, languageProgressMetric);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(languageProgressPeriod);
        this.f33393h = c3244lM17114d;
        int i = 2;
        m83 m83Var = new m83(c3244lM17114d, new LanguageStatsDetailsViewModel$period$1(this, null), i);
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(m83Var, g41VarM16103C, c3243k, languageProgressPeriod);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(languageProgressMetric);
        this.f33394i = c3244lM17114d2;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15534m(new C3540rl(cmaVar.mo4572B0(), 5), c3244lM17114d, new LanguageStatsDetailsViewModel$_stats$1(this, null)), lda.m16103C(this), c3243k, null);
        LanguageProgressMetric languageProgressMetric2 = LanguageProgressMetric.LingQsCreated;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(vz1.m23605K(new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/01", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/02", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/03", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/04", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/05", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/06", 0.0d, 0.0d), new LanguageProgressChartEntry(languageProgressMetric2.getKey(), cmaVar.mo4589b2(), "09/07", 0.0d, 0.0d)));
        this.f33395j = c3244lM17114d3;
        n83 n83VarM15531j = AbstractC3224d.m15531j(c18VarM15520B2, new c13(c3244lM17114d3, i), c3244lM17114d2, c18VarM15520B, new LanguageStatsDetailsViewModel$languageStatsDetailsUiState$2(5, null));
        g41 g41VarM16103C2 = lda.m16103C(this);
        switch (mo4.f51633a[languageProgressMetric.ordinal()]) {
            case 1:
                cn4Var = ii9.f44150b;
                break;
            case 2:
                cn4Var = ii9.f44149a;
                break;
            case 3:
                cn4Var = ii9.f44152d;
                break;
            case 4:
                cn4Var = ii9.f44151c;
                break;
            case 5:
                cn4Var = ii9.f44153e;
                break;
            case 6:
                cn4Var = ii9.f44154f;
                break;
            case 7:
                cn4Var = ii9.f44155g;
                break;
            case 8:
                cn4Var = ii9.f44156h;
                break;
            case 9:
                cn4Var = ii9.f44157i;
                break;
            case 10:
                cn4Var = ii9.f44158j;
                break;
            default:
                gm5.m12750e();
                throw null;
        }
        this.f33396k = AbstractC3224d.m15520B(n83VarM15531j, g41VarM16103C2, c3243k, new io4(cn4Var, languageProgressPeriod));
        wfb.m23926u(lda.m16103C(this), null, null, new LanguageStatsDetailsViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LanguageStatsDetailsViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33387b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33387b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33387b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33387b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33387b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33387b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33387b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33387b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33387b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33387b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33387b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33387b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33387b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33387b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33387b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33387b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33387b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33387b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33387b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33387b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33387b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33387b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33387b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33387b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33387b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33387b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33387b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33387b.mo4598w2();
    }
}
