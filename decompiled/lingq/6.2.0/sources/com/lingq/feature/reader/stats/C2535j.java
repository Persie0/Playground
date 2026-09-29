package com.lingq.feature.reader.stats;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.lesson.C1382d;
import com.lingq.core.domain.lesson.C1383e;
import com.lingq.core.domain.library.C1390e;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.core.domain.stats.C1526a;
import com.lingq.core.domain.stats.C1527b;
import com.lingq.core.domain.stats.C1528c;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.player.C1808b;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.reader.rating.p016ui.RatingContentType;
import com.lingq.feature.reader.stats.domain.C2529a;
import com.lingq.feature.reader.stats.domain.LessonCoachChatResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C2992f8;
import p000.C3026g5;
import p000.C3139j9;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3540rl;
import p000.C3713w8;
import p000.a23;
import p000.a34;
import p000.ar7;
import p000.b4b;
import p000.bw8;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cz5;
import p000.eh9;
import p000.fa4;
import p000.g41;
import p000.gl6;
import p000.go3;
import p000.hi8;
import p000.hm5;
import p000.hx4;
import p000.l3a;
import p000.ld0;
import p000.lda;
import p000.lx4;
import p000.m23;
import p000.m83;
import p000.mk0;
import p000.mn5;
import p000.mv0;
import p000.n23;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.o23;
import p000.oj9;
import p000.oz4;
import p000.ph4;
import p000.pl3;
import p000.pz4;
import p000.q05;
import p000.ql9;
import p000.qz4;
import p000.r13;
import p000.s65;
import p000.sca;
import p000.si7;
import p000.sj9;
import p000.u66;
import p000.ux5;
import p000.va2;
import p000.vj6;
import p000.vz1;
import p000.web;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.x08;
import p000.xa2;
import p000.xfa;
import p000.xi9;
import p000.y02;
import p000.y13;
import p000.y65;
import p000.y75;
import p000.yx4;
import p000.z13;
import p000.zm3;
import p000.zx4;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2535j extends wta implements cma, mk0, cz5, sca, l3a, ar7 {
    public static final oz4 Companion = new oz4();

    /* JADX INFO: renamed from: A */
    public final y13 f30791A;

    /* JADX INFO: renamed from: B */
    public final C3139j9 f30792B;

    /* JADX INFO: renamed from: C */
    public final z13 f30793C;

    /* JADX INFO: renamed from: D */
    public final C2529a f30794D;

    /* JADX INFO: renamed from: E */
    public final a23 f30795E;

    /* JADX INFO: renamed from: F */
    public final z13 f30796F;

    /* JADX INFO: renamed from: G */
    public final a34 f30797G;

    /* JADX INFO: renamed from: H */
    public final a23 f30798H;

    /* JADX INFO: renamed from: I */
    public final n23 f30799I;

    /* JADX INFO: renamed from: J */
    public final C3713w8 f30800J;

    /* JADX INFO: renamed from: K */
    public final C1808b f30801K;

    /* JADX INFO: renamed from: L */
    public final nn1 f30802L;

    /* JADX INFO: renamed from: M */
    public final int f30803M;

    /* JADX INFO: renamed from: N */
    public final boolean f30804N;

    /* JADX INFO: renamed from: O */
    public final c18 f30805O;

    /* JADX INFO: renamed from: P */
    public final C3244l f30806P;

    /* JADX INFO: renamed from: Q */
    public final C3244l f30807Q;

    /* JADX INFO: renamed from: R */
    public final c18 f30808R;

    /* JADX INFO: renamed from: S */
    public final C3244l f30809S;

    /* JADX INFO: renamed from: T */
    public final c18 f30810T;

    /* JADX INFO: renamed from: U */
    public final C3244l f30811U;

    /* JADX INFO: renamed from: V */
    public final C3244l f30812V;

    /* JADX INFO: renamed from: W */
    public final C3244l f30813W;

    /* JADX INFO: renamed from: X */
    public final C3244l f30814X;

    /* JADX INFO: renamed from: Y */
    public final C3244l f30815Y;

    /* JADX INFO: renamed from: Z */
    public final C3244l f30816Z;

    /* JADX INFO: renamed from: a0 */
    public final c18 f30817a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f30818b;

    /* JADX INFO: renamed from: b0 */
    public final c18 f30819b0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mk0 f30820c;

    /* JADX INFO: renamed from: c0 */
    public final c18 f30821c0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cz5 f30822d;

    /* JADX INFO: renamed from: d0 */
    public final c18 f30823d0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sca f30824e;

    /* JADX INFO: renamed from: e0 */
    public final c18 f30825e0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ l3a f30826f;

    /* JADX INFO: renamed from: f0 */
    public final c18 f30827f0;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ar7 f30828g;

    /* JADX INFO: renamed from: g0 */
    public final c18 f30829g0;

    /* JADX INFO: renamed from: h */
    public final hm5 f30830h;

    /* JADX INFO: renamed from: h0 */
    public final c18 f30831h0;

    /* JADX INFO: renamed from: i */
    public final nm7 f30832i;

    /* JADX INFO: renamed from: i0 */
    public final c18 f30833i0;

    /* JADX INFO: renamed from: j */
    public final C1525a f30834j;

    /* JADX INFO: renamed from: j0 */
    public final C3244l f30835j0;

    /* JADX INFO: renamed from: k */
    public final C1526a f30836k;

    /* JADX INFO: renamed from: k0 */
    public final C3244l f30837k0;

    /* JADX INFO: renamed from: l */
    public final C1528c f30838l;

    /* JADX INFO: renamed from: l0 */
    public final C3244l f30839l0;

    /* JADX INFO: renamed from: m */
    public final C1526a f30840m;

    /* JADX INFO: renamed from: m0 */
    public final C3244l f30841m0;

    /* JADX INFO: renamed from: n */
    public final C1526a f30842n;

    /* JADX INFO: renamed from: n0 */
    public final C3244l f30843n0;

    /* JADX INFO: renamed from: o */
    public final r13 f30844o;

    /* JADX INFO: renamed from: o0 */
    public qz4 f30845o0;

    /* JADX INFO: renamed from: p */
    public final hi8 f30846p;

    /* JADX INFO: renamed from: p0 */
    public final c18 f30847p0;

    /* JADX INFO: renamed from: q */
    public final C1527b f30848q;

    /* JADX INFO: renamed from: q0 */
    public final c18 f30849q0;

    /* JADX INFO: renamed from: r */
    public final y13 f30850r;

    /* JADX INFO: renamed from: r0 */
    public final c18 f30851r0;

    /* JADX INFO: renamed from: s */
    public final C1390e f30852s;

    /* JADX INFO: renamed from: s0 */
    public final c18 f30853s0;

    /* JADX INFO: renamed from: t */
    public final C1383e f30854t;

    /* JADX INFO: renamed from: u */
    public final C1382d f30855u;

    /* JADX INFO: renamed from: v */
    public final vj6 f30856v;

    /* JADX INFO: renamed from: w */
    public final n23 f30857w;

    /* JADX INFO: renamed from: x */
    public final o23 f30858x;

    /* JADX INFO: renamed from: y */
    public final m23 f30859y;

    /* JADX INFO: renamed from: z */
    public final r13 f30860z;

    public C2535j(hm5 hm5Var, C3509qs c3509qs, si7 si7Var, nm7 nm7Var, C1525a c1525a, o23 o23Var, C1530a c1530a, vj6 vj6Var, bw8 bw8Var, C1526a c1526a, C1528c c1528c, C1526a c1526a2, C1526a c1526a3, r13 r13Var, hi8 hi8Var, C1527b c1527b, zm3 zm3Var, y13 y13Var, C1390e c1390e, C1383e c1383e, C1382d c1382d, vj6 vj6Var2, n23 n23Var, o23 o23Var2, m23 m23Var, r13 r13Var2, y13 y13Var2, C3139j9 c3139j9, web webVar, z13 z13Var, C2529a c2529a, a23 a23Var, z13 z13Var2, a34 a34Var, a23 a23Var2, n23 n23Var2, pl3 pl3Var, va2 va2Var, xa2 xa2Var, C3713w8 c3713w8, C1808b c1808b, nn1 nn1Var, cma cmaVar, mk0 mk0Var, cz5 cz5Var, sca scaVar, l3a l3aVar, ar7 ar7Var, nl8 nl8Var) {
        hm5Var.getClass();
        c3509qs.getClass();
        si7Var.getClass();
        nm7Var.getClass();
        c1808b.getClass();
        cmaVar.getClass();
        mk0Var.getClass();
        cz5Var.getClass();
        scaVar.getClass();
        l3aVar.getClass();
        ar7Var.getClass();
        nl8Var.getClass();
        this.f30818b = cmaVar;
        this.f30820c = mk0Var;
        this.f30822d = cz5Var;
        this.f30824e = scaVar;
        this.f30826f = l3aVar;
        this.f30828g = ar7Var;
        this.f30830h = hm5Var;
        this.f30832i = nm7Var;
        this.f30834j = c1525a;
        this.f30836k = c1526a;
        this.f30838l = c1528c;
        this.f30840m = c1526a2;
        this.f30842n = c1526a3;
        this.f30844o = r13Var;
        this.f30846p = hi8Var;
        this.f30848q = c1527b;
        this.f30850r = y13Var;
        this.f30852s = c1390e;
        this.f30854t = c1383e;
        this.f30855u = c1382d;
        this.f30856v = vj6Var2;
        this.f30857w = n23Var;
        this.f30858x = o23Var2;
        this.f30859y = m23Var;
        this.f30860z = r13Var2;
        this.f30791A = y13Var2;
        this.f30792B = c3139j9;
        this.f30793C = z13Var;
        this.f30794D = c2529a;
        this.f30795E = a23Var;
        this.f30796F = z13Var2;
        this.f30797G = a34Var;
        this.f30798H = a23Var2;
        this.f30799I = n23Var2;
        this.f30800J = c3713w8;
        this.f30801K = c1808b;
        this.f30802L = nn1Var;
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        int iIntValue = num != null ? num.intValue() : 0;
        this.f30803M = iIntValue;
        Boolean bool = (Boolean) nl8Var.m17488b("isCompleting");
        this.f30804N = bool != null ? bool.booleanValue() : false;
        C3235e c3235eM15521C = AbstractC3224d.m15521C(nl8Var.m17489c(0, "lessonId"), new LessonCompleteViewModel$special$$inlined$flatMapLatest$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, null);
        this.f30805O = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(nl8Var.m17489c(0, "lessonId"), new LessonCompleteViewModel$special$$inlined$flatMapLatest$2(this, null)), lda.m16103C(this), c3243k, null);
        AbstractC3224d.m15520B(AbstractC3224d.m15521C(nl8Var.m17489c(0, "lessonId"), new LessonCompleteViewModel$special$$inlined$flatMapLatest$3(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(new ph4(new C3540rl(c18VarM15520B, 5), 4), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(c18VarM15520B3, 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$4(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(c18VarM15520B3, 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$5(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B6 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) ((C1295k) o23Var.f53649a).f16498b).f57071K, true, new String[]{"LessonNextSuggestionEntity"}, new mv0(iIntValue, 4)))), new LessonCompleteViewModel$lessonCompleteNext$1(3, null)), lda.m16103C(this), c3243k, null);
        Boolean bool2 = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool2);
        this.f30806P = c3244lM17114d;
        this.f30807Q = c3244lM17114d;
        this.f30808R = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c18VarM15520B, c18VarM15520B6, c18VarM15520B5, new LessonCompleteViewModel$nextLessonReference$1(4, null)), lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f30809S = c3244lM17114d2;
        this.f30810T = AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool2);
        this.f30811U = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool2);
        this.f30812V = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f30813W = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(bool2);
        this.f30814X = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(Boolean.TRUE);
        this.f30815Y = c3244lM17114d7;
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(null);
        this.f30816Z = c3244lM17114d8;
        c18 c18VarM15520B7 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(z13Var.m25401a(iIntValue)), lda.m16103C(this), c3243k, null);
        this.f30817a0 = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c18VarM15520B7, AbstractC3224d.m15531j(c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, c3244lM17114d6, new LessonCompleteViewModel$lynxCoachUiState$1(5, null)), c3244lM17114d7, AbstractC3224d.m15521C(c18VarM15520B7, new LessonCompleteViewModel$special$$inlined$flatMapLatest$6(this, null)), c3244lM17114d8, new LessonCompleteViewModel$lynxCoachUiState$2(this, null)), lda.m16103C(this), c3243k, new mn5(false, false, false, false, null, null, false, 0, 0, null, null, null, null, null, null, 65535));
        c18 c18VarM15520B8 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$7(this, null)), lda.m16103C(this), c3243k, oj9.f54467a);
        this.f30819b0 = c18VarM15520B8;
        this.f30821c0 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$8(this, null)), lda.m16103C(this), c3243k, sj9.f60941a);
        this.f30823d0 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$9(this, null)), lda.m16103C(this), c3243k, b4b.f7939a);
        c18 c18VarM15520B9 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$10(this, null)), lda.m16103C(this), c3243k, new C2992f8(LanguageProgressPeriod.Today));
        this.f30825e0 = c18VarM15520B9;
        this.f30827f0 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(cmaVar.mo4572B0(), 5), new LessonCompleteViewModel$special$$inlined$flatMapLatest$11(this, null)), lda.m16103C(this), c3243k, y75.f69407a);
        String strMo4589b2 = cmaVar.mo4589b2();
        strMo4589b2.getClass();
        lx4 lx4Var = (lx4) webVar.f66742a;
        lx4Var.getClass();
        hx4 hx4Var = lx4Var.f50239a;
        hx4Var.getClass();
        this.f30829g0 = AbstractC3224d.m15520B(new wz0(17, new wz0(12, AbstractC3584sr.m21590A(hx4Var.f43096a, false, new String[]{"LessonAchievementEntity"}, new ld0(iIntValue, strMo4589b2, 8)), lx4Var), webVar), lda.m16103C(this), c3243k, new C3026g5(EmptyList.f47638a));
        String strMo4589b3 = cmaVar.mo4589b2();
        LanguageProgressPeriod languageProgressPeriod = LanguageProgressPeriod.Last7Days;
        LanguageProgressMetric languageProgressMetric = LanguageProgressMetric.StudyTime;
        this.f30831h0 = AbstractC3224d.m15520B(new C3228h(zm3Var.m25700a(strMo4589b3, languageProgressPeriod, languageProgressMetric), zm3Var.m25700a(cmaVar.mo4589b2(), LanguageProgressPeriod.Last14Days, languageProgressMetric), new LessonCompleteViewModel$studyTimeChartUiState$1(this, null)), lda.m16103C(this), c3243k, new ql9());
        this.f30833i0 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(AbstractC3224d.m15532k(zm3Var.m25700a(cmaVar.mo4589b2(), LanguageProgressPeriod.Last6Months, LanguageProgressMetric.ReadingSpeed), c18VarM15520B9, c18VarM15520B2, new LessonCompleteViewModel$readingSpeedChartUiState$1(this, null))), lda.m16103C(this), c3243k, new x08());
        ((C1240a) hm5Var).m7025f("lesson complete main screen viewed", null);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$1(this, null), 3);
        AbstractC3224d.m15545x(new m83(cmaVar.mo4577H(), new LessonCompleteViewModel$startLynxCoach$1(this, null), 2), lda.m16103C(this));
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(bool2);
        this.f30835j0 = c3244lM17114d9;
        this.f30837k0 = c3244lM17114d9;
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(null);
        this.f30839l0 = c3244lM17114d10;
        this.f30841m0 = c3244lM17114d10;
        this.f30843n0 = AbstractC3352my.m17114d("0:00");
        this.f30847p0 = AbstractC3224d.m15520B(AbstractC3224d.m15531j(new C3540rl(c18VarM15520B, 5), c18VarM15520B2, c18VarM15520B8, c1530a.m8209a(), new LessonCompleteViewModel$lessonStatsUiState$1(5, null)), lda.m16103C(this), c3243k, new s65(zz7.f72431f, 0.0d, (2046 & 4) != 0 ? 0.0d : 3.5d, 0.0d, (2046 & 16) != 0 ? 0.0d : 8.0d, null, null, (2046 & 128) != 0 ? null : 5, (2046 & 256) == 0 ? 5 : 0, (2046 & 512) != 0 ? null : Double.valueOf(1848.0d), (2046 & 1024) != 0 ? null : Double.valueOf(33.8d)));
        c18 c18VarM15520B10 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(nl8Var.m17489c(0, "lessonId"), new LessonCompleteViewModel$special$$inlined$flatMapLatest$12(this, null)), lda.m16103C(this), c3243k, 0);
        this.f30849q0 = c18VarM15520B10;
        this.f30851r0 = AbstractC3224d.m15520B(AbstractC3224d.m15532k(new C3540rl(c18VarM15520B, 5), c18VarM15520B10, AbstractC3224d.m15520B(AbstractC3224d.m15521C(nl8Var.m17489c(0, "lessonId"), new LessonCompleteViewModel$special$$inlined$flatMapLatest$13(this, null)), lda.m16103C(this), c3243k, null), new LessonCompleteViewModel$lessonUiState$1(this, null)), lda.m16103C(this), c3243k, new y65(false, false, (92 & 4) != 0 ? "" : "Example Lesson Title", (8 & 92) != 0 ? "" : "LingQ Mini Stories", (92 & 16) != 0 ? null : "https://www.lingq.com/static/assets/images/lesson/lesson-1.jpg", (92 & 32) != 0 ? "" : cmaVar.mo4589b2(), false));
        this.f30853s0 = AbstractC3224d.m15520B(AbstractC3224d.m15531j(new C3540rl(c18VarM15520B, 5), c18VarM15520B5, c18VarM15520B6, c18VarM15520B4, new LessonCompleteViewModel$nextLessonTileUiState$1(5, null)), lda.m16103C(this), c3243k, new gl6());
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$6(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$7(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$8(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$9(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$10(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$11(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new LessonCompleteViewModel$12(this, null), 3);
        m9465a3();
    }

    /* JADX INFO: renamed from: V2 */
    public static final String m9460V2(C2535j c2535j, String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd", Locale.US);
            Calendar calendar = Calendar.getInstance();
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                calendar.setTime(date);
                calendar.set(1, Calendar.getInstance().get(1));
                String str2 = new SimpleDateFormat("EEE", Locale.getDefault()).format(calendar.getTime());
                str2.getClass();
                return str2;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0196 A[Catch: all -> 0x0188, TryCatch #4 {all -> 0x0188, blocks: (B:93:0x0182, B:94:0x0187, B:99:0x018d, B:106:0x01a7, B:100:0x0196), top: B:115:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7 A[Catch: all -> 0x0188, PHI: r2 r7 r14
      0x01a7: PHI (r2v11 zx4) = (r2v3 zx4), (r2v13 zx4), (r2v15 zx4) binds: [B:105:0x01a5, B:101:0x019f, B:98:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r7v18 boolean) = (r7v11 boolean), (r7v19 boolean), (r7v19 boolean) binds: [B:105:0x01a5, B:101:0x019f, B:98:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r14v8 int) = (r14v5 int), (r14v9 int), (r14v9 int) binds: [B:105:0x01a5, B:101:0x019f, B:98:0x018b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x0188, blocks: (B:93:0x0182, B:94:0x0187, B:99:0x018d, B:106:0x01a7, B:100:0x0196), top: B:115:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[PHI: r7 r12
      0x00b7: PHI (r7v4 boolean) = (r7v3 boolean), (r7v7 boolean) binds: [B:34:0x0097, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r12v2 zx4) = (r12v1 zx4), (r12v5 zx4) binds: [B:34:0x0097, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103 A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:16:0x0040, B:60:0x0103), top: B:115:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x017a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018d A[Catch: all -> 0x0188, TryCatch #4 {all -> 0x0188, blocks: (B:93:0x0182, B:94:0x0187, B:99:0x018d, B:106:0x01a7, B:100:0x0196), top: B:115:0x0034 }] */
    /* JADX INFO: renamed from: W2 */
    public static final Object m9461W2(C2535j c2535j, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LessonCompleteViewModel$loadLynxCoach$1 lessonCompleteViewModel$loadLynxCoach$1;
        boolean z2;
        zx4 zx4Var;
        zx4 zx4Var2;
        boolean z3;
        int i;
        zx4 zx4Var3;
        int i2;
        boolean z4;
        zx4 zx4Var4;
        int i3;
        zx4 zx4Var5;
        zx4 zx4Var6;
        Object failure;
        Object obj;
        int i4;
        cma cmaVar = c2535j.f30818b;
        C3244l c3244l = c2535j.f30812V;
        C3244l c3244l2 = c2535j.f30811U;
        C3244l c3244l3 = c2535j.f30813W;
        if (continuationImpl instanceof LessonCompleteViewModel$loadLynxCoach$1) {
            lessonCompleteViewModel$loadLynxCoach$1 = (LessonCompleteViewModel$loadLynxCoach$1) continuationImpl;
            int i5 = lessonCompleteViewModel$loadLynxCoach$1.f30596f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonCompleteViewModel$loadLynxCoach$1.f30596f = i5 - Integer.MIN_VALUE;
            } else {
                lessonCompleteViewModel$loadLynxCoach$1 = new LessonCompleteViewModel$loadLynxCoach$1(c2535j, continuationImpl);
            }
        } else {
            lessonCompleteViewModel$loadLynxCoach$1 = new LessonCompleteViewModel$loadLynxCoach$1(c2535j, continuationImpl);
        }
        LessonCompleteViewModel$loadLynxCoach$1 lessonCompleteViewModel$loadLynxCoach$2 = lessonCompleteViewModel$loadLynxCoach$1;
        Object objM15541t = lessonCompleteViewModel$loadLynxCoach$2.f30594d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonCompleteViewModel$loadLynxCoach$2.f30596f;
        xfa xfaVar = xfa.f68157a;
        try {
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        z2 = lessonCompleteViewModel$loadLynxCoach$2.f30591a;
                        AbstractC3193b.m15359b(objM15541t);
                    } else if (i6 == 2) {
                        z2 = lessonCompleteViewModel$loadLynxCoach$2.f30591a;
                        zx4Var = lessonCompleteViewModel$loadLynxCoach$2.f30592b;
                        AbstractC3193b.m15359b(objM15541t);
                        if (((Boolean) objM15541t).booleanValue()) {
                            zx4Var2 = zx4Var;
                            z3 = z2;
                            i = 1;
                        } else {
                            zx4Var2 = zx4Var;
                            z3 = z2;
                            i = 0;
                        }
                        if (i != 0 || c2535j.f30804N) {
                            zx4Var3 = zx4Var2;
                            i2 = i;
                            z4 = z3;
                            Boolean bool = Boolean.FALSE;
                            c3244l2.getClass();
                            c3244l2.m15572j(null, bool);
                            ux5.m22977D(!z4, c3244l, null);
                            if (i2 != 0) {
                                if (!z4) {
                                    c3244l3.getClass();
                                    c3244l3.m15572j(null, "");
                                    C2529a c2529a = c2535j.f30794D;
                                    String strMo4589b2 = cmaVar.mo4589b2();
                                    String strMo4580K1 = cmaVar.mo4580K1();
                                    int i7 = c2535j.f30803M;
                                    LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$1 = new LessonCompleteViewModel$loadLynxCoach$result$1$1(c2535j, null);
                                    LessonCompleteViewModel$loadLynxCoach$result$1$2 lessonCompleteViewModel$loadLynxCoach$result$1$2 = new LessonCompleteViewModel$loadLynxCoach$result$1$2(c2535j, null);
                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var3;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 4;
                                    zx4Var5 = zx4Var3;
                                    i3 = 1;
                                    objM15541t = c2529a.m9459a(strMo4589b2, strMo4580K1, i7, lessonCompleteViewModel$loadLynxCoach$result$1$1, lessonCompleteViewModel$loadLynxCoach$result$1$2, lessonCompleteViewModel$loadLynxCoach$2);
                                    if (objM15541t == obj2) {
                                        return obj2;
                                    }
                                    z4 = z4;
                                    zx4Var6 = zx4Var5;
                                    failure = (LessonCoachChatResult) objM15541t;
                                    obj = LessonCoachChatResult.Failed;
                                    if (failure instanceof Result.Failure) {
                                        failure = obj;
                                    }
                                    i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                                    if (i4 == i3) {
                                        zx4Var4 = null;
                                        Boolean bool2 = Boolean.TRUE;
                                        c3244l.getClass();
                                        c3244l.m15572j(null, bool2);
                                        if (zx4Var6 != null) {
                                        }
                                    } else if (i4 == 2) {
                                        zx4Var4 = null;
                                        if (zx4Var6 == null) {
                                            Boolean bool3 = Boolean.TRUE;
                                            c3244l2.getClass();
                                            c3244l2.m15572j(null, bool3);
                                        }
                                    } else {
                                        if (i4 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        zx4Var4 = null;
                                    }
                                } else if (zx4Var3 == null) {
                                    c3244l3.m15571i(null);
                                    return xfaVar;
                                }
                            }
                            zx4Var4 = null;
                            z4 = z4;
                        } else {
                            lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var2;
                            lessonCompleteViewModel$loadLynxCoach$2.f30591a = z3;
                            lessonCompleteViewModel$loadLynxCoach$2.f30593c = i;
                            lessonCompleteViewModel$loadLynxCoach$2.f30596f = 3;
                            objM15541t = c2535j.m9463Y2(lessonCompleteViewModel$loadLynxCoach$2);
                            if (objM15541t == obj2) {
                                return obj2;
                            }
                            if (!((Boolean) objM15541t).booleanValue()) {
                                Boolean bool4 = Boolean.TRUE;
                                c3244l2.getClass();
                                c3244l2.m15572j(null, bool4);
                                return xfaVar;
                            }
                            zx4Var3 = zx4Var2;
                            i2 = i;
                            z4 = z3;
                            Boolean bool5 = Boolean.FALSE;
                            c3244l2.getClass();
                            c3244l2.m15572j(null, bool5);
                            ux5.m22977D(!z4, c3244l, null);
                            if (i2 != 0) {
                                if (!z4) {
                                    c3244l3.getClass();
                                    c3244l3.m15572j(null, "");
                                    C2529a c2529a2 = c2535j.f30794D;
                                    String strMo4589b3 = cmaVar.mo4589b2();
                                    String strMo4580K2 = cmaVar.mo4580K1();
                                    int i8 = c2535j.f30803M;
                                    LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$3 = new LessonCompleteViewModel$loadLynxCoach$result$1$1(c2535j, null);
                                    LessonCompleteViewModel$loadLynxCoach$result$1$2 lessonCompleteViewModel$loadLynxCoach$result$1$4 = new LessonCompleteViewModel$loadLynxCoach$result$1$2(c2535j, null);
                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var3;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 4;
                                    zx4Var5 = zx4Var3;
                                    i3 = 1;
                                    objM15541t = c2529a2.m9459a(strMo4589b3, strMo4580K2, i8, lessonCompleteViewModel$loadLynxCoach$result$1$3, lessonCompleteViewModel$loadLynxCoach$result$1$4, lessonCompleteViewModel$loadLynxCoach$2);
                                    if (objM15541t == obj2) {
                                        return obj2;
                                    }
                                    z4 = z4;
                                    zx4Var6 = zx4Var5;
                                    failure = (LessonCoachChatResult) objM15541t;
                                    obj = LessonCoachChatResult.Failed;
                                    if (failure instanceof Result.Failure) {
                                        failure = obj;
                                    }
                                    i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                                    if (i4 == i3) {
                                        zx4Var4 = null;
                                        Boolean bool6 = Boolean.TRUE;
                                        c3244l.getClass();
                                        c3244l.m15572j(null, bool6);
                                        if (zx4Var6 != null) {
                                        }
                                    } else if (i4 == 2) {
                                        zx4Var4 = null;
                                        if (zx4Var6 == null) {
                                            Boolean bool7 = Boolean.TRUE;
                                            c3244l2.getClass();
                                            c3244l2.m15572j(null, bool7);
                                        }
                                    } else {
                                        if (i4 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        zx4Var4 = null;
                                    }
                                } else if (zx4Var3 == null) {
                                    c3244l3.m15571i(null);
                                    return xfaVar;
                                }
                            }
                            zx4Var4 = null;
                            z4 = z4;
                        }
                        lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                        lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                        if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                            return obj2;
                        }
                    } else if (i6 == 3) {
                        i = lessonCompleteViewModel$loadLynxCoach$2.f30593c;
                        z3 = lessonCompleteViewModel$loadLynxCoach$2.f30591a;
                        zx4Var2 = lessonCompleteViewModel$loadLynxCoach$2.f30592b;
                        AbstractC3193b.m15359b(objM15541t);
                        if (!((Boolean) objM15541t).booleanValue()) {
                            Boolean bool8 = Boolean.TRUE;
                            c3244l2.getClass();
                            c3244l2.m15572j(null, bool8);
                            return xfaVar;
                        }
                        zx4Var3 = zx4Var2;
                        i2 = i;
                        z4 = z3;
                        Boolean bool9 = Boolean.FALSE;
                        c3244l2.getClass();
                        c3244l2.m15572j(null, bool9);
                        ux5.m22977D(!z4, c3244l, null);
                        if (i2 != 0) {
                            if (!z4) {
                                c3244l3.getClass();
                                c3244l3.m15572j(null, "");
                                try {
                                    C2529a c2529a3 = c2535j.f30794D;
                                    String strMo4589b4 = cmaVar.mo4589b2();
                                    String strMo4580K3 = cmaVar.mo4580K1();
                                    try {
                                        int i9 = c2535j.f30803M;
                                        LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$5 = new LessonCompleteViewModel$loadLynxCoach$result$1$1(c2535j, null);
                                        LessonCompleteViewModel$loadLynxCoach$result$1$2 lessonCompleteViewModel$loadLynxCoach$result$1$6 = new LessonCompleteViewModel$loadLynxCoach$result$1$2(c2535j, null);
                                        lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var3;
                                        lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                        lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                        lessonCompleteViewModel$loadLynxCoach$2.f30596f = 4;
                                        zx4Var5 = zx4Var3;
                                        i3 = 1;
                                        try {
                                            objM15541t = c2529a3.m9459a(strMo4589b4, strMo4580K3, i9, lessonCompleteViewModel$loadLynxCoach$result$1$5, lessonCompleteViewModel$loadLynxCoach$result$1$6, lessonCompleteViewModel$loadLynxCoach$2);
                                            if (objM15541t == obj2) {
                                                return obj2;
                                            }
                                            z4 = z4;
                                            zx4Var6 = zx4Var5;
                                            failure = (LessonCoachChatResult) objM15541t;
                                            obj = LessonCoachChatResult.Failed;
                                            if (failure instanceof Result.Failure) {
                                                failure = obj;
                                            }
                                            i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                                            if (i4 == i3) {
                                                zx4Var4 = null;
                                                Boolean bool10 = Boolean.TRUE;
                                                c3244l.getClass();
                                                c3244l.m15572j(null, bool10);
                                                if (zx4Var6 != null) {
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                                        return obj2;
                                                    }
                                                }
                                            } else if (i4 == 2) {
                                                zx4Var4 = null;
                                                if (zx4Var6 == null) {
                                                    Boolean bool11 = Boolean.TRUE;
                                                    c3244l2.getClass();
                                                    c3244l2.m15572j(null, bool11);
                                                } else {
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                                        return obj2;
                                                    }
                                                }
                                            } else {
                                                if (i4 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                zx4Var4 = null;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            z4 = z4;
                                            zx4Var6 = zx4Var5;
                                            failure = new Result.Failure(th);
                                            obj = LessonCoachChatResult.Failed;
                                            if (failure instanceof Result.Failure) {
                                                failure = obj;
                                            }
                                            i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                                            if (i4 == i3) {
                                                zx4Var4 = null;
                                                Boolean bool12 = Boolean.TRUE;
                                                c3244l.getClass();
                                                c3244l.m15572j(null, bool12);
                                                if (zx4Var6 != null) {
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                                        return obj2;
                                                    }
                                                }
                                            } else if (i4 == 2) {
                                                zx4Var4 = null;
                                                if (zx4Var6 == null) {
                                                    Boolean bool13 = Boolean.TRUE;
                                                    c3244l2.getClass();
                                                    c3244l2.m15572j(null, bool13);
                                                } else {
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                                        return obj2;
                                                    }
                                                }
                                            } else {
                                                if (i4 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                zx4Var4 = null;
                                            }
                                            c3244l3.m15571i(zx4Var4);
                                            return xfaVar;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zx4Var5 = zx4Var3;
                                        i3 = 1;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i3 = 1;
                                    zx4Var5 = zx4Var3;
                                }
                            } else if (zx4Var3 == null) {
                                c3244l3.m15571i(null);
                                return xfaVar;
                            }
                        }
                        zx4Var4 = null;
                        z4 = z4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                        lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                        if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                            return obj2;
                        }
                    } else if (i6 == 4) {
                        int i10 = lessonCompleteViewModel$loadLynxCoach$2.f30593c;
                        z4 = lessonCompleteViewModel$loadLynxCoach$2.f30591a;
                        zx4Var6 = lessonCompleteViewModel$loadLynxCoach$2.f30592b;
                        try {
                            AbstractC3193b.m15359b(objM15541t);
                            i2 = i10;
                            i3 = 1;
                            try {
                                failure = (LessonCoachChatResult) objM15541t;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    failure = new Result.Failure(th);
                                } catch (Throwable th5) {
                                    th = th5;
                                    cmaVar = null;
                                    c3244l3.m15571i(cmaVar);
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            i2 = i10;
                            i3 = 1;
                            failure = new Result.Failure(th);
                            obj = LessonCoachChatResult.Failed;
                            if (failure instanceof Result.Failure) {
                                failure = obj;
                            }
                            i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                            if (i4 == i3) {
                                zx4Var4 = null;
                                Boolean bool14 = Boolean.TRUE;
                                c3244l.getClass();
                                c3244l.m15572j(null, bool14);
                                if (zx4Var6 != null) {
                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                        return obj2;
                                    }
                                }
                            } else if (i4 == 2) {
                                zx4Var4 = null;
                                if (zx4Var6 == null) {
                                    Boolean bool15 = Boolean.TRUE;
                                    c3244l2.getClass();
                                    c3244l2.m15572j(null, bool15);
                                } else {
                                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                    if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                        return obj2;
                                    }
                                }
                            } else {
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zx4Var4 = null;
                            }
                            c3244l3.m15571i(zx4Var4);
                            return xfaVar;
                        }
                        obj = LessonCoachChatResult.Failed;
                        if (failure instanceof Result.Failure) {
                            failure = obj;
                        }
                        i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                        if (i4 == i3) {
                            zx4Var4 = null;
                            Boolean bool16 = Boolean.TRUE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool16);
                            if (zx4Var6 != null) {
                                lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                    return obj2;
                                }
                            }
                        } else if (i4 == 2) {
                            zx4Var4 = null;
                            if (zx4Var6 == null) {
                                Boolean bool17 = Boolean.TRUE;
                                c3244l2.getClass();
                                c3244l2.m15572j(null, bool17);
                            } else {
                                lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                    return obj2;
                                }
                            }
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zx4Var4 = null;
                        }
                    } else {
                        if (i6 != 5) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(objM15541t);
                        zx4Var4 = null;
                    }
                    c3244l3.m15571i(zx4Var4);
                    return xfaVar;
                }
                AbstractC3193b.m15359b(objM15541t);
                c83 c83VarM25401a = c2535j.f30793C.m25401a(c2535j.f30803M);
                z2 = z;
                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z2;
                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 1;
                objM15541t = AbstractC3224d.m15541t(c83VarM25401a, lessonCompleteViewModel$loadLynxCoach$2);
                if (objM15541t == obj2) {
                    return obj2;
                }
                zx4Var = (zx4) objM15541t;
                if (zx4Var != null) {
                    int i11 = zx4Var.f72337a;
                    lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var;
                    lessonCompleteViewModel$loadLynxCoach$2.f30591a = z2;
                    lessonCompleteViewModel$loadLynxCoach$2.f30596f = 2;
                    objM15541t = c2535j.m9462X2(i11, lessonCompleteViewModel$loadLynxCoach$2);
                    if (objM15541t == obj2) {
                        return obj2;
                    }
                    if (((Boolean) objM15541t).booleanValue()) {
                        zx4Var2 = zx4Var;
                        z3 = z2;
                        i = 1;
                    } else {
                        zx4Var2 = zx4Var;
                        z3 = z2;
                        i = 0;
                    }
                } else {
                    zx4Var2 = zx4Var;
                    z3 = z2;
                    i = 1;
                }
                if (i != 0) {
                }
                zx4Var3 = zx4Var2;
                i2 = i;
                z4 = z3;
                Boolean bool18 = Boolean.FALSE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool18);
                ux5.m22977D(!z4, c3244l, null);
                if (i2 != 0) {
                    if (!z4) {
                        c3244l3.getClass();
                        c3244l3.m15572j(null, "");
                        C2529a c2529a4 = c2535j.f30794D;
                        String strMo4589b5 = cmaVar.mo4589b2();
                        String strMo4580K4 = cmaVar.mo4580K1();
                        int i12 = c2535j.f30803M;
                        LessonCompleteViewModel$loadLynxCoach$result$1$1 lessonCompleteViewModel$loadLynxCoach$result$1$7 = new LessonCompleteViewModel$loadLynxCoach$result$1$1(c2535j, null);
                        LessonCompleteViewModel$loadLynxCoach$result$1$2 lessonCompleteViewModel$loadLynxCoach$result$1$8 = new LessonCompleteViewModel$loadLynxCoach$result$1$2(c2535j, null);
                        lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var3;
                        lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                        lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                        lessonCompleteViewModel$loadLynxCoach$2.f30596f = 4;
                        zx4Var5 = zx4Var3;
                        i3 = 1;
                        objM15541t = c2529a4.m9459a(strMo4589b5, strMo4580K4, i12, lessonCompleteViewModel$loadLynxCoach$result$1$7, lessonCompleteViewModel$loadLynxCoach$result$1$8, lessonCompleteViewModel$loadLynxCoach$2);
                        if (objM15541t == obj2) {
                            return obj2;
                        }
                        z4 = z4;
                        zx4Var6 = zx4Var5;
                        failure = (LessonCoachChatResult) objM15541t;
                        obj = LessonCoachChatResult.Failed;
                        if (failure instanceof Result.Failure) {
                            failure = obj;
                        }
                        i4 = pz4.f57030a[((LessonCoachChatResult) failure).ordinal()];
                        if (i4 == i3) {
                            zx4Var4 = null;
                            Boolean bool19 = Boolean.TRUE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool19);
                            if (zx4Var6 != null) {
                                lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                    return obj2;
                                }
                            }
                        } else if (i4 == 2) {
                            zx4Var4 = null;
                            if (zx4Var6 == null) {
                                Boolean bool110 = Boolean.TRUE;
                                c3244l2.getClass();
                                c3244l2.m15572j(null, bool110);
                            } else {
                                lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                                lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                                if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                                    return obj2;
                                }
                            }
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zx4Var4 = null;
                        }
                        c3244l3.m15571i(zx4Var4);
                        return xfaVar;
                    }
                    if (zx4Var3 == null) {
                        c3244l3.m15571i(null);
                        return xfaVar;
                    }
                }
                zx4Var4 = null;
                z4 = z4;
                lessonCompleteViewModel$loadLynxCoach$2.f30592b = zx4Var4;
                lessonCompleteViewModel$loadLynxCoach$2.f30591a = z4;
                lessonCompleteViewModel$loadLynxCoach$2.f30593c = i2;
                lessonCompleteViewModel$loadLynxCoach$2.f30596f = 5;
                if (c2535j.m9464Z2(lessonCompleteViewModel$loadLynxCoach$2) == obj2) {
                    return obj2;
                }
                c3244l3.m15571i(zx4Var4);
                return xfaVar;
            } catch (Throwable th7) {
                th = th7;
                cmaVar = null;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f30818b.mo4571A();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f30826f.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f30826f.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f30818b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f30818b.mo4573B1();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: B2 */
    public final void mo3004B2() {
        this.f30828g.mo3004B2();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: C */
    public final void mo3005C() {
        this.f30828g.mo3005C();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f30818b.mo4574C1();
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: C2 */
    public final c83 mo9319C2() {
        return this.f30820c.mo9319C2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f30818b.mo4575D0(continuation);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: D2 */
    public final void mo3006D2(String str) {
        str.getClass();
        this.f30828g.mo3006D2(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f30826f.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f30826f.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f30826f.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f30818b.mo4576F1(str, continuation);
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: G1 */
    public final void mo9320G1(String str, int i, String str2, int i2, int i3) {
        str.getClass();
        str2.getClass();
        this.f30820c.mo9320G1(str, i, str2, i2, i3);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: G2 */
    public final void mo3007G2(boolean z) {
        this.f30828g.mo3007G2(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f30818b.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f30826f.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f30818b.mo4578J(continuation);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: J2 */
    public final void mo3008J2() {
        this.f30828g.mo3008J2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f30818b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f30818b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f30818b.mo4581L0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: L1 */
    public final void mo3009L1() {
        this.f30828g.mo3009L1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f30826f.mo8743L2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f30818b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f30818b.mo4583O1();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        this.f30824e.mo8482P();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f30818b.mo4584Q0();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Q1 */
    public final eh9 mo7006Q1() {
        return this.f30822d.mo7006Q1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f30818b.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f30826f.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f30818b.mo4586T0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        this.f30824e.mo8483U0(i, d, d2, f, str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f30826f.mo8747U1();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        qz4 qz4Var = this.f30845o0;
        if (qz4Var != null) {
            qz4Var.cancel();
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f30826f.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f30826f.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f30818b.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X2 */
    public final Object m9462X2(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonCompleteViewModel$isCoachMessageStale$1 lessonCompleteViewModel$isCoachMessageStale$1;
        if (continuationImpl instanceof LessonCompleteViewModel$isCoachMessageStale$1) {
            lessonCompleteViewModel$isCoachMessageStale$1 = (LessonCompleteViewModel$isCoachMessageStale$1) continuationImpl;
            int i2 = lessonCompleteViewModel$isCoachMessageStale$1.f30571c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonCompleteViewModel$isCoachMessageStale$1.f30571c = i2 - Integer.MIN_VALUE;
            } else {
                lessonCompleteViewModel$isCoachMessageStale$1 = new LessonCompleteViewModel$isCoachMessageStale$1(this, continuationImpl);
            }
        } else {
            lessonCompleteViewModel$isCoachMessageStale$1 = new LessonCompleteViewModel$isCoachMessageStale$1(this, continuationImpl);
        }
        Object objM15447n = lessonCompleteViewModel$isCoachMessageStale$1.f30569a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonCompleteViewModel$isCoachMessageStale$1.f30571c;
        Long lValueOf = null;
        boolean z = true;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15447n);
            LessonCompleteViewModel$isCoachMessageStale$updatedAt$1 lessonCompleteViewModel$isCoachMessageStale$updatedAt$1 = new LessonCompleteViewModel$isCoachMessageStale$updatedAt$1(this, i, null);
            lessonCompleteViewModel$isCoachMessageStale$1.f30571c = 1;
            objM15447n = AbstractC3208a.m15447n(2000L, lessonCompleteViewModel$isCoachMessageStale$updatedAt$1, lessonCompleteViewModel$isCoachMessageStale$1);
            if (objM15447n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15447n);
        }
        String str = (String) objM15447n;
        if (str == null) {
            return Boolean.FALSE;
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str);
            if (date != null) {
                lValueOf = Long.valueOf(date.getTime());
            }
        } catch (Exception unused) {
        }
        if (lValueOf != null) {
            if (y02.m24805c() - lValueOf.longValue() <= 86400000) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        this.f30824e.mo8484Y0(str, z, f, z2);
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Y1 */
    public final void mo7009Y1(List list) {
        this.f30822d.mo7009Y1(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y2 */
    public final Object m9463Y2(ContinuationImpl continuationImpl) throws Throwable {
        LessonCompleteViewModel$isLessonAlreadyComplete$1 lessonCompleteViewModel$isLessonAlreadyComplete$1;
        if (continuationImpl instanceof LessonCompleteViewModel$isLessonAlreadyComplete$1) {
            lessonCompleteViewModel$isLessonAlreadyComplete$1 = (LessonCompleteViewModel$isLessonAlreadyComplete$1) continuationImpl;
            int i = lessonCompleteViewModel$isLessonAlreadyComplete$1.f30577c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonCompleteViewModel$isLessonAlreadyComplete$1.f30577c = i - Integer.MIN_VALUE;
            } else {
                lessonCompleteViewModel$isLessonAlreadyComplete$1 = new LessonCompleteViewModel$isLessonAlreadyComplete$1(this, continuationImpl);
            }
        } else {
            lessonCompleteViewModel$isLessonAlreadyComplete$1 = new LessonCompleteViewModel$isLessonAlreadyComplete$1(this, continuationImpl);
        }
        Object objM15447n = lessonCompleteViewModel$isLessonAlreadyComplete$1.f30575a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonCompleteViewModel$isLessonAlreadyComplete$1.f30577c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15447n);
            LessonCompleteViewModel$isLessonAlreadyComplete$2 lessonCompleteViewModel$isLessonAlreadyComplete$2 = new LessonCompleteViewModel$isLessonAlreadyComplete$2(this, null);
            lessonCompleteViewModel$isLessonAlreadyComplete$1.f30577c = 1;
            objM15447n = AbstractC3208a.m15447n(2000L, lessonCompleteViewModel$isLessonAlreadyComplete$2, lessonCompleteViewModel$isLessonAlreadyComplete$1);
            if (objM15447n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15447n);
        }
        return Boolean.valueOf(fa4.m11650l(objM15447n, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX INFO: renamed from: Z2 */
    public final Object m9464Z2(ContinuationImpl continuationImpl) throws Throwable {
        LessonCompleteViewModel$prepareLynxCoachMessage$1 lessonCompleteViewModel$prepareLynxCoachMessage$1;
        ?? r8;
        int i;
        if (continuationImpl instanceof LessonCompleteViewModel$prepareLynxCoachMessage$1) {
            lessonCompleteViewModel$prepareLynxCoachMessage$1 = (LessonCompleteViewModel$prepareLynxCoachMessage$1) continuationImpl;
            int i2 = lessonCompleteViewModel$prepareLynxCoachMessage$1.f30623d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonCompleteViewModel$prepareLynxCoachMessage$1.f30623d = i2 - Integer.MIN_VALUE;
            } else {
                lessonCompleteViewModel$prepareLynxCoachMessage$1 = new LessonCompleteViewModel$prepareLynxCoachMessage$1(this, continuationImpl);
            }
        } else {
            lessonCompleteViewModel$prepareLynxCoachMessage$1 = new LessonCompleteViewModel$prepareLynxCoachMessage$1(this, continuationImpl);
        }
        Object objM15541t = lessonCompleteViewModel$prepareLynxCoachMessage$1.f30621b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonCompleteViewModel$prepareLynxCoachMessage$1.f30623d;
        C3244l c3244l = this.f30814X;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            C3540rl c3540rl = new C3540rl(this.f30793C.m25401a(this.f30803M), 5);
            lessonCompleteViewModel$prepareLynxCoachMessage$1.f30623d = 1;
            objM15541t = AbstractC3224d.m15541t(c3540rl, lessonCompleteViewModel$prepareLynxCoachMessage$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = lessonCompleteViewModel$prepareLynxCoachMessage$1.f30620a;
            AbstractC3193b.m15359b(objM15541t);
        }
        if (r8 == 0) {
            r8 = i;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
        }
        r8 = i;
        return xfa.f68157a;
        zx4 zx4Var = (zx4) objM15541t;
        ?? r5 = zx4Var.f72340d != null ? 0 : 1;
        Boolean boolValueOf = Boolean.valueOf((boolean) r5);
        c3244l.getClass();
        c3244l.m15572j(null, boolValueOf);
        LessonCompleteViewModel$prepareLynxCoachMessage$2 lessonCompleteViewModel$prepareLynxCoachMessage$2 = new LessonCompleteViewModel$prepareLynxCoachMessage$2(r5, this, zx4Var, null);
        lessonCompleteViewModel$prepareLynxCoachMessage$1.f30620a = r5;
        lessonCompleteViewModel$prepareLynxCoachMessage$1.f30623d = 2;
        if (vz1.m23649s(lessonCompleteViewModel$prepareLynxCoachMessage$2, lessonCompleteViewModel$prepareLynxCoachMessage$1) != coroutineSingletons) {
            r8 = r5;
            if (r8 == 0) {
                r8 = i;
                Boolean bool2 = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool2);
            }
            r8 = i;
            return xfa.f68157a;
        }
        return coroutineSingletons;
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: a */
    public final u66 mo7010a() {
        return this.f30822d.mo7010a();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f30818b.mo4588a0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: a2 */
    public final eh9 mo3010a2() {
        return this.f30828g.mo3010a2();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9465a3() {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.getClass();
        calendar2.add(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        qz4 qz4Var = new qz4(this, calendar2.getTimeInMillis() - calendar.getTimeInMillis());
        this.f30845o0 = qz4Var;
        qz4Var.start();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f30826f.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f30818b.mo4589b2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f30826f.mo8758c();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        this.f30824e.mo8485c2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f30824e.mo8486d();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f30818b.mo4590d0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: e1 */
    public final Object mo3011e1(boolean z, Continuation continuation) {
        return this.f30828g.mo3011e1(z, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f30826f.mo8761f();
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: g2 */
    public final void mo9326g2(yx4 yx4Var) {
        this.f30820c.mo9326g2(yx4Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f30818b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f30826f.mo8765i();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f30826f.mo8767j();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f30818b.mo4592m0();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        return this.f30824e.mo8492m1(continuationImpl);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        this.f30824e.mo8493n(d, d2, i, 1.0f, l);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f30826f.mo8769n0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f30818b.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f30826f.mo8770p1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f30826f.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f30826f.mo8773q2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f30818b.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f30826f.mo8774r2(i);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f30818b.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f30826f.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f30818b.mo4596t();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f30824e.mo8494u();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f30826f.mo8779v2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f30818b.mo4597w0(continuation);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: w1 */
    public final Object mo3012w1(Continuation continuation) {
        return this.f30828g.mo3012w1(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f30818b.mo4598w2();
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        this.f30824e.mo8495y1(set);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z */
    public final void mo3013z(RatingContentType ratingContentType) {
        ratingContentType.getClass();
        this.f30828g.mo3013z(ratingContentType);
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: z1 */
    public final void mo7016z1(go3 go3Var) {
        go3Var.getClass();
        this.f30822d.mo7016z1(go3Var);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z2 */
    public final void mo3014z2(boolean z) {
        this.f30828g.mo3014z2(z);
    }
}
