package com.lingq.feature.dictionary;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.g41;
import p000.lda;
import p000.nn1;
import p000.re2;
import p000.se2;
import p000.te2;
import p000.v91;
import p000.wfb;
import p000.wta;
import p000.xf2;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2057b extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f25792b;

    /* JADX INFO: renamed from: c */
    public final xf2 f25793c;

    /* JADX INFO: renamed from: d */
    public final nn1 f25794d;

    /* JADX INFO: renamed from: e */
    public final C3244l f25795e;

    /* JADX INFO: renamed from: f */
    public final C3244l f25796f;

    /* JADX INFO: renamed from: g */
    public final C3244l f25797g;

    /* JADX INFO: renamed from: h */
    public final C3244l f25798h;

    /* JADX INFO: renamed from: i */
    public final C3244l f25799i;

    /* JADX INFO: renamed from: j */
    public final C3244l f25800j;

    /* JADX INFO: renamed from: k */
    public final C3244l f25801k;

    /* JADX INFO: renamed from: l */
    public final c18 f25802l;

    public C2057b(C1297m c1297m, xf2 xf2Var, cma cmaVar, nn1 nn1Var) {
        c1297m.getClass();
        xf2Var.getClass();
        cmaVar.getClass();
        this.f25792b = cmaVar;
        this.f25793c = xf2Var;
        this.f25794d = nn1Var;
        Boolean bool = Boolean.FALSE;
        this.f25795e = AbstractC3352my.m17114d(bool);
        this.f25796f = AbstractC3352my.m17114d(cmaVar.mo4580K1());
        EmptyList emptyList = EmptyList.f47638a;
        this.f25797g = AbstractC3352my.m17114d(emptyList);
        this.f25798h = AbstractC3352my.m17114d(emptyList);
        this.f25799i = AbstractC3352my.m17114d(emptyList);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f25800j = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, bool);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f25801k = c3244lM17114d2;
        this.f25802l = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        wfb.m23926u(lda.m16103C(this), null, null, new DictManageViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictManageViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictManageViewModel$3(this, null), 3);
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "observableActiveDictionaries", new DictManageViewModel$fetchActiveDictionaries$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "observableAvailableDictionaries", new DictManageViewModel$fetchAvailableDictionaries$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, "observableAvailableLocales", new DictManageViewModel$fetchAvailableLocales$1(this, null));
        wfb.m23926u(lda.m16103C(this), null, null, new DictManageViewModel$updateActiveDictionaries$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictManageViewModel$updateAvailableLocales$1(this, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static final ArrayList m8964V2(C2057b c2057b) {
        ArrayList arrayList = new ArrayList();
        List list = (List) c2057b.f25798h.getValue();
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new re2((DictionaryData) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new te2((List) c2057b.f25797g.getValue(), (String) c2057b.f25796f.getValue()));
        List list2 = (List) c2057b.f25799i.getValue();
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new se2((DictionaryData) it2.next()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25792b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25792b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25792b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25792b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25792b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25792b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25792b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25792b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25792b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25792b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25792b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25792b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25792b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25792b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25792b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25792b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25792b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25792b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25792b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25792b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25792b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25792b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25792b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25792b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25792b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25792b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25792b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25792b.mo4598w2();
    }
}
