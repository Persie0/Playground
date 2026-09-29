package com.lingq.feature.karaoke;

import android.graphics.Rect;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.modules.ReaderMode;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.player.C1808b;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.InterfaceC3812yx;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.e7a;
import p000.eh9;
import p000.fh4;
import p000.g41;
import p000.hc7;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.oh4;
import p000.pg9;
import p000.si7;
import p000.u91;
import p000.ui3;
import p000.vj6;
import p000.vma;
import p000.wfb;
import p000.wta;
import p000.xfa;
import p000.xi9;
import p000.y15;
import p000.y5a;

/* JADX INFO: renamed from: com.lingq.feature.karaoke.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2118c extends wta implements cma, e7a, InterfaceC3733ws {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f26288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e7a f26289c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3733ws f26290d;

    /* JADX INFO: renamed from: e */
    public final d65 f26291e;

    /* JADX INFO: renamed from: f */
    public final C1384f f26292f;

    /* JADX INFO: renamed from: g */
    public final C1808b f26293g;

    /* JADX INFO: renamed from: h */
    public final si7 f26294h;

    /* JADX INFO: renamed from: i */
    public final y15 f26295i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3812yx f26296j;

    /* JADX INFO: renamed from: k */
    public final vj6 f26297k;

    /* JADX INFO: renamed from: l */
    public final nn1 f26298l;

    /* JADX INFO: renamed from: m */
    public final fh4 f26299m;

    /* JADX INFO: renamed from: n */
    public final C3244l f26300n;

    /* JADX INFO: renamed from: o */
    public pg9 f26301o;

    /* JADX INFO: renamed from: p */
    public final C3244l f26302p;

    /* JADX INFO: renamed from: q */
    public final c18 f26303q;

    /* JADX INFO: renamed from: r */
    public final C3244l f26304r;

    /* JADX INFO: renamed from: s */
    public final C3244l f26305s;

    /* JADX INFO: renamed from: t */
    public final C3244l f26306t;

    /* JADX INFO: renamed from: u */
    public final C3244l f26307u;

    /* JADX INFO: renamed from: v */
    public final c18 f26308v;

    public C2118c(d65 d65Var, C1384f c1384f, C1808b c1808b, vma vmaVar, si7 si7Var, y15 y15Var, InterfaceC3812yx interfaceC3812yx, vj6 vj6Var, nn1 nn1Var, cma cmaVar, InterfaceC3733ws interfaceC3733ws, e7a e7aVar, nl8 nl8Var) {
        Boolean bool;
        Boolean bool2;
        d65Var.getClass();
        c1808b.getClass();
        vmaVar.getClass();
        si7Var.getClass();
        y15Var.getClass();
        interfaceC3812yx.getClass();
        cmaVar.getClass();
        interfaceC3733ws.getClass();
        e7aVar.getClass();
        nl8Var.getClass();
        this.f26288b = cmaVar;
        this.f26289c = e7aVar;
        this.f26290d = interfaceC3733ws;
        this.f26291e = d65Var;
        this.f26292f = c1384f;
        this.f26293g = c1808b;
        this.f26294h = si7Var;
        this.f26295i = y15Var;
        this.f26296j = interfaceC3812yx;
        this.f26297k = vj6Var;
        this.f26298l = nn1Var;
        fh4.Companion.getClass();
        if (!nl8Var.m17487a("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        if (num == null) {
            C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("fromLesson")) {
            bool = (Boolean) nl8Var.m17488b("fromLesson");
            if (bool == null) {
                C3386nv.m17626m("Argument \"fromLesson\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (nl8Var.m17487a("video")) {
            bool2 = (Boolean) nl8Var.m17488b("video");
            if (bool2 == null) {
                C3386nv.m17626m("Argument \"video\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        this.f26299m = new fh4(iIntValue, zBooleanValue, bool2.booleanValue());
        C3244l c3244lM17114d = AbstractC3352my.m17114d(num);
        this.f26300n = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f26302p = c3244lM17114d2;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f26303q = AbstractC3224d.m15520B(c3244lM17114d2, g41VarM16103C, c3243k, null);
        Boolean bool3 = Boolean.FALSE;
        this.f26304r = AbstractC3352my.m17114d(bool3);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f26305s = c3244lM17114d3;
        c18 c18VarM15520B = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new KaraokeViewModel$_sentencesTranslations$1(this, null)), lda.m16103C(this), c3243k, EmptyList.f47638a);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool3);
        this.f26306t = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(0L);
        this.f26307u = c3244lM17114d5;
        this.f26308v = AbstractC3224d.m15520B(new C3228h(AbstractC3224d.m15530i(c18VarM15520B, c3244lM17114d5, c3244lM17114d4, c1808b.f21946D, c3244lM17114d3, new KaraokeViewModel$karaokeContentInputs$1(null)), AbstractC3224d.m15532k(new C3540rl(c3244lM17114d2, 5), ((C1368a) si7Var).f18338F0, AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new KaraokeViewModel$special$$inlined$flatMapLatest$1(this, null)), lda.m16103C(this), c3243k, null), new KaraokeViewModel$karaokeLessonInputs$1(4, null)), new KaraokeViewModel$karaokeUiState$1(this, null)), lda.m16103C(this), c3243k, new oh4(EmptyList.f47638a, null, true, true, false, 20, new hc7(null, null, 8191), null, "", false, 0));
        c3244lM17114d5.m15572j(null, 0L);
        if (zBooleanValue) {
            y15Var.mo50y(LqAnalyticsValues$LessonExitPath.QuitLesson);
            y15Var.mo46F0(ReaderMode.Karaoke);
            y15Var.mo47b(new DateTime());
        }
        wfb.m23926u(lda.m16103C(this), null, null, new KaraokeViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new KaraokeViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new KaraokeViewModel$3(this, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26288b.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f26289c.mo8733A0(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26288b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26288b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26288b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26288b.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f26289c.mo8736D1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26288b.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f26289c.mo8740G(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26288b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26288b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26288b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26288b.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f26289c.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26288b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26288b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26288b.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f26289c.mo8744P0(tooltipStep);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f26289c.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26288b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26288b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26288b.mo4586T0();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        AbstractC1263a.m7046a(this.f26301o);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: V2 */
    public final Object m9030V2(Integer num, ContinuationImpl continuationImpl) throws Throwable {
        KaraokeViewModel$enableSentenceMode$1 karaokeViewModel$enableSentenceMode$1;
        List list;
        LessonTextToken lessonTextToken;
        if (continuationImpl instanceof KaraokeViewModel$enableSentenceMode$1) {
            karaokeViewModel$enableSentenceMode$1 = (KaraokeViewModel$enableSentenceMode$1) continuationImpl;
            int i = karaokeViewModel$enableSentenceMode$1.f26259c;
            if ((i & Integer.MIN_VALUE) != 0) {
                karaokeViewModel$enableSentenceMode$1.f26259c = i - Integer.MIN_VALUE;
            } else {
                karaokeViewModel$enableSentenceMode$1 = new KaraokeViewModel$enableSentenceMode$1(this, continuationImpl);
            }
        } else {
            karaokeViewModel$enableSentenceMode$1 = new KaraokeViewModel$enableSentenceMode$1(this, continuationImpl);
        }
        KaraokeViewModel$enableSentenceMode$1 karaokeViewModel$enableSentenceMode$2 = karaokeViewModel$enableSentenceMode$1;
        Object objM7298r = karaokeViewModel$enableSentenceMode$2.f26257a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = karaokeViewModel$enableSentenceMode$2.f26259c;
        C3244l c3244l = this.f26300n;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7298r);
            if (num != null) {
                int iIntValue = ((Number) c3244l.getValue()).intValue();
                int iIntValue2 = num.intValue();
                karaokeViewModel$enableSentenceMode$2.f26259c = 1;
                objM7298r = ((C1295k) this.f26291e).m7298r(iIntValue, iIntValue2, karaokeViewModel$enableSentenceMode$2);
                if (objM7298r != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM7298r);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM7298r);
        LessonSentence lessonSentence = (LessonSentence) objM7298r;
        if (lessonSentence != null && (list = lessonSentence.f19253a) != null && (lessonTextToken = (LessonTextToken) u91.m22591I0(list)) != null) {
            int i3 = lessonTextToken.f19283g;
            String strMo4589b2 = this.f26288b.mo4589b2();
            int iIntValue3 = ((Number) c3244l.getValue()).intValue();
            ReaderBookmarkMode readerBookmarkMode = ReaderBookmarkMode.Karaoke;
            karaokeViewModel$enableSentenceMode$2.f26259c = 2;
            if (this.f26292f.m7995a(strMo4589b2, iIntValue3, i3, readerBookmarkMode, null, karaokeViewModel$enableSentenceMode$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9031W2(double d) {
        if (((Boolean) this.f26304r.getValue()).booleanValue()) {
            Double dValueOf = Double.valueOf(d);
            C3244l c3244l = this.f26305s;
            c3244l.getClass();
            c3244l.m15572j(null, dValueOf);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26288b.mo4587X();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f26289c.mo8753Z0(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26288b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26288b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26288b.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f26289c.mo8759d1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f26289c.mo8763g();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f26290d.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26288b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f26289c.mo8766i1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f26289c.mo8768j0(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26288b.mo4592m0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f26290d.mo9033o1(appUsageType, num);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26288b.mo4593p0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f26289c.mo8771q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26288b.mo4594r1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f26289c.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26288b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26288b.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f26289c.mo8777t0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f26289c.mo8778u0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f26290d.mo9034v0(appUsageType);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f26289c.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26288b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26288b.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f26289c.mo8781y0();
    }
}
