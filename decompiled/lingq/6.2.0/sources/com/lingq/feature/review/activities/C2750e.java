package com.lingq.feature.review.activities;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3540rl;
import p000.ao0;
import p000.c18;
import p000.c83;
import p000.cl9;
import p000.cma;
import p000.du0;
import p000.eh9;
import p000.fa4;
import p000.g41;
import p000.ig8;
import p000.lda;
import p000.n58;
import p000.nl8;
import p000.nn1;
import p000.s7b;
import p000.sca;
import p000.u0b;
import p000.vk9;
import p000.vs3;
import p000.wfb;
import p000.wta;
import p000.xfa;
import p000.xi9;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2750e extends wta implements cma, sca {

    /* JADX INFO: renamed from: A */
    public final c18 f32363A;

    /* JADX INFO: renamed from: B */
    public final C3211a f32364B;

    /* JADX INFO: renamed from: C */
    public final du0 f32365C;

    /* JADX INFO: renamed from: D */
    public final C3244l f32366D;

    /* JADX INFO: renamed from: E */
    public final C3244l f32367E;

    /* JADX INFO: renamed from: F */
    public final c18 f32368F;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32369b;

    /* JADX INFO: renamed from: c */
    public final ao0 f32370c;

    /* JADX INFO: renamed from: d */
    public final u0b f32371d;

    /* JADX INFO: renamed from: e */
    public final C1307w f32372e;

    /* JADX INFO: renamed from: f */
    public final s7b f32373f;

    /* JADX INFO: renamed from: g */
    public final sca f32374g;

    /* JADX INFO: renamed from: h */
    public final n58 f32375h;

    /* JADX INFO: renamed from: i */
    public final ig8 f32376i;

    /* JADX INFO: renamed from: j */
    public final C1530a f32377j;

    /* JADX INFO: renamed from: k */
    public final nn1 f32378k;

    /* JADX INFO: renamed from: l */
    public final int f32379l;

    /* JADX INFO: renamed from: m */
    public final String f32380m;

    /* JADX INFO: renamed from: n */
    public final C3244l f32381n;

    /* JADX INFO: renamed from: o */
    public final c18 f32382o;

    /* JADX INFO: renamed from: p */
    public final C3244l f32383p;

    /* JADX INFO: renamed from: q */
    public final c18 f32384q;

    /* JADX INFO: renamed from: r */
    public final C3244l f32385r;

    /* JADX INFO: renamed from: s */
    public final c18 f32386s;

    /* JADX INFO: renamed from: t */
    public final C3211a f32387t;

    /* JADX INFO: renamed from: u */
    public final du0 f32388u;

    /* JADX INFO: renamed from: v */
    public final C3244l f32389v;

    /* JADX INFO: renamed from: w */
    public final c18 f32390w;

    /* JADX INFO: renamed from: x */
    public final C3244l f32391x;

    /* JADX INFO: renamed from: y */
    public final c18 f32392y;

    /* JADX INFO: renamed from: z */
    public final C3244l f32393z;

    public C2750e(ao0 ao0Var, u0b u0bVar, C1307w c1307w, s7b s7bVar, sca scaVar, n58 n58Var, ig8 ig8Var, C1530a c1530a, nn1 nn1Var, nn1 nn1Var2, cma cmaVar, nl8 nl8Var) {
        ao0Var.getClass();
        u0bVar.getClass();
        c1307w.getClass();
        s7bVar.getClass();
        scaVar.getClass();
        ig8Var.getClass();
        cmaVar.getClass();
        nl8Var.getClass();
        this.f32369b = cmaVar;
        this.f32370c = ao0Var;
        this.f32371d = u0bVar;
        this.f32372e = c1307w;
        this.f32373f = s7bVar;
        this.f32374g = scaVar;
        this.f32375h = n58Var;
        this.f32376i = ig8Var;
        this.f32377j = c1530a;
        this.f32378k = nn1Var2;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        this.f32379l = num != null ? num.intValue() : -1;
        String str = (String) nl8Var.m17488b("currentCard");
        str = str == null ? "" : str;
        this.f32380m = str;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f32381n = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f32382o = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f32383p = c3244lM17114d2;
        this.f32384q = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, null);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f32385r = c3244lM17114d3;
        this.f32386s = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, bool);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f32387t = c3211aM7042a;
        this.f32388u = AbstractC3224d.m15519A(c3211aM7042a);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f32389v = c3244lM17114d4;
        this.f32390w = AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(bool);
        this.f32391x = c3244lM17114d5;
        this.f32392y = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c3244lM17114d5, c3244lM17114d4, new C3540rl(c3244lM17114d, 5), new ReviewActivityViewModel$autoTts$1(4, null)), lda.m16103C(this), c3243k, bool);
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(new Pair("Off", null));
        this.f32393z = c3244lM17114d6;
        this.f32363A = AbstractC3224d.m15520B(c3244lM17114d6, lda.m16103C(this), c3243k, new Pair("Off", null));
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f32364B = c3211aM7042a2;
        this.f32365C = AbstractC3224d.m15519A(c3211aM7042a2);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(emptyList);
        this.f32366D = c3244lM17114d7;
        vs3 vs3Var = zz7.f72431f;
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(vs3Var);
        this.f32367E = c3244lM17114d8;
        AbstractC3224d.m15520B(c3244lM17114d8, lda.m16103C(this), c3243k, vs3Var);
        this.f32368F = AbstractC3224d.m15520B(new C3228h(c3244lM17114d7, new C3540rl(c3244lM17114d, 5), new ReviewActivityViewModel$tags$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$2(this, null), 3);
        if (str.length() <= 0) {
            c3211aM7042a.mo4677k(xfa.f68157a);
        } else {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$fetchCard$1(this, null), 3);
            AbstractC1263a.m7047b(lda.m16103C(this), nn1Var2, "getGrammarTags ".concat(str), new ReviewActivityViewModel$getGrammarTags$1(this, null));
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32369b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32369b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32369b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32369b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32369b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32369b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32369b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32369b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32369b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32369b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32369b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32369b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32369b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f32374g.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32369b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32369b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32369b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f32374g.mo8483U0(i, d, d2, f, str);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9560V2(ReviewSettingsKeys reviewSettingsKeys) {
        reviewSettingsKeys.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$getAutoTtsSettings$1(this, reviewSettingsKeys, null), 3);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9561W2(ReviewSettingsKeys reviewSettingsKeys) {
        reviewSettingsKeys.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$getScripting$1(this, reviewSettingsKeys, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32369b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final boolean m9562X2(String str) {
        cma cmaVar = this.f32369b;
        boolean zM11650l = fa4.m11650l(cmaVar.mo4589b2(), LanguageLearn.Japanese.getCode());
        C3244l c3244l = this.f32366D;
        if (!zM11650l) {
            Iterable iterable = (Iterable) c3244l.getValue();
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (cl9.m4834Q((String) it.next(), str, true)) {
                }
            }
            return false;
        }
        Iterable iterable2 = (Iterable) c3244l.getValue();
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            if (cl9.m4834Q((String) it2.next(), str, true)) {
                if (AbstractC3352my.m17096O(str, cmaVar.mo4589b2())) {
                    return false;
                }
            }
        }
        return false;
        return true;
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivityViewModel$speak$1(this, str, z, f, z2, null), 3);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9563Y2(String str) {
        String strM17734i;
        str.getClass();
        if (m9562X2(str)) {
            cma cmaVar = this.f32369b;
            if (fa4.m11650l(cmaVar.mo4589b2(), LanguageLearn.Japanese.getCode())) {
                String strM17084C = AbstractC3352my.m17084C(str);
                strM17734i = !vk9.m23391n0(strM17084C) ? String.format("https://www.lingq.com/%s/grammar-resource/japanese/%s", Arrays.copyOf(new Object[]{cmaVar.mo4580K1(), strM17084C}, 2)) : AbstractC3393o1.m17734i("https://cooljugator.com/ja/", URLEncoder.encode(str, "utf-8"));
            } else {
                strM17734i = String.format("https://www.lingq.com/%s/grammar-resource/%s/tag/%s/", Arrays.copyOf(new Object[]{cmaVar.mo4580K1(), cmaVar.mo4589b2(), str}, 3));
            }
            this.f32364B.mo4677k(strM17734i);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32369b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32369b.mo4589b2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f32374g.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f32374g.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32369b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32369b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32369b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f32374g.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f32374g.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32369b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32369b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32369b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32369b.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f32374g.mo8494u();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32369b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32369b.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f32374g.mo8495y1(set);
    }
}
