package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.domain.dictionaries.C1375a;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.ef2;
import p000.eh9;
import p000.g41;
import p000.h23;
import p000.jd0;
import p000.lda;
import p000.nn1;
import p000.nt0;
import p000.vj6;
import p000.vqb;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C2066j extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f25833b;

    /* JADX INFO: renamed from: c */
    public final nt0 f25834c;

    /* JADX INFO: renamed from: d */
    public final vj6 f25835d;

    /* JADX INFO: renamed from: e */
    public final vqb f25836e;

    /* JADX INFO: renamed from: f */
    public final nt0 f25837f;

    /* JADX INFO: renamed from: g */
    public final h23 f25838g;

    /* JADX INFO: renamed from: h */
    public final nn1 f25839h;

    /* JADX INFO: renamed from: i */
    public final C3244l f25840i;

    /* JADX INFO: renamed from: j */
    public final c18 f25841j;

    public C2066j(h23 h23Var, C1375a c1375a, nt0 nt0Var, vj6 vj6Var, vqb vqbVar, nt0 nt0Var2, h23 h23Var2, cma cmaVar, nn1 nn1Var) {
        cmaVar.getClass();
        this.f25833b = cmaVar;
        this.f25834c = nt0Var;
        this.f25835d = vj6Var;
        this.f25836e = vqbVar;
        this.f25837f = nt0Var2;
        this.f25838g = h23Var2;
        this.f25839h = nn1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.FALSE);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(cmaVar.mo4580K1());
        this.f25840i = c3244lM17114d2;
        C3235e c3235eM15521C = AbstractC3224d.m15521C(c3244lM17114d2, new DictionariesManageViewModel$availableDictionaries$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, EmptyList.f47638a);
        String strMo4589b2 = cmaVar.mo4589b2();
        strMo4589b2.getClass();
        C1292h c1292h = (C1292h) h23Var.f41694a;
        c1292h.getClass();
        C1318f c1318f = c1292h.f16483b;
        c1318f.getClass();
        this.f25841j = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c3244lM17114d, AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(strMo4589b2, 6)))), c18VarM15520B, c1375a.m7981a(cmaVar.mo4589b2()), c3244lM17114d2, new DictionariesManageViewModel$uiState$1(null)), lda.m16103C(this), c3243k, new ef2(null, null, null, null, true, 47));
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new DictionariesManageViewModel$1(this, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25833b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25833b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25833b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25833b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25833b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25833b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25833b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25833b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25833b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25833b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25833b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25833b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25833b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25833b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25833b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25833b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25833b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25833b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25833b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25833b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25833b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25833b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25833b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25833b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25833b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25833b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25833b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25833b.mo4598w2();
    }
}
