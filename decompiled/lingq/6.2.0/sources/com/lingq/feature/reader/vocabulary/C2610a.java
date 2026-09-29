package com.lingq.feature.reader.vocabulary;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.domain.token.C1536d;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ao0;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.g41;
import p000.l3a;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.s7b;
import p000.sca;
import p000.vj6;
import p000.vs3;
import p000.w3a;
import p000.w65;
import p000.wfb;
import p000.wta;
import p000.xi9;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2610a extends wta implements l3a, cma, sca {

    /* JADX INFO: renamed from: A */
    public final du0 f31653A;

    /* JADX INFO: renamed from: B */
    public final C3244l f31654B;

    /* JADX INFO: renamed from: C */
    public final c18 f31655C;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l3a f31656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cma f31657c;

    /* JADX INFO: renamed from: d */
    public final ao0 f31658d;

    /* JADX INFO: renamed from: e */
    public final s7b f31659e;

    /* JADX INFO: renamed from: f */
    public final w3a f31660f;

    /* JADX INFO: renamed from: g */
    public final C1307w f31661g;

    /* JADX INFO: renamed from: h */
    public final nn1 f31662h;

    /* JADX INFO: renamed from: i */
    public final sca f31663i;

    /* JADX INFO: renamed from: j */
    public final C1530a f31664j;

    /* JADX INFO: renamed from: k */
    public final vj6 f31665k;

    /* JADX INFO: renamed from: l */
    public final C1536d f31666l;

    /* JADX INFO: renamed from: m */
    public final c18 f31667m;

    /* JADX INFO: renamed from: n */
    public final Locale f31668n;

    /* JADX INFO: renamed from: o */
    public final C3244l f31669o;

    /* JADX INFO: renamed from: p */
    public final c18 f31670p;

    /* JADX INFO: renamed from: q */
    public final C3244l f31671q;

    /* JADX INFO: renamed from: r */
    public final C3244l f31672r;

    /* JADX INFO: renamed from: s */
    public final C3244l f31673s;

    /* JADX INFO: renamed from: t */
    public final C3244l f31674t;

    /* JADX INFO: renamed from: u */
    public final c18 f31675u;

    /* JADX INFO: renamed from: v */
    public final C3244l f31676v;

    /* JADX INFO: renamed from: w */
    public final c18 f31677w;

    /* JADX INFO: renamed from: x */
    public final C3211a f31678x;

    /* JADX INFO: renamed from: y */
    public final du0 f31679y;

    /* JADX INFO: renamed from: z */
    public final C3211a f31680z;

    public C2610a(ao0 ao0Var, s7b s7bVar, w3a w3aVar, C1307w c1307w, nn1 nn1Var, sca scaVar, C1530a c1530a, vj6 vj6Var, C1536d c1536d, l3a l3aVar, cma cmaVar, nl8 nl8Var) {
        ao0Var.getClass();
        s7bVar.getClass();
        w3aVar.getClass();
        c1307w.getClass();
        scaVar.getClass();
        l3aVar.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f31656b = l3aVar;
        this.f31657c = cmaVar;
        this.f31658d = ao0Var;
        this.f31659e = s7bVar;
        this.f31660f = w3aVar;
        this.f31661g = c1307w;
        this.f31662h = nn1Var;
        this.f31663i = scaVar;
        this.f31664j = c1530a;
        this.f31665k = vj6Var;
        this.f31666l = c1536d;
        this.f31667m = nl8Var.m17489c(0, "lessonId");
        this.f31668n = Locale.forLanguageTag(cmaVar.mo4589b2());
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f31669o = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f31670p = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f31671q = c3244lM17114d2;
        AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f31672r = c3244lM17114d3;
        AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, emptyList);
        this.f31673s = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool);
        this.f31674t = c3244lM17114d4;
        this.f31675u = AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, bool);
        VocabularyType vocabularyType = VocabularyType.Cards;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(vocabularyType);
        this.f31676v = c3244lM17114d5;
        this.f31677w = AbstractC3224d.m15520B(c3244lM17114d5, lda.m16103C(this), c3243k, vocabularyType);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f31678x = c3211aM7042a;
        this.f31679y = AbstractC3224d.m15519A(c3211aM7042a);
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f31680z = c3211aM7042a2;
        this.f31653A = AbstractC3224d.m15519A(c3211aM7042a2);
        vs3 vs3Var = zz7.f72431f;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(vs3Var);
        this.f31654B = c3244lM17114d6;
        this.f31655C = AbstractC3224d.m15520B(c3244lM17114d6, lda.m16103C(this), c3243k, vs3Var);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$6(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f31657c.mo4571A();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f31656b.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f31656b.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f31657c.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f31657c.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f31657c.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f31657c.mo4575D0(continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f31656b.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f31656b.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f31656b.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f31657c.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f31657c.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f31656b.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f31657c.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f31657c.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f31657c.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f31657c.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f31656b.mo8743L2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f31657c.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f31657c.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f31663i.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f31657c.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f31657c.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f31656b.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f31657c.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f31663i.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f31656b.mo8747U1();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9528V2(int i, String str) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$onAddMeaning$1(this, str, i, null), 3);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f31656b.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f31656b.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9529W2(w65 w65Var) {
        w65Var.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$speak$1(this, w65Var, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f31657c.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9530X2(String str, TokenStatus tokenStatus) {
        str.getClass();
        tokenStatus.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$updateStatus$1(this, str, tokenStatus, null), 3);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.f31663i.mo8484Y0(str, z, f, z2);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9531Y2(String str, String str2) {
        str.getClass();
        str2.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new LessonVocabularyViewModel$updateStatus$2(this, str, str2, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f31657c.mo4588a0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f31656b.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f31657c.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f31656b.mo8758c();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f31663i.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f31663i.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f31657c.mo4590d0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f31656b.mo8761f();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f31657c.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f31656b.mo8765i();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f31656b.mo8767j();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f31657c.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f31663i.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f31663i.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f31656b.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f31657c.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f31656b.mo8770p1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f31656b.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f31656b.mo8773q2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f31657c.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f31656b.mo8774r2(i);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f31657c.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f31656b.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f31657c.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f31663i.mo8494u();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f31656b.mo8779v2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f31657c.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f31657c.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f31663i.mo8495y1(set);
    }
}
