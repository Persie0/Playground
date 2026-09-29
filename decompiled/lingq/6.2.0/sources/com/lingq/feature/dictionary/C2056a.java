package com.lingq.feature.dictionary;

import android.os.Parcelable;
import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.navigation.model.DictionaryToUseDataNavArg;
import java.io.Serializable;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.g41;
import p000.jf2;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.pg9;
import p000.wfb;
import p000.wta;
import p000.xf2;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2056a extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f25780b;

    /* JADX INFO: renamed from: c */
    public final xf2 f25781c;

    /* JADX INFO: renamed from: d */
    public final C1297m f25782d;

    /* JADX INFO: renamed from: e */
    public final C1307w f25783e;

    /* JADX INFO: renamed from: f */
    public final nn1 f25784f;

    /* JADX INFO: renamed from: g */
    public final pg9 f25785g;

    /* JADX INFO: renamed from: h */
    public final pg9 f25786h;

    /* JADX INFO: renamed from: i */
    public final C3244l f25787i;

    /* JADX INFO: renamed from: j */
    public final C3244l f25788j;

    /* JADX INFO: renamed from: k */
    public final C3244l f25789k;

    /* JADX INFO: renamed from: l */
    public final C3211a f25790l;

    /* JADX INFO: renamed from: m */
    public final C3244l f25791m;

    public C2056a(xf2 xf2Var, C1297m c1297m, C1307w c1307w, nn1 nn1Var, cma cmaVar, nl8 nl8Var) {
        xf2Var.getClass();
        c1297m.getClass();
        c1307w.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f25780b = cmaVar;
        this.f25781c = xf2Var;
        this.f25782d = c1297m;
        this.f25783e = c1307w;
        this.f25784f = nn1Var;
        jf2.Companion.getClass();
        if (!nl8Var.m17487a("dictionaryData")) {
            C3386nv.m17626m("Required argument \"dictionaryData\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(DictionaryToUseDataNavArg.class) && !Serializable.class.isAssignableFrom(DictionaryToUseDataNavArg.class)) {
            C3386nv.m17636w(DictionaryToUseDataNavArg.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        if (((DictionaryToUseDataNavArg) nl8Var.m17488b("dictionaryData")) == null) {
            C3386nv.m17626m("Argument \"dictionaryData\" is marked as non-null but was passed a null value");
            throw null;
        }
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f25787i = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f25788j = c3244lM17114d2;
        AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC1261a.m7042a();
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f25789k = c3244lM17114d3;
        AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, bool);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f25790l = c3211aM7042a;
        AbstractC3224d.m15519A(c3211aM7042a);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f25791m = c3244lM17114d4;
        AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, null);
        AbstractC1263a.m7046a(this.f25785g);
        this.f25785g = wfb.m23926u(lda.m16103C(this), null, null, new DictContentViewModel$fetchActiveDictionaries$1(this, null), 3);
        AbstractC1263a.m7046a(this.f25786h);
        this.f25786h = wfb.m23926u(lda.m16103C(this), null, null, new DictContentViewModel$fetchAvailableDictionaries$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictContentViewModel$updateActiveDictionaries$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictContentViewModel$updateAvailableLocales$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new DictContentViewModel$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25780b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25780b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25780b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25780b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25780b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25780b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25780b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25780b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25780b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25780b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25780b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25780b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25780b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25780b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25780b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25780b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25780b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25780b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25780b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25780b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25780b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25780b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25780b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25780b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25780b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25780b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25780b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25780b.mo4598w2();
    }
}
