package com.lingq.feature.imports;

import android.content.Context;
import android.os.Parcelable;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.bla;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.eh9;
import p000.fa4;
import p000.fv8;
import p000.g41;
import p000.ika;
import p000.jka;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.pla;
import p000.qla;
import p000.v91;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.xo1;
import p000.ys2;

/* JADX INFO: renamed from: com.lingq.feature.imports.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2108e extends wta implements jka, cma {
    public static final pla Companion = new pla();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jka f26154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f26155c;

    /* JADX INFO: renamed from: d */
    public final Context f26156d;

    /* JADX INFO: renamed from: e */
    public final xo1 f26157e;

    /* JADX INFO: renamed from: f */
    public final d65 f26158f;

    /* JADX INFO: renamed from: g */
    public final nn1 f26159g;

    /* JADX INFO: renamed from: h */
    public final bla f26160h;

    /* JADX INFO: renamed from: i */
    public final UserImportDetailType f26161i;

    /* JADX INFO: renamed from: j */
    public final C3244l f26162j;

    /* JADX INFO: renamed from: k */
    public final c18 f26163k;

    /* JADX INFO: renamed from: l */
    public final C3244l f26164l;

    /* JADX INFO: renamed from: m */
    public final C3244l f26165m;

    /* JADX INFO: renamed from: n */
    public final c18 f26166n;

    /* JADX INFO: renamed from: o */
    public final C3244l f26167o;

    /* JADX INFO: renamed from: p */
    public final C3244l f26168p;

    /* JADX INFO: renamed from: q */
    public final c18 f26169q;

    public C2108e(Context context, xo1 xo1Var, d65 d65Var, nn1 nn1Var, jka jkaVar, cma cmaVar, nl8 nl8Var) {
        xo1Var.getClass();
        d65Var.getClass();
        jkaVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f26154b = jkaVar;
        this.f26155c = cmaVar;
        this.f26156d = context;
        this.f26157e = xo1Var;
        this.f26158f = d65Var;
        this.f26159g = nn1Var;
        bla.Companion.getClass();
        if (!nl8Var.m17487a("userImportDetailType")) {
            C3386nv.m17626m("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            C3386nv.m17636w(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) nl8Var.m17488b("userImportDetailType");
        if (userImportDetailType == null) {
            C3386nv.m17626m("Argument \"userImportDetailType\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f26160h = new bla(userImportDetailType);
        this.f26161i = userImportDetailType;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f26162j = c3244lM17114d;
        this.f26163k = AbstractC3224d.m15524c(c3244lM17114d);
        this.f26164l = AbstractC3352my.m17114d("");
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f26165m = c3244lM17114d2;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f26166n = AbstractC3224d.m15520B(c3244lM17114d2, g41VarM16103C, c3243k, null);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f26167o = c3244lM17114d3;
        this.f26168p = AbstractC3352my.m17114d(EmptySet.f47640a);
        this.f26169q = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d3, new UserImportSelectionViewModel$selectionItems$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        wfb.m23926u(lda.m16103C(this), null, null, new UserImportSelectionViewModel$1(this, null), 3);
        if (userImportDetailType == UserImportDetailType.Languages) {
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new UserImportSelectionViewModel$2(this, null), 2);
        }
        if (userImportDetailType == UserImportDetailType.Tags) {
            wfb.m23926u(lda.m16103C(this), null, null, new UserImportSelectionViewModel$3(this, null), 3);
        }
        if (userImportDetailType == UserImportDetailType.Course) {
            wfb.m23926u(lda.m16103C(this), null, null, new UserImportSelectionViewModel$4(this, null), 3);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26155c.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26155c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26155c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26155c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26155c.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26155c.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26155c.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26155c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26155c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26155c.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26155c.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26155c.mo4582N();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: N0 */
    public final void mo9011N0(ika ikaVar) {
        this.f26154b.mo9011N0(ikaVar);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26155c.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26155c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26155c.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26155c.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9012V2(Context context) {
        int i = qla.f57917a[this.f26161i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new UserImportSelectionViewModel$fetchUserCourses$1(this, null), 3);
            return;
        }
        ys2<LearningLevel> entries = LearningLevel.getEntries();
        ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
        for (LearningLevel learningLevel : entries) {
            arrayList.add(new fv8(1, null, AbstractC3423or.m18230O(learningLevel, context), learningLevel.getServerName(), fa4.m11650l(learningLevel.getServerName(), ((ika) this.f26154b.mo9014u2().getValue()).f44240d)));
        }
        C3244l c3244l = this.f26167o;
        c3244l.getClass();
        c3244l.m15572j(null, arrayList);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26155c.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26155c.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26155c.mo4589b2();
    }

    @Override // p000.jka
    public final void clear() {
        this.f26154b.clear();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26155c.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26155c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: l0 */
    public final eh9 mo9013l0() {
        return this.f26154b.mo9013l0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26155c.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26155c.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26155c.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26155c.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26155c.mo4596t();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: u2 */
    public final eh9 mo9014u2() {
        return this.f26154b.mo9014u2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26155c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26155c.mo4598w2();
    }
}
