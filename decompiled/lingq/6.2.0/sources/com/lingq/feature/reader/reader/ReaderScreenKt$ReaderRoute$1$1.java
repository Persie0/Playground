package com.lingq.feature.reader.reader;

import com.lingq.core.analytics.data.modules.ReaderMode;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1296l;
import com.lingq.feature.reader.content.C2260a;
import com.lingq.feature.reader.content.state.C2264a;
import com.lingq.feature.reader.content.state.C2265b;
import com.lingq.feature.reader.content.state.C2266c;
import com.lingq.feature.reader.playback.C2465a;
import com.lingq.feature.reader.playback.state.C2468a;
import com.lingq.feature.reader.preferences.C2469a;
import com.lingq.feature.reader.reader.state.C2502a;
import com.lingq.feature.reader.tracking.C2574a;
import com.lingq.feature.reader.tracking.TrackingPauseReason;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.C3513qw;
import p000.C3540rl;
import p000.c18;
import p000.c32;
import p000.cma;
import p000.h0a;
import p000.jv7;
import p000.lda;
import p000.m83;
import p000.n23;
import p000.ph4;
import p000.rm5;
import p000.sm5;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderRoute$1$1", m4291f = "ReaderScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2493a f30144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderRoute$1$1(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30144a = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderRoute$1$1(this.f30144a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderScreenKt$ReaderRoute$1$1 readerScreenKt$ReaderRoute$1$1 = (ReaderScreenKt$ReaderRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerScreenKt$ReaderRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2493a c2493a = this.f30144a;
        C2574a c2574a = c2493a.f30186H;
        C2469a c2469a = c2493a.f30220j;
        C2265b c2265b = c2493a.f30225o;
        C2468a c2468a = c2493a.f30224n;
        C2266c c2266c = c2493a.f30221k;
        cma cmaVar = c2493a.f30206b;
        C2465a c2465a = c2493a.f30218h;
        boolean z = c2493a.f30194P;
        C2264a c2264a = c2493a.f30214f;
        C2260a c2260a = c2493a.f30212e;
        int i = c2493a.f30190L;
        if (!c2493a.f30189K) {
            c2493a.f30189K = true;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            rm5 rm5Var = sm5.Companion;
            String str = "[LessonTracking] ReaderComposeViewModel.start lessonId=" + i + " isSessionForeground=" + c2493a.f30191M;
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
            c2264a.getClass();
            strMo4589b2.getClass();
            strMo4580K1.getClass();
            C3244l c3244l = c2264a.f28124m;
            c3244l.getClass();
            c3244l.m15572j(null, strMo4589b2);
            C3244l c3244l2 = c2264a.f28125n;
            Integer numValueOf = Integer.valueOf(i);
            c3244l2.getClass();
            c3244l2.m15572j(null, numValueOf);
            C3244l c3244l3 = c2264a.f28126o;
            c3244l3.getClass();
            c3244l3.m15572j(null, strMo4580K1);
            c2264a.f28128q = z;
            c2264a.f28129r.clear();
            C3244l c3244l4 = c2493a.f30219i.f30378b;
            c3244l4.getClass();
            c3244l4.m15572j(null, strMo4589b2);
            c2266c.getClass();
            c2266c.f28151g = strMo4589b2;
            c2266c.f28152h = strMo4580K1;
            c2266c.f28153i = i;
            C3244l c3244l5 = c2266c.f28149e;
            Map mapM15360M = AbstractC3194a.m15360M();
            c3244l5.getClass();
            c3244l5.m15572j(null, mapM15360M);
            C2502a c2502a = c2493a.f30222l;
            c2502a.getClass();
            C3244l c3244l6 = c2502a.f30309b;
            c3244l6.getClass();
            c3244l6.m15572j(null, strMo4589b2);
            c2468a.getClass();
            c2468a.f29817d = strMo4589b2;
            c2468a.f29816c.clear();
            c2468a.m9370a(c2260a);
            c18 c18Var = c2260a.f27957w;
            c2265b.getClass();
            c2265b.f28142e = strMo4589b2;
            c2265b.f28143f = i;
            c2265b.f28140c.clear();
            C3244l c3244l7 = c2265b.f28141d;
            Map mapM15360M2 = AbstractC3194a.m15360M();
            c3244l7.getClass();
            c3244l7.m15572j(null, mapM15360M2);
            c2265b.f28144g = false;
            c2265b.m9271a(c2260a, c2264a);
            c2465a.m9360b(i, strMo4589b2);
            c18 c18Var2 = c2465a.f29783q;
            c2574a.m9499g(i, strMo4589b2);
            c2574a.m9503n(TrackingPauseReason.SessionBackground, !c2493a.f30191M, true, true);
            c2493a.f30187I.mo46F0(z ? ReaderMode.Sentence : ReaderMode.Page);
            c2493a.f30227q.m9278a(i, strMo4589b2);
            C3244l c3244l8 = c2493a.f30230t.f30504m;
            Integer numValueOf2 = Integer.valueOf(i);
            c3244l8.getClass();
            c3244l8.m15572j(null, numValueOf2);
            c2493a.f30223m.m9411g();
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c18Var, 21)), new ReaderComposeViewModel$observeContentReadiness$2(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c2264a.f28131t, 29)), new ReaderComposeViewModel$observeVocabularyChangesForTooltips$2(c2493a, null), 2), lda.m16103C(c2493a));
            wfb.m23926u(lda.m16103C(c2493a), null, null, new ReaderComposeViewModel$loadLesson$1(c2493a, null), 3);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c18Var, 23)), new ReaderComposeViewModel$observePageChanges$2(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(c2264a.f28106B, new ReaderComposeViewModel$observeCompletedPages$1(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c18Var2, 26)), new ReaderComposeViewModel$observePlayerUpgradePopup$2(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(AbstractC3224d.m15536o(((C1296l) c2493a.f30184F.f58517a).m7314i(i)), 24)), new ReaderComposeViewModel$observePlaybackInterval$2(c2493a, null), 2), lda.m16103C(c2493a));
            wfb.m23926u(lda.m16103C(c2493a), null, null, new ReaderComposeViewModel$start$1(c2493a, strMo4589b2, null), 3);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new jv7(c18Var, c2493a, 0)), new ReaderComposeViewModel$observeLessonStudyTracking$2(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new jv7(c18Var, c2493a, 1)), new ReaderComposeViewModel$observeLessonStudyTracking$4(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new jv7(c18Var, c2493a, 2)), new C2478x94b7e943(c2493a, null)), new ReaderComposeViewModel$observeLessonStudyTracking$7(2, c2493a.f30186H, C2574a.class, "updatePlayback", "updatePlayback(Lcom/lingq/feature/reader/tracking/LessonPlaybackSnapshot;)V", 4), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15521C(AbstractC3224d.m15536o(new jv7(c18Var, c2493a, 3)), new C2487x1ce6a2a4(c2493a, null))), new ReaderComposeViewModel$observeReadingUsageAgainstPlayback$3(c2493a, null), 2), lda.m16103C(c2493a));
            c2465a.m9365h(new C3513qw(c18Var, 20), c2469a.f29844j);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new ph4(new C3540rl(new C3513qw(c18Var2, 25), 5), 5)), new ReaderComposeViewModel$observePlaybackSentenceBookmark$3(c2493a, null), 2), lda.m16103C(c2493a));
            if (z) {
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c18Var, 27)), new ReaderComposeViewModel$observeSentenceNotes$2(c2493a, null), 2), lda.m16103C(c2493a));
            }
            if (z) {
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3228h(new C3513qw(c18Var, 28), c2469a.f29841g, new ReaderComposeViewModel$observeSentenceTranslationAutoShow$1(3, null))), new ReaderComposeViewModel$observeSentenceTranslationAutoShow$2(c2493a, null), 2), lda.m16103C(c2493a));
            }
            AbstractC3224d.m15545x(new m83(new C3540rl(new C3540rl(new C3513qw(c18Var, 18), 5), 4), new ReaderComposeViewModel$observeAnalytics$2(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new C3513qw(c18Var, 19)), new ReaderComposeViewModel$observeAnalytics$4(c2493a, null), 2), lda.m16103C(c2493a));
            n23 n23Var = c2493a.f30233w;
            String strMo4589b3 = cmaVar.mo4589b2();
            n23Var.getClass();
            strMo4589b3.getClass();
            AbstractC3224d.m15545x(new m83(new C3540rl(((C1295k) n23Var.f52215a).m7255M(i, strMo4589b3), 5), new ReaderComposeViewModel$observeAnalytics$5(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(c2266c.f28150f, new ReaderComposeViewModel$wireSentenceTranslations$1(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(c2493a.f30209c0, new ReaderComposeViewModel$wirePromotedCourse$1(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(c2493a.f30217g0, new ReaderComposeViewModel$wireMaxAllowedPage$1(c2493a, new Ref$ObjectRef(), null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(new m83(c2493a.f30198T, new ReaderComposeViewModel$wireSentenceTimestamps$1(c2493a, null), 2), lda.m16103C(c2493a));
            AbstractC3224d.m15545x(AbstractC3224d.m15530i(c2264a.f28135x, c2264a.f28136y, c2493a.f30213e0, c2264a.f28137z, c2493a.f30215f0, new ReaderComposeViewModel$wireReviewCounts$1(c2493a, null)), lda.m16103C(c2493a));
        }
        return xfa.f68157a;
    }
}
