package com.lingq.feature.reader.old;

import android.graphics.Rect;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.analytics.data.modules.ReaderMode;
import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.domain.token.C1534b;
import com.lingq.core.player.C1808b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.AbstractC3204c;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3220xd7c321ea;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3540rl;
import p000.abd;
import p000.ao0;
import p000.bl3;
import p000.c18;
import p000.c83;
import p000.cl9;
import p000.cma;
import p000.cx1;
import p000.d65;
import p000.do7;
import p000.du0;
import p000.e7a;
import p000.eh9;
import p000.fa4;
import p000.fy7;
import p000.g41;
import p000.iy7;
import p000.je9;
import p000.kk8;
import p000.lda;
import p000.mv7;
import p000.nl8;
import p000.nn1;
import p000.ox7;
import p000.pg9;
import p000.ppc;
import p000.qv7;
import p000.s7b;
import p000.sca;
import p000.si7;
import p000.u7b;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.v72;
import p000.vj6;
import p000.vk9;
import p000.vqb;
import p000.vs3;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.wi7;
import p000.wta;
import p000.wz0;
import p000.x65;
import p000.xf0;
import p000.xi9;
import p000.xz7;
import p000.y15;
import p000.y5a;
import p000.y7d;
import p000.yd5;
import p000.yi7;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C2411m extends wta implements cma, e7a, sca, y15 {

    /* JADX INFO: renamed from: A */
    public final C3244l f29196A;

    /* JADX INFO: renamed from: B */
    public final C3244l f29197B;

    /* JADX INFO: renamed from: C */
    public final C3244l f29198C;

    /* JADX INFO: renamed from: D */
    public final c18 f29199D;

    /* JADX INFO: renamed from: E */
    public final C3244l f29200E;

    /* JADX INFO: renamed from: F */
    public final c18 f29201F;

    /* JADX INFO: renamed from: G */
    public final C3244l f29202G;

    /* JADX INFO: renamed from: H */
    public final c18 f29203H;

    /* JADX INFO: renamed from: I */
    public final c18 f29204I;

    /* JADX INFO: renamed from: J */
    public final c18 f29205J;

    /* JADX INFO: renamed from: K */
    public final c18 f29206K;

    /* JADX INFO: renamed from: L */
    public final c18 f29207L;

    /* JADX INFO: renamed from: M */
    public final c18 f29208M;

    /* JADX INFO: renamed from: N */
    public final C3244l f29209N;

    /* JADX INFO: renamed from: O */
    public final C3244l f29210O;

    /* JADX INFO: renamed from: P */
    public final C3244l f29211P;

    /* JADX INFO: renamed from: Q */
    public final C3244l f29212Q;

    /* JADX INFO: renamed from: R */
    public final c18 f29213R;

    /* JADX INFO: renamed from: S */
    public final C3244l f29214S;

    /* JADX INFO: renamed from: T */
    public final c18 f29215T;

    /* JADX INFO: renamed from: U */
    public final c18 f29216U;

    /* JADX INFO: renamed from: V */
    public final c18 f29217V;

    /* JADX INFO: renamed from: W */
    public final C3244l f29218W;

    /* JADX INFO: renamed from: X */
    public final c18 f29219X;

    /* JADX INFO: renamed from: Y */
    public final c18 f29220Y;

    /* JADX INFO: renamed from: Z */
    public final C3211a f29221Z;

    /* JADX INFO: renamed from: a0 */
    public final du0 f29222a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f29223b;

    /* JADX INFO: renamed from: b0 */
    public final C3244l f29224b0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e7a f29225c;

    /* JADX INFO: renamed from: c0 */
    public final c18 f29226c0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y15 f29227d;

    /* JADX INFO: renamed from: d0 */
    public final C3244l f29228d0;

    /* JADX INFO: renamed from: e */
    public final ao0 f29229e;

    /* JADX INFO: renamed from: e0 */
    public final c18 f29230e0;

    /* JADX INFO: renamed from: f */
    public final s7b f29231f;

    /* JADX INFO: renamed from: f0 */
    public final C3211a f29232f0;

    /* JADX INFO: renamed from: g */
    public final d65 f29233g;

    /* JADX INFO: renamed from: g0 */
    public final du0 f29234g0;

    /* JADX INFO: renamed from: h */
    public final sca f29235h;

    /* JADX INFO: renamed from: h0 */
    public final C3211a f29236h0;

    /* JADX INFO: renamed from: i */
    public final si7 f29237i;

    /* JADX INFO: renamed from: i0 */
    public final du0 f29238i0;

    /* JADX INFO: renamed from: j */
    public final w3a f29239j;

    /* JADX INFO: renamed from: j0 */
    public final wi7 f29240j0;

    /* JADX INFO: renamed from: k */
    public final C1530a f29241k;

    /* JADX INFO: renamed from: k0 */
    public final C3244l f29242k0;

    /* JADX INFO: renamed from: l */
    public final C1534b f29243l;

    /* JADX INFO: renamed from: l0 */
    public final c18 f29244l0;

    /* JADX INFO: renamed from: m */
    public final vqb f29245m;

    /* JADX INFO: renamed from: n */
    public final vj6 f29246n;

    /* JADX INFO: renamed from: o */
    public final v72 f29247o;

    /* JADX INFO: renamed from: p */
    public final int f29248p;

    /* JADX INFO: renamed from: q */
    public final int f29249q;

    /* JADX INFO: renamed from: r */
    public final c18 f29250r;

    /* JADX INFO: renamed from: s */
    public xz7 f29251s;

    /* JADX INFO: renamed from: t */
    public iy7 f29252t;

    /* JADX INFO: renamed from: u */
    public final Locale f29253u;

    /* JADX INFO: renamed from: v */
    public final C3244l f29254v;

    /* JADX INFO: renamed from: w */
    public final c18 f29255w;

    /* JADX INFO: renamed from: x */
    public pg9 f29256x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashMap f29257y;

    /* JADX INFO: renamed from: z */
    public final c18 f29258z;

    public C2411m(ao0 ao0Var, s7b s7bVar, d65 d65Var, sca scaVar, si7 si7Var, w3a w3aVar, C1530a c1530a, C1534b c1534b, vqb vqbVar, vj6 vj6Var, un1 un1Var, v72 v72Var, nn1 nn1Var, C1808b c1808b, cma cmaVar, e7a e7aVar, y15 y15Var, nl8 nl8Var) {
        ao0Var.getClass();
        s7bVar.getClass();
        d65Var.getClass();
        scaVar.getClass();
        si7Var.getClass();
        w3aVar.getClass();
        un1Var.getClass();
        c1808b.getClass();
        cmaVar.getClass();
        e7aVar.getClass();
        y15Var.getClass();
        nl8Var.getClass();
        this.f29223b = cmaVar;
        this.f29225c = e7aVar;
        this.f29227d = y15Var;
        this.f29229e = ao0Var;
        this.f29231f = s7bVar;
        this.f29233g = d65Var;
        this.f29235h = scaVar;
        this.f29237i = si7Var;
        this.f29239j = w3aVar;
        this.f29241k = c1530a;
        this.f29243l = c1534b;
        this.f29245m = vqbVar;
        this.f29246n = vj6Var;
        this.f29247o = v72Var;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        this.f29248p = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) nl8Var.m17488b("pagePosition");
        this.f29249q = num2 != null ? num2.intValue() : 0;
        Boolean bool = Boolean.FALSE;
        c18 c18VarM17489c = nl8Var.m17489c(bool, "isSentenceMode");
        this.f29250r = c18VarM17489c;
        this.f29253u = Locale.forLanguageTag(cmaVar.mo4589b2());
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f29254v = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f29255w = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, null);
        this.f29257y = new LinkedHashMap();
        this.f29258z = AbstractC3224d.m15520B(AbstractC3224d.m15536o(new wz0(22, new C3540rl(c3244lM17114d, 5), this)), lda.m16103C(this), c3243k, "");
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29196A = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29197B = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29198C = c3244lM17114d4;
        C3228h c3228h = new C3228h(new C3540rl(c3244lM17114d, 5), c3244lM17114d4, new ReaderPageViewModel$_phrasesTokens$1(this, null));
        g41 g41VarM16103C2 = lda.m16103C(this);
        EmptyList emptyList = EmptyList.f47638a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3228h, g41VarM16103C2, c3243k, emptyList);
        this.f29199D = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15534m(new C3540rl(c3244lM17114d, 5), c3244lM17114d4, new ReaderPageViewModel$_phrasesInPage$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$_cwtMeanings$1$1(this, c3244lM17114d5, null), 3);
        this.f29200E = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(null);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$_mergeMeanings$1$1(this, c3244lM17114d6, null), 3);
        this.f29201F = AbstractC3224d.m15520B(c3244lM17114d6, lda.m16103C(this), c3243k, bool);
        vs3 vs3Var = zz7.f72431f;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(vs3Var);
        this.f29202G = c3244lM17114d7;
        this.f29203H = AbstractC3224d.m15520B(c3244lM17114d7, lda.m16103C(this), c3243k, vs3Var);
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15533l(c18VarM17489c, new C3540rl(c3244lM17114d5, 5), c3244lM17114d3, new C3540rl(c3244lM17114d, 5), new ReaderPageViewModel$_tokensCwts$1(this, null)), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f29204I = c18VarM15520B3;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(new kk8(new C3220xd7c321ea(new c83[]{c3244lM17114d3, c3244lM17114d2, c18VarM15520B2, new C3540rl(c3244lM17114d, 5), c18VarM15520B3}, null, new ReaderPageViewModel$sentenceTokens$1(this, null))), lda.m16103C(this), c3243k, emptyList);
        this.f29205J = c18VarM15520B4;
        this.f29206K = AbstractC3224d.m15520B(new cx1(c18VarM15520B4, 6), lda.m16103C(this), c3243k, emptyList);
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(new kk8(new C3220xd7c321ea(new c83[]{c3244lM17114d2, c3244lM17114d4, new C3540rl(c3244lM17114d, 5), c18VarM15520B, c3244lM17114d7}, null, new ReaderPageViewModel$spansForCards$1(this, null))), lda.m16103C(this), c3243k, emptyList);
        this.f29207L = c18VarM15520B5;
        c18 c18VarM15520B6 = AbstractC3224d.m15520B(AbstractC3224d.m15533l(c3244lM17114d3, new C3540rl(c3244lM17114d, 5), c18VarM15520B, c3244lM17114d7, new ReaderPageViewModel$spansForWords$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        this.f29208M = c18VarM15520B6;
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(null);
        this.f29209N = c3244lM17114d8;
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(null);
        this.f29210O = c3244lM17114d9;
        this.f29211P = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(null);
        this.f29212Q = c3244lM17114d10;
        this.f29213R = AbstractC3224d.m15520B(c3244lM17114d10, lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d11 = AbstractC3352my.m17114d(TextHighlightStyle.Default);
        this.f29214S = c3244lM17114d11;
        C1368a c1368a = (C1368a) si7Var;
        yi7 yi7Var = c1368a.f18335E0;
        this.f29215T = AbstractC3224d.m15520B(new mv7(c1368a.f18419j1, 12), lda.m16103C(this), c3243k, bool);
        this.f29216U = AbstractC3224d.m15520B(c1368a.f18425l1, lda.m16103C(this), c3243k, Float.valueOf(1.0f));
        this.f29217V = AbstractC3224d.m15520B(AbstractC3224d.m15532k(new C3540rl(c3244lM17114d, 5), c3244lM17114d2, c3244lM17114d3, new ReaderPageViewModel$bottomButtonState$1(4, null)), lda.m16103C(this), c3243k, xf0.f68147a);
        C3244l c3244lM17114d12 = AbstractC3352my.m17114d(emptyList);
        this.f29218W = c3244lM17114d12;
        this.f29219X = AbstractC3224d.m15520B(AbstractC3224d.m15531j(new C3540rl(c3244lM17114d, 5), c1808b.f21946D, AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(c3244lM17114d, 5), new ReaderPageViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, emptyList), c1368a.f18452u1, new ReaderPageViewModel$playerPosition$1(5, null)), lda.m16103C(this), c3243k, null);
        this.f29220Y = AbstractC3224d.m15520B(new kk8(new ReaderPageViewModel$special$$inlined$combineTransform$1(new c83[]{c18VarM15520B6, c18VarM15520B5, c3244lM17114d8, c3244lM17114d9, c3244lM17114d12, c3244lM17114d11, yi7Var, c3244lM17114d7}, null, this)), lda.m16103C(this), c3243k, null);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f29221Z = c3211aM10525a;
        this.f29222a0 = AbstractC3224d.m15519A(c3211aM10525a);
        C3244l c3244lM17114d13 = AbstractC3352my.m17114d("");
        this.f29224b0 = c3244lM17114d13;
        this.f29226c0 = AbstractC3224d.m15520B(c3244lM17114d13, lda.m16103C(this), c3243k, "");
        C3244l c3244lM17114d14 = AbstractC3352my.m17114d("");
        this.f29228d0 = c3244lM17114d14;
        this.f29230e0 = AbstractC3224d.m15520B(c3244lM17114d14, lda.m16103C(this), c3243k, "");
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f29232f0 = c3211aM7042a;
        this.f29234g0 = AbstractC3224d.m15519A(c3211aM7042a);
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f29236h0 = c3211aM7042a2;
        this.f29238i0 = AbstractC3224d.m15519A(c3211aM7042a2);
        this.f29240j0 = c1368a.f18326B0;
        C3244l c3244lM17114d15 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29242k0 = c3244lM17114d15;
        this.f29244l0 = AbstractC3224d.m15520B(c3244lM17114d15, lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$showSentenceAudioTooltip$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f29223b.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f29225c.mo8733A0(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f29223b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f29223b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f29223b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f29223b.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f29225c.mo8736D1();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: F0 */
    public final void mo46F0(ReaderMode readerMode) {
        readerMode.getClass();
        this.f29227d.mo46F0(readerMode);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f29223b.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29225c.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f29223b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f29223b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f29223b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f29223b.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29225c.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f29223b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f29223b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f29223b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f29235h.mo8482P();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29225c.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f29225c.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f29223b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f29223b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f29223b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f29235h.mo8483U0(i, d, d2, f, str);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9301V2(iy7 iy7Var) {
        if (!fa4.m11650l(this.f29252t, iy7Var)) {
            m9303X2();
        }
        this.f29252t = iy7Var;
        C3244l c3244l = this.f29211P;
        C3244l c3244l2 = this.f29209N;
        c3244l.m15571i(c3244l2.getValue());
        this.f29251s = null;
        c3244l2.m15571i(null);
        C3244l c3244l3 = this.f29210O;
        c3244l3.m15571i(null);
        c3244l3.m15571i(iy7Var.f44779a);
        this.f29221Z.mo4677k(new fy7(iy7Var.f44779a, TokenType.CardType, iy7Var.f44782d, iy7Var, true));
        m9311f3(iy7Var);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9302W2(xz7 xz7Var, TokenType tokenType) {
        C3244l c3244l = this.f29209N;
        this.f29211P.m15571i(c3244l.getValue());
        this.f29251s = xz7Var;
        c3244l.m15571i(null);
        c3244l.m15571i(xz7Var);
        this.f29221Z.mo4677k(new fy7(xz7Var, tokenType, EmptyList.f47638a, null, false));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f29223b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9303X2() {
        m9311f3(this.f29252t);
        C3244l c3244l = this.f29211P;
        c3244l.m15571i(null);
        iy7 iy7Var = this.f29252t;
        c3244l.m15571i(iy7Var != null ? iy7Var.f44779a : null);
        this.f29252t = null;
        this.f29210O.m15571i(null);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.f29235h.mo8484Y0(str, z, f, z2);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9304Y2(int i) {
        g41 g41VarM16103C = lda.m16103C(this);
        ReaderPageViewModel$fetchTranslation$1 readerPageViewModel$fetchTranslation$1 = new ReaderPageViewModel$fetchTranslation$1(this, i, null);
        v72 v72Var = this.f29247o;
        AbstractC1263a.m7047b(g41VarM16103C, v72Var, "fetchTranslation", readerPageViewModel$fetchTranslation$1);
        AbstractC1263a.m7047b(lda.m16103C(this), v72Var, "networkSentenceTranslation", new ReaderPageViewModel$fetchTranslation$2(this, i, null));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29225c.mo8753Z0(tooltipStep);
    }

    /* JADX INFO: renamed from: Z2 */
    public final xz7 m9305Z2(String str) {
        str.getClass();
        ox7 ox7Var = (ox7) this.f29254v.getValue();
        Object obj = null;
        if (ox7Var == null) {
            return null;
        }
        for (Object obj2 : ox7Var.f55132e) {
            String str2 = ((xz7) obj2).f69008e;
            Locale locale = this.f29253u;
            locale.getClass();
            if (vz1.m23610P(str2, locale).equals(vz1.m23610P(str, locale))) {
                obj = obj2;
                break;
            }
        }
        return (xz7) obj;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f29223b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final boolean m9306a3(xz7 xz7Var, xz7 xz7Var2) {
        String str = xz7Var.f69008e;
        Locale locale = this.f29253u;
        locale.getClass();
        return vk9.m23380c0(vz1.m23610P(str, locale), vz1.m23610P(xz7Var2.f69008e, locale), false) && xz7Var2.f69004a >= xz7Var.f69004a && xz7Var2.f69005b <= xz7Var.f69005b;
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: b */
    public final void mo47b(DateTime dateTime) {
        this.f29227d.mo47b(dateTime);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f29223b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9307b3(int i, int i2, boolean z) {
        Object value;
        Object value2;
        ArrayList arrayList = new ArrayList();
        C3244l c3244l = this.f29254v;
        ox7 ox7Var = (ox7) c3244l.getValue();
        if (ox7Var != null) {
            for (xz7 xz7Var : ox7Var.f55132e) {
                if (xz7Var.f69004a >= i && xz7Var.f69005b <= i2) {
                    arrayList.add(xz7Var);
                }
            }
        }
        if (arrayList.isEmpty() || arrayList.size() >= 9) {
            return;
        }
        ox7 ox7Var2 = (ox7) c3244l.getValue();
        String strSubstring = ox7Var2 != null ? ox7Var2.f55131d.substring(((xz7) u91.m22589G0(arrayList)).f69004a, ((xz7) u91.m22597O0(arrayList)).f69005b) : "";
        Regex regex = new Regex("\\w+-\\w+");
        ArrayList<String> arrayList2 = new ArrayList();
        if (regex.m15423a(strSubstring)) {
            arrayList2.addAll(AbstractC3204c.m15421q0(new bl3(Regex.m15422c(regex, strSubstring), new qv7(1), 1)));
        }
        int i3 = ((xz7) u91.m22589G0(arrayList)).f69010g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((xz7) it.next()).f69010g != i3) {
                return;
            }
        }
        this.f29209N.m15571i(null);
        this.f29210O.m15571i(null);
        int size = arrayList.size();
        C3244l c3244l2 = this.f29212Q;
        C3244l c3244l3 = this.f29211P;
        if (size == 1) {
            do {
                value2 = c3244l3.getValue();
            } while (!c3244l3.m15570h(value2, this.f29251s));
            je9 je9VarM9309d3 = m9309d3((xz7) arrayList.get(0));
            c3244l2.getClass();
            c3244l2.m15572j(null, je9VarM9309d3);
            return;
        }
        String strM4839V = cl9.m4839V(u91.m22596N0(arrayList, null, null, null, new qv7(2), 31), ",", "");
        for (String str : arrayList2) {
            strM4839V = cl9.m4839V(strM4839V, cl9.m4839V(str, "-", " "), str);
        }
        xz7 xz7Var2 = new xz7(((xz7) arrayList.get(0)).f69004a, ((xz7) AbstractC3393o1.m17731f(1, arrayList)).f69005b, 0, 0, vk9.m23376L0(strM4839V).toString(), ((xz7) arrayList.get(0)).f69009f, 0, 0, (String) null, (TokenTransliteration) null, TextTokenType.POTENTIAL_PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 261068);
        c3244l2.m15571i(null);
        do {
            value = c3244l3.getValue();
        } while (!c3244l3.m15570h(value, this.f29251s));
        je9 je9VarM9309d4 = m9309d3(xz7Var2);
        c3244l2.getClass();
        c3244l2.m15572j(null, je9VarM9309d4);
        pg9 pg9Var = this.f29256x;
        if (pg9Var != null) {
            AbstractC1263a.m7046a(pg9Var);
        }
        this.f29256x = wfb.m23926u(lda.m16103C(this), null, null, new ReaderPageViewModel$setSelectionAndShowPhrase$5(z, this, xz7Var2, arrayList, null), 3);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f29235h.mo8485c2();
    }

    /* JADX INFO: renamed from: c3 */
    public final je9 m9308c3(vs3 vs3Var, xz7 xz7Var, LessonCard lessonCard, boolean z) {
        boolean z2;
        Integer numValueOf;
        int length;
        int i = lessonCard.f19188k;
        Integer num = lessonCard.f19189l;
        int iM19442a = ppc.m19442a(vs3Var, i, num);
        yd5 yd5Var = vs3Var.f65847c;
        int value = CardStatus.New.getValue();
        if (!z) {
            Iterator it = ((List) ((C3244l) this.f29199D.f9311a).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                iy7 iy7Var = (iy7) it.next();
                Map map = iy7Var.f44781c;
                xz7 xz7Var2 = iy7Var.f44779a;
                if (map.get(xz7Var.f69008e) != null && m9306a3(xz7Var2, xz7Var)) {
                    iM19442a = abd.m253i(vs3Var.f65848d.f63526c.f67242a);
                    LessonCard lessonCard2 = (LessonCard) ((Map) this.f29198C.getValue()).get(vz1.m23609O(xz7Var2.f69008e, this.f29223b.mo4589b2()));
                    value = lessonCard2 != null ? lessonCard2.f19188k : CardStatus.New.getValue();
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        C3244l c3244l = this.f29254v;
        ox7 ox7Var = (ox7) c3244l.getValue();
        boolean z3 = (ox7Var == null || !ox7Var.f55139l || lessonCard.m8042j()) ? false : true;
        int iM19443b = ppc.m19443b(vs3Var, i, num);
        String str = yd5Var.f69692f;
        String str2 = yd5Var.f69693g;
        int iM253i = abd.m253i(str);
        int iM24983b = y7d.m24983b(i, num);
        if (!z2 || value == CardStatus.Known.getValue() || value == CardStatus.Learned.getValue()) {
            numValueOf = (i == CardStatus.Known.getValue() || i == CardStatus.Ignored.getValue() || i == CardStatus.Learned.getValue()) ? null : Integer.valueOf(abd.m253i(str2));
        } else {
            numValueOf = Integer.valueOf(abd.m253i(str2));
        }
        je9 je9Var = new je9(iM19442a, iM19443b, iM253i, numValueOf, xz7Var, iM24983b, z3, false, 1248);
        int i2 = xz7Var.f69005b;
        ox7 ox7Var2 = (ox7) c3244l.getValue();
        if (i2 >= (ox7Var2 != null ? ox7Var2.f55131d.length() : 0)) {
            ox7 ox7Var3 = (ox7) c3244l.getValue();
            length = ox7Var3 != null ? ox7Var3.f55131d.length() : 0;
        } else {
            length = xz7Var.f69005b;
        }
        int i3 = xz7Var.f69004a;
        if (i3 > length) {
            i3 = length;
        }
        xz7Var.f69004a = i3;
        xz7Var.f69005b = length;
        je9Var.f45486g = false;
        return je9Var;
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f29235h.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f29223b.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f29225c.mo8759d1();
    }

    /* JADX INFO: renamed from: d3 */
    public final je9 m9309d3(xz7 xz7Var) {
        vs3 vs3Var = (vs3) this.f29202G.getValue();
        je9 je9Var = new je9(0, 0, 0, null, xz7Var, 0, false, false, 2031);
        je9Var.f45480a = abd.m253i(vs3Var.f65849e);
        je9Var.f45482c = abd.m253i(vs3Var.f65851g);
        return je9Var;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX INFO: renamed from: e3 */
    public final je9 m9310e3(vs3 vs3Var, xz7 xz7Var, LessonWord lessonWord, boolean z) {
        boolean z2;
        Integer num;
        Integer numValueOf;
        int i;
        ox7 ox7Var;
        int length;
        int i2;
        ox7 ox7Var2;
        String str = lessonWord.f19322i;
        if (fa4.m11650l(str, WordStatus.Card.getValue())) {
            return null;
        }
        vs3Var.getClass();
        u7b u7bVar = vs3Var.f65848d;
        str.getClass();
        int iM253i = (str.equals(WordStatus.Ignored.getValue()) || str.equals(WordStatus.Known.getValue())) ? abd.m253i(u7bVar.f63526c.f67242a) : abd.m253i(u7bVar.f63524a.f67242a);
        int value = CardStatus.New.getValue();
        int length2 = 0;
        if (!z) {
            Iterator it = ((List) ((C3244l) this.f29199D.f9311a).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                iy7 iy7Var = (iy7) it.next();
                Map map = iy7Var.f44781c;
                xz7 xz7Var2 = iy7Var.f44779a;
                if (map.get(xz7Var.f69008e) != null && m9306a3(xz7Var2, xz7Var)) {
                    iM253i = abd.m253i(u7bVar.f63526c.f67242a);
                    LessonCard lessonCard = (LessonCard) ((Map) this.f29198C.getValue()).get(vz1.m23609O(xz7Var2.f69008e, this.f29223b.mo4589b2()));
                    value = lessonCard != null ? lessonCard.f19188k : CardStatus.New.getValue();
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        C3244l c3244l = this.f29254v;
        ox7 ox7Var3 = (ox7) c3244l.getValue();
        boolean z3 = ox7Var3 != null && ox7Var3.f55139l && (str.equals(WordStatus.Known.getValue()) || str.equals(WordStatus.Ignored.getValue()));
        WordStatus wordStatus = WordStatus.Ignored;
        int iM253i2 = (str.equals(wordStatus.getValue()) || str.equals(WordStatus.Known.getValue())) ? abd.m253i(u7bVar.f63526c.f67243b) : abd.m253i(u7bVar.f63524a.f67243b);
        int iM253i3 = abd.m253i(u7bVar.f63527d);
        WordStatus wordStatus2 = WordStatus.Known;
        boolean zEquals = str.equals(wordStatus2.getValue());
        if (!z2 || value == CardStatus.Known.getValue() || value == CardStatus.Learned.getValue()) {
            if (str.equals(wordStatus2.getValue()) || str.equals(wordStatus.getValue())) {
                num = null;
            } else {
                numValueOf = Integer.valueOf(abd.m253i(u7bVar.f63528e));
            }
            je9 je9Var = new je9(iM253i, iM253i2, iM253i3, num, xz7Var, 0, z3, zEquals, 480);
            i = xz7Var.f69005b;
            ox7Var = (ox7) c3244l.getValue();
            if (ox7Var != null) {
                length = ox7Var.f55131d.length();
            } else {
                length = 0;
            }
            if (i >= length) {
                ox7Var2 = (ox7) c3244l.getValue();
                if (ox7Var2 != null) {
                    length2 = ox7Var2.f55131d.length();
                }
            } else {
                length2 = xz7Var.f69005b;
            }
            i2 = xz7Var.f69004a;
            if (i2 > length2) {
                i2 = length2;
            }
            xz7Var.f69004a = i2;
            xz7Var.f69005b = length2;
            je9Var.f45486g = true;
            return je9Var;
        }
        numValueOf = Integer.valueOf(abd.m253i(vs3Var.f65847c.f69693g));
        num = numValueOf;
        je9 je9Var2 = new je9(iM253i, iM253i2, iM253i3, num, xz7Var, 0, z3, zEquals, 480);
        i = xz7Var.f69005b;
        ox7Var = (ox7) c3244l.getValue();
        if (ox7Var != null) {
            length = ox7Var.f55131d.length();
        } else {
            length = 0;
        }
        if (i >= length) {
            ox7Var2 = (ox7) c3244l.getValue();
            if (ox7Var2 != null) {
                length2 = ox7Var2.f55131d.length();
            }
        } else {
            length2 = xz7Var.f69005b;
        }
        i2 = xz7Var.f69004a;
        if (i2 > length2) {
            i2 = length2;
        }
        xz7Var.f69004a = i2;
        xz7Var.f69005b = length2;
        je9Var2.f45486g = true;
        return je9Var2;
    }

    /* JADX INFO: renamed from: f3 */
    public final void m9311f3(iy7 iy7Var) {
        List<xz7> list;
        Locale locale;
        vs3 vs3Var = (vs3) this.f29202G.getValue();
        ArrayList arrayList = new ArrayList();
        if (iy7Var != null && (list = iy7Var.f44782d) != null) {
            for (xz7 xz7Var : list) {
                Iterator it = ((Iterable) ((C3244l) this.f29207L.f9311a).getValue()).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    locale = this.f29253u;
                    if (!zHasNext) {
                        break;
                    }
                    if (fa4.m11650l(xz7Var, ((je9) it.next()).f45484e)) {
                        Map map = (Map) this.f29196A.getValue();
                        String str = xz7Var.f69008e;
                        locale.getClass();
                        LessonCard lessonCard = (LessonCard) map.get(vz1.m23610P(str, locale));
                        if (lessonCard != null) {
                            arrayList.add(m9308c3(vs3Var, xz7Var, lessonCard, true));
                        }
                    }
                }
                Iterator it2 = ((Iterable) ((C3244l) this.f29208M.f9311a).getValue()).iterator();
                while (it2.hasNext()) {
                    if (fa4.m11650l(xz7Var, ((je9) it2.next()).f45484e)) {
                        Map map2 = (Map) this.f29197B.getValue();
                        String str2 = xz7Var.f69008e;
                        locale.getClass();
                        LessonWord lessonWord = (LessonWord) map2.get(vz1.m23610P(str2, locale));
                        if (lessonWord != null) {
                            arrayList.add(m9310e3(vs3Var, xz7Var, lessonWord, true));
                        }
                    }
                }
            }
        }
        ArrayList arrayListM22587E0 = u91.m22587E0(u91.m22622n1(arrayList));
        C3244l c3244l = this.f29218W;
        c3244l.getClass();
        c3244l.m15572j(null, arrayListM22587E0);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f29225c.mo8763g();
    }

    /* JADX INFO: renamed from: g3 */
    public final void m9312g3(xz7 xz7Var) {
        xz7Var.getClass();
        for (iy7 iy7Var : (List) ((C3244l) this.f29199D.f9311a).getValue()) {
            if (iy7Var.f44781c.get(xz7Var.f69008e) != null && m9306a3(iy7Var.f44779a, xz7Var)) {
                if (!iy7Var.equals(this.f29252t)) {
                    m9301V2(iy7Var);
                    return;
                } else if (xz7Var.equals(this.f29251s)) {
                    m9301V2(iy7Var);
                    return;
                } else {
                    m9302W2(xz7Var, TokenType.WordType);
                    return;
                }
            }
        }
        m9303X2();
        m9302W2(xz7Var, TokenType.WordType);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f29223b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f29225c.mo8766i1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f29225c.mo8768j0(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f29223b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f29235h.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f29235h.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: n1 */
    public final void mo48n1(String str, x65 x65Var) {
        str.getClass();
        this.f29227d.mo48n1(str, x65Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f29223b.mo4593p0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f29225c.mo8771q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f29223b.mo4594r1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f29225c.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f29223b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f29223b.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f29225c.mo8777t0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f29235h.mo8494u();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f29225c.mo8778u0();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: u1 */
    public final void mo49u1(LessonEngagedDataType lessonEngagedDataType, Number number) {
        lessonEngagedDataType.getClass();
        this.f29227d.mo49u1(lessonEngagedDataType, number);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f29225c.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f29223b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f29223b.mo4598w2();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: y */
    public final void mo50y(LqAnalyticsValues$LessonExitPath lqAnalyticsValues$LessonExitPath) {
        lqAnalyticsValues$LessonExitPath.getClass();
        this.f29227d.mo50y(lqAnalyticsValues$LessonExitPath);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f29225c.mo8781y0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f29235h.mo8495y1(set);
    }
}
