package com.lingq.feature.review.activities;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3329mb;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.eh9;
import p000.g41;
import p000.ig8;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.oo4;
import p000.sca;
import p000.si7;
import p000.wfb;
import p000.wta;
import p000.xe9;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.review.activities.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2748c extends wta implements cma, InterfaceC3733ws {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3733ws f32330c;

    /* JADX INFO: renamed from: d */
    public final d65 f32331d;

    /* JADX INFO: renamed from: e */
    public final C1307w f32332e;

    /* JADX INFO: renamed from: f */
    public final oo4 f32333f;

    /* JADX INFO: renamed from: g */
    public final sca f32334g;

    /* JADX INFO: renamed from: h */
    public final si7 f32335h;

    /* JADX INFO: renamed from: i */
    public final ig8 f32336i;

    /* JADX INFO: renamed from: j */
    public final nn1 f32337j;

    /* JADX INFO: renamed from: k */
    public final int f32338k;

    /* JADX INFO: renamed from: l */
    public final int f32339l;

    /* JADX INFO: renamed from: m */
    public final C3244l f32340m;

    /* JADX INFO: renamed from: n */
    public final C3244l f32341n;

    /* JADX INFO: renamed from: o */
    public final C3244l f32342o;

    /* JADX INFO: renamed from: p */
    public final C3244l f32343p;

    /* JADX INFO: renamed from: q */
    public final c18 f32344q;

    /* JADX INFO: renamed from: r */
    public final C3244l f32345r;

    /* JADX INFO: renamed from: s */
    public final c18 f32346s;

    /* JADX INFO: renamed from: t */
    public String f32347t;

    /* JADX INFO: renamed from: u */
    public final Locale f32348u;

    /* JADX INFO: renamed from: v */
    public Long f32349v;

    public C2748c(d65 d65Var, C1307w c1307w, oo4 oo4Var, sca scaVar, si7 si7Var, ig8 ig8Var, nn1 nn1Var, nn1 nn1Var2, cma cmaVar, InterfaceC3733ws interfaceC3733ws, nl8 nl8Var) {
        d65Var.getClass();
        c1307w.getClass();
        oo4Var.getClass();
        scaVar.getClass();
        si7Var.getClass();
        ig8Var.getClass();
        cmaVar.getClass();
        interfaceC3733ws.getClass();
        nl8Var.getClass();
        this.f32329b = cmaVar;
        this.f32330c = interfaceC3733ws;
        this.f32331d = d65Var;
        this.f32332e = c1307w;
        this.f32333f = oo4Var;
        this.f32334g = scaVar;
        this.f32335h = si7Var;
        this.f32336i = ig8Var;
        this.f32337j = nn1Var2;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        this.f32338k = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) nl8Var.m17488b("sentenceIndex");
        int iIntValue = num2 != null ? num2.intValue() : -1;
        this.f32339l = iIntValue;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f32340m = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        this.f32341n = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f32342o = AbstractC3352my.m17114d("");
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new xe9());
        this.f32343p = c3244lM17114d2;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, new xe9());
        this.f32344q = c18VarM15520B;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f32345r = c3244lM17114d3;
        this.f32346s = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c3244lM17114d3, c18VarM15520B, new C3540rl(c3244lM17114d, 5), new ReviewActivitySpeakingViewModel$autoTts$1(4, null)), lda.m16103C(this), c3243k, bool);
        this.f32347t = "";
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f32348u = Locale.forLanguageTag(cmaVar.mo4589b2());
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivitySpeakingViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivitySpeakingViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivitySpeakingViewModel$3(this, null), 3);
        if (iIntValue == -1) {
            c3211aM7042a.mo4677k(xfa.f68157a);
        } else {
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivitySpeakingViewModel$fetchSentence$1(this, null), 3);
            wfb.m23926u(lda.m16103C(this), null, null, new ReviewActivitySpeakingViewModel$fetchSentenceTokens$1(this, null), 3);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32329b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32329b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32329b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32329b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32329b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32329b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32329b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32329b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32329b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32329b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32329b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32329b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32329b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32329b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32329b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32329b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9558V2(SpeechRecognitionState speechRecognitionState) {
        speechRecognitionState.getClass();
        while (true) {
            C3244l c3244l = this.f32343p;
            Object value = c3244l.getValue();
            SpeechRecognitionState speechRecognitionState2 = speechRecognitionState;
            if (c3244l.m15570h(value, xe9.m24478a((xe9) value, false, 0, null, null, speechRecognitionState2, null, null, 111))) {
                return;
            } else {
                speechRecognitionState = speechRecognitionState2;
            }
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9559W2(String str) {
        Locale locale = this.f32348u;
        locale.getClass();
        C3329mb c3329mb = new C3329mb(this.f32347t, str, locale);
        while (true) {
            C3244l c3244l = this.f32343p;
            Object value = c3244l.getValue();
            String str2 = str;
            if (c3244l.m15570h(value, xe9.m24478a((xe9) value, false, c3329mb.m16728e(), null, str2, null, c3329mb, null, 85))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32329b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32329b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32329b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32329b.mo4590d0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f32330c.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32329b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32329b.mo4592m0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f32330c.mo9033o1(appUsageType, num);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32329b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32329b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32329b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32329b.mo4596t();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f32330c.mo9034v0(appUsageType);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32329b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32329b.mo4598w2();
    }
}
