package com.lingq.feature.statistics;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.stats.C1529d;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.m83;
import p000.nn1;
import p000.oo4;
import p000.si7;
import p000.sj9;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.statistics.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C2821i extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f33470b;

    /* JADX INFO: renamed from: c */
    public final oo4 f33471c;

    /* JADX INFO: renamed from: d */
    public final nn1 f33472d;

    /* JADX INFO: renamed from: e */
    public final c18 f33473e;

    /* JADX INFO: renamed from: f */
    public final C3211a f33474f;

    /* JADX INFO: renamed from: g */
    public final du0 f33475g;

    /* JADX INFO: renamed from: h */
    public final C3244l f33476h;

    /* JADX INFO: renamed from: i */
    public final c18 f33477i;

    /* JADX INFO: renamed from: j */
    public final C3244l f33478j;

    /* JADX INFO: renamed from: k */
    public final c18 f33479k;

    /* JADX INFO: renamed from: l */
    public final c18 f33480l;

    public C2821i(oo4 oo4Var, si7 si7Var, nn1 nn1Var, cma cmaVar, C1529d c1529d) {
        oo4Var.getClass();
        si7Var.getClass();
        cmaVar.getClass();
        this.f33470b = cmaVar;
        this.f33471c = oo4Var;
        this.f33472d = nn1Var;
        m83 m83Var = new m83(c1529d.m8208a(), new StatsShareViewModel$streak$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(m83Var, g41VarM16103C, c3243k, null);
        this.f33473e = AbstractC3224d.m15520B(new C3228h(c18VarM15520B, AbstractC3224d.m15520B(AbstractC3224d.m15521C(cmaVar.mo4572B0(), new StatsShareViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, null), new StatsShareViewModel$streakWeekUiState$1(3, null)), lda.m16103C(this), c3243k, sj9.f60941a);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f33474f = c3211aM7042a;
        this.f33475g = AbstractC3224d.m15519A(c3211aM7042a);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new Pair(0, cmaVar.mo4589b2()));
        this.f33476h = c3244lM17114d;
        this.f33477i = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), c3243k, new Pair(0, cmaVar.mo4589b2()));
        Boolean bool = Boolean.TRUE;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new Pair(emptyList, bool));
        this.f33478j = c3244lM17114d2;
        this.f33479k = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d2, new StatsShareViewModel$goals$1(3, null)), lda.m16103C(this), c3243k, new Pair(emptyList, bool));
        this.f33480l = AbstractC3224d.m15520B(new C3228h(c18VarM15520B, c3244lM17114d2, new StatsShareViewModel$canShare$1(3, null)), lda.m16103C(this), c3243k, Boolean.FALSE);
        c3244lM17114d2.m15572j(null, new Pair(emptyList, bool));
        LanguageProgressInterval languageProgressInterval = LanguageProgressInterval.AllTime;
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "update goals " + languageProgressInterval, new StatsShareViewModel$updateGoals$1(this, languageProgressInterval, null));
        String strMo4589b2 = cmaVar.mo4589b2();
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "goals " + languageProgressInterval, new StatsShareViewModel$getGoals$1(this, strMo4589b2, languageProgressInterval, null));
        LanguageProgressInterval languageProgressInterval2 = LanguageProgressInterval.LastWeek;
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "update goals " + languageProgressInterval2, new StatsShareViewModel$updateGoals$1(this, languageProgressInterval2, null));
        String strMo4589b3 = cmaVar.mo4589b2();
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "goals " + languageProgressInterval2, new StatsShareViewModel$getGoals$1(this, strMo4589b3, languageProgressInterval2, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f33470b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f33470b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f33470b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f33470b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f33470b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f33470b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f33470b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f33470b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f33470b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f33470b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f33470b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f33470b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f33470b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f33470b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f33470b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f33470b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f33470b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f33470b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f33470b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f33470b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f33470b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f33470b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f33470b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f33470b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f33470b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f33470b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f33470b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f33470b.mo4598w2();
    }
}
