package com.lingq.feature.reader.reader;

import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerViewState;
import com.lingq.core.player.data.PlayingSource;
import com.lingq.core.player.service.PlayingFrom;
import com.lingq.feature.reader.buylesson.C2256a;
import com.lingq.feature.reader.content.C2260a;
import com.lingq.feature.reader.content.state.C2264a;
import com.lingq.feature.reader.content.state.C2265b;
import com.lingq.feature.reader.content.state.C2266c;
import com.lingq.feature.reader.milestones.C2268b;
import com.lingq.feature.reader.milestones.state.C2272a;
import com.lingq.feature.reader.playback.C2465a;
import com.lingq.feature.reader.playback.state.C2468a;
import com.lingq.feature.reader.preferences.C2469a;
import com.lingq.feature.reader.progress.C2470a;
import com.lingq.feature.reader.reader.domain.C2497a;
import com.lingq.feature.reader.reader.domain.C2498b;
import com.lingq.feature.reader.reader.state.C2502a;
import com.lingq.feature.reader.reader.state.C2503b;
import com.lingq.feature.reader.settings.C2507a;
import com.lingq.feature.reader.simplify.C2518a;
import com.lingq.feature.reader.tracking.C2574a;
import com.lingq.feature.reader.tracking.TrackingPauseReason;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import org.joda.time.DateTime;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.ap1;
import p000.ar7;
import p000.as7;
import p000.at7;
import p000.au7;
import p000.b23;
import p000.bia;
import p000.bs7;
import p000.bt7;
import p000.bx7;
import p000.c18;
import p000.c83;
import p000.ck6;
import p000.cl9;
import p000.cma;
import p000.cs7;
import p000.ct7;
import p000.cx1;
import p000.d27;
import p000.d87;
import p000.ds7;
import p000.dt7;
import p000.e23;
import p000.e28;
import p000.ea7;
import p000.eh9;
import p000.es7;
import p000.et7;
import p000.f08;
import p000.f41;
import p000.fa4;
import p000.fs7;
import p000.ft7;
import p000.g41;
import p000.gm5;
import p000.gs7;
import p000.gt7;
import p000.h0a;
import p000.hl7;
import p000.hs7;
import p000.ht7;
import p000.hv7;
import p000.hx7;
import p000.ia4;
import p000.is7;
import p000.it7;
import p000.iu7;
import p000.j13;
import p000.jr7;
import p000.js7;
import p000.jt7;
import p000.jv7;
import p000.jy7;
import p000.k55;
import p000.kr7;
import p000.ks7;
import p000.kt7;
import p000.lda;
import p000.lr7;
import p000.ls7;
import p000.lt7;
import p000.m83;
import p000.m97;
import p000.mq7;
import p000.mr7;
import p000.ms7;
import p000.mt7;
import p000.mv7;
import p000.n23;
import p000.n84;
import p000.nl8;
import p000.nr7;
import p000.ns7;
import p000.nt7;
import p000.o23;
import p000.og8;
import p000.or7;
import p000.os7;
import p000.ot7;
import p000.ox7;
import p000.p33;
import p000.pg9;
import p000.pr7;
import p000.ps7;
import p000.pt7;
import p000.qr7;
import p000.qs7;
import p000.qt7;
import p000.qx8;
import p000.r23;
import p000.rm5;
import p000.rr7;
import p000.rs7;
import p000.sm5;
import p000.sr7;
import p000.ss7;
import p000.st7;
import p000.tb7;
import p000.tr7;
import p000.ts7;
import p000.u91;
import p000.ur7;
import p000.us7;
import p000.ut7;
import p000.v15;
import p000.v91;
import p000.vk9;
import p000.vr7;
import p000.vs7;
import p000.vt7;
import p000.vz1;
import p000.wfb;
import p000.wr7;
import p000.ws7;
import p000.wt7;
import p000.wta;
import p000.wz0;
import p000.xi9;
import p000.xr7;
import p000.xs7;
import p000.xt7;
import p000.xz7;
import p000.y15;
import p000.yr7;
import p000.ys7;
import p000.yz4;
import p000.zl3;
import p000.zr7;
import p000.zs7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493a extends wta implements cma, InterfaceC3733ws, bia {
    private static final hv7 Companion = new hv7();

    /* JADX INFO: renamed from: A */
    public final b23 f30179A;

    /* JADX INFO: renamed from: B */
    public final C2498b f30180B;

    /* JADX INFO: renamed from: C */
    public final zl3 f30181C;

    /* JADX INFO: renamed from: D */
    public final C2497a f30182D;

    /* JADX INFO: renamed from: E */
    public final C3139j9 f30183E;

    /* JADX INFO: renamed from: F */
    public final r23 f30184F;

    /* JADX INFO: renamed from: G */
    public final e23 f30185G;

    /* JADX INFO: renamed from: H */
    public final C2574a f30186H;

    /* JADX INFO: renamed from: I */
    public final y15 f30187I;

    /* JADX INFO: renamed from: J */
    public final iu7 f30188J;

    /* JADX INFO: renamed from: K */
    public boolean f30189K;

    /* JADX INFO: renamed from: L */
    public final int f30190L;

    /* JADX INFO: renamed from: M */
    public boolean f30191M;

    /* JADX INFO: renamed from: N */
    public boolean f30192N;

    /* JADX INFO: renamed from: O */
    public boolean f30193O;

    /* JADX INFO: renamed from: P */
    public final boolean f30194P;

    /* JADX INFO: renamed from: Q */
    public LqAnalyticsValues$LessonExitPath f30195Q;

    /* JADX INFO: renamed from: R */
    public final C3244l f30196R;

    /* JADX INFO: renamed from: S */
    public final C3244l f30197S;

    /* JADX INFO: renamed from: T */
    public final c18 f30198T;

    /* JADX INFO: renamed from: U */
    public final C3244l f30199U;

    /* JADX INFO: renamed from: V */
    public final c18 f30200V;

    /* JADX INFO: renamed from: W */
    public final c18 f30201W;

    /* JADX INFO: renamed from: X */
    public final c18 f30202X;

    /* JADX INFO: renamed from: Y */
    public final c18 f30203Y;

    /* JADX INFO: renamed from: Z */
    public final c18 f30204Z;

    /* JADX INFO: renamed from: a0 */
    public final c18 f30205a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f30206b;

    /* JADX INFO: renamed from: b0 */
    public final c18 f30207b0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3733ws f30208c;

    /* JADX INFO: renamed from: c0 */
    public final c18 f30209c0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f30210d;

    /* JADX INFO: renamed from: d0 */
    public final c18 f30211d0;

    /* JADX INFO: renamed from: e */
    public final C2260a f30212e;

    /* JADX INFO: renamed from: e0 */
    public final c18 f30213e0;

    /* JADX INFO: renamed from: f */
    public final C2264a f30214f;

    /* JADX INFO: renamed from: f0 */
    public final c18 f30215f0;

    /* JADX INFO: renamed from: g */
    public final p33 f30216g;

    /* JADX INFO: renamed from: g0 */
    public final c18 f30217g0;

    /* JADX INFO: renamed from: h */
    public final C2465a f30218h;

    /* JADX INFO: renamed from: i */
    public final C2507a f30219i;

    /* JADX INFO: renamed from: j */
    public final C2469a f30220j;

    /* JADX INFO: renamed from: k */
    public final C2266c f30221k;

    /* JADX INFO: renamed from: l */
    public final C2502a f30222l;

    /* JADX INFO: renamed from: m */
    public final C2503b f30223m;

    /* JADX INFO: renamed from: n */
    public final C2468a f30224n;

    /* JADX INFO: renamed from: o */
    public final C2265b f30225o;

    /* JADX INFO: renamed from: p */
    public final C2470a f30226p;

    /* JADX INFO: renamed from: q */
    public final C2268b f30227q;

    /* JADX INFO: renamed from: r */
    public final ar7 f30228r;

    /* JADX INFO: renamed from: s */
    public final C2256a f30229s;

    /* JADX INFO: renamed from: t */
    public final C2518a f30230t;

    /* JADX INFO: renamed from: u */
    public final ck6 f30231u;

    /* JADX INFO: renamed from: v */
    public final mq7 f30232v;

    /* JADX INFO: renamed from: w */
    public final n23 f30233w;

    /* JADX INFO: renamed from: x */
    public final o23 f30234x;

    /* JADX INFO: renamed from: y */
    public final j13 f30235y;

    /* JADX INFO: renamed from: z */
    public final og8 f30236z;

    public C2493a(f41 f41Var, C2260a c2260a, C2264a c2264a, p33 p33Var, C2465a c2465a, C2507a c2507a, C2469a c2469a, C2266c c2266c, C2502a c2502a, C2503b c2503b, C2468a c2468a, C2265b c2265b, C2470a c2470a, C2268b c2268b, ar7 ar7Var, C2256a c2256a, C2518a c2518a, ck6 ck6Var, mq7 mq7Var, n23 n23Var, o23 o23Var, ck6 ck6Var2, j13 j13Var, og8 og8Var, b23 b23Var, C2498b c2498b, zl3 zl3Var, C2497a c2497a, C3139j9 c3139j9, r23 r23Var, e23 e23Var, C2574a c2574a, y15 y15Var, cma cmaVar, InterfaceC3733ws interfaceC3733ws, bia biaVar, nl8 nl8Var) {
        Integer num;
        String str;
        Boolean bool;
        f41Var.getClass();
        c2260a.getClass();
        c18 c18Var = c2260a.f27957w;
        c2264a.getClass();
        ar7Var.getClass();
        og8Var.getClass();
        y15Var.getClass();
        cmaVar.getClass();
        interfaceC3733ws.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f30206b = cmaVar;
        this.f30208c = interfaceC3733ws;
        this.f30210d = biaVar;
        this.f30212e = c2260a;
        this.f30214f = c2264a;
        this.f30216g = p33Var;
        this.f30218h = c2465a;
        this.f30219i = c2507a;
        this.f30220j = c2469a;
        this.f30221k = c2266c;
        this.f30222l = c2502a;
        this.f30223m = c2503b;
        this.f30224n = c2468a;
        this.f30225o = c2265b;
        this.f30226p = c2470a;
        this.f30227q = c2268b;
        this.f30228r = ar7Var;
        this.f30229s = c2256a;
        this.f30230t = c2518a;
        this.f30231u = ck6Var;
        this.f30232v = mq7Var;
        this.f30233w = n23Var;
        this.f30234x = o23Var;
        this.f30235y = j13Var;
        this.f30236z = og8Var;
        this.f30179A = b23Var;
        this.f30180B = c2498b;
        this.f30181C = zl3Var;
        this.f30182D = c2497a;
        this.f30183E = c3139j9;
        this.f30184F = r23Var;
        this.f30185G = e23Var;
        this.f30186H = c2574a;
        this.f30187I = y15Var;
        iu7.Companion.getClass();
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
        this.f30188J = new iu7(iIntValue, lqAnalyticsValues$LessonPath, iIntValue2, str, zBooleanValue, str2);
        this.f30190L = iIntValue;
        m24153Q2(f41Var);
        this.f30194P = zBooleanValue;
        this.f30196R = AbstractC3352my.m17114d(new k55(false, 0L, 0L, 15));
        this.f30197S = AbstractC3352my.m17114d(null);
        C3235e c3235eM15521C = AbstractC3224d.m15521C(AbstractC3224d.m15536o(new mv7(c18Var, 0)), new ReaderComposeViewModel$special$$inlined$flatMapLatest$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f30198T = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, EmptyList.f47638a);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new f08());
        this.f30199U = c3244lM17114d;
        this.f30200V = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), c3243k, new f08());
        AbstractC3224d.m15520B(AbstractC3224d.m15536o(new mv7(c18Var, 1)), lda.m16103C(this), c3243k, Boolean.FALSE);
        c18 c18Var2 = c2469a.f29837c;
        this.f30201W = c18Var2;
        this.f30202X = c2469a.f29838d;
        this.f30203Y = c2469a.f29840f;
        c18 c18VarM15520B = AbstractC3224d.m15520B(new wz0(16, ((cma) ck6Var2.f10194b).mo4572B0(), ck6Var2), lda.m16103C(this), c3243k, null);
        int i = 4;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(new jv7(c18Var, this, i), lda.m16103C(this), c3243k, new v15(0, false, false));
        int i2 = 2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new mv7(c18Var, i2)), new ReaderComposeViewModel$special$$inlined$flatMapLatest$2(this, null)), lda.m16103C(this), c3243k, new ap1(false, false));
        AbstractC3224d.m15545x(new m83(new C3540rl(AbstractC3224d.m15536o(new mv7(c18Var, 3)), 5), new ReaderComposeViewModel$2(this, null), i2), lda.m16103C(this));
        this.f30204Z = AbstractC3224d.m15520B(AbstractC3224d.m15530i(c18VarM15520B, c18VarM15520B2, AbstractC3224d.m15536o(new mv7(c18Var, i)), c2518a.f30506o, c18VarM15520B3, new ReaderComposeViewModel$menuState$2(this, null)), lda.m16103C(this), c3243k, new hx7(null, null, null, false, false, false, 255));
        this.f30205a0 = c2268b.f28175h;
        this.f30207b0 = c2268b.f28172e.f28216e;
        this.f30209c0 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new mv7(c18Var, 5)), new ReaderComposeViewModel$special$$inlined$flatMapLatest$3(this, null)), lda.m16103C(this), c3243k, null);
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(new C3228h(c2264a.f28131t, c18Var, new ReaderComposeViewModel$pageReviewCards$1(this, null)), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f30211d0 = c18VarM15520B4;
        this.f30213e0 = AbstractC3224d.m15520B(new cx1(c18VarM15520B4, 1), lda.m16103C(this), c3243k, 0);
        this.f30215f0 = AbstractC3224d.m15520B(new C3228h(c2264a.f28110F, c18Var, new ReaderComposeViewModel$sentenceReviewCount$1(3, null)), lda.m16103C(this), c3243k, 0);
        this.f30217g0 = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c18Var2, c2264a.f28106B, AbstractC3224d.m15536o(new mv7(c18Var, 6)), new ReaderComposeViewModel$maxAllowedPage$2(4, null)), lda.m16103C(this), c3243k, 0);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f30206b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f30206b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f30206b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f30206b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f30206b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f30206b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f30206b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f30206b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f30206b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f30206b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f30206b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f30210d.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f30206b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f30206b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f30206b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f30206b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f30206b.mo4586T0();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        this.f30191M = false;
        if (this.f30192N) {
            mo9034v0(AppUsageType.Reading);
            this.f30192N = false;
        }
        m9396c3();
        this.f30186H.m9505p();
        this.f30232v.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:275:0x083e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0846  */
    /* JADX WARN: Code duplicated, block: B:458:0x083b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: V2 */
    public final void m9389V2(pt7 pt7Var) {
        Object value;
        yz4 yz4Var;
        EmptyList emptyList;
        tb7 tb7VarM12625d;
        Object value2;
        int i;
        ?? arrayList;
        int iAbs;
        List list;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        yz4 yz4Var2;
        Object value7;
        Map map;
        qx8 qx8Var;
        Object value8;
        Map map2;
        qx8 qx8Var2;
        Object value9;
        Object value10;
        xz7 xz7Var;
        pt7Var.getClass();
        Object next = null;
        if (pt7Var instanceof ps7) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$refreshLesson$1(this, null), 3);
            return;
        }
        if (pt7Var instanceof rs7) {
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$loadLesson$1(this, null), 3);
            return;
        }
        boolean z = pt7Var instanceof gs7;
        boolean z2 = this.f30194P;
        cma cmaVar = this.f30206b;
        c18 c18Var = this.f30201W;
        int i2 = this.f30190L;
        C2469a c2469a = this.f30220j;
        C2260a c2260a = this.f30212e;
        mq7 mq7Var = this.f30232v;
        C2503b c2503b = this.f30223m;
        C2465a c2465a = this.f30218h;
        p33 p33Var = this.f30216g;
        if (z) {
            c2503b.m9406b(TooltipStep.SwipePageHighlight);
            int i3 = ((gs7) pt7Var).f41267a;
            c18 c18Var2 = c2260a.f27957w;
            int i4 = ((yz4) ((C3244l) c18Var2.f9311a).getValue()).f70680n;
            if (i3 == i4) {
                return;
            }
            p33Var.m18866H();
            List list2 = ((yz4) ((C3244l) c18Var2.f9311a).getValue()).f70670d;
            if (i3 > i4) {
                mq7Var.m17001k(new ut7(i2, ((Boolean) c2260a.f27940f.f27983d.getValue()).booleanValue()));
                wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$onPageChanged$1(this, null), 3);
            }
            c2260a.m9255h(i3);
            m9394a3(i4, i3);
            this.f30226p.m9374b(((Boolean) ((C3244l) c18Var.f9311a).getValue()).booleanValue(), cmaVar.mo4589b2(), this.f30190L, i4, i3, list2);
            if (z2) {
                C3244l c3244l = c2465a.f29782p;
                do {
                    value10 = c3244l.getValue();
                } while (!c3244l.m15570h(value10, jy7.m14750a((jy7) value10, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65247)));
                c2465a.f29768b.mo8482P();
                ox7 ox7Var = (ox7) u91.m22592J0(i3, list2);
                Integer numValueOf = (ox7Var == null || (xz7Var = (xz7) u91.m22591I0(ox7Var.f55132e)) == null) ? null : Integer.valueOf(xz7Var.f69010g);
                if (numValueOf != null) {
                    Lesson lesson = ((yz4) ((C3244l) c18Var2.f9311a).getValue()).f70667a;
                    boolean z3 = (lesson != null ? lesson.f19162u : null) != null;
                    if (!((Boolean) ((C3244l) c2469a.f29845k.f9311a).getValue()).booleanValue() || z3) {
                        return;
                    }
                    c2465a.m9363e(ox7Var.f55131d, numValueOf.intValue(), ((Number) ((C3244l) c2469a.f29842h.f9311a).getValue()).floatValue());
                    return;
                }
                return;
            }
            return;
        }
        if (pt7Var instanceof wr7) {
            int i5 = ((wr7) pt7Var).f67206a;
            int i6 = ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70680n;
            this.f30226p.m9375c(((Boolean) ((C3244l) c18Var.f9311a).getValue()).booleanValue(), cmaVar.mo4589b2(), this.f30190L, i6, i5, ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70670d);
            c2260a.m9255h(i5);
            m9394a3(i6, i5);
            return;
        }
        boolean z4 = pt7Var instanceof ft7;
        C2264a c2264a = this.f30214f;
        if (z4) {
            m9391X2(true);
            ft7 ft7Var = (ft7) pt7Var;
            xz7 xz7Var2 = ft7Var.f39627a;
            boolean z5 = ft7Var.f39629c;
            p33Var.m18867I();
            p33Var.m18878W(xz7Var2, z5);
            m9392Y2(xz7Var2.f69009f);
            Map map3 = (Map) ((C3244l) c2264a.f28131t.f9311a).getValue();
            String str = xz7Var2.f69008e;
            LessonCard lessonCard = (LessonCard) map3.get(str);
            LessonWord lessonWord = (LessonWord) ((Map) ((C3244l) c2264a.f28132u.f9311a).getValue()).get(str);
            if (lessonCard != null) {
                mq7Var.m17001k(new qt7(lessonCard.f19188k));
                return;
            } else {
                if (lessonWord != null) {
                    mq7Var.m17001k(new au7(fa4.m11650l(lessonWord.f19322i, WordStatus.Known.getValue())));
                    return;
                }
                return;
            }
        }
        if (pt7Var instanceof js7) {
            m9391X2(true);
            p33Var.m18867I();
            p33Var.m18877V(((js7) pt7Var).f46077a);
            return;
        }
        if (pt7Var instanceof bt7) {
            m9391X2(false);
            p33Var.m18878W(null, false);
            p33Var.m18867I();
            return;
        }
        if (pt7Var instanceof ur7) {
            m9390W2();
            p33Var.m18866H();
            return;
        }
        if (pt7Var instanceof sr7) {
            m9390W2();
            p33Var.m18875T();
            return;
        }
        if (pt7Var instanceof cs7) {
            m9391X2(false);
            cs7 cs7Var = (cs7) pt7Var;
            String str2 = cs7Var.f34493a;
            e28 e28Var = cs7Var.f34494b;
            p33Var.getClass();
            str2.getClass();
            e28Var.getClass();
            C3244l c3244l2 = (C3244l) p33Var.f55513b;
            c3244l2.m15572j(null, bx7.m4221a((bx7) c3244l2.getValue(), null, null, null, false, false, new ia4(str2, e28Var), false, 95));
            return;
        }
        if (pt7Var instanceof kr7) {
            C3244l c3244l3 = (C3244l) p33Var.f55513b;
            c3244l3.m15572j(null, bx7.m4221a((bx7) c3244l3.getValue(), null, null, null, false, false, null, false, 111));
            return;
        }
        if (pt7Var instanceof ls7) {
            c2503b.m9406b(TooltipStep.PlayAudioHighlight);
            c2465a.m9362d();
            return;
        }
        if (pt7Var instanceof yr7) {
            C1808b c1808b = c2465a.f29767a;
            c1808b.m8447J();
            C3244l c3244l4 = c2465a.f29782p;
            do {
                value9 = c3244l4.getValue();
            } while (!c3244l4.m15570h(value9, jy7.m14750a((jy7) value9, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65532)));
            c1808b.m8466e0(PlayerViewState.Closed);
            return;
        }
        if (pt7Var instanceof ts7) {
            c2465a.f29767a.m8442C(ea7.f36936d);
            return;
        }
        boolean z6 = pt7Var instanceof ht7;
        C3244l c3244l5 = this.f30199U;
        if (z6) {
            f08 f08VarM11428a = f08.m11428a((f08) c3244l5.getValue(), false, false, false, ((ht7) pt7Var).f42931a, 7);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a);
            return;
        }
        boolean z7 = pt7Var instanceof zs7;
        C2574a c2574a = this.f30186H;
        if (z7) {
            c2574a.m9503n(TrackingPauseReason.Settings, true, true, true);
            f08 f08VarM11428a2 = f08.m11428a((f08) c3244l5.getValue(), true, false, false, null, 14);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a2);
            return;
        }
        if (pt7Var instanceof as7) {
            c2574a.m9503n(TrackingPauseReason.Settings, false, true, true);
            f08 f08VarM11428a3 = f08.m11428a((f08) c3244l5.getValue(), false, false, false, null, 14);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a3);
            return;
        }
        if (pt7Var instanceof xs7) {
            c2574a.m9503n(TrackingPauseReason.Menu, true, true, true);
            f08 f08VarM11428a4 = f08.m11428a((f08) c3244l5.getValue(), false, true, false, null, 13);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a4);
            return;
        }
        if (pt7Var instanceof xr7) {
            c2574a.m9503n(TrackingPauseReason.Menu, false, true, true);
            f08 f08VarM11428a5 = f08.m11428a((f08) c3244l5.getValue(), false, false, false, null, 13);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a5);
            return;
        }
        if (pt7Var instanceof ys7) {
            c2503b.m9406b(TooltipStep.ReviewMenuHighlight);
            c2574a.m9503n(TrackingPauseReason.ReviewMenu, true, true, true);
            f08 f08VarM11428a6 = f08.m11428a((f08) c3244l5.getValue(), false, false, true, null, 11);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a6);
            return;
        }
        if (pt7Var instanceof zr7) {
            c2574a.m9503n(TrackingPauseReason.ReviewMenu, false, true, true);
            f08 f08VarM11428a7 = f08.m11428a((f08) c3244l5.getValue(), false, false, false, null, 11);
            c3244l5.getClass();
            c3244l5.m15572j(null, f08VarM11428a7);
            return;
        }
        boolean z8 = pt7Var instanceof et7;
        C2266c c2266c = this.f30221k;
        if (z8) {
            Map map4 = (Map) ((C3244l) c2266c.f28150f.f9311a).getValue();
            int i7 = ((et7) pt7Var).f37829a;
            qx8 qx8Var3 = (qx8) map4.get(Integer.valueOf(i7));
            if (qx8Var3 == null || !qx8Var3.f58340a) {
                mq7Var.m17001k(new xt7());
            }
            c2266c.m9276e(i7);
            return;
        }
        if (pt7Var instanceof qs7) {
            int i8 = ((qs7) pt7Var).f58145a;
            C3244l c3244l6 = c2266c.f28149e;
            do {
                value8 = c3244l6.getValue();
                map2 = (Map) value8;
                qx8Var2 = (qx8) map2.get(Integer.valueOf(i8));
                if (qx8Var2 == null) {
                    qx8Var2 = new qx8();
                }
            } while (!c3244l6.m15570h(value8, AbstractC3194a.m15368U(map2, new Pair(Integer.valueOf(i8), qx8.m20194a(qx8Var2, false, true, null, null, null, false, 53)))));
            c2266c.m9272a(i8);
            return;
        }
        if (pt7Var instanceof dt7) {
            Map map5 = (Map) ((C3244l) c2266c.f28150f.f9311a).getValue();
            int i9 = ((dt7) pt7Var).f36215a;
            qx8 qx8Var4 = (qx8) map5.get(Integer.valueOf(i9));
            if (qx8Var4 == null || !qx8Var4.f58345f) {
                mq7Var.m17001k(wt7.f67282c);
            }
            C3244l c3244l7 = c2266c.f28149e;
            do {
                value7 = c3244l7.getValue();
                map = (Map) value7;
                qx8 qx8Var5 = (qx8) map.get(Integer.valueOf(i9));
                if (qx8Var5 == null) {
                    qx8Var5 = new qx8();
                }
                qx8Var = qx8Var5;
            } while (!c3244l7.m15570h(value7, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i9), qx8.m20194a(qx8Var, false, false, null, null, null, !qx8Var.f58345f, 31)))));
            return;
        }
        if (pt7Var instanceof ms7) {
            mq7Var.m17001k(vt7.f65893c);
            ms7 ms7Var = (ms7) pt7Var;
            int i10 = ms7Var.f51804a;
            m9393Z2(i10);
            c2465a.m9363e(ms7Var.f51805b, i10, ms7Var.f51806c);
            return;
        }
        if (pt7Var instanceof mt7) {
            return;
        }
        if (pt7Var instanceof ot7) {
            c2264a.m9263e(((ot7) pt7Var).f54969a);
            return;
        }
        if (pt7Var instanceof lt7) {
            lt7 lt7Var = (lt7) pt7Var;
            c2264a.m9270l(lt7Var.f50115a, lt7Var.f50116b);
            return;
        }
        if (pt7Var instanceof nt7) {
            C2465a.m9359f(c2465a, ((nt7) pt7Var).f53240a);
            return;
        }
        if (pt7Var instanceof kt7) {
            kt7 kt7Var = (kt7) pt7Var;
            c2264a.m9268j(kt7Var.f48414a, kt7Var.f48415b);
            return;
        }
        if (pt7Var instanceof ds7) {
            return;
        }
        if (pt7Var instanceof os7) {
            Set setKeySet = ((Map) ((C3244l) this.f30211d0.f9311a).getValue()).keySet();
            og8 og8Var = this.f30236z;
            og8Var.getClass();
            setKeySet.getClass();
            og8Var.f54320a = setKeySet;
            return;
        }
        if (pt7Var instanceof rr7) {
            C3244l c3244l8 = c2260a.f27949o;
            do {
                value6 = c3244l8.getValue();
                yz4Var2 = (yz4) value6;
            } while (!c3244l8.m15570h(value6, yz4.m25387a(yz4Var2, null, null, null, null, null, null, false, null, false, false, null, null, new hl7(false, yz4Var2.f70679m.f42581b, true), 0, 0, false, null, null, false, false, null, 0, false, 8384511)));
            return;
        }
        if (pt7Var instanceof mr7) {
            C3244l c3244l9 = c2260a.f27949o;
            do {
                value5 = c3244l9.getValue();
            } while (!c3244l9.m15570h(value5, yz4.m25387a((yz4) value5, null, null, null, null, null, null, false, null, false, false, null, null, new hl7(null, 7), 0, 0, false, null, null, false, false, null, 0, false, 8384511)));
            return;
        }
        if (pt7Var instanceof pr7) {
            C3244l c3244l10 = c2465a.f29782p;
            do {
                value4 = c3244l10.getValue();
            } while (!c3244l10.m15570h(value4, jy7.m14750a((jy7) value4, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 64511)));
            return;
        }
        if (pt7Var instanceof lr7) {
            mq7Var.m17001k(st7.f61394c);
            c2465a.m9361c();
            return;
        }
        if (pt7Var instanceof or7) {
            C3244l c3244l11 = c2465a.f29782p;
            do {
                value3 = c3244l11.getValue();
            } while (!c3244l11.m15570h(value3, jy7.m14750a((jy7) value3, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 61439)));
            return;
        }
        boolean z9 = pt7Var instanceof bs7;
        EmptyList emptyList2 = EmptyList.f47638a;
        if (z9) {
            bs7 bs7Var = (bs7) pt7Var;
            TokenRelatedPhrase tokenRelatedPhrase = bs7Var.f8947a;
            boolean z10 = bs7Var.f8948b;
            int i11 = ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70680n;
            Map map6 = (Map) ((C3244l) c2264a.f28108D.f9311a).getValue();
            List list3 = ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70670d;
            p33Var.getClass();
            tokenRelatedPhrase.getClass();
            String str3 = tokenRelatedPhrase.f19612a;
            String str4 = tokenRelatedPhrase.f19613b;
            map6.getClass();
            list3.getClass();
            d27 d27Var = (d27) map6.get(Integer.valueOf(i11));
            xz7 xz7Var3 = ((bx7) ((C3244l) p33Var.f55513b).getValue()).f9137a;
            int i12 = xz7Var3 != null ? xz7Var3.f69004a : 0;
            if (d27Var == null || (list = d27Var.f34870b) == null) {
                arrayList = emptyList2;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    d87 d87Var = (d87) obj;
                    String str5 = d87Var.f35175d;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str5.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = str4.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (!lowerCase.equals(lowerCase2)) {
                        String lowerCase3 = d87Var.f35175d.toLowerCase(locale);
                        lowerCase3.getClass();
                        String lowerCase4 = str3.toLowerCase(locale);
                        lowerCase4.getClass();
                        if (lowerCase3.equals(lowerCase4)) {
                        }
                    }
                    arrayList.add(obj);
                }
            }
            Iterator it = ((Iterable) arrayList).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iAbs2 = Math.abs(((d87) next).f35173b - i12);
                    do {
                        Object next2 = it.next();
                        int iAbs3 = Math.abs(((d87) next2).f35173b - i12);
                        if (iAbs2 > iAbs3) {
                            next = next2;
                            iAbs2 = iAbs3;
                        }
                    } while (it.hasNext());
                }
            }
            d87 d87Var2 = (d87) next;
            if (d87Var2 != null) {
                p33Var.m18876U(new d87(d87Var2.f35172a, d87Var2.f35173b, d87Var2.f35174c, d87Var2.f35175d, d87Var2.f35176e, d87Var2.f35177f, d87Var2.f35178g, true), z10);
                return;
            }
            if (i11 < 0 || i11 >= list3.size()) {
                return;
            }
            ox7 ox7Var2 = (ox7) list3.get(i11);
            String str6 = ox7Var2.f55131d;
            boolean z11 = ox7Var2.f55137j;
            Locale locale2 = Locale.ROOT;
            String lowerCase5 = str6.toLowerCase(locale2);
            lowerCase5.getClass();
            String lowerCase6 = str3.toLowerCase(locale2);
            lowerCase6.getClass();
            String lowerCase7 = str4.toLowerCase(locale2);
            lowerCase7.getClass();
            Collection collectionM23605K = vz1.m23605K(lowerCase6, lowerCase7);
            if (!z11) {
                Collection collection = collectionM23605K;
                Collection collection2 = collectionM23605K;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(collection2, 10));
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(cl9.m4839V((String) it2.next(), " ", ""));
                }
                collectionM23605K = u91.m22603U0(arrayList2, collection);
            }
            int i13 = -1;
            int i14 = Integer.MAX_VALUE;
            int length = 0;
            for (String str7 : u91.m22622n1(u91.m22626r1(collectionM23605K))) {
                if (str7.length() != 0) {
                    int i15 = 0;
                    while (true) {
                        int iM23389l0 = vk9.m23389l0(lowerCase5, str7, i15, false, 4);
                        if (iM23389l0 >= 0) {
                            if (z11) {
                                Character chM23385h0 = vk9.m23385h0(iM23389l0 - 1, lowerCase5);
                                Character chM23385h1 = vk9.m23385h0(str7.length() + iM23389l0, lowerCase5);
                                if ((chM23385h0 == null || !Character.isLetterOrDigit(chM23385h0.charValue())) && (chM23385h1 == null || !Character.isLetterOrDigit(chM23385h1.charValue()))) {
                                    iAbs = Math.abs(iM23389l0 - i12);
                                    if (iAbs < i14) {
                                        length = str7.length();
                                        i13 = iM23389l0;
                                        i14 = iAbs;
                                    }
                                }
                            } else {
                                iAbs = Math.abs(iM23389l0 - i12);
                                if (iAbs < i14) {
                                    length = str7.length();
                                    i13 = iM23389l0;
                                    i14 = iAbs;
                                }
                            }
                            i15 = iM23389l0 + 1;
                        }
                    }
                }
            }
            if (i13 >= 0) {
                int i16 = length + i13;
                p33Var.m18876U(new d87(-1, i13, i16, str6.substring(i13, i16), emptyList2, -1, null, true), z10);
                return;
            }
            return;
        }
        boolean z12 = pt7Var instanceof gt7;
        C2268b c2268b = this.f30227q;
        if (z12) {
            c2268b.m9279b(((gt7) pt7Var).f41301a);
            return;
        }
        if (pt7Var instanceof tr7) {
            c2268b.m9279b(0);
            return;
        }
        if (pt7Var instanceof qr7) {
            c2268b.f28172e.m9283a();
            return;
        }
        if (pt7Var instanceof jr7) {
            C2272a c2272a = c2268b.f28172e;
            pg9 pg9Var = c2272a.f28217f;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            c2272a.f28217f = null;
            return;
        }
        if (pt7Var instanceof at7) {
            this.f30230t.m9433a();
            return;
        }
        if (pt7Var instanceof ct7) {
            Lesson lesson2 = ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70667a;
            if (lesson2 == null || (i = lesson2.f19149h) <= 0) {
                return;
            }
            String strMo4589b2 = cmaVar.mo4589b2();
            if (vk9.m23391n0(strMo4589b2)) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$toggleCourseSubscription$1(this, i, strMo4589b2, null), 3);
            return;
        }
        boolean z13 = pt7Var instanceof it7;
        C3244l c3244l12 = this.f30196R;
        if (z13) {
            it7 it7Var = (it7) pt7Var;
            c3244l12.m15572j(null, k55.m14854a((k55) c3244l12.getValue(), it7Var.f44533a, 0L, (long) (it7Var.f44534b * 1000.0f), null, 10));
            return;
        }
        if (pt7Var instanceof jt7) {
            k55 k55VarM14854a = k55.m14854a((k55) c3244l12.getValue(), false, (long) (((jt7) pt7Var).f46129a * 1000.0f), 0L, null, 13);
            c3244l12.getClass();
            c3244l12.m15572j(null, k55VarM14854a);
            return;
        }
        if (pt7Var instanceof ws7) {
            c2469a.m9372b(((ws7) pt7Var).f67257a);
            return;
        }
        if (pt7Var instanceof vs7) {
            c2469a.m9371a(((vs7) pt7Var).f65862a);
            return;
        }
        boolean z14 = pt7Var instanceof fs7;
        ck6 ck6Var = this.f30231u;
        if (z14) {
            this.f30195Q = null;
            this.f30191M = true;
            rm5 rm5Var = sm5.Companion;
            String str8 = "[LessonTracking] ReaderComposeViewModel.OnSessionResume lessonId=" + i2 + " started=" + this.f30189K;
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str8, new Object[0]);
            c2574a.m9503n(TrackingPauseReason.SessionBackground, false, true, true);
            ((y15) ck6Var.f10194b).mo47b(new DateTime());
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$handleAction$7(this, null), 3);
            C1808b c1808b2 = c2465a.f29767a;
            c2465a.f29780n.mo9211g0(PlayingFrom.Lesson);
            tb7 tb7Var = c2465a.f29788v;
            if (tb7Var != null && (tb7VarM12625d = c1808b2.f21961n.m12625d()) != null && tb7VarM12625d.f62111k != PlayingSource.Reader) {
                c1808b2.m8447J();
                c1808b2.m8450M(false);
                C3244l c3244l13 = c2465a.f29782p;
                do {
                    value2 = c3244l13.getValue();
                } while (!c3244l13.m15570h(value2, jy7.m14750a((jy7) value2, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65532)));
                c1808b2.m8461a0(vz1.m23604J(tb7Var));
            }
            wfb.m23926u(lda.m16103C(this), null, null, new ReaderComposeViewModel$handleAction$8(this, null), 3);
            if (z2) {
                Lesson lesson3 = ((yz4) ((C3244l) c2260a.f27957w.f9311a).getValue()).f70667a;
                if ((lesson3 != null ? lesson3.f19162u : null) != null) {
                    m9397d3(((k55) c3244l12.getValue()).f46725a);
                    return;
                }
            }
            m9396c3();
            m9395b3();
            return;
        }
        if (pt7Var instanceof es7) {
            this.f30191M = false;
            rm5 rm5Var2 = sm5.Companion;
            String str9 = "[LessonTracking] ReaderComposeViewModel.OnSessionBackground lessonId=" + i2 + " started=" + this.f30189K;
            rm5Var2.getClass();
            h0a.f41641a.mo11431b(str9, new Object[0]);
            c2574a.m9503n(TrackingPauseReason.SessionBackground, true, true, true);
            if (this.f30192N) {
                mo9034v0(AppUsageType.Reading);
                this.f30192N = false;
            }
            m9396c3();
            mq7Var.getClass();
            LqAnalyticsValues$LessonExitPath lqAnalyticsValues$LessonExitPath = this.f30195Q;
            if (lqAnalyticsValues$LessonExitPath == null) {
                lqAnalyticsValues$LessonExitPath = LqAnalyticsValues$LessonExitPath.BackgroundedLingq;
            }
            ck6Var.getClass();
            lqAnalyticsValues$LessonExitPath.getClass();
            ((y15) ck6Var.f10194b).mo50y(lqAnalyticsValues$LessonExitPath);
            this.f30195Q = null;
            return;
        }
        if (pt7Var instanceof ns7) {
            c2574a.m9503n(TrackingPauseReason.SessionBackground, true, true, true);
            if (this.f30192N) {
                mo9034v0(AppUsageType.Reading);
                this.f30192N = false;
            }
            m9396c3();
            this.f30195Q = z2 ? LqAnalyticsValues$LessonExitPath.BackgroundedLingq : LqAnalyticsValues$LessonExitPath.QuitLesson;
            return;
        }
        if (pt7Var instanceof is7) {
            List list4 = ((is7) pt7Var).f44512a;
            c2260a.getClass();
            list4.getClass();
            if (c2260a.f27955u) {
                c2260a.m9249b(list4, ((yz4) c2260a.f27949o.getValue()).f70671e);
                return;
            } else {
                c2260a.f27954t = list4;
                return;
            }
        }
        if (pt7Var instanceof nr7) {
            long j = ((nr7) pt7Var).f53171a;
            c2260a.getClass();
            int i17 = (int) (j >> 32);
            if (i17 <= 0 || ((int) (4294967295L & j)) <= 0 || n84.m17279a(j, c2260a.f27956v)) {
                return;
            }
            long j2 = c2260a.f27956v;
            c2260a.f27956v = j;
            if (n84.m17279a(j2, 0L) || ((int) (j2 >> 32)) == i17) {
                return;
            }
            C3244l c3244l14 = c2260a.f27949o;
            do {
                value = c3244l14.getValue();
                yz4Var = (yz4) value;
                emptyList = emptyList2;
                emptyList2 = emptyList;
            } while (!c3244l14.m15570h(value, yz4.m25387a(yz4Var, null, null, null, emptyList, null, null, false, null, false, false, null, null, null, yz4Var.f70680n, 0, false, null, null, false, false, null, 0, false, 8347639)));
            return;
        }
        if (pt7Var instanceof hs7) {
            e28 e28Var2 = ((hs7) pt7Var).f42890a;
            c2503b.getClass();
            C3244l c3244l15 = c2503b.f30317f;
            c3244l15.getClass();
            c3244l15.m15572j(null, e28Var2);
            return;
        }
        if (pt7Var instanceof vr7) {
            vr7 vr7Var = (vr7) pt7Var;
            e28 e28Var3 = vr7Var.f65827a;
            xz7 xz7Var4 = vr7Var.f65828b;
            c2503b.f30318g.m15571i(e28Var3);
            c2503b.f30319h = xz7Var4;
            return;
        }
        if (pt7Var instanceof ks7) {
            e28 e28Var4 = ((ks7) pt7Var).f48391a;
            c2503b.getClass();
            e28Var4.getClass();
            C3244l c3244l16 = c2503b.f30314c;
            c3244l16.getClass();
            c3244l16.m15572j(null, e28Var4);
            return;
        }
        if (pt7Var instanceof us7) {
            e28 e28Var5 = ((us7) pt7Var).f64296a;
            c2503b.getClass();
            e28Var5.getClass();
            C3244l c3244l17 = c2503b.f30315d;
            c3244l17.getClass();
            c3244l17.m15572j(null, e28Var5);
            return;
        }
        if (!(pt7Var instanceof ss7)) {
            gm5.m12750e();
            return;
        }
        e28 e28Var6 = ((ss7) pt7Var).f61368a;
        c2503b.getClass();
        e28Var6.getClass();
        C3244l c3244l18 = c2503b.f30316e;
        c3244l18.getClass();
        c3244l18.m15572j(null, e28Var6);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9390W2() {
        Object value;
        boolean zBooleanValue = ((Boolean) ((C3244l) this.f30220j.f29839e.f9311a).getValue()).booleanValue();
        boolean z = ((bx7) ((C3244l) ((c18) this.f30216g.f55514c).f9311a).getValue()).f9143g;
        C2465a c2465a = this.f30218h;
        boolean z2 = ((jy7) ((C3244l) c2465a.f29783q.f9311a).getValue()).f46393a;
        this.f30186H.m9503n(TrackingPauseReason.Interaction, false, true, zBooleanValue);
        if (zBooleanValue && z && !z2) {
            c2465a.f29767a.m8458W();
            C3244l c3244l = c2465a.f29782p;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, true, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65534)));
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f30206b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9391X2(boolean z) {
        boolean zBooleanValue = ((Boolean) ((C3244l) this.f30220j.f29839e.f9311a).getValue()).booleanValue();
        this.f30186H.m9503n(TrackingPauseReason.Interaction, true, true, zBooleanValue);
        if (z && zBooleanValue) {
            p33 p33Var = this.f30216g;
            bx7 bx7Var = (bx7) ((C3244l) ((c18) p33Var.f55514c).f9311a).getValue();
            if (bx7Var.f9137a == null && bx7Var.f9138b == null) {
                p33Var.m18879X(((jy7) ((C3244l) this.f30218h.f29783q.f9311a).getValue()).f46393a);
            }
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9392Y2(int i) {
        Object value;
        yz4 yz4Var;
        LessonBookmark lessonBookmark;
        this.f30214f.m9269k(i, this.f30194P ? ReaderBookmarkMode.Sentence : ReaderBookmarkMode.Page);
        C2260a c2260a = this.f30212e;
        C3244l c3244l = c2260a.f27949o;
        do {
            value = c3244l.getValue();
            yz4Var = (yz4) value;
            lessonBookmark = yz4Var.f70671e;
            if (lessonBookmark == null) {
                lessonBookmark = new LessonBookmark(c2260a.f27950p, null, null, null, 126);
            }
        } while (!c3244l.m15570h(value, yz4.m25387a(yz4Var, null, null, null, null, new LessonBookmark(lessonBookmark.f19168a, lessonBookmark.f19174g, Integer.valueOf(i), lessonBookmark.f19170c, lessonBookmark.f19171d, lessonBookmark.f19172e, lessonBookmark.f19173f), null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388591)));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f30210d.mo3738Z();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9393Z2(int i) {
        Object next;
        List list = ((yz4) ((C3244l) this.f30212e.f27957w.f9311a).getValue()).f70670d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((xz7) next).f69010g != i);
        xz7 xz7Var = (xz7) next;
        if (xz7Var == null) {
            return;
        }
        m9392Y2(xz7Var.f69009f);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f30206b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9394a3(int i, int i2) {
        Integer numM9265g;
        if (i2 == i || (numM9265g = this.f30214f.m9265g(i2)) == null) {
            return;
        }
        m9392Y2(numM9265g.intValue());
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f30206b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9395b3() {
        if (!this.f30191M || this.f30192N) {
            return;
        }
        mo9033o1(AppUsageType.Reading, Integer.valueOf(this.f30190L));
        this.f30192N = true;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9396c3() {
        if (this.f30193O) {
            mo9034v0(AppUsageType.Listening);
            this.f30193O = false;
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f30206b.mo4590d0();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m9397d3(boolean z) {
        m97 m97Var = (m97) this.f30197S.getValue();
        boolean z2 = false;
        if (m97Var != null && !m97Var.m16697a(((k55) this.f30196R.getValue()).f46726b)) {
            z2 = true;
        }
        if (!z || z2) {
            m9396c3();
        } else if (this.f30191M && !this.f30193O) {
            mo9033o1(AppUsageType.Listening, Integer.valueOf(this.f30190L));
            this.f30193O = true;
        }
        m9395b3();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f30208c.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f30206b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f30210d.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f30210d.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f30206b.mo4592m0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f30208c.mo9033o1(appUsageType, num);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f30206b.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f30210d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f30206b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f30210d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f30206b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f30206b.mo4596t();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f30208c.mo9034v0(appUsageType);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f30206b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f30206b.mo4598w2();
    }
}
