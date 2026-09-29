package com.lingq.feature.reader.video;

import android.os.Parcelable;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.modules.ReaderMode;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.lesson.C1385g;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1536d;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.reader.content.C2260a;
import com.lingq.feature.reader.content.state.C2266c;
import com.lingq.feature.reader.milestones.C2268b;
import com.lingq.feature.reader.milestones.state.C2272a;
import com.lingq.feature.reader.preferences.C2469a;
import com.lingq.feature.reader.progress.C2470a;
import com.lingq.feature.reader.progress.domain.C2472b;
import com.lingq.feature.reader.reader.domain.C2497a;
import com.lingq.feature.reader.reader.domain.C2498b;
import com.lingq.feature.reader.settings.C2507a;
import com.lingq.feature.reader.tracking.C2574a;
import com.lingq.feature.reader.tracking.TrackingPauseReason;
import com.lingq.feature.reader.video.state.C2595a;
import com.lingq.feature.reader.video.state.C2596b;
import com.lingq.feature.reader.video.state.C2597c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.ac7;
import p000.ap1;
import p000.ara;
import p000.bia;
import p000.bra;
import p000.bu7;
import p000.bx7;
import p000.c18;
import p000.c83;
import p000.cb7;
import p000.cc4;
import p000.ck6;
import p000.cma;
import p000.cra;
import p000.cx1;
import p000.dra;
import p000.dsa;
import p000.e08;
import p000.e23;
import p000.eh9;
import p000.era;
import p000.f41;
import p000.fa4;
import p000.fb7;
import p000.fra;
import p000.g41;
import p000.g9a;
import p000.gm5;
import p000.gra;
import p000.h08;
import p000.h0a;
import p000.hm5;
import p000.hqa;
import p000.hra;
import p000.hx7;
import p000.i84;
import p000.ia7;
import p000.ira;
import p000.j13;
import p000.j2c;
import p000.jqa;
import p000.jra;
import p000.kqa;
import p000.kra;
import p000.l70;
import p000.la7;
import p000.lda;
import p000.lqa;
import p000.lra;
import p000.m83;
import p000.mqa;
import p000.mra;
import p000.mv7;
import p000.n08;
import p000.nha;
import p000.nl8;
import p000.nqa;
import p000.nra;
import p000.og8;
import p000.oqa;
import p000.ora;
import p000.p08;
import p000.p33;
import p000.pg9;
import p000.pqa;
import p000.pra;
import p000.qqa;
import p000.qra;
import p000.qx8;
import p000.r23;
import p000.rqa;
import p000.sca;
import p000.sm5;
import p000.sqa;
import p000.tpa;
import p000.tqa;
import p000.u91;
import p000.ua7;
import p000.uqa;
import p000.v15;
import p000.v91;
import p000.vj6;
import p000.vk9;
import p000.vqa;
import p000.vz1;
import p000.web;
import p000.wfb;
import p000.wl6;
import p000.wqa;
import p000.wta;
import p000.wz0;
import p000.wz7;
import p000.xa2;
import p000.xa7;
import p000.xi9;
import p000.xqa;
import p000.xz7;
import p000.y15;
import p000.yqa;
import p000.yz4;
import p000.zl3;
import p000.zqa;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2583a extends wta implements cma, bia {
    public static final n08 Companion = new n08();

    /* JADX INFO: renamed from: b0 */
    public static final List f31340b0;

    /* JADX INFO: renamed from: c0 */
    public static final ArrayList f31341c0;

    /* JADX INFO: renamed from: A */
    public final xa2 f31342A;

    /* JADX INFO: renamed from: B */
    public final nha f31343B;

    /* JADX INFO: renamed from: C */
    public final C1533a f31344C;

    /* JADX INFO: renamed from: D */
    public final C1536d f31345D;

    /* JADX INFO: renamed from: E */
    public final vj6 f31346E;

    /* JADX INFO: renamed from: F */
    public final sca f31347F;

    /* JADX INFO: renamed from: G */
    public final int f31348G;

    /* JADX INFO: renamed from: H */
    public LqAnalyticsValues$LessonExitPath f31349H;

    /* JADX INFO: renamed from: I */
    public boolean f31350I;

    /* JADX INFO: renamed from: J */
    public boolean f31351J;

    /* JADX INFO: renamed from: K */
    public boolean f31352K;

    /* JADX INFO: renamed from: L */
    public final c18 f31353L;

    /* JADX INFO: renamed from: M */
    public final C3244l f31354M;

    /* JADX INFO: renamed from: N */
    public final c18 f31355N;

    /* JADX INFO: renamed from: O */
    public final C3244l f31356O;

    /* JADX INFO: renamed from: P */
    public final c18 f31357P;

    /* JADX INFO: renamed from: Q */
    public final c18 f31358Q;

    /* JADX INFO: renamed from: R */
    public final c18 f31359R;

    /* JADX INFO: renamed from: S */
    public final c18 f31360S;

    /* JADX INFO: renamed from: T */
    public final c18 f31361T;

    /* JADX INFO: renamed from: U */
    public final c18 f31362U;

    /* JADX INFO: renamed from: V */
    public final c18 f31363V;

    /* JADX INFO: renamed from: W */
    public final c18 f31364W;

    /* JADX INFO: renamed from: X */
    public final c18 f31365X;

    /* JADX INFO: renamed from: Y */
    public final c18 f31366Y;

    /* JADX INFO: renamed from: Z */
    public final c18 f31367Z;

    /* JADX INFO: renamed from: a0 */
    public long f31368a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f31369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bia f31370c;

    /* JADX INFO: renamed from: d */
    public final C2260a f31371d;

    /* JADX INFO: renamed from: e */
    public final C2595a f31372e;

    /* JADX INFO: renamed from: f */
    public final p33 f31373f;

    /* JADX INFO: renamed from: g */
    public final C2469a f31374g;

    /* JADX INFO: renamed from: h */
    public final C2266c f31375h;

    /* JADX INFO: renamed from: i */
    public final C2597c f31376i;

    /* JADX INFO: renamed from: j */
    public final C2596b f31377j;

    /* JADX INFO: renamed from: k */
    public final C2268b f31378k;

    /* JADX INFO: renamed from: l */
    public final C2472b f31379l;

    /* JADX INFO: renamed from: m */
    public final ck6 f31380m;

    /* JADX INFO: renamed from: n */
    public final C2498b f31381n;

    /* JADX INFO: renamed from: o */
    public final zl3 f31382o;

    /* JADX INFO: renamed from: p */
    public final C2497a f31383p;

    /* JADX INFO: renamed from: q */
    public final j13 f31384q;

    /* JADX INFO: renamed from: r */
    public final C1385g f31385r;

    /* JADX INFO: renamed from: s */
    public final cc4 f31386s;

    /* JADX INFO: renamed from: t */
    public final e23 f31387t;

    /* JADX INFO: renamed from: u */
    public final C1384f f31388u;

    /* JADX INFO: renamed from: v */
    public final C2470a f31389v;

    /* JADX INFO: renamed from: w */
    public final web f31390w;

    /* JADX INFO: renamed from: x */
    public final C2574a f31391x;

    /* JADX INFO: renamed from: y */
    public final og8 f31392y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC3733ws f31393z;

    static {
        List listM23605K = vz1.m23605K(new ac7("0.25x", 0.25f), new ac7("0.5x", 0.5f), new ac7("0.75x", 0.75f), new ac7("1x", 1.0f), new ac7("1.25x", 1.25f), new ac7("1.5x", 1.5f), new ac7("1.75x", 1.75f), new ac7("2x", 2.0f));
        f31340b0 = listM23605K;
        List<ac7> list = listM23605K;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (ac7 ac7Var : list) {
            arrayList.add(new Pair(ac7Var.f487b, Float.valueOf(ac7Var.f486a)));
        }
        f31341c0 = arrayList;
    }

    public C2583a(f41 f41Var, C2260a c2260a, C2595a c2595a, p33 p33Var, C2507a c2507a, C2469a c2469a, C2266c c2266c, C2597c c2597c, C2596b c2596b, C2268b c2268b, C2472b c2472b, ck6 ck6Var, ck6 ck6Var2, C2498b c2498b, zl3 zl3Var, C2497a c2497a, j13 j13Var, C1385g c1385g, cc4 cc4Var, r23 r23Var, e23 e23Var, C1384f c1384f, C2470a c2470a, web webVar, C2574a c2574a, y15 y15Var, og8 og8Var, InterfaceC3733ws interfaceC3733ws, xa2 xa2Var, nha nhaVar, C1533a c1533a, C1536d c1536d, vj6 vj6Var, sca scaVar, cma cmaVar, bia biaVar, nl8 nl8Var) {
        f41Var.getClass();
        c2260a.getClass();
        c18 c18Var = c2260a.f27957w;
        c2595a.getClass();
        c18 c18Var2 = c2507a.f30380d;
        C3244l c3244l = c2597c.f31571u;
        C3244l c3244l2 = c2597c.f31566p;
        c18 c18Var3 = c2597c.f31558h;
        c18 c18Var4 = c2597c.f31554d;
        c18 c18Var5 = c2597c.f31556f;
        y15Var.getClass();
        og8Var.getClass();
        interfaceC3733ws.getClass();
        scaVar.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f31369b = cmaVar;
        this.f31370c = biaVar;
        this.f31371d = c2260a;
        this.f31372e = c2595a;
        this.f31373f = p33Var;
        this.f31374g = c2469a;
        this.f31375h = c2266c;
        this.f31376i = c2597c;
        this.f31377j = c2596b;
        this.f31378k = c2268b;
        this.f31379l = c2472b;
        this.f31380m = ck6Var;
        this.f31381n = c2498b;
        this.f31382o = zl3Var;
        this.f31383p = c2497a;
        this.f31384q = j13Var;
        this.f31385r = c1385g;
        this.f31386s = cc4Var;
        this.f31387t = e23Var;
        this.f31388u = c1384f;
        this.f31389v = c2470a;
        this.f31390w = webVar;
        this.f31391x = c2574a;
        this.f31392y = og8Var;
        this.f31393z = interfaceC3733ws;
        this.f31342A = xa2Var;
        this.f31343B = nhaVar;
        this.f31344C = c1533a;
        this.f31345D = c1536d;
        this.f31346E = vj6Var;
        this.f31347F = scaVar;
        h08.Companion.getClass();
        if (!nl8Var.m17487a("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        if (num == null) {
            C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("courseId") && ((Integer) nl8Var.m17488b("courseId")) == null) {
            C3386nv.m17626m("Argument \"courseId\" of type integer does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("courseTitle") && ((String) nl8Var.m17488b("courseTitle")) == null) {
            C3386nv.m17626m("Argument \"courseTitle\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (nl8Var.m17487a("isSentenceMode") && ((Boolean) nl8Var.m17488b("isSentenceMode")) == null) {
            C3386nv.m17626m("Argument \"isSentenceMode\" of type boolean does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("lessonLanguageFromDeeplink") && ((String) nl8Var.m17488b("lessonLanguageFromDeeplink")) == null) {
            C3386nv.m17626m("Argument \"lessonLanguageFromDeeplink\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (!nl8Var.m17487a("lessonPath")) {
            C3386nv.m17626m("Required argument \"lessonPath\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class) && !Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        int iIntValue = num.intValue();
        this.f31348G = iIntValue;
        mv7 mv7Var = new mv7(c2469a.f29843i, 24);
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(mv7Var, g41VarM16103C, c3243k, new ac7());
        this.f31353L = c2469a.f29839e;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new dsa());
        this.f31354M = c3244lM17114d;
        this.f31355N = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), c3243k, new dsa());
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f31356O = c3244lM17114d2;
        this.f31357P = c2268b.f28175h;
        this.f31358Q = c2268b.f28172e.f28216e;
        c18 c18Var6 = c2595a.f31538o;
        this.f31359R = c18Var6;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(new C3228h(c18Var3, c3244lM17114d2, new ReaderVideoComposeViewModel$activeScrollIndex$1(3, null)), lda.m16103C(this), c3243k, null);
        this.f31360S = c18VarM15520B2;
        this.f31361T = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c18Var6, c18Var3, c3244lM17114d2, c2595a.f31540q, AbstractC3224d.m15536o(new mv7(c18Var, 25)), new ReaderVideoComposeViewModel$readerBarState$2(null)), lda.m16103C(this), c3243k, bu7.f9026a);
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(new wz0(16, ((cma) ck6Var2.f10194b).mo4572B0(), ck6Var2), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(new C3228h(c18Var, c18Var5, new ReaderVideoComposeViewModel$lessonEditState$1(this, null)), lda.m16103C(this), c3243k, new v15(0, false, false));
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(new mv7(c18Var, 26)), lda.m16103C(this), c3243k, Boolean.FALSE);
        this.f31362U = c18VarM15520B5;
        this.f31363V = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c18Var6, c18Var, c18VarM15520B5, c3244l2, AbstractC3224d.m15520B(AbstractC3224d.m15536o(new cx1(AbstractC3224d.m15520B(cc4Var.m4513n(iIntValue), lda.m16103C(this), c3243k, null), 7)), lda.m16103C(this), c3243k, null), new ReaderVideoComposeViewModel$consolidatedContentState$1(this, null)), lda.m16103C(this), c3243k, new tpa(EmptyList.f47638a, "", "", "", "", "", true, false, false, null));
        this.f31364W = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c18Var5, c18VarM15520B2, (c18) p33Var.f55514c, c2597c.f31561k, new C3228h(c2469a.f29844j, AbstractC3224d.m15536o(new mv7(c18Var4, 27)), new ReaderVideoComposeViewModel$textState$2(3, null)), new ReaderVideoComposeViewModel$textState$3(this, null)), lda.m16103C(this), c3243k, new wz7(null, null, null, null, null, AudioUnderlineMode.Wave, false, "", false));
        this.f31365X = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c2266c.f28150f, AbstractC3224d.m15536o(new mv7(c18Var, 28)), AbstractC3224d.m15536o(new mv7(c18Var2, 29)), new ReaderVideoComposeViewModel$translationState$3(4, null)), lda.m16103C(this), c3243k, new e08(AbstractC3194a.m15360M(), AbstractC3194a.m15360M()));
        this.f31366Y = AbstractC3224d.m15520B(AbstractC3224d.m15531j(c18VarM15520B3, c18VarM15520B4, AbstractC3224d.m15536o(new p08(c18Var, 1)), AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new p08(c18Var, 0)), new ReaderVideoComposeViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, new ap1(false, false)), new ReaderVideoComposeViewModel$menuState$2(this, null)), lda.m16103C(this), c3243k, new hx7(null, null, null, false, false, false, 255));
        this.f31367Z = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c18Var4, c18VarM15520B, c3244l2, new ReaderVideoComposeViewModel$consolidatedPlayerState$1(this, null)), lda.m16103C(this), c3243k, new hqa());
        m24153Q2(f41Var);
        AbstractC3224d.m15545x(new m83(new C3540rl(AbstractC3224d.m15536o(new mv7(c18Var, 23)), 5), new ReaderVideoComposeViewModel$2(this, null), 2), lda.m16103C(this));
        String strMo4589b2 = cmaVar.mo4589b2();
        String strMo4580K1 = cmaVar.mo4580K1();
        ((C1240a) ((hm5) webVar.f66742a)).m7025f("Video mode opened", null);
        y15Var.mo46F0(ReaderMode.Video);
        c2574a.m9499g(iIntValue, strMo4589b2);
        c2574a.m9503n(TrackingPauseReason.SessionBackground, true, true, true);
        c2595a.m9524f(iIntValue, strMo4589b2);
        C3244l c3244l3 = c2507a.f30378b;
        c3244l3.getClass();
        c3244l3.m15572j(null, strMo4589b2);
        strMo4580K1.getClass();
        c2266c.f28151g = strMo4589b2;
        c2266c.f28152h = strMo4580K1;
        c2266c.f28153i = iIntValue;
        C3244l c3244l4 = c2266c.f28149e;
        Map mapM15360M = AbstractC3194a.m15360M();
        c3244l4.getClass();
        c3244l4.m15572j(null, mapM15360M);
        c2597c.m9526a(iIntValue);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new mv7(AbstractC3224d.m15536o(((C1296l) r23Var.f58517a).m7314i(iIntValue)), 17)), new ReaderVideoComposeViewModel$observePlaybackInterval$2(2, c2597c, C2597c.class, "updatePlaybackInterval", "updatePlaybackInterval(Lcom/lingq/core/player/data/PlaybackInterval;)V", 4), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$3(this, strMo4589b2, null), 3);
        c2596b.f31546f = strMo4589b2;
        c2596b.f31547g = iIntValue;
        c2596b.f31543c.clear();
        C3244l c3244l5 = c2596b.f31544d;
        Map mapM15360M2 = AbstractC3194a.m15360M();
        c3244l5.getClass();
        c3244l5.m15572j(null, mapM15360M2);
        c2596b.f31549i.m15571i(null);
        c2596b.f31550j.m15571i(i84.f43682d);
        c2596b.f31548h = false;
        c2596b.m9525a(c18Var6);
        c2268b.m9278a(iIntValue, strMo4589b2);
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3228h(c18Var6, c18VarM15520B2, new ReaderVideoComposeViewModel$observeLessonStudyTracking$1(this, null))), new ReaderVideoComposeViewModel$observeLessonStudyTracking$2(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3228h(c18Var4, c3244l, new ReaderVideoComposeViewModel$observeLessonStudyTracking$3(3, null))), new ReaderVideoComposeViewModel$observeLessonStudyTracking$4(2, c2574a, C2574a.class, "updatePlayback", "updatePlayback(Lcom/lingq/feature/reader/tracking/LessonPlaybackSnapshot;)V", 4), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3228h(c18Var4, c3244l, new ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$1(3, null))), new ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2(this, null), 2), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$loadLesson$1(this, null), 3);
        AbstractC3224d.m15545x(AbstractC3224d.m15532k(AbstractC3224d.m15536o(new mv7(c18Var4, 20)), c18Var6, c18VarM15520B, new ReaderVideoComposeViewModel$observeVideoPosition$2(this, null)), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3540rl(c18Var5, 5)), new ReaderVideoComposeViewModel$observeVideoPosition$3(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c18Var5, new ReaderVideoComposeViewModel$observeActiveSentenceForLipp$1(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c18Var5, new ReaderVideoComposeViewModel$observeActiveSentenceTranslations$1(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new mv7(AbstractC3224d.m15536o(new mv7(c18Var2, 19)), 18), new ReaderVideoComposeViewModel$observeSentenceTranslationSetting$3(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new wz0(24, new mv7(c18Var4, 21), this), new ReaderVideoComposeViewModel$observeVideoProgressForSaving$3(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3540rl(c18Var5, 5)), new ReaderVideoComposeViewModel$observeActiveSentenceBookmark$1(this, null), 2), lda.m16103C(this));
        AbstractC3224d.m15545x(new C3228h(c18Var3, c3244lM17114d2, new ReaderVideoComposeViewModel$clearPreviewWhenVideoCatchesUp$1(this, null)), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$resolveBookmarkPosition$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f31369b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f31369b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f31369b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f31369b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f31369b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f31369b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f31369b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f31369b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f31369b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f31369b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f31369b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f31370c.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f31369b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f31369b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f31369b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f31369b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f31369b.mo4586T0();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        m9512Y2();
        this.f31391x.m9505p();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9509V2(qra qraVar) {
        int i;
        qraVar.getClass();
        if (qraVar.equals(cra.f34434a)) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$refreshLesson$1(this, null), 3);
            return;
        }
        boolean zEquals = qraVar.equals(jra.f46048a);
        cma cmaVar = this.f31369b;
        if (zEquals) {
            Lesson lesson = ((yz4) ((C3244l) this.f31371d.f27957w.f9311a).getValue()).f70667a;
            if (lesson == null || (i = lesson.f19149h) <= 0) {
                return;
            }
            String strMo4589b2 = cmaVar.mo4589b2();
            if (vk9.m23391n0(strMo4589b2)) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$toggleCourseSubscription$1(this, i, strMo4589b2, null), 3);
            return;
        }
        boolean z = qraVar instanceof ora;
        C2597c c2597c = this.f31376i;
        if (z) {
            j2c j2cVar = ((ora) qraVar).f54799a;
            if (j2cVar instanceof ia7) {
                float f = ((ia7) j2cVar).f43861e;
                C3244l c3244l = c2597c.f31553c;
                c3244l.m15572j(null, hqa.m13434a((hqa) c3244l.getValue(), (long) (f * 1000.0f), 0L, false, 126));
                return;
            }
            if (j2cVar instanceof la7) {
                float f2 = ((la7) j2cVar).f49369e;
                C3244l c3244l2 = c2597c.f31553c;
                c3244l2.m15572j(null, hqa.m13434a((hqa) c3244l2.getValue(), 0L, (long) (f2 * 1000.0f), false, 125));
                return;
            }
            if (j2cVar instanceof xa7) {
                C3244l c3244l3 = c2597c.f31553c;
                c3244l3.m15572j(null, hqa.m13434a((hqa) c3244l3.getValue(), 0L, 0L, true, 123));
                c2597c.f31564n = true;
                return;
            } else if (j2cVar instanceof ua7) {
                C3244l c3244l4 = c2597c.f31553c;
                c3244l4.m15572j(null, hqa.m13434a((hqa) c3244l4.getValue(), 0L, 0L, false, 123));
                c2597c.f31560j.m15571i(null);
                return;
            } else if (j2cVar instanceof cb7) {
                C3244l c3244l5 = c2597c.f31553c;
                c3244l5.m15572j(null, hqa.m13434a((hqa) c3244l5.getValue(), 0L, 0L, false, 119));
                return;
            } else {
                if (j2cVar instanceof fb7) {
                    return;
                }
                gm5.m12750e();
                return;
            }
        }
        boolean z2 = qraVar instanceof lra;
        C2574a c2574a = this.f31391x;
        p33 p33Var = this.f31373f;
        if (z2) {
            c2574a.m9503n(TrackingPauseReason.Interaction, true, true, true);
            if (((bx7) ((C3244l) ((c18) p33Var.f55514c).f9311a).getValue()).f9137a == null) {
                p33Var.m18879X(((hqa) ((C3244l) c2597c.f31554d.f9311a).getValue()).f42795c);
            }
            lra lraVar = (lra) qraVar;
            xz7 xz7Var = lraVar.f50048b;
            int i2 = lraVar.f50047a;
            int i3 = xz7Var.f69004a;
            C3244l c3244l6 = c2597c.f31559i;
            Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
            c3244l6.getClass();
            c3244l6.m15572j(null, pair);
            p33Var.m18878W(xz7Var, lraVar.f50050d);
            m9510W2(xz7Var.f69009f);
            return;
        }
        if (qraVar instanceof xqa) {
            c2574a.m9503n(TrackingPauseReason.Interaction, true, true, true);
            p33Var.m18877V(((xqa) qraVar).f68550a);
            return;
        }
        if (qraVar instanceof ira) {
            c2574a.m9503n(TrackingPauseReason.Interaction, true, true, true);
            p33Var.m18875T();
            return;
        }
        if (qraVar instanceof mqa) {
            c2574a.m9503n(TrackingPauseReason.Interaction, false, true, true);
            p33Var.m18866H();
            C3244l c3244l7 = c2597c.f31559i;
            Pair pair2 = new Pair(-1, null);
            c3244l7.getClass();
            c3244l7.m15572j(null, pair2);
            return;
        }
        boolean z3 = qraVar instanceof kra;
        web webVar = this.f31390w;
        if (z3) {
            C2266c c2266c = this.f31375h;
            Map map = (Map) ((C3244l) c2266c.f28150f.f9311a).getValue();
            int i4 = ((kra) qraVar).f48371a;
            qx8 qx8Var = (qx8) map.get(Integer.valueOf(i4));
            if (qx8Var == null || !qx8Var.f58340a) {
                ((C1240a) ((hm5) webVar.f66742a)).m7025f("Sentence translation viewed", g9a.m12429f("translation location", "video mode"));
            }
            c2266c.m9276e(i4);
            return;
        }
        if (qraVar instanceof uqa) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderVideoComposeViewModel$markSentenceKnown$1(this, ((uqa) qraVar).f64233a, null), 3);
            return;
        }
        boolean z4 = qraVar instanceof sqa;
        C2595a c2595a = this.f31372e;
        if (z4) {
            Integer numM9523e = c2595a.m9523e(((sqa) qraVar).f61270a);
            if (numM9523e != null) {
                m9510W2(numM9523e.intValue());
                return;
            }
            return;
        }
        if (qraVar instanceof dra) {
            Set set = ((dra) qraVar).f36118b;
            if (set.isEmpty()) {
                return;
            }
            og8 og8Var = this.f31392y;
            og8Var.getClass();
            og8Var.f54320a = set;
            return;
        }
        if (qraVar.equals(bra.f8903a)) {
            return;
        }
        boolean z5 = qraVar instanceof zqa;
        C3244l c3244l8 = this.f31356O;
        if (z5) {
            c3244l8.m15571i(m9511X2(((zqa) qraVar).f71988a));
            return;
        }
        if (qraVar instanceof ara) {
            c3244l8.m15571i(m9511X2(((ara) qraVar).f7407a));
            return;
        }
        boolean z6 = qraVar instanceof nra;
        C3244l c3244l9 = this.f31354M;
        if (z6) {
            dsa dsaVarM10615a = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, false, ((nra) qraVar).f53174a, 15);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a);
            return;
        }
        if (qraVar.equals(hra.f42848a)) {
            c2574a.m9503n(TrackingPauseReason.Settings, true, true, true);
            dsa dsaVarM10615a2 = dsa.m10615a((dsa) c3244l9.getValue(), true, false, false, false, null, 30);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a2);
            return;
        }
        if (qraVar.equals(rqa.f59729a)) {
            c2574a.m9503n(TrackingPauseReason.Settings, false, true, true);
            dsa dsaVarM10615a3 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, false, null, 30);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a3);
            return;
        }
        if (qraVar.equals(fra.f39534a)) {
            c2574a.m9503n(TrackingPauseReason.Menu, true, true, true);
            dsa dsaVarM10615a4 = dsa.m10615a((dsa) c3244l9.getValue(), false, true, false, false, null, 29);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a4);
            return;
        }
        if (qraVar.equals(pqa.f56698a)) {
            c2574a.m9503n(TrackingPauseReason.Menu, false, true, true);
            dsa dsaVarM10615a5 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, false, null, 29);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a5);
            return;
        }
        if (qraVar.equals(gra.f41250a)) {
            c2574a.m9503n(TrackingPauseReason.ReviewMenu, true, true, true);
            dsa dsaVarM10615a6 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, true, false, null, 27);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a6);
            return;
        }
        if (qraVar.equals(qqa.f58091a)) {
            c2574a.m9503n(TrackingPauseReason.ReviewMenu, false, true, true);
            dsa dsaVarM10615a7 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, false, null, 27);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a7);
            return;
        }
        if (qraVar instanceof pra) {
            pra praVar = (pra) qraVar;
            int i5 = praVar.f56732a;
            int i6 = praVar.f56733b;
            C3244l c3244l10 = this.f31377j.f31550j;
            i84 i84Var = new i84(i5, i6, 1);
            c3244l10.getClass();
            c3244l10.m15572j(null, i84Var);
            return;
        }
        if (qraVar instanceof era) {
            this.f31374g.m9372b(((era) qraVar).f37760a);
            return;
        }
        if (qraVar.equals(nqa.f53153a)) {
            ((C1240a) ((hm5) webVar.f66742a)).m7025f("Video landscape view opened", null);
            dsa dsaVarM10615a8 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, true, null, 23);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a8);
            return;
        }
        if (qraVar.equals(oqa.f54761a)) {
            dsa dsaVarM10615a9 = dsa.m10615a((dsa) c3244l9.getValue(), false, false, false, false, null, 23);
            c3244l9.getClass();
            c3244l9.m15572j(null, dsaVarM10615a9);
            return;
        }
        boolean z7 = qraVar instanceof mra;
        C2268b c2268b = this.f31378k;
        if (z7) {
            c2268b.m9279b(((mra) qraVar).f51780a);
            return;
        }
        if (qraVar.equals(lqa.f50017a)) {
            c2268b.m9279b(0);
            return;
        }
        if (qraVar.equals(kqa.f48344a)) {
            c2268b.f28172e.m9283a();
            return;
        }
        if (qraVar.equals(jqa.f46016a)) {
            C2272a c2272a = c2268b.f28172e;
            pg9 pg9Var = c2272a.f28217f;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            c2272a.f28217f = null;
            return;
        }
        boolean zEquals2 = qraVar.equals(tqa.f62742a);
        int i7 = this.f31348G;
        if (zEquals2) {
            if (((Boolean) ((C3244l) this.f31362U.f9311a).getValue()).booleanValue()) {
                return;
            }
            Map map2 = (Map) ((C3244l) c2595a.f31535l.f9311a).getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (fa4.m11650l(((LessonWord) entry.getValue()).f19322i, WordStatus.New.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List listM22622n1 = u91.m22622n1(linkedHashMap.keySet());
            c2574a.m9501j();
            this.f31389v.m9373a(i7, cmaVar.mo4589b2(), listM22622n1);
            return;
        }
        boolean zEquals3 = qraVar.equals(wqa.f67194a);
        ck6 ck6Var = this.f31380m;
        if (zEquals3) {
            this.f31350I = true;
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("[LessonTracking] ReaderVideoComposeViewModel.OnSessionResume lessonId=" + i7, new Object[0]);
            c2574a.m9503n(TrackingPauseReason.SessionBackground, false, true, true);
            ((y15) ck6Var.f10194b).mo47b(new DateTime());
            boolean z8 = ((hqa) ((C3244l) c2597c.f31554d.f9311a).getValue()).f42795c;
            InterfaceC3733ws interfaceC3733ws = this.f31393z;
            if (z8) {
                if (this.f31352K) {
                    return;
                }
                interfaceC3733ws.mo9033o1(AppUsageType.Listening, Integer.valueOf(i7));
                this.f31352K = true;
                return;
            }
            if (this.f31351J) {
                return;
            }
            interfaceC3733ws.mo9033o1(AppUsageType.Reading, Integer.valueOf(i7));
            this.f31351J = true;
            return;
        }
        if (!qraVar.equals(vqa.f65799a)) {
            if (!qraVar.equals(yqa.f70302a)) {
                gm5.m12750e();
                return;
            }
            c2574a.m9503n(TrackingPauseReason.SessionBackground, true, true, true);
            m9512Y2();
            this.f31349H = LqAnalyticsValues$LessonExitPath.QuitLesson;
            return;
        }
        this.f31350I = false;
        sm5.Companion.getClass();
        h0a.f41641a.mo11431b("[LessonTracking] ReaderVideoComposeViewModel.OnSessionBackground lessonId=" + i7, new Object[0]);
        c2574a.m9503n(TrackingPauseReason.SessionBackground, true, true, true);
        m9512Y2();
        LqAnalyticsValues$LessonExitPath lqAnalyticsValues$LessonExitPath = this.f31349H;
        if (lqAnalyticsValues$LessonExitPath == null) {
            lqAnalyticsValues$LessonExitPath = LqAnalyticsValues$LessonExitPath.BackgroundedLingq;
        }
        ck6Var.getClass();
        lqAnalyticsValues$LessonExitPath.getClass();
        ((y15) ck6Var.f10194b).mo50y(lqAnalyticsValues$LessonExitPath);
        this.f31349H = null;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9510W2(int i) {
        g41 g41VarM16103C = lda.m16103C(this);
        wl6 wl6Var = wl6.f67013b;
        ReaderVideoComposeViewModel$saveBookmark$1 readerVideoComposeViewModel$saveBookmark$1 = new ReaderVideoComposeViewModel$saveBookmark$1(this, i, null);
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        wl6Var.getClass();
        wfb.m23925t(g41VarM16103C, wl6Var, coroutineStart, readerVideoComposeViewModel$saveBookmark$1);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f31369b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final Integer m9511X2(int i) {
        List list = (List) ((C3244l) this.f31359R.f9311a).getValue();
        if (list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(l70.m15945h(i - 1, 0, list.size() - 1));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9512Y2() {
        boolean z = this.f31351J;
        InterfaceC3733ws interfaceC3733ws = this.f31393z;
        if (z) {
            interfaceC3733ws.mo9034v0(AppUsageType.Reading);
            this.f31351J = false;
        }
        if (this.f31352K) {
            interfaceC3733ws.mo9034v0(AppUsageType.Listening);
            this.f31352K = false;
        }
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f31370c.mo3738Z();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f31369b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f31369b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f31369b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f31369b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f31370c.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f31370c.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f31369b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f31369b.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f31370c.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f31369b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f31370c.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f31369b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f31369b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f31369b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f31369b.mo4598w2();
    }
}
