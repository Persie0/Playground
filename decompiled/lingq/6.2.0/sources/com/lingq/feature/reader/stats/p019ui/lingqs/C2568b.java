package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.TokenPopupData;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ao0;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.eh9;
import p000.g41;
import p000.hm5;
import p000.l3a;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.s7b;
import p000.sca;
import p000.vj6;
import p000.vs3;
import p000.w3a;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2568b extends wta implements l3a, cma, bia, sca {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l3a f31055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f31056c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f31057d;

    /* JADX INFO: renamed from: e */
    public final d65 f31058e;

    /* JADX INFO: renamed from: f */
    public final ao0 f31059f;

    /* JADX INFO: renamed from: g */
    public final s7b f31060g;

    /* JADX INFO: renamed from: h */
    public final w3a f31061h;

    /* JADX INFO: renamed from: i */
    public final C1307w f31062i;

    /* JADX INFO: renamed from: j */
    public final C1530a f31063j;

    /* JADX INFO: renamed from: k */
    public final vj6 f31064k;

    /* JADX INFO: renamed from: l */
    public final nn1 f31065l;

    /* JADX INFO: renamed from: m */
    public final sca f31066m;

    /* JADX INFO: renamed from: n */
    public final c18 f31067n;

    /* JADX INFO: renamed from: o */
    public final Locale f31068o;

    /* JADX INFO: renamed from: p */
    public final C3244l f31069p;

    /* JADX INFO: renamed from: q */
    public final c18 f31070q;

    /* JADX INFO: renamed from: r */
    public final C3244l f31071r;

    /* JADX INFO: renamed from: s */
    public final C3244l f31072s;

    /* JADX INFO: renamed from: t */
    public final C3244l f31073t;

    /* JADX INFO: renamed from: u */
    public final C3244l f31074u;

    /* JADX INFO: renamed from: v */
    public final c18 f31075v;

    public C2568b(d65 d65Var, ao0 ao0Var, s7b s7bVar, w3a w3aVar, C1307w c1307w, C1530a c1530a, vj6 vj6Var, nn1 nn1Var, sca scaVar, hm5 hm5Var, l3a l3aVar, cma cmaVar, bia biaVar, nl8 nl8Var) {
        d65Var.getClass();
        ao0Var.getClass();
        s7bVar.getClass();
        w3aVar.getClass();
        c1307w.getClass();
        scaVar.getClass();
        hm5Var.getClass();
        l3aVar.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f31055b = l3aVar;
        this.f31056c = cmaVar;
        this.f31057d = biaVar;
        this.f31058e = d65Var;
        this.f31059f = ao0Var;
        this.f31060g = s7bVar;
        this.f31061h = w3aVar;
        this.f31062i = c1307w;
        this.f31063j = c1530a;
        this.f31064k = vj6Var;
        this.f31065l = nn1Var;
        this.f31066m = scaVar;
        this.f31067n = nl8Var.m17489c(0, "lessonId");
        this.f31068o = Locale.forLanguageTag(cmaVar.mo4589b2());
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f31069p = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f31070q = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f31071r = c3244lM17114d2;
        AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        this.f31072s = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f31073t = c3244lM17114d3;
        AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, bool);
        vs3 vs3Var = zz7.f72431f;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(vs3Var);
        this.f31074u = c3244lM17114d4;
        this.f31075v = AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, vs3Var);
        ((C1240a) hm5Var).m7025f("lesson complete lingqs screen viewed", null);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteVocabularyViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteVocabularyViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteVocabularyViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteVocabularyViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteVocabularyViewModel$5(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f31056c.mo4571A();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f31055b.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f31055b.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f31056c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f31056c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f31056c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f31056c.mo4575D0(continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f31055b.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f31055b.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f31055b.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f31056c.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f31056c.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f31055b.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f31056c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f31056c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f31056c.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f31056c.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f31055b.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f31057d.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f31056c.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f31056c.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f31066m.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f31056c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f31056c.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f31055b.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f31056c.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f31066m.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f31055b.mo8747U1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f31055b.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f31055b.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f31056c.mo4587X();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.f31066m.mo8484Y0(str, z, f, z2);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f31057d.mo3738Z();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f31056c.mo4588a0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f31055b.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f31056c.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f31055b.mo8758c();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f31066m.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f31066m.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f31056c.mo4590d0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f31055b.mo8761f();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f31056c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f31055b.mo8765i();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f31055b.mo8767j();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f31057d.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f31057d.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f31056c.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f31066m.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f31066m.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f31055b.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f31056c.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f31055b.mo8770p1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f31055b.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f31055b.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f31057d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f31056c.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f31055b.mo8774r2(i);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f31057d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f31056c.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f31055b.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f31056c.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f31066m.mo8494u();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f31055b.mo8779v2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f31056c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f31056c.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f31066m.mo8495y1(set);
    }
}
