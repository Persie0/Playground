package com.lingq.feature.reader.old;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.analytics.data.modules.ReaderMode;
import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.network.C1262a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonStatus;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.milestones.GoalMetType;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.playlist.C1518a;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerViewState;
import com.lingq.core.player.service.PlayingFrom;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.reader.content.domain.C2262a;
import com.lingq.feature.reader.rating.p016ui.RatingContentType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.InterfaceC3812yx;
import p000.ao0;
import p000.ar7;
import p000.bia;
import p000.bz5;
import p000.c13;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cx1;
import p000.cz5;
import p000.d65;
import p000.dc7;
import p000.do7;
import p000.du0;
import p000.e25;
import p000.e65;
import p000.e7a;
import p000.ea7;
import p000.eh9;
import p000.fa4;
import p000.g25;
import p000.g41;
import p000.gm5;
import p000.go3;
import p000.h24;
import p000.h25;
import p000.hm5;
import p000.hy3;
import p000.j25;
import p000.j7b;
import p000.km7;
import p000.l3a;
import p000.lda;
import p000.lx7;
import p000.mk0;
import p000.my5;
import p000.n23;
import p000.n2c;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.nz9;
import p000.o23;
import p000.o7b;
import p000.og8;
import p000.oo4;
import p000.ox7;
import p000.pg9;
import p000.pk9;
import p000.qn6;
import p000.r08;
import p000.s08;
import p000.s7b;
import p000.sca;
import p000.si7;
import p000.t08;
import p000.t79;
import p000.tb7;
import p000.tw7;
import p000.u66;
import p000.u91;
import p000.ui3;
import p000.um5;
import p000.un1;
import p000.v91;
import p000.va3;
import p000.vd7;
import p000.vk9;
import p000.vma;
import p000.vs3;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.x45;
import p000.x65;
import p000.xd7;
import p000.xfa;
import p000.xi9;
import p000.xo1;
import p000.xy5;
import p000.xz7;
import p000.y02;
import p000.y15;
import p000.y5a;
import p000.y95;
import p000.ym5;
import p000.yx4;
import p000.yz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2412n extends wta implements cma, l3a, dc7, InterfaceC3812yx, cz5, mk0, va3, bz5, bia, e7a, InterfaceC3733ws, qn6, y15, ar7 {

    /* JADX INFO: renamed from: A */
    public final o23 f29259A;

    /* JADX INFO: renamed from: A0 */
    public final c18 f29260A0;

    /* JADX INFO: renamed from: A1 */
    public final du0 f29261A1;

    /* JADX INFO: renamed from: B */
    public final C1518a f29262B;

    /* JADX INFO: renamed from: B0 */
    public final C3244l f29263B0;

    /* JADX INFO: renamed from: B1 */
    public final C3211a f29264B1;

    /* JADX INFO: renamed from: C */
    public final C2262a f29265C;

    /* JADX INFO: renamed from: C0 */
    public final C3244l f29266C0;

    /* JADX INFO: renamed from: C1 */
    public final du0 f29267C1;

    /* JADX INFO: renamed from: D */
    public final my5 f29268D;

    /* JADX INFO: renamed from: D0 */
    public final C3244l f29269D0;

    /* JADX INFO: renamed from: D1 */
    public final C3211a f29270D1;

    /* JADX INFO: renamed from: E */
    public final si7 f29271E;

    /* JADX INFO: renamed from: E0 */
    public final c18 f29272E0;

    /* JADX INFO: renamed from: E1 */
    public final du0 f29273E1;

    /* JADX INFO: renamed from: F */
    public final nm7 f29274F;

    /* JADX INFO: renamed from: F0 */
    public final C3244l f29275F0;

    /* JADX INFO: renamed from: F1 */
    public final C3211a f29276F1;

    /* JADX INFO: renamed from: G */
    public final vma f29277G;

    /* JADX INFO: renamed from: G0 */
    public final C3244l f29278G0;

    /* JADX INFO: renamed from: G1 */
    public final du0 f29279G1;

    /* JADX INFO: renamed from: H */
    public final C3509qs f29280H;

    /* JADX INFO: renamed from: H0 */
    public final c18 f29281H0;

    /* JADX INFO: renamed from: H1 */
    public final C3244l f29282H1;

    /* JADX INFO: renamed from: I */
    public final og8 f29283I;

    /* JADX INFO: renamed from: I0 */
    public final c18 f29284I0;

    /* JADX INFO: renamed from: I1 */
    public final C3211a f29285I1;

    /* JADX INFO: renamed from: J */
    public final sca f29286J;

    /* JADX INFO: renamed from: J0 */
    public final c18 f29287J0;

    /* JADX INFO: renamed from: J1 */
    public final du0 f29288J1;

    /* JADX INFO: renamed from: K */
    public final C1808b f29289K;

    /* JADX INFO: renamed from: K0 */
    public final c18 f29290K0;

    /* JADX INFO: renamed from: K1 */
    public final C3211a f29291K1;

    /* JADX INFO: renamed from: L */
    public final hm5 f29292L;

    /* JADX INFO: renamed from: L0 */
    public final c18 f29293L0;

    /* JADX INFO: renamed from: L1 */
    public final C3244l f29294L1;

    /* JADX INFO: renamed from: M */
    public final C1262a f29295M;

    /* JADX INFO: renamed from: M0 */
    public final C3244l f29296M0;

    /* JADX INFO: renamed from: M1 */
    public final c18 f29297M1;

    /* JADX INFO: renamed from: N */
    public final C1530a f29298N;

    /* JADX INFO: renamed from: N0 */
    public final c18 f29299N0;

    /* JADX INFO: renamed from: N1 */
    public final C3211a f29300N1;

    /* JADX INFO: renamed from: O */
    public final nn1 f29301O;

    /* JADX INFO: renamed from: O0 */
    public final r08 f29302O0;

    /* JADX INFO: renamed from: O1 */
    public final du0 f29303O1;

    /* JADX INFO: renamed from: P */
    public final un1 f29304P;

    /* JADX INFO: renamed from: P0 */
    public final C3244l f29305P0;

    /* JADX INFO: renamed from: P1 */
    public final C3244l f29306P1;

    /* JADX INFO: renamed from: Q */
    public final tw7 f29307Q;

    /* JADX INFO: renamed from: Q0 */
    public final C3244l f29308Q0;

    /* JADX INFO: renamed from: Q1 */
    public final c18 f29309Q1;

    /* JADX INFO: renamed from: R */
    public final C3244l f29310R;

    /* JADX INFO: renamed from: R0 */
    public final c18 f29311R0;

    /* JADX INFO: renamed from: R1 */
    public pg9 f29312R1;

    /* JADX INFO: renamed from: S */
    public final C3244l f29313S;

    /* JADX INFO: renamed from: S0 */
    public final C3244l f29314S0;

    /* JADX INFO: renamed from: S1 */
    public pg9 f29315S1;

    /* JADX INFO: renamed from: T */
    public final C3244l f29316T;

    /* JADX INFO: renamed from: T0 */
    public final c18 f29317T0;

    /* JADX INFO: renamed from: T1 */
    public pg9 f29318T1;

    /* JADX INFO: renamed from: U */
    public final c18 f29319U;

    /* JADX INFO: renamed from: U0 */
    public final C3244l f29320U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f29321U1;

    /* JADX INFO: renamed from: V */
    public final C3244l f29322V;

    /* JADX INFO: renamed from: V0 */
    public final c18 f29323V0;

    /* JADX INFO: renamed from: V1 */
    public final C3244l f29324V1;

    /* JADX INFO: renamed from: W */
    public final C3244l f29325W;

    /* JADX INFO: renamed from: W0 */
    public final C3211a f29326W0;

    /* JADX INFO: renamed from: W1 */
    public final C3244l f29327W1;

    /* JADX INFO: renamed from: X */
    public final C3211a f29328X;

    /* JADX INFO: renamed from: X0 */
    public final du0 f29329X0;

    /* JADX INFO: renamed from: X1 */
    public final c18 f29330X1;

    /* JADX INFO: renamed from: Y */
    public final du0 f29331Y;

    /* JADX INFO: renamed from: Y0 */
    public final C3211a f29332Y0;

    /* JADX INFO: renamed from: Y1 */
    public final c18 f29333Y1;

    /* JADX INFO: renamed from: Z */
    public final Locale f29334Z;

    /* JADX INFO: renamed from: Z0 */
    public final du0 f29335Z0;

    /* JADX INFO: renamed from: Z1 */
    public final C3244l f29336Z1;

    /* JADX INFO: renamed from: a0 */
    public final String f29337a0;

    /* JADX INFO: renamed from: a1 */
    public boolean f29338a1;

    /* JADX INFO: renamed from: a2 */
    public final C3244l f29339a2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f29340b;

    /* JADX INFO: renamed from: b0 */
    public Long f29341b0;

    /* JADX INFO: renamed from: b1 */
    public final C3244l f29342b1;

    /* JADX INFO: renamed from: b2 */
    public final C3244l f29343b2;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l3a f29344c;

    /* JADX INFO: renamed from: c0 */
    public final C3244l f29345c0;

    /* JADX INFO: renamed from: c1 */
    public final c18 f29346c1;

    /* JADX INFO: renamed from: c2 */
    public final C3244l f29347c2;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dc7 f29348d;

    /* JADX INFO: renamed from: d0 */
    public final c18 f29349d0;

    /* JADX INFO: renamed from: d1 */
    public final C3244l f29350d1;

    /* JADX INFO: renamed from: d2 */
    public final du0 f29351d2;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3812yx f29352e;

    /* JADX INFO: renamed from: e0 */
    public final c18 f29353e0;

    /* JADX INFO: renamed from: e1 */
    public final c18 f29354e1;

    /* JADX INFO: renamed from: e2 */
    public final C3211a f29355e2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cz5 f29356f;

    /* JADX INFO: renamed from: f0 */
    public final C3244l f29357f0;

    /* JADX INFO: renamed from: f1 */
    public final c18 f29358f1;

    /* JADX INFO: renamed from: f2 */
    public final du0 f29359f2;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ mk0 f29360g;

    /* JADX INFO: renamed from: g0 */
    public final c18 f29361g0;

    /* JADX INFO: renamed from: g1 */
    public final C3244l f29362g1;

    /* JADX INFO: renamed from: g2 */
    public final c18 f29363g2;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ va3 f29364h;

    /* JADX INFO: renamed from: h0 */
    public final c18 f29365h0;

    /* JADX INFO: renamed from: h1 */
    public final c18 f29366h1;

    /* JADX INFO: renamed from: h2 */
    public final c18 f29367h2;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ bz5 f29368i;

    /* JADX INFO: renamed from: i0 */
    public final c18 f29369i0;

    /* JADX INFO: renamed from: i1 */
    public final c18 f29370i1;

    /* JADX INFO: renamed from: i2 */
    public final c18 f29371i2;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ bia f29372j;

    /* JADX INFO: renamed from: j0 */
    public final c18 f29373j0;

    /* JADX INFO: renamed from: j1 */
    public final C3244l f29374j1;

    /* JADX INFO: renamed from: j2 */
    public final c18 f29375j2;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ e7a f29376k;

    /* JADX INFO: renamed from: k0 */
    public final c18 f29377k0;

    /* JADX INFO: renamed from: k1 */
    public final c18 f29378k1;

    /* JADX INFO: renamed from: k2 */
    public final C3244l f29379k2;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3733ws f29380l;

    /* JADX INFO: renamed from: l0 */
    public final C3244l f29381l0;

    /* JADX INFO: renamed from: l1 */
    public final C3244l f29382l1;

    /* JADX INFO: renamed from: l2 */
    public final c18 f29383l2;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ qn6 f29384m;

    /* JADX INFO: renamed from: m0 */
    public final c18 f29385m0;

    /* JADX INFO: renamed from: m1 */
    public final C3211a f29386m1;

    /* JADX INFO: renamed from: m2 */
    public final C3244l f29387m2;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ y15 f29388n;

    /* JADX INFO: renamed from: n0 */
    public final C3244l f29389n0;

    /* JADX INFO: renamed from: n1 */
    public final c18 f29390n1;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ar7 f29391o;

    /* JADX INFO: renamed from: o0 */
    public final C3244l f29392o0;

    /* JADX INFO: renamed from: o1 */
    public final c18 f29393o1;

    /* JADX INFO: renamed from: p */
    public final d65 f29394p;

    /* JADX INFO: renamed from: p0 */
    public final c18 f29395p0;

    /* JADX INFO: renamed from: p1 */
    public final c18 f29396p1;

    /* JADX INFO: renamed from: q */
    public final xd7 f29397q;

    /* JADX INFO: renamed from: q0 */
    public final C3211a f29398q0;

    /* JADX INFO: renamed from: q1 */
    public final c18 f29399q1;

    /* JADX INFO: renamed from: r */
    public final ao0 f29400r;

    /* JADX INFO: renamed from: r0 */
    public final du0 f29401r0;

    /* JADX INFO: renamed from: r1 */
    public final c18 f29402r1;

    /* JADX INFO: renamed from: s */
    public final s7b f29403s;

    /* JADX INFO: renamed from: s0 */
    public final C3211a f29404s0;

    /* JADX INFO: renamed from: s1 */
    public final C3211a f29405s1;

    /* JADX INFO: renamed from: t */
    public final oo4 f29406t;

    /* JADX INFO: renamed from: t0 */
    public final du0 f29407t0;

    /* JADX INFO: renamed from: t1 */
    public final du0 f29408t1;

    /* JADX INFO: renamed from: u */
    public final C1307w f29409u;

    /* JADX INFO: renamed from: u0 */
    public final C3211a f29410u0;

    /* JADX INFO: renamed from: u1 */
    public final C3211a f29411u1;

    /* JADX INFO: renamed from: v */
    public final y95 f29412v;

    /* JADX INFO: renamed from: v0 */
    public final du0 f29413v0;

    /* JADX INFO: renamed from: v1 */
    public final du0 f29414v1;

    /* JADX INFO: renamed from: w */
    public final xy5 f29415w;

    /* JADX INFO: renamed from: w0 */
    public final C3211a f29416w0;

    /* JADX INFO: renamed from: w1 */
    public final C3244l f29417w1;

    /* JADX INFO: renamed from: x */
    public final km7 f29418x;

    /* JADX INFO: renamed from: x0 */
    public final du0 f29419x0;

    /* JADX INFO: renamed from: x1 */
    public final C3211a f29420x1;

    /* JADX INFO: renamed from: y */
    public final xo1 f29421y;

    /* JADX INFO: renamed from: y0 */
    public final C3244l f29422y0;

    /* JADX INFO: renamed from: y1 */
    public final du0 f29423y1;

    /* JADX INFO: renamed from: z */
    public final n23 f29424z;

    /* JADX INFO: renamed from: z0 */
    public final C3244l f29425z0;

    /* JADX INFO: renamed from: z1 */
    public final C3211a f29426z1;

    public C2412n(d65 d65Var, xd7 xd7Var, ao0 ao0Var, s7b s7bVar, oo4 oo4Var, C1307w c1307w, y95 y95Var, xy5 xy5Var, km7 km7Var, xo1 xo1Var, n23 n23Var, o23 o23Var, C1518a c1518a, C2262a c2262a, my5 my5Var, si7 si7Var, nm7 nm7Var, vma vmaVar, C3509qs c3509qs, og8 og8Var, sca scaVar, C1808b c1808b, hm5 hm5Var, C1262a c1262a, C1530a c1530a, nn1 nn1Var, nn1 nn1Var2, un1 un1Var, cma cmaVar, l3a l3aVar, dc7 dc7Var, InterfaceC3812yx interfaceC3812yx, cz5 cz5Var, mk0 mk0Var, bz5 bz5Var, bia biaVar, e7a e7aVar, InterfaceC3733ws interfaceC3733ws, qn6 qn6Var, y15 y15Var, ar7 ar7Var, va3 va3Var, nl8 nl8Var) {
        Integer num;
        String str;
        Boolean bool;
        tb7 tb7VarM12625d;
        d65Var.getClass();
        xd7Var.getClass();
        ao0Var.getClass();
        s7bVar.getClass();
        oo4Var.getClass();
        c1307w.getClass();
        y95Var.getClass();
        xy5Var.getClass();
        km7Var.getClass();
        xo1Var.getClass();
        si7Var.getClass();
        nm7Var.getClass();
        vmaVar.getClass();
        c3509qs.getClass();
        og8Var.getClass();
        scaVar.getClass();
        c1808b.getClass();
        hm5Var.getClass();
        un1Var.getClass();
        cmaVar.getClass();
        l3aVar.getClass();
        dc7Var.getClass();
        interfaceC3812yx.getClass();
        cz5Var.getClass();
        mk0Var.getClass();
        bz5Var.getClass();
        biaVar.getClass();
        e7aVar.getClass();
        interfaceC3733ws.getClass();
        qn6Var.getClass();
        y15Var.getClass();
        ar7Var.getClass();
        va3Var.getClass();
        nl8Var.getClass();
        this.f29340b = cmaVar;
        this.f29344c = l3aVar;
        this.f29348d = dc7Var;
        this.f29352e = interfaceC3812yx;
        this.f29356f = cz5Var;
        this.f29360g = mk0Var;
        this.f29364h = va3Var;
        this.f29368i = bz5Var;
        this.f29372j = biaVar;
        this.f29376k = e7aVar;
        this.f29380l = interfaceC3733ws;
        this.f29384m = qn6Var;
        this.f29388n = y15Var;
        this.f29391o = ar7Var;
        this.f29394p = d65Var;
        this.f29397q = xd7Var;
        this.f29400r = ao0Var;
        this.f29403s = s7bVar;
        this.f29406t = oo4Var;
        this.f29409u = c1307w;
        this.f29412v = y95Var;
        this.f29415w = xy5Var;
        this.f29418x = km7Var;
        this.f29421y = xo1Var;
        this.f29424z = n23Var;
        this.f29259A = o23Var;
        this.f29262B = c1518a;
        this.f29265C = c2262a;
        this.f29268D = my5Var;
        this.f29271E = si7Var;
        this.f29274F = nm7Var;
        this.f29277G = vmaVar;
        this.f29280H = c3509qs;
        this.f29283I = og8Var;
        this.f29286J = scaVar;
        this.f29289K = c1808b;
        this.f29292L = hm5Var;
        this.f29295M = c1262a;
        this.f29298N = c1530a;
        this.f29301O = nn1Var2;
        this.f29304P = un1Var;
        tw7.Companion.getClass();
        if (!nl8Var.m17487a("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num2 = (Integer) nl8Var.m17488b("lessonId");
        if (num2 == null) {
            C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("courseId")) {
            num = (Integer) nl8Var.m17488b("courseId");
            if (num == null) {
                C3386nv.m17626m("Argument \"courseId\" of type integer does not support null values");
                throw null;
            }
        } else {
            num = -1;
        }
        String str2 = "";
        if (nl8Var.m17487a("courseTitle")) {
            str = (String) nl8Var.m17488b("courseTitle");
            if (str == null) {
                C3386nv.m17626m("Argument \"courseTitle\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        if (nl8Var.m17487a("isSentenceMode")) {
            bool = (Boolean) nl8Var.m17488b("isSentenceMode");
            if (bool == null) {
                C3386nv.m17626m("Argument \"isSentenceMode\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (nl8Var.m17487a("lessonLanguageFromDeeplink") && (str2 = (String) nl8Var.m17488b("lessonLanguageFromDeeplink")) == null) {
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
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = (LqAnalyticsValues$LessonPath) nl8Var.m17488b("lessonPath");
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        this.f29307Q = new tw7(iIntValue, lqAnalyticsValues$LessonPath, iIntValue2, str, zBooleanValue, str2);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(num2);
        this.f29310R = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f29313S = c3244lM17114d2;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        Boolean bool2 = Boolean.FALSE;
        AbstractC3224d.m15520B(c3244lM17114d2, g41VarM16103C, c3243k, bool2);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(-1);
        this.f29316T = c3244lM17114d3;
        this.f29319U = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, -1);
        this.f29322V = AbstractC3352my.m17114d(-1);
        this.f29325W = AbstractC3352my.m17114d(bool2);
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f29328X = c3211aM7042a;
        this.f29331Y = AbstractC3224d.m15519A(c3211aM7042a);
        this.f29334Z = Locale.forLanguageTag(cmaVar.mo4589b2());
        this.f29337a0 = hy3.f43148E.m14766a(new DateTime());
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(null);
        this.f29345c0 = c3244lM17114d4;
        this.f29349d0 = AbstractC3224d.m15520B(c3244lM17114d4, lda.m16103C(this), c3243k, null);
        C1368a c1368a = (C1368a) si7Var;
        this.f29353e0 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(c1368a.f18353K0), new ReaderViewModel$moveToKnown$1(3, null)), lda.m16103C(this), c3243k, bool2);
        this.f29357f0 = AbstractC3352my.m17114d(bool2);
        c18 c18VarM15520B = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18389Z0), lda.m16103C(this), c3243k, "Off");
        this.f29361g0 = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18395b1), lda.m16103C(this), c3243k, "Off");
        this.f29365h0 = c18VarM15520B2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18392a1), lda.m16103C(this), c3243k, "Off");
        this.f29369i0 = c18VarM15520B3;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18398c1), lda.m16103C(this), c3243k, "Off");
        this.f29373j0 = c18VarM15520B4;
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18401d1), lda.m16103C(this), c3243k, "Off");
        this.f29377k0 = c18VarM15520B5;
        c18 c18VarM15520B6 = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1368a.f18387Y0), lda.m16103C(this), c3243k, bool2);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(null);
        this.f29381l0 = c3244lM17114d5;
        this.f29385m0 = AbstractC3224d.m15520B(c3244lM17114d5, lda.m16103C(this), c3243k, null);
        EmptyList emptyList = EmptyList.f47638a;
        this.f29389n0 = AbstractC3352my.m17114d(emptyList);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(bool2);
        this.f29392o0 = c3244lM17114d6;
        this.f29395p0 = AbstractC3224d.m15520B(c3244lM17114d6, lda.m16103C(this), c3243k, bool2);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f29398q0 = c3211aM7042a2;
        this.f29401r0 = AbstractC3224d.m15519A(c3211aM7042a2);
        C3211a c3211aM7042a3 = AbstractC1261a.m7042a();
        this.f29404s0 = c3211aM7042a3;
        this.f29407t0 = AbstractC3224d.m15519A(c3211aM7042a3);
        C3211a c3211aM7042a4 = AbstractC1261a.m7042a();
        this.f29410u0 = c3211aM7042a4;
        this.f29413v0 = AbstractC3224d.m15519A(c3211aM7042a4);
        C3211a c3211aM7042a5 = AbstractC1261a.m7042a();
        this.f29416w0 = c3211aM7042a5;
        this.f29419x0 = AbstractC3224d.m15519A(c3211aM7042a5);
        this.f29422y0 = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(emptyList);
        this.f29425z0 = c3244lM17114d7;
        this.f29260A0 = AbstractC3224d.m15520B(c3244lM17114d7, lda.m16103C(this), c3243k, emptyList);
        this.f29263B0 = AbstractC3352my.m17114d(null);
        this.f29266C0 = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(emptyList);
        this.f29269D0 = c3244lM17114d8;
        this.f29272E0 = AbstractC3224d.m15520B(c3244lM17114d8, lda.m16103C(this), c3243k, emptyList);
        this.f29275F0 = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(new s08(0.0f, false));
        this.f29278G0 = c3244lM17114d9;
        this.f29281H0 = AbstractC3224d.m15520B(c3244lM17114d9, lda.m16103C(this), c3243k, new s08(0.0f, false));
        this.f29284I0 = AbstractC3224d.m15520B(new C3228h(new C3540rl(c3244lM17114d5, 5), new c13(c3244lM17114d8, 7), new ReaderViewModel$lessonPages$2(this, null)), lda.m16103C(this), c3243k, emptyList);
        c18 c18VarM15520B7 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new c13(c3244lM17114d8, 8), new ReaderViewModel$cards$2(this, null)), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f29287J0 = c18VarM15520B7;
        c18 c18VarM15520B8 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new c13(c3244lM17114d8, 9), new ReaderViewModel$words$2(this, null)), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f29290K0 = c18VarM15520B8;
        c18 c18VarM15520B9 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new c13(c3244lM17114d8, 10), new ReaderViewModel$phrases$2(this, null)), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f29293L0 = c18VarM15520B9;
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(bool2);
        this.f29296M0 = c3244lM17114d10;
        this.f29299N0 = AbstractC3224d.m15520B(c3244lM17114d10, lda.m16103C(this), c3243k, bool2);
        this.f29302O0 = new r08(new c83[]{new C3540rl(c3244lM17114d5, 5), new C3540rl(c2262a.m9256a(), 5), AbstractC3224d.m15536o(c1368a.f18466z0), AbstractC3224d.m15536o(c1368a.f18335E0), AbstractC3224d.m15536o(c1368a.f18329C0), c18VarM15520B, c18VarM15520B2, c18VarM15520B3, c18VarM15520B4, c18VarM15520B5, c18VarM15520B6, AbstractC3224d.m15536o(c1368a.f18327B1), AbstractC3224d.m15536o(c1368a.f18324A1)}, this, 1);
        this.f29305P0 = AbstractC3352my.m17114d(emptyList);
        C3244l c3244lM17114d11 = AbstractC3352my.m17114d(emptyList);
        this.f29308Q0 = c3244lM17114d11;
        this.f29311R0 = AbstractC3224d.m15520B(c3244lM17114d11, lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d12 = AbstractC3352my.m17114d(Boolean.valueOf(!zBooleanValue));
        this.f29314S0 = c3244lM17114d12;
        this.f29317T0 = AbstractC3224d.m15520B(c3244lM17114d12, lda.m16103C(this), c3243k, Boolean.valueOf(!zBooleanValue));
        C3244l c3244lM17114d13 = AbstractC3352my.m17114d(bool2);
        this.f29320U0 = c3244lM17114d13;
        this.f29323V0 = AbstractC3224d.m15520B(c3244lM17114d13, lda.m16103C(this), c3243k, bool2);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f29326W0 = c3211aM10525a;
        this.f29329X0 = AbstractC3224d.m15519A(c3211aM10525a);
        C3211a c3211aM7042a6 = AbstractC1261a.m7042a();
        this.f29332Y0 = c3211aM7042a6;
        this.f29335Z0 = AbstractC3224d.m15519A(c3211aM7042a6);
        C3244l c3244lM17114d14 = AbstractC3352my.m17114d(-1);
        this.f29342b1 = c3244lM17114d14;
        this.f29346c1 = AbstractC3224d.m15520B(c3244lM17114d14, lda.m16103C(this), c3243k, -1);
        C3244l c3244lM17114d15 = AbstractC3352my.m17114d(0);
        this.f29350d1 = c3244lM17114d15;
        this.f29354e1 = AbstractC3224d.m15520B(c3244lM17114d15, lda.m16103C(this), c3243k, 0);
        C3244l c3244lM17114d16 = AbstractC3352my.m17114d(bool2);
        this.f29358f1 = AbstractC3224d.m15520B(c3244lM17114d16, lda.m16103C(this), c3243k, bool2);
        C3244l c3244lM17114d17 = AbstractC3352my.m17114d(null);
        this.f29362g1 = c3244lM17114d17;
        this.f29366h1 = AbstractC3224d.m15520B(c3244lM17114d17, lda.m16103C(this), c3243k, null);
        this.f29370i1 = AbstractC3224d.m15520B(new C3228h(c3244lM17114d3, c3244lM17114d8, new ReaderViewModel$pagesInfo$1(3, null)), lda.m16103C(this), c3243k, new Pair(0, 0));
        C3244l c3244lM17114d18 = AbstractC3352my.m17114d(null);
        this.f29374j1 = c3244lM17114d18;
        this.f29378k1 = AbstractC3224d.m15520B(c3244lM17114d18, lda.m16103C(this), c3243k, null);
        this.f29382l1 = AbstractC3352my.m17114d(bool2);
        this.f29386m1 = AbstractC1261a.m7042a();
        this.f29390n1 = AbstractC3224d.m15520B(new C3228h(cmaVar.mo4583O1(), c3244lM17114d5, new ReaderViewModel$showEditSentence$1(3, null)), lda.m16103C(this), c3243k, bool2);
        this.f29393o1 = AbstractC3224d.m15520B(new C3228h(c18VarM15520B7, c18VarM15520B9, new ReaderViewModel$cardsCount$1(3, null)), lda.m16103C(this), c3243k, 0);
        this.f29396p1 = AbstractC3224d.m15520B(new cx1(c18VarM15520B8, 8), lda.m16103C(this), c3243k, -1);
        this.f29399q1 = AbstractC3224d.m15520B(new wz0(25, c18VarM15520B7, this), lda.m16103C(this), c3243k, 0);
        this.f29402r1 = AbstractC3224d.m15520B(new cx1(c18VarM15520B8, 9), lda.m16103C(this), c3243k, emptyList);
        C3211a c3211aM7042a7 = AbstractC1261a.m7042a();
        this.f29405s1 = c3211aM7042a7;
        this.f29408t1 = AbstractC3224d.m15519A(c3211aM7042a7);
        C3211a c3211aM7042a8 = AbstractC1261a.m7042a();
        this.f29411u1 = c3211aM7042a8;
        this.f29414v1 = AbstractC3224d.m15519A(c3211aM7042a8);
        this.f29417w1 = AbstractC3352my.m17114d(bool2);
        C3211a c3211aM7042a9 = AbstractC1261a.m7042a();
        this.f29420x1 = c3211aM7042a9;
        this.f29423y1 = AbstractC3224d.m15519A(c3211aM7042a9);
        C3211a c3211aM7042a10 = AbstractC1261a.m7042a();
        this.f29426z1 = c3211aM7042a10;
        this.f29261A1 = AbstractC3224d.m15519A(c3211aM7042a10);
        C3211a c3211aM7042a11 = AbstractC1261a.m7042a();
        this.f29264B1 = c3211aM7042a11;
        this.f29267C1 = AbstractC3224d.m15519A(c3211aM7042a11);
        C3211a c3211aM7042a12 = AbstractC1261a.m7042a();
        this.f29270D1 = c3211aM7042a12;
        this.f29273E1 = AbstractC3224d.m15519A(c3211aM7042a12);
        C3211a c3211aM7042a13 = AbstractC1261a.m7042a();
        this.f29276F1 = c3211aM7042a13;
        this.f29279G1 = AbstractC3224d.m15519A(c3211aM7042a13);
        this.f29282H1 = AbstractC3352my.m17114d(TextHighlightStyle.Default);
        C3211a c3211aM7042a14 = AbstractC1261a.m7042a();
        this.f29285I1 = c3211aM7042a14;
        this.f29288J1 = AbstractC3224d.m15519A(c3211aM7042a14);
        C3211a c3211aM7042a15 = AbstractC1261a.m7042a();
        this.f29291K1 = c3211aM7042a15;
        AbstractC3224d.m15519A(c3211aM7042a15);
        C3244l c3244lM17114d19 = AbstractC3352my.m17114d(bool2);
        this.f29294L1 = c3244lM17114d19;
        this.f29297M1 = AbstractC3224d.m15520B(c3244lM17114d19, lda.m16103C(this), c3243k, bool2);
        C3211a c3211aM7042a16 = AbstractC1261a.m7042a();
        this.f29300N1 = c3211aM7042a16;
        this.f29303O1 = AbstractC3224d.m15519A(c3211aM7042a16);
        C3244l c3244lM17114d20 = AbstractC3352my.m17114d(bool2);
        this.f29306P1 = c3244lM17114d20;
        this.f29309Q1 = AbstractC3224d.m15520B(c3244lM17114d20, lda.m16103C(this), c3243k, bool2);
        this.f29321U1 = true;
        C3244l c3244lM17114d21 = AbstractC3352my.m17114d(null);
        this.f29324V1 = c3244lM17114d21;
        AbstractC3224d.m15520B(c3244lM17114d21, lda.m16103C(this), c3243k, null);
        this.f29327W1 = AbstractC3352my.m17114d(null);
        this.f29330X1 = AbstractC3224d.m15520B(AbstractC3224d.m15531j(c3244lM17114d2, new C3540rl(c3244lM17114d5, 5), c3244lM17114d21, c3244lM17114d17, new ReaderViewModel$hideAudio$1(5, null)), lda.m16103C(this), c3243k, null);
        this.f29333Y1 = AbstractC3224d.m15520B(new C3228h(c3244lM17114d2, new C3540rl(c3244lM17114d5, 5), new ReaderViewModel$hidePlaybackSpeed$1(3, null)), lda.m16103C(this), c3243k, null);
        this.f29336Z1 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f29339a2 = AbstractC3352my.m17114d(bool2);
        this.f29343b2 = AbstractC3352my.m17114d(null);
        this.f29347c2 = AbstractC3352my.m17114d(bool2);
        this.f29351d2 = AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f29355e2 = c3211aM10525a2;
        this.f29359f2 = AbstractC3224d.m15519A(c3211aM10525a2);
        c18 c18VarM15520B10 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new ReaderViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B11 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new ReaderViewModel$special$$inlined$flatMapLatest$2(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B12 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3228h(new C3540rl(c3244lM17114d5, 5), new C3540rl(c18VarM15520B10, 5), new ReaderViewModel$_lessonTo$1(3, null)), new ReaderViewModel$special$$inlined$flatMapLatest$3(this, null)), lda.m16103C(this), c3243k, null);
        this.f29363g2 = c18VarM15520B12;
        this.f29367h2 = AbstractC3224d.m15520B(AbstractC3224d.m15530i(new C3540rl(c3244lM17114d5, 5), new c13(c3244lM17114d8, 11), c18VarM15520B12, c18VarM15520B10, c18VarM15520B11, new ReaderViewModel$simplifyAction$2(this, null)), lda.m16103C(this), c3243k, t79.f61954a);
        this.f29371i2 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(c3244lM17114d5, 5), new ReaderViewModel$special$$inlined$flatMapLatest$4(this, null)), lda.m16103C(this), c3243k, null);
        this.f29375j2 = AbstractC3224d.m15520B(new C3228h(new C3540rl(c3244lM17114d5, 5), AbstractC3224d.m15520B(AbstractC3224d.m15521C(new C3540rl(c3244lM17114d5, 5), new ReaderViewModel$special$$inlined$flatMapLatest$5(this, null)), lda.m16103C(this), c3243k, null), new ReaderViewModel$promotedCourse$1(3, null)), lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d22 = AbstractC3352my.m17114d(new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431));
        this.f29379k2 = c3244lM17114d22;
        this.f29383l2 = AbstractC3224d.m15520B(c3244lM17114d22, lda.m16103C(this), c3243k, new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431));
        this.f29387m2 = AbstractC3352my.m17114d(null);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$updateUser$1(this, null), 3);
        c3244lM17114d16.m15572j(null, Boolean.valueOf(AbstractC3423or.m18251e0(this.f29340b.mo4589b2())));
        if (c1808b.m8444G() && (tb7VarM12625d = c1808b.f21961n.m12625d()) != null && tb7VarM12625d.f62101a == m9332l3()) {
            c1808b.m8466e0(PlayerViewState.Opened);
        } else {
            c1808b.m8447J();
            c1808b.m8450M(false);
            c1808b.m8466e0(PlayerViewState.Closed);
        }
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$6(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$7(this, null), 3);
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReaderViewModel$8(this, null), 2);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$9(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$10(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$11(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$12(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$13(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$14(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$15(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$16(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$17(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$18(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$19(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$20(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$21(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V2 */
    public static final Object m9313V2(C2412n c2412n, String str, int i, ContinuationImpl continuationImpl) throws Throwable {
        ReaderViewModel$fetchLessonParallel$1 readerViewModel$fetchLessonParallel$1;
        if (continuationImpl instanceof ReaderViewModel$fetchLessonParallel$1) {
            readerViewModel$fetchLessonParallel$1 = (ReaderViewModel$fetchLessonParallel$1) continuationImpl;
            int i2 = readerViewModel$fetchLessonParallel$1.f28939d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readerViewModel$fetchLessonParallel$1.f28939d = i2 - Integer.MIN_VALUE;
            } else {
                readerViewModel$fetchLessonParallel$1 = new ReaderViewModel$fetchLessonParallel$1(c2412n, continuationImpl);
            }
        } else {
            readerViewModel$fetchLessonParallel$1 = new ReaderViewModel$fetchLessonParallel$1(c2412n, continuationImpl);
        }
        Object objM7302v = readerViewModel$fetchLessonParallel$1.f28937b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = readerViewModel$fetchLessonParallel$1.f28939d;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7302v);
            wfb.m23926u(lda.m16103C(c2412n), c2412n.f29301O, null, new ReaderViewModel$fetchLessonParallel$2(i, c2412n, str, null), 2);
            n23 n23Var = c2412n.f29424z;
            readerViewModel$fetchLessonParallel$1.f28936a = i;
            readerViewModel$fetchLessonParallel$1.f28939d = 1;
            objM7302v = ((C1295k) n23Var.f52215a).m7302v(str, i, true, readerViewModel$fetchLessonParallel$1);
            if (objM7302v != obj) {
            }
            return obj;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM7302v);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = readerViewModel$fetchLessonParallel$1.f28936a;
        AbstractC3193b.m15359b(objM7302v);
        ym5 ym5Var = (ym5) objM7302v;
        x45 x45Var = (x45) pk9.m19381x(ym5Var);
        if (x45Var != null) {
            Lesson lesson = x45Var.f67754a;
            LessonBookmark lessonBookmark = x45Var.f67756c;
            List list = x45Var.f67755b;
            readerViewModel$fetchLessonParallel$1.f28936a = i;
            readerViewModel$fetchLessonParallel$1.f28939d = 2;
            if (c2412n.m9327g3(lesson, lessonBookmark, list, readerViewModel$fetchLessonParallel$1) == obj) {
                return obj;
            }
        } else if (ym5Var instanceof um5) {
            c2412n.m9325f3((j25) pk9.m19373k(ym5Var));
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: W2 */
    public static final int m9314W2(C2412n c2412n, Map map, ArrayList arrayList) {
        Object next;
        int size = arrayList.size() - 1;
        for (int i = 0; i < arrayList.size(); i++) {
            List list = (List) arrayList.get(i);
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((xz7) it.next()).f69008e;
                Locale locale = c2412n.f29334Z;
                locale.getClass();
                arrayList2.add((LessonWord) map.get(vz1.m23610P(str, locale)));
            }
            Iterator it2 = u91.m22587E0(arrayList2).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!fa4.m11650l(((LessonWord) next).f19322i, WordStatus.New.getValue()));
            if (((LessonWord) next) != null) {
                return i;
            }
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X2 */
    public static final Object m9315X2(C2412n c2412n, int i, ContinuationImpl continuationImpl) throws Throwable {
        ReaderViewModel$isLessonDownloaded$1 readerViewModel$isLessonDownloaded$1;
        if (continuationImpl instanceof ReaderViewModel$isLessonDownloaded$1) {
            readerViewModel$isLessonDownloaded$1 = (ReaderViewModel$isLessonDownloaded$1) continuationImpl;
            int i2 = readerViewModel$isLessonDownloaded$1.f28978d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readerViewModel$isLessonDownloaded$1.f28978d = i2 - Integer.MIN_VALUE;
            } else {
                readerViewModel$isLessonDownloaded$1 = new ReaderViewModel$isLessonDownloaded$1(c2412n, continuationImpl);
            }
        } else {
            readerViewModel$isLessonDownloaded$1 = new ReaderViewModel$isLessonDownloaded$1(c2412n, continuationImpl);
        }
        Object objM7356p = readerViewModel$isLessonDownloaded$1.f28976b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = readerViewModel$isLessonDownloaded$1.f28978d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7356p);
            xd7 xd7Var = c2412n.f29397q;
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            readerViewModel$isLessonDownloaded$1.f28975a = i;
            readerViewModel$isLessonDownloaded$1.f28978d = 1;
            objM7356p = ((C1302r) xd7Var).m7356p(i, strMo4589b2, readerViewModel$isLessonDownloaded$1);
            if (objM7356p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = readerViewModel$isLessonDownloaded$1.f28975a;
            AbstractC3193b.m15359b(objM7356p);
        }
        vd7 vd7Var = (vd7) objM7356p;
        if (vd7Var != null) {
            return Boolean.valueOf(vd7Var.f65237b && vd7Var.f65238c == 100 && c2412n.f29352e.mo8231E0(i));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final Object m9316Y2(C2412n c2412n, int i, SuspendLambda suspendLambda) {
        int i2;
        List list = (List) c2412n.f29269D0.getValue();
        if (list.isEmpty() || (i2 = i - 1) < 0 || i >= list.size()) {
            return EmptyList.f47638a;
        }
        List list2 = ((ox7) list.get(i2)).f55132e;
        s7b s7bVar = c2412n.f29403s;
        String strMo4589b2 = c2412n.f29340b.mo4589b2();
        List list3 = list2;
        ArrayList<String> arrayList = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((xz7) it.next()).f69008e);
        }
        C1310z c1310z = (C1310z) s7bVar;
        c1310z.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(strMo4589b2);
        o7b o7bVar = c1310z.f16576a;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (String str : arrayList) {
            localeForLanguageTag.getClass();
            arrayList2.add(vz1.m23629f(strMo4589b2, vz1.m23610P(str, localeForLanguageTag)));
        }
        o7bVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `termWithLanguage`, `term`, `id`, `status`, `importance`, `isPhrase`, `meanings`, `tags`, `gTags`, `romaji`, `hiragana`, `pinyin`, `hant`, `hans`, `jyutping` FROM (SELECT * FROM WordEntity WHERE termWithLanguage IN (");
        return AbstractC0758a.m2861d(new j7b(AbstractC3393o1.m17736k(") AND status = 'new')", sb, arrayList2), arrayList2, o7bVar, 3), o7bVar.f53957K, suspendLambda, true, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public static final void m9317Z2(C2412n c2412n, float f) {
        ox7 ox7Var = (ox7) u91.m22592J0(((Number) c2412n.f29316T.getValue()).intValue(), (List) c2412n.f29269D0.getValue());
        if (ox7Var != null) {
            List list = ox7Var.f55132e;
            my5 my5Var = c2412n.f29268D;
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            List<xz7> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (xz7 xz7Var : list2) {
                arrayList.add(new Pair(xz7Var.f69008e, xz7Var.f69013j));
            }
            my5Var.getClass();
            String strM22596N0 = u91.m22596N0(my5.m17154h(strMo4589b2, arrayList), " ", null, null, null, 62);
            if (vk9.m23391n0(strM22596N0)) {
                return;
            }
            c2412n.f29286J.mo8484Y0(strM22596N0, true, f, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (r13 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r13).m7272d0(r3, r0, r1) == r2) goto L39;
     */
    /* JADX INFO: renamed from: a3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9318a3(C2412n c2412n, ContinuationImpl continuationImpl) throws Throwable {
        ReaderViewModel$updateLessonComplete$1 readerViewModel$updateLessonComplete$1;
        C1518a c1518a;
        String strMo4589b2;
        int iM9332l3;
        cma cmaVar = c2412n.f29340b;
        if (continuationImpl instanceof ReaderViewModel$updateLessonComplete$1) {
            readerViewModel$updateLessonComplete$1 = (ReaderViewModel$updateLessonComplete$1) continuationImpl;
            int i = readerViewModel$updateLessonComplete$1.f29152c;
            if ((i & Integer.MIN_VALUE) != 0) {
                readerViewModel$updateLessonComplete$1.f29152c = i - Integer.MIN_VALUE;
            } else {
                readerViewModel$updateLessonComplete$1 = new ReaderViewModel$updateLessonComplete$1(c2412n, continuationImpl);
            }
        } else {
            readerViewModel$updateLessonComplete$1 = new ReaderViewModel$updateLessonComplete$1(c2412n, continuationImpl);
        }
        Object objM7430i = readerViewModel$updateLessonComplete$1.f29150a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = readerViewModel$updateLessonComplete$1.f29152c;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM7430i);
            } else if (i2 == 2) {
                AbstractC3193b.m15359b(objM7430i);
                d65 d65Var = c2412n.f29394p;
                String strMo4589b3 = cmaVar.mo4589b2();
                int iM9332l4 = c2412n.m9332l3();
                readerViewModel$updateLessonComplete$1.f29152c = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM7430i);
            }
            wfb.m23926u(lda.m16103C(c2412n), c2412n.f29301O, null, new ReaderViewModel$updateLessonReadStat$1(c2412n, c2412n.m9323d3(), null), 2);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM7430i);
        C3509qs c3509qs = c2412n.f29280H;
        c3509qs.m20136j(c3509qs.f58118b.getInt("lessonsCompleted", 0) + 1);
        List list = (List) c2412n.f29269D0.getValue();
        if (list.isEmpty()) {
            c1518a = c2412n.f29262B;
            strMo4589b2 = cmaVar.mo4589b2();
            iM9332l3 = c2412n.m9332l3();
            readerViewModel$updateLessonComplete$1.f29152c = 2;
            if (c1518a.m8194a(iM9332l3, strMo4589b2, readerViewModel$updateLessonComplete$1) != coroutineSingletons) {
                d65 d65Var2 = c2412n.f29394p;
                String strMo4589b4 = cmaVar.mo4589b2();
                int iM9332l5 = c2412n.m9332l3();
                readerViewModel$updateLessonComplete$1.f29152c = 3;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
            }
            s7b s7bVar = c2412n.f29403s;
            String strMo4589b5 = cmaVar.mo4589b2();
            int iM9332l6 = c2412n.m9332l3();
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((xz7) it2.next()).f69008e);
            }
            readerViewModel$updateLessonComplete$1.f29152c = 1;
            objM7430i = ((C1310z) s7bVar).m7430i(strMo4589b5, iM9332l6, arrayList2, readerViewModel$updateLessonComplete$1);
        }
        return coroutineSingletons;
        if (((Number) objM7430i).intValue() > 0) {
            wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$trackAchievements$1(c2412n, null), 3);
        }
        c1518a = c2412n.f29262B;
        strMo4589b2 = cmaVar.mo4589b2();
        iM9332l3 = c2412n.m9332l3();
        readerViewModel$updateLessonComplete$1.f29152c = 2;
        if (c1518a.m8194a(iM9332l3, strMo4589b2, readerViewModel$updateLessonComplete$1) != coroutineSingletons) {
            d65 d65Var3 = c2412n.f29394p;
            String strMo4589b6 = cmaVar.mo4589b2();
            int iM9332l7 = c2412n.m9332l3();
            readerViewModel$updateLessonComplete$1.f29152c = 3;
        }
        return coroutineSingletons;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f29340b.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f29376k.mo8733A0(z);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f29384m.mo7001A1(inAppNotificationAction);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f29344c.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f29344c.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f29340b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f29340b.mo4573B1();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: B2 */
    public final void mo3004B2() {
        this.f29391o.mo3004B2();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: C */
    public final void mo3005C() {
        this.f29391o.mo3005C();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f29340b.mo4574C1();
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: C2 */
    public final c83 mo9319C2() {
        return this.f29360g.mo9319C2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f29340b.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f29376k.mo8736D1();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: D2 */
    public final void mo3006D2(String str) {
        str.getClass();
        this.f29391o.mo3006D2(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f29344c.mo8737E(str);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: E0 */
    public final boolean mo8231E0(int i) {
        return this.f29352e.mo8231E0(i);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f29344c.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f29344c.mo8739F();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: F0 */
    public final void mo46F0(ReaderMode readerMode) {
        readerMode.getClass();
        this.f29388n.mo46F0(readerMode);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f29340b.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29376k.mo8740G(tooltipStep);
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: G1 */
    public final void mo9320G1(String str, int i, String str2, int i2, int i3) {
        str.getClass();
        str2.getClass();
        this.f29360g.mo9320G1(str, i, str2, i2, i3);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: G2 */
    public final void mo3007G2(boolean z) {
        this.f29391o.mo3007G2(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f29340b.mo4577H();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    public final Object mo7002H0(int i, Continuation continuation) {
        return this.f29384m.mo7002H0(i, continuation);
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: I0 */
    public final eh9 mo8236I0() {
        return this.f29364h.mo8236I0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f29344c.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f29340b.mo4578J(continuation);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: J2 */
    public final void mo3008J2() {
        this.f29391o.mo3008J2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f29340b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f29340b.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f29376k.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f29340b.mo4581L0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: L1 */
    public final void mo3009L1() {
        this.f29391o.mo3009L1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f29344c.mo8743L2();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: M0 */
    public final eh9 mo9201M0() {
        return this.f29348d.mo9201M0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f29372j.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f29340b.mo4582N();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    public final Object mo7003O(Continuation continuation) {
        return this.f29384m.mo7003O(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f29384m.mo7004O0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f29340b.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29376k.mo8744P0(tooltipStep);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f29384m.mo7005P1(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f29376k.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f29340b.mo4584Q0();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Q1 */
    public final eh9 mo7006Q1() {
        return this.f29356f.mo7006Q1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f29340b.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f29344c.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f29340b.mo4586T0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: T1 */
    public final void mo9202T1(int i, long j, boolean z) {
        this.f29348d.mo9202T1(i, j, z);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f29344c.mo8747U1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f29344c.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f29344c.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f29340b.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        return this.f29384m.mo7007X0(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f29384m.mo7008X1();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Y1 */
    public final void mo7009Y1(List list) {
        this.f29356f.mo7009Y1(list);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f29372j.mo3738Z();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f29376k.mo8753Z0(tooltipStep);
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: a */
    public final u66 mo7010a() {
        return this.f29356f.mo7010a();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f29340b.mo4588a0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: a2 */
    public final eh9 mo3010a2() {
        return this.f29391o.mo3010a2();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: b */
    public final void mo47b(DateTime dateTime) {
        this.f29388n.mo47b(dateTime);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f29344c.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f29340b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9321b3(int i) {
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$bookmarkLesson$1(this, i, null), 3);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f29344c.mo8758c();
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9322c3() {
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$completeLesson$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f29340b.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f29376k.mo8759d1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f29384m.mo7012d2();
    }

    /* JADX INFO: renamed from: d3 */
    public final int m9323d3() {
        return ((Number) this.f29316T.getValue()).intValue();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: e1 */
    public final Object mo3011e1(boolean z, Continuation continuation) {
        return this.f29391o.mo3011e1(z, continuation);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: e2 */
    public final void mo8233e2(String str, List list) {
        str.getClass();
        this.f29352e.mo8233e2(str, list);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX INFO: renamed from: e3 */
    public final TokenFragmentData m9324e3(int i, List list) {
        Object next;
        String str;
        int i2;
        int size;
        int size2;
        try {
            List list2 = (List) this.f29269D0.getValue();
            ArrayList<xz7> arrayList = new ArrayList();
            int i3 = i - 1;
            if (i3 >= 0) {
                arrayList.addAll(((ox7) list2.get(i3)).f55132e);
            }
            arrayList.addAll(((ox7) list2.get(i)).f55132e);
            int i4 = i + 1;
            if (i4 < list2.size() - 1) {
                arrayList.addAll(((ox7) list2.get(i4)).f55132e);
            }
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            if (!list.isEmpty()) {
                xz7 xz7Var = (xz7) u91.m22589G0(list);
                int i5 = xz7Var.f69010g;
                Iterator it = ((Iterable) this.f29425z0.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((LessonSentence) next).f19256d != i5);
                LessonSentence lessonSentence = (LessonSentence) next;
                String strSubstring = "";
                if (lessonSentence == null || (str = lessonSentence.f19254b) == null) {
                    str = "";
                }
                int i6 = xz7Var.f69011h;
                int i7 = list.size() > 1 ? ((xz7) u91.m22589G0(list)).f69011h : -1;
                int i8 = list.size() > 1 ? ((xz7) u91.m22597O0(list)).f69011h : -1;
                for (xz7 xz7Var2 : arrayList) {
                    if (xz7Var2.f69010g == i5) {
                        arrayList2.add(xz7Var2);
                    }
                }
                if (i7 == -1) {
                    i2 = i6 - 5;
                    if (i2 <= 0) {
                        i2 = 0;
                    }
                } else {
                    int i9 = i7 - 5;
                    if (i9 > 0) {
                        i2 = i9;
                    } else {
                        i2 = 0;
                    }
                }
                if (i8 != -1 ? (size = arrayList2.size() - 1) <= (size2 = i8 + 3) : (size2 = arrayList2.size() - 1) > (size = i6 + 3)) {
                    size2 = size;
                }
                if (i2 >= 0 && i2 < size2 && size2 < arrayList2.size()) {
                    if (((xz7) arrayList2.get(i2)).f69006c >= 0 && ((xz7) arrayList2.get(i2)).f69006c < ((xz7) arrayList2.get(size2)).f69007d && ((xz7) arrayList2.get(size2)).f69007d > ((xz7) arrayList2.get(i2)).f69006c && ((xz7) arrayList2.get(size2)).f69007d <= str.length()) {
                        strSubstring = str.substring(((xz7) arrayList2.get(i2)).f69006c, ((xz7) arrayList2.get(size2)).f69007d);
                    }
                    sb.append(strSubstring);
                    if (AbstractC3184kh.m15194A(this.f29340b.mo4589b2())) {
                        if (size2 < arrayList2.size() - 1) {
                            sb.insert(0, "...");
                        } else if (size2 == arrayList2.size() - 1 && ((xz7) arrayList2.get(size2)).f69007d < str.length() && ((xz7) arrayList2.get(size2)).f69007d - 1 != str.length() - 1) {
                            sb.append(str.substring(((xz7) arrayList2.get(size2)).f69007d, str.length()));
                        }
                        if (i2 > 0) {
                            sb.append("...");
                        }
                    } else {
                        if (i2 > 0) {
                            sb.insert(0, "...");
                        }
                        if (size2 < arrayList2.size() - 1) {
                            sb.append("...");
                        } else if (size2 == arrayList2.size() - 1 && ((xz7) arrayList2.get(size2)).f69007d < str.length() && ((xz7) arrayList2.get(size2)).f69007d - 1 != str.length() - 1) {
                            sb.append(str.substring(((xz7) arrayList2.get(size2)).f69007d, str.length()));
                        }
                    }
                    return new TokenFragmentData(vk9.m23376L0(sb.toString()).toString(), i6);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new TokenFragmentData();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f29344c.mo8761f();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m9325f3(j25 j25Var) {
        boolean z = j25Var instanceof e25;
        C3244l c3244l = this.f29320U0;
        if (z) {
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return;
        }
        if (!(j25Var instanceof h25)) {
            Boolean bool2 = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool2);
            if (j25Var == null) {
                j25Var = g25.f40076a;
            }
            this.f29411u1.mo4677k(j25Var);
            return;
        }
        Set setM20855w0 = AbstractC3550rv.m20855w0(new LessonProcessingStatus[]{LessonProcessingStatus.AI, LessonProcessingStatus.AI_SPLITTING, LessonProcessingStatus.GENERATE_TTS, LessonProcessingStatus.TIMESTAMPS, LessonProcessingStatus.TRANSCRIBE});
        LessonProcessingStatus lessonProcessingStatus = ((h25) j25Var).f41700a;
        if (setM20855w0.contains(lessonProcessingStatus)) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$lippServiceRunning$1(this, null), 3);
            return;
        }
        Boolean bool3 = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool3);
        this.f29326W0.mo4677k(lessonProcessingStatus);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f29376k.mo8763g();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: g0 */
    public final void mo9211g0(PlayingFrom playingFrom) {
        playingFrom.getClass();
        this.f29348d.mo9211g0(playingFrom);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        this.f29384m.mo7013g1(h24Var);
    }

    @Override // p000.mk0
    /* JADX INFO: renamed from: g2 */
    public final void mo9326g2(yx4 yx4Var) {
        this.f29360g.mo9326g2(yx4Var);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:50:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (((com.lingq.core.data.repository.C1290f) r1).m7179c(r9, r6, r2) == r3) goto L45;
     */
    /* JADX INFO: renamed from: g3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9327g3(Lesson lesson, LessonBookmark lessonBookmark, List list, ContinuationImpl continuationImpl) throws Throwable {
        ReaderViewModel$handleLessonLoadSuccess$1 readerViewModel$handleLessonLoadSuccess$1;
        boolean z;
        Lesson lesson2;
        LessonBookmark lessonBookmark2;
        List list2;
        Object value;
        Lesson lesson3;
        LessonBookmark lessonBookmark3;
        LessonBookmark lessonBookmark4;
        Lesson lesson4;
        List list3;
        Object value2;
        List list4;
        Lesson lesson5;
        C3244l c3244l;
        Integer num;
        if (continuationImpl instanceof ReaderViewModel$handleLessonLoadSuccess$1) {
            readerViewModel$handleLessonLoadSuccess$1 = (ReaderViewModel$handleLessonLoadSuccess$1) continuationImpl;
            int i = readerViewModel$handleLessonLoadSuccess$1.f28966g;
            if ((i & Integer.MIN_VALUE) != 0) {
                readerViewModel$handleLessonLoadSuccess$1.f28966g = i - Integer.MIN_VALUE;
            } else {
                readerViewModel$handleLessonLoadSuccess$1 = new ReaderViewModel$handleLessonLoadSuccess$1(this, continuationImpl);
            }
        } else {
            readerViewModel$handleLessonLoadSuccess$1 = new ReaderViewModel$handleLessonLoadSuccess$1(this, continuationImpl);
        }
        Object obj = readerViewModel$handleLessonLoadSuccess$1.f28964e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = readerViewModel$handleLessonLoadSuccess$1.f28966g;
        xfa xfaVar = xfa.f68157a;
        C3244l c3244l2 = this.f29278G0;
        if (i2 != 0) {
            if (i2 == 1) {
                z = readerViewModel$handleLessonLoadSuccess$1.f28963d;
                List list5 = readerViewModel$handleLessonLoadSuccess$1.f28962c;
                lessonBookmark3 = readerViewModel$handleLessonLoadSuccess$1.f28961b;
                lesson3 = readerViewModel$handleLessonLoadSuccess$1.f28960a;
                AbstractC3193b.m15359b(obj);
                list2 = list5;
            } else {
                if (i2 == 2) {
                    z = readerViewModel$handleLessonLoadSuccess$1.f28963d;
                    list3 = readerViewModel$handleLessonLoadSuccess$1.f28962c;
                    lessonBookmark4 = readerViewModel$handleLessonLoadSuccess$1.f28961b;
                    lesson4 = readerViewModel$handleLessonLoadSuccess$1.f28960a;
                    try {
                        AbstractC3193b.m15359b(obj);
                    } catch (Exception unused) {
                    }
                    lessonBookmark2 = lessonBookmark4;
                    if (lessonBookmark2 != null) {
                        readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson4;
                        readerViewModel$handleLessonLoadSuccess$1.f28961b = null;
                        readerViewModel$handleLessonLoadSuccess$1.f28962c = list3;
                        readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
                        readerViewModel$handleLessonLoadSuccess$1.f28966g = 3;
                        if (m9337q3(lessonBookmark2, readerViewModel$handleLessonLoadSuccess$1) != obj2) {
                            list4 = list3;
                            lesson5 = lesson4;
                        }
                        return obj2;
                    }
                    this.f29425z0.m15571i(list3);
                    this.f29265C.m9257b(list3);
                    LessonSentencesTranslation lessonSentencesTranslation = lesson4.f19151j;
                    c3244l = this.f29422y0;
                    num = (Integer) c3244l.getValue();
                    if (num != null) {
                        this.f29416w0.mo4677k(new Integer(num.intValue()));
                        c3244l.m15571i(null);
                    }
                    fa4.m11650l(lesson4.f19136F, LessonStatus.GENERATE_TTS.getValue());
                    return xfaVar;
                }
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list4 = readerViewModel$handleLessonLoadSuccess$1.f28962c;
                lesson5 = readerViewModel$handleLessonLoadSuccess$1.f28960a;
                AbstractC3193b.m15359b(obj);
            }
            lesson4 = lesson5;
            list3 = list4;
            this.f29425z0.m15571i(list3);
            this.f29265C.m9257b(list3);
            LessonSentencesTranslation lessonSentencesTranslation2 = lesson4.f19151j;
            c3244l = this.f29422y0;
            num = (Integer) c3244l.getValue();
            if (num != null) {
                this.f29416w0.mo4677k(new Integer(num.intValue()));
                c3244l.m15571i(null);
            }
            fa4.m11650l(lesson4.f19136F, LessonStatus.GENERATE_TTS.getValue());
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        C3244l c3244l3 = this.f29269D0;
        c3244l3.getClass();
        c3244l3.m15572j(null, EmptyList.f47638a);
        z = ((s08) c3244l2.getValue()).f60141a;
        if (z) {
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, new s08(100.0f, true)));
            wfb.m23926u(lda.m16103C(this), this.f29301O, null, new ReaderViewModel$handleLessonLoadSuccess$3(this, null), 2);
            lesson3 = lesson;
            readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson3;
            lessonBookmark3 = lessonBookmark;
            readerViewModel$handleLessonLoadSuccess$1.f28961b = lessonBookmark3;
            readerViewModel$handleLessonLoadSuccess$1.f28962c = list;
            readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
            readerViewModel$handleLessonLoadSuccess$1.f28966g = 1;
            if (AbstractC3208a.m15437d(500L, readerViewModel$handleLessonLoadSuccess$1) != obj2) {
                list2 = list;
            }
        } else {
            lesson2 = lesson;
            lessonBookmark2 = lessonBookmark;
            list2 = list;
            Boolean bool = Boolean.FALSE;
            C3244l c3244l4 = this.f29320U0;
            c3244l4.getClass();
            c3244l4.m15572j(null, bool);
            this.f29291K1.mo4677k(xfaVar);
            this.f29381l0.m15571i(lesson2);
            if (lesson2.f19132B != null) {
                lesson4 = lesson2;
                list3 = list2;
                if (lessonBookmark2 != null) {
                    readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson4;
                    readerViewModel$handleLessonLoadSuccess$1.f28961b = null;
                    readerViewModel$handleLessonLoadSuccess$1.f28962c = list3;
                    readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
                    readerViewModel$handleLessonLoadSuccess$1.f28966g = 3;
                    if (m9337q3(lessonBookmark2, readerViewModel$handleLessonLoadSuccess$1) != obj2) {
                        list4 = list3;
                        lesson5 = lesson4;
                        lesson4 = lesson5;
                        list3 = list4;
                    }
                }
                this.f29425z0.m15571i(list3);
                this.f29265C.m9257b(list3);
                LessonSentencesTranslation lessonSentencesTranslation3 = lesson4.f19151j;
                c3244l = this.f29422y0;
                num = (Integer) c3244l.getValue();
                if (num != null) {
                    this.f29416w0.mo4677k(new Integer(num.intValue()));
                    c3244l.m15571i(null);
                }
                fa4.m11650l(lesson4.f19136F, LessonStatus.GENERATE_TTS.getValue());
                return xfaVar;
            }
            try {
                xo1 xo1Var = this.f29421y;
                String strMo4589b2 = this.f29340b.mo4589b2();
                int i3 = lesson2.f19149h;
                readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson2;
                readerViewModel$handleLessonLoadSuccess$1.f28961b = lessonBookmark2;
                readerViewModel$handleLessonLoadSuccess$1.f28962c = list2;
                readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
                readerViewModel$handleLessonLoadSuccess$1.f28966g = 2;
            } catch (Exception unused2) {
            }
        }
        return obj2;
        boolean z2 = z;
        LessonBookmark lessonBookmark5 = lessonBookmark3;
        Lesson lesson6 = lesson3;
        do {
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, new s08(100.0f, false)));
        z = z2;
        lessonBookmark2 = lessonBookmark5;
        lesson2 = lesson6;
        Boolean bool2 = Boolean.FALSE;
        C3244l c3244l5 = this.f29320U0;
        c3244l5.getClass();
        c3244l5.m15572j(null, bool2);
        this.f29291K1.mo4677k(xfaVar);
        this.f29381l0.m15571i(lesson2);
        if (lesson2.f19132B != null) {
            lesson4 = lesson2;
            list3 = list2;
            if (lessonBookmark2 != null) {
                readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson4;
                readerViewModel$handleLessonLoadSuccess$1.f28961b = null;
                readerViewModel$handleLessonLoadSuccess$1.f28962c = list3;
                readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
                readerViewModel$handleLessonLoadSuccess$1.f28966g = 3;
                if (m9337q3(lessonBookmark2, readerViewModel$handleLessonLoadSuccess$1) != obj2) {
                    list4 = list3;
                    lesson5 = lesson4;
                    lesson4 = lesson5;
                    list3 = list4;
                }
            }
            this.f29425z0.m15571i(list3);
            this.f29265C.m9257b(list3);
            LessonSentencesTranslation lessonSentencesTranslation4 = lesson4.f19151j;
            c3244l = this.f29422y0;
            num = (Integer) c3244l.getValue();
            if (num != null) {
                this.f29416w0.mo4677k(new Integer(num.intValue()));
                c3244l.m15571i(null);
            }
            fa4.m11650l(lesson4.f19136F, LessonStatus.GENERATE_TTS.getValue());
            return xfaVar;
        }
        xo1 xo1Var2 = this.f29421y;
        String strMo4589b3 = this.f29340b.mo4589b2();
        int i4 = lesson2.f19149h;
        readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson2;
        readerViewModel$handleLessonLoadSuccess$1.f28961b = lessonBookmark2;
        readerViewModel$handleLessonLoadSuccess$1.f28962c = list2;
        readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
        readerViewModel$handleLessonLoadSuccess$1.f28966g = 2;
        return obj2;
        lessonBookmark4 = lessonBookmark2;
        lesson4 = lesson2;
        list3 = list2;
        lessonBookmark2 = lessonBookmark4;
        if (lessonBookmark2 != null) {
            readerViewModel$handleLessonLoadSuccess$1.f28960a = lesson4;
            readerViewModel$handleLessonLoadSuccess$1.f28961b = null;
            readerViewModel$handleLessonLoadSuccess$1.f28962c = list3;
            readerViewModel$handleLessonLoadSuccess$1.f28963d = z;
            readerViewModel$handleLessonLoadSuccess$1.f28966g = 3;
            if (m9337q3(lessonBookmark2, readerViewModel$handleLessonLoadSuccess$1) != obj2) {
                list4 = list3;
                lesson5 = lesson4;
                lesson4 = lesson5;
                list3 = list4;
            }
            return obj2;
        }
        this.f29425z0.m15571i(list3);
        this.f29265C.m9257b(list3);
        LessonSentencesTranslation lessonSentencesTranslation5 = lesson4.f19151j;
        c3244l = this.f29422y0;
        num = (Integer) c3244l.getValue();
        if (num != null) {
            this.f29416w0.mo4677k(new Integer(num.intValue()));
            c3244l.m15571i(null);
        }
        fa4.m11650l(lesson4.f19136F, LessonStatus.GENERATE_TTS.getValue());
        return xfaVar;
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f29380l.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f29340b.mo4591h0(profileAccount, continuation);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m9328h3(n2c n2cVar) {
        boolean zEquals = n2cVar.equals(ea7.f36940h);
        C1808b c1808b = this.f29289K;
        if (zEquals) {
            c1808b.m8442C(n2cVar);
            c1808b.m8458W();
            mo9034v0(AppUsageType.Reading);
        } else {
            if (!n2cVar.equals(ea7.f36937e)) {
                c1808b.m8442C(n2cVar);
                return;
            }
            c1808b.m8442C(n2cVar);
            c1808b.m8447J();
            mo9033o1(AppUsageType.Reading, (Integer) this.f29310R.getValue());
        }
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f29344c.mo8765i();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        this.f29384m.mo7014i0(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f29376k.mo8766i1();
    }

    /* JADX INFO: renamed from: i3 */
    public final boolean m9329i3(int i) {
        Object next;
        Iterator it = ((Iterable) this.f29389n0.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LibraryItemCounter) next).f19455a != i);
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
        if (libraryItemCounter != null && !libraryItemCounter.f19460f) {
            Lesson lesson = (Lesson) ((C3244l) this.f29385m0.f9311a).getValue();
            if ((lesson != null ? lesson.f19131A : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f29344c.mo8767j();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f29376k.mo8768j0(z);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: j1 */
    public final void mo9212j1() {
        this.f29348d.mo9212j1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f29372j.mo3739j2();
    }

    /* JADX INFO: renamed from: j3 */
    public final boolean m9330j3() {
        return ((Boolean) ((C3244l) this.f29353e0.f9311a).getValue()).booleanValue();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f29372j.mo3740k2();
    }

    /* JADX INFO: renamed from: k3 */
    public final boolean m9331k3() {
        return ((Boolean) this.f29313S.getValue()).booleanValue();
    }

    @Override // p000.bz5
    /* JADX INFO: renamed from: l2 */
    public final Object mo4239l2(long j, ContinuationImpl continuationImpl) {
        return this.f29368i.mo4239l2(j, continuationImpl);
    }

    /* JADX INFO: renamed from: l3 */
    public final int m9332l3() {
        return ((Number) this.f29310R.getValue()).intValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f29340b.mo4592m0();
    }

    /* JADX INFO: renamed from: m3 */
    public final void m9333m3(int i, String str) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$movePageToKnown$1(i, this, str, null), 3);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f29344c.mo8769n0();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: n1 */
    public final void mo48n1(String str, x65 x65Var) {
        str.getClass();
        this.f29388n.mo48n1(str, x65Var);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m9334n3() {
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$onPlayAudio$1(this, ((Number) this.f29310R.getValue()).intValue(), null), 3);
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f29380l.mo9033o1(appUsageType, num);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f29384m.mo7015o2();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m9335o3(int i, float f) {
        ((C1240a) this.f29292L).m7025f("Sentence audio played", null);
        AbstractC1263a.m7046a(this.f29318T1);
        this.f29318T1 = wfb.m23926u(lda.m16103C(this), this.f29301O, null, new ReaderViewModel$prepareSentenceToSpeak$1(this, i, f, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f29340b.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f29344c.mo8770p1();
    }

    /* JADX INFO: renamed from: p3 */
    public final void m9336p3(boolean z) {
        Boolean bool = Boolean.TRUE;
        C3244l c3244l = this.f29320U0;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        AbstractC1263a.m7046a(this.f29312R1);
        this.f29312R1 = wfb.m23926u(lda.m16103C(this), this.f29301O, null, new ReaderViewModel$fetchLesson$1(this, z, null), 2);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: q */
    public final c83 mo9213q() {
        return this.f29348d.mo9213q();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f29376k.mo8771q0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f29344c.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f29344c.mo8773q2();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124 A[PHI: r9 r10
      0x0124: PHI (r9v13 com.lingq.core.domain.model.lesson.LessonBookmark) = (r9v1 com.lingq.core.domain.model.lesson.LessonBookmark), (r9v14 com.lingq.core.domain.model.lesson.LessonBookmark) binds: [B:48:0x0121, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r10v22 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:48:0x0121, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q3 */
    public final Object m9337q3(LessonBookmark lessonBookmark, ContinuationImpl continuationImpl) throws Throwable {
        ReaderViewModel$setupBookmark$1 readerViewModel$setupBookmark$1;
        String str;
        Object objM15541t;
        LessonBookmark lessonBookmark2;
        String str2;
        int i;
        LessonBookmark lessonBookmark3;
        int i2;
        LinkedHashMap linkedHashMapM15372Y;
        LinkedHashMap linkedHashMapM15372Y2;
        LinkedHashMap linkedHashMapM15372Y3;
        if (continuationImpl instanceof ReaderViewModel$setupBookmark$1) {
            readerViewModel$setupBookmark$1 = (ReaderViewModel$setupBookmark$1) continuationImpl;
            int i3 = readerViewModel$setupBookmark$1.f29051g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                readerViewModel$setupBookmark$1.f29051g = i3 - Integer.MIN_VALUE;
            } else {
                readerViewModel$setupBookmark$1 = new ReaderViewModel$setupBookmark$1(this, continuationImpl);
            }
        } else {
            readerViewModel$setupBookmark$1 = new ReaderViewModel$setupBookmark$1(this, continuationImpl);
        }
        Object objM15541t2 = readerViewModel$setupBookmark$1.f29049e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = readerViewModel$setupBookmark$1.f29051g;
        xfa xfaVar = xfa.f68157a;
        vma vmaVar = this.f29277G;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(objM15541t2);
                str = lessonBookmark.f19172e;
                if (str != null) {
                    c83 c83Var = ((C1371d) vmaVar).f18583t;
                    readerViewModel$setupBookmark$1.f29045a = lessonBookmark;
                    readerViewModel$setupBookmark$1.f29046b = str;
                    readerViewModel$setupBookmark$1.f29051g = 1;
                    objM15541t = AbstractC3224d.m15541t(c83Var, readerViewModel$setupBookmark$1);
                    if (objM15541t != coroutineSingletons) {
                        lessonBookmark2 = (LessonBookmark) e65.m10872d(m9332l3(), (Map) objM15541t);
                        if (lessonBookmark2 != null) {
                            str2 = lessonBookmark2.f19172e;
                            if (str2 != null) {
                                if (str.compareTo(str2) > 0) {
                                    c83 c83Var2 = ((C1371d) vmaVar).f18583t;
                                    readerViewModel$setupBookmark$1.f29045a = lessonBookmark;
                                    readerViewModel$setupBookmark$1.f29046b = null;
                                    readerViewModel$setupBookmark$1.f29047c = null;
                                    readerViewModel$setupBookmark$1.f29048d = 0;
                                    readerViewModel$setupBookmark$1.f29051g = 2;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var2, readerViewModel$setupBookmark$1);
                                    if (objM15541t2 != coroutineSingletons) {
                                        lessonBookmark3 = lessonBookmark;
                                        i2 = 0;
                                        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        linkedHashMapM15372Y.put(new Integer(m9332l3()), lessonBookmark3);
                                        readerViewModel$setupBookmark$1.f29045a = null;
                                        readerViewModel$setupBookmark$1.f29046b = null;
                                        readerViewModel$setupBookmark$1.f29047c = null;
                                        readerViewModel$setupBookmark$1.f29048d = i2;
                                        readerViewModel$setupBookmark$1.f29051g = 3;
                                        if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                                        }
                                    }
                                } else {
                                    c83 c83Var3 = ((C1371d) vmaVar).f18583t;
                                    readerViewModel$setupBookmark$1.f29045a = null;
                                    readerViewModel$setupBookmark$1.f29046b = null;
                                    readerViewModel$setupBookmark$1.f29047c = lessonBookmark2;
                                    readerViewModel$setupBookmark$1.f29048d = 0;
                                    readerViewModel$setupBookmark$1.f29051g = 4;
                                    objM15541t2 = AbstractC3224d.m15541t(c83Var3, readerViewModel$setupBookmark$1);
                                    if (objM15541t2 != coroutineSingletons) {
                                        i = 0;
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                        linkedHashMapM15372Y2.put(new Integer(m9332l3()), lessonBookmark2);
                                        readerViewModel$setupBookmark$1.f29045a = null;
                                        readerViewModel$setupBookmark$1.f29046b = null;
                                        readerViewModel$setupBookmark$1.f29047c = null;
                                        readerViewModel$setupBookmark$1.f29048d = i;
                                        readerViewModel$setupBookmark$1.f29051g = 5;
                                        if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y2, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        } else {
                            c83 c83Var4 = ((C1371d) vmaVar).f18583t;
                            readerViewModel$setupBookmark$1.f29045a = lessonBookmark;
                            readerViewModel$setupBookmark$1.f29046b = null;
                            readerViewModel$setupBookmark$1.f29047c = null;
                            readerViewModel$setupBookmark$1.f29051g = 6;
                            objM15541t2 = AbstractC3224d.m15541t(c83Var4, readerViewModel$setupBookmark$1);
                            if (objM15541t2 != coroutineSingletons) {
                                linkedHashMapM15372Y3 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                linkedHashMapM15372Y3.put(new Integer(m9332l3()), lessonBookmark);
                                readerViewModel$setupBookmark$1.f29045a = null;
                                readerViewModel$setupBookmark$1.f29046b = null;
                                readerViewModel$setupBookmark$1.f29047c = null;
                                readerViewModel$setupBookmark$1.f29051g = 7;
                                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y3, readerViewModel$setupBookmark$1) != coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 1:
                String str3 = readerViewModel$setupBookmark$1.f29046b;
                LessonBookmark lessonBookmark4 = readerViewModel$setupBookmark$1.f29045a;
                AbstractC3193b.m15359b(objM15541t2);
                str = str3;
                lessonBookmark = lessonBookmark4;
                objM15541t = objM15541t2;
                lessonBookmark2 = (LessonBookmark) e65.m10872d(m9332l3(), (Map) objM15541t);
                if (lessonBookmark2 != null) {
                    str2 = lessonBookmark2.f19172e;
                    if (str2 != null) {
                        if (str.compareTo(str2) > 0) {
                            c83 c83Var5 = ((C1371d) vmaVar).f18583t;
                            readerViewModel$setupBookmark$1.f29045a = lessonBookmark;
                            readerViewModel$setupBookmark$1.f29046b = null;
                            readerViewModel$setupBookmark$1.f29047c = null;
                            readerViewModel$setupBookmark$1.f29048d = 0;
                            readerViewModel$setupBookmark$1.f29051g = 2;
                            objM15541t2 = AbstractC3224d.m15541t(c83Var5, readerViewModel$setupBookmark$1);
                            if (objM15541t2 != coroutineSingletons) {
                                lessonBookmark3 = lessonBookmark;
                                i2 = 0;
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t2);
                                linkedHashMapM15372Y.put(new Integer(m9332l3()), lessonBookmark3);
                                readerViewModel$setupBookmark$1.f29045a = null;
                                readerViewModel$setupBookmark$1.f29046b = null;
                                readerViewModel$setupBookmark$1.f29047c = null;
                                readerViewModel$setupBookmark$1.f29048d = i2;
                                readerViewModel$setupBookmark$1.f29051g = 3;
                                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                                }
                            }
                        } else {
                            c83 c83Var6 = ((C1371d) vmaVar).f18583t;
                            readerViewModel$setupBookmark$1.f29045a = null;
                            readerViewModel$setupBookmark$1.f29046b = null;
                            readerViewModel$setupBookmark$1.f29047c = lessonBookmark2;
                            readerViewModel$setupBookmark$1.f29048d = 0;
                            readerViewModel$setupBookmark$1.f29051g = 4;
                            objM15541t2 = AbstractC3224d.m15541t(c83Var6, readerViewModel$setupBookmark$1);
                            if (objM15541t2 != coroutineSingletons) {
                                i = 0;
                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                                linkedHashMapM15372Y2.put(new Integer(m9332l3()), lessonBookmark2);
                                readerViewModel$setupBookmark$1.f29045a = null;
                                readerViewModel$setupBookmark$1.f29046b = null;
                                readerViewModel$setupBookmark$1.f29047c = null;
                                readerViewModel$setupBookmark$1.f29048d = i;
                                readerViewModel$setupBookmark$1.f29051g = 5;
                                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y2, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                c83 c83Var7 = ((C1371d) vmaVar).f18583t;
                readerViewModel$setupBookmark$1.f29045a = lessonBookmark;
                readerViewModel$setupBookmark$1.f29046b = null;
                readerViewModel$setupBookmark$1.f29047c = null;
                readerViewModel$setupBookmark$1.f29051g = 6;
                objM15541t2 = AbstractC3224d.m15541t(c83Var7, readerViewModel$setupBookmark$1);
                if (objM15541t2 != coroutineSingletons) {
                    linkedHashMapM15372Y3 = AbstractC3194a.m15372Y((Map) objM15541t2);
                    linkedHashMapM15372Y3.put(new Integer(m9332l3()), lessonBookmark);
                    readerViewModel$setupBookmark$1.f29045a = null;
                    readerViewModel$setupBookmark$1.f29046b = null;
                    readerViewModel$setupBookmark$1.f29047c = null;
                    readerViewModel$setupBookmark$1.f29051g = 7;
                    if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y3, readerViewModel$setupBookmark$1) != coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 2:
                i2 = readerViewModel$setupBookmark$1.f29048d;
                lessonBookmark3 = readerViewModel$setupBookmark$1.f29045a;
                AbstractC3193b.m15359b(objM15541t2);
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t2);
                linkedHashMapM15372Y.put(new Integer(m9332l3()), lessonBookmark3);
                readerViewModel$setupBookmark$1.f29045a = null;
                readerViewModel$setupBookmark$1.f29046b = null;
                readerViewModel$setupBookmark$1.f29047c = null;
                readerViewModel$setupBookmark$1.f29048d = i2;
                readerViewModel$setupBookmark$1.f29051g = 3;
                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 3:
                AbstractC3193b.m15359b(objM15541t2);
                return xfaVar;
            case 4:
                i = readerViewModel$setupBookmark$1.f29048d;
                lessonBookmark2 = readerViewModel$setupBookmark$1.f29047c;
                AbstractC3193b.m15359b(objM15541t2);
                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t2);
                linkedHashMapM15372Y2.put(new Integer(m9332l3()), lessonBookmark2);
                readerViewModel$setupBookmark$1.f29045a = null;
                readerViewModel$setupBookmark$1.f29046b = null;
                readerViewModel$setupBookmark$1.f29047c = null;
                readerViewModel$setupBookmark$1.f29048d = i;
                readerViewModel$setupBookmark$1.f29051g = 5;
                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y2, readerViewModel$setupBookmark$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(objM15541t2);
                return xfaVar;
            case 6:
                lessonBookmark = readerViewModel$setupBookmark$1.f29045a;
                AbstractC3193b.m15359b(objM15541t2);
                linkedHashMapM15372Y3 = AbstractC3194a.m15372Y((Map) objM15541t2);
                linkedHashMapM15372Y3.put(new Integer(m9332l3()), lessonBookmark);
                readerViewModel$setupBookmark$1.f29045a = null;
                readerViewModel$setupBookmark$1.f29046b = null;
                readerViewModel$setupBookmark$1.f29047c = null;
                readerViewModel$setupBookmark$1.f29051g = 7;
                if (((C1371d) vmaVar).m7965e(linkedHashMapM15372Y3, readerViewModel$setupBookmark$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 7:
                AbstractC3193b.m15359b(objM15541t2);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: r */
    public final Object mo8234r(DownloadItem downloadItem, Continuation continuation) {
        return this.f29352e.mo8234r(downloadItem, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f29372j.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f29340b.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f29344c.mo8774r2(i);
    }

    /* JADX INFO: renamed from: r3 */
    public final void m9338r3() {
        wfb.m23926u(lda.m16103C(this), null, null, new ReaderViewModel$simplifyLesson$1(this, null), 3);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f29376k.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f29372j.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f29340b.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f29344c.mo8776s2(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: s3 */
    public final void m9339s3(ReviewType reviewType) {
        CardStatus cardStatus;
        List list;
        reviewType.getClass();
        mo8747U1();
        ReviewType reviewType2 = ReviewType.Integrated;
        C3244l c3244l = this.f29336Z1;
        if (reviewType == reviewType2 && (list = (List) ((Map) c3244l.getValue()).get(Integer.valueOf(m9323d3()))) != null && list.size() == 0) {
            reviewType = ReviewType.IntegratedWord;
        }
        int[] iArr = t08.f61725a;
        int size = 0;
        switch (iArr[reviewType.ordinal()]) {
            case 1:
                List list2 = (List) ((Map) c3244l.getValue()).get(Integer.valueOf(m9323d3()));
                if (list2 != null) {
                    size = list2.size();
                }
                break;
            case 2:
                size = ((Number) ((C3244l) this.f29399q1.f9311a).getValue()).intValue();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                size = ((Number) ((C3244l) this.f29393o1.f9311a).getValue()).intValue();
                break;
            case 7:
                List list3 = (List) ((Map) c3244l.getValue()).get(Integer.valueOf(m9323d3()));
                if (list3 != null) {
                    size = list3.size();
                }
                break;
            case 8:
                size = 3;
                break;
            default:
                gm5.m12750e();
                return;
        }
        switch (iArr[reviewType.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                cardStatus = CardStatus.Familiar;
                break;
            case 2:
            case 7:
            case 8:
                cardStatus = CardStatus.Learned;
                break;
            default:
                gm5.m12750e();
                return;
        }
        if (size > 0) {
            int i = iArr[reviewType.ordinal()];
            ?? arrayList = EmptyList.f47638a;
            if (i == 1 || i == 7) {
                List list4 = (List) ((Map) c3244l.getValue()).get(Integer.valueOf(m9323d3()));
                if (list4 != null) {
                    arrayList = list4;
                }
            } else if (i == 8) {
                ox7 ox7Var = (ox7) u91.m22592J0(m9323d3(), (List) this.f29269D0.getValue());
                if (ox7Var != null) {
                    List list5 = ox7Var.f55132e;
                    arrayList = new ArrayList(v91.m23189q0(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        String str = ((xz7) it.next()).f69008e;
                        Locale locale = this.f29334Z;
                        locale.getClass();
                        arrayList.add(vz1.m23610P(str, locale));
                    }
                }
            }
            Set setM22627s1 = u91.m22627s1((Iterable) arrayList);
            og8 og8Var = this.f29283I;
            og8Var.getClass();
            og8Var.f54320a = setM22627s1;
            this.f29405s1.mo4677k(new lx7(m9332l3(), m9323d3() + 1, reviewType, cardStatus));
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f29340b.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f29376k.mo8777t0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: t2 */
    public final eh9 mo9214t2() {
        return this.f29348d.mo9214t2();
    }

    /* JADX INFO: renamed from: t3 */
    public final int m9340t3() {
        Iterator it = ((Iterable) this.f29269D0.getValue()).iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((ox7) it.next()).f55132e.size();
        }
        return size;
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f29376k.mo8778u0();
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: u1 */
    public final void mo49u1(LessonEngagedDataType lessonEngagedDataType, Number number) {
        lessonEngagedDataType.getClass();
        this.f29388n.mo49u1(lessonEngagedDataType, number);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m9341u3(int i, boolean z) {
        C3244l c3244l = this.f29316T;
        if (((Number) c3244l.getValue()).intValue() != i) {
            if (this.f29341b0 == null) {
                this.f29341b0 = Long.valueOf(y02.m24805c());
            }
            int iM9323d3 = m9323d3();
            g41 g41VarM16103C = lda.m16103C(this);
            xz7 xz7Var = null;
            ReaderViewModel$updateLessonReadStat$1 readerViewModel$updateLessonReadStat$1 = new ReaderViewModel$updateLessonReadStat$1(this, iM9323d3, null);
            nn1 nn1Var = this.f29301O;
            wfb.m23926u(g41VarM16103C, nn1Var, null, readerViewModel$updateLessonReadStat$1, 2);
            C3244l c3244l2 = this.f29325W;
            boolean zBooleanValue = ((Boolean) c3244l2.getValue()).booleanValue();
            C3244l c3244l3 = this.f29322V;
            if (zBooleanValue) {
                c3244l3.m15571i(c3244l.getValue());
            }
            int iIntValue = ((Number) c3244l3.getValue()).intValue();
            int i2 = i - 1;
            if (iIntValue == i2 && ((Boolean) c3244l2.getValue()).booleanValue()) {
                C3509qs c3509qs = this.f29280H;
                if (!c3509qs.f58118b.getBoolean("didPageAdvanced", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("Lesson ID", m9332l3());
                    bundle.putString("sentence or page", m9331k3() ? "sentence" : "page");
                    ((C1240a) this.f29292L).m7025f("Page advanced", bundle);
                    SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                    editorEdit.getClass();
                    editorEdit.putBoolean("didPageAdvanced", true);
                    editorEdit.apply();
                    AbstractC1263a.m7046a(this.f29315S1);
                    this.f29315S1 = wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReaderViewModel$updateLessonStats$1(this, null), 2);
                }
                mo8740G(TooltipStep.SentenceMode);
                mo8740G(TooltipStep.SwipePageHighlight);
            }
            Integer numValueOf = Integer.valueOf(i);
            c3244l.getClass();
            c3244l.m15572j(null, numValueOf);
            this.f29341b0 = Long.valueOf(y02.m24805c());
            mo8745Q();
            C3244l c3244l4 = this.f29269D0;
            int size = ((List) c3244l4.getValue()).size();
            if (i >= 0 && i < size && z) {
                List list = ((ox7) ((List) c3244l4.getValue()).get(i)).f55132e;
                xz7 xz7Var2 = (xz7) u91.m22591I0(list);
                if (((List) c3244l4.getValue()).size() > 1 && i2 >= 0) {
                    xz7Var = (xz7) u91.m22598P0(((ox7) ((List) c3244l4.getValue()).get(i2)).f55132e);
                }
                if (xz7Var2 != null) {
                    int i3 = xz7Var2.f69010g;
                    int i4 = 1;
                    while (i4 < list.size() - 1 && ((xz7) list.get(i4)).f69010g <= i3) {
                        i4++;
                    }
                    if (i4 >= list.size() || xz7Var == null || i3 != xz7Var.f69010g) {
                        m9321b3(((xz7) list.get(i4 - 1)).f69009f);
                    } else {
                        m9321b3(((xz7) list.get(i4)).f69009f);
                    }
                }
            }
            mo8735B();
        }
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f29380l.mo9034v0(appUsageType);
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: v1 */
    public final Object mo8237v1(ReaderFont readerFont, ContinuationImpl continuationImpl) {
        return this.f29364h.mo8237v1(readerFont, continuationImpl);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f29344c.mo8779v2();
    }

    /* JADX INFO: renamed from: v3 */
    public final void m9342v3(boolean z) {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f29347c2;
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.valueOf(z)));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f29376k.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f29340b.mo4597w0(continuation);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: w1 */
    public final Object mo3012w1(Continuation continuation) {
        return this.f29391o.mo3012w1(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f29340b.mo4598w2();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m9343w3(int i) {
        wfb.m23926u(lda.m16103C(this), this.f29301O, null, new ReaderViewModel$updateStreakChallenge$1(this, i, null), 2);
        Boolean bool = Boolean.FALSE;
        C3244l c3244l = this.f29392o0;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        Bundle bundle = new Bundle();
        bundle.putInt("streak challenge selected", i);
        ((C1240a) this.f29292L).m7025f("streak challenge popup clicked", bundle);
        this.f29356f.mo7016z1(new go3(GoalMetType.StreakChallenge, 0));
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: y */
    public final void mo50y(LqAnalyticsValues$LessonExitPath lqAnalyticsValues$LessonExitPath) {
        lqAnalyticsValues$LessonExitPath.getClass();
        this.f29388n.mo50y(lqAnalyticsValues$LessonExitPath);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f29376k.mo8781y0();
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z */
    public final void mo3013z(RatingContentType ratingContentType) {
        ratingContentType.getClass();
        this.f29391o.mo3013z(ratingContentType);
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: z1 */
    public final void mo7016z1(go3 go3Var) {
        go3Var.getClass();
        this.f29356f.mo7016z1(go3Var);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z2 */
    public final void mo3014z2(boolean z) {
        this.f29391o.mo3014z2(z);
    }
}
