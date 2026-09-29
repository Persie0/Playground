package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Translation;
import com.lingq.core.p012ui.R$string;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.bh4;
import p000.c32;
import p000.fa4;
import p000.lda;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {77}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32223b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$1$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27211 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32224a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f32225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27211(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
            super(2, continuation);
            this.f32225b = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27211 c27211 = new C27211(this.f32225b, continuation);
            c27211.f32224a = obj;
            return c27211;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27211 c27211 = (C27211) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27211.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            String str;
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f32224a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean zIsEmpty = lessonTranslationSentence.f19297f.isEmpty();
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32225b;
            if (zIsEmpty) {
                bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
                reviewActivityUnscrambleFragment.m9552S0().f40701a.setText(reviewActivityUnscrambleFragment.m2111m(R$string.lingq_loading_translation));
                C2749d c2749dM9554U0 = reviewActivityUnscrambleFragment.m9554U0();
                wfb.m23926u(lda.m16103C(c2749dM9554U0), null, null, new ReviewActivityUnscrambleViewModel$loadTranslation$1(c2749dM9554U0, null), 3);
            } else {
                Iterator it = lessonTranslationSentence.f19297f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    str = ((Translation) next).f19335b;
                    bh4[] bh4VarArr2 = ReviewActivityUnscrambleFragment.f32209F0;
                } while (!fa4.m11650l(str, reviewActivityUnscrambleFragment.m9554U0().f32350b.mo4580K1()));
                Translation translation = (Translation) next;
                String str2 = translation != null ? translation.f19334a : null;
                if (str2 == null || vk9.m23391n0(str2)) {
                    bh4[] bh4VarArr3 = ReviewActivityUnscrambleFragment.f32209F0;
                    reviewActivityUnscrambleFragment.m9552S0().f40701a.setText(reviewActivityUnscrambleFragment.m2111m(R$string.lingq_loading_translation));
                    C2749d c2749dM9554U1 = reviewActivityUnscrambleFragment.m9554U0();
                    wfb.m23926u(lda.m16103C(c2749dM9554U1), null, null, new ReviewActivityUnscrambleViewModel$loadTranslation$1(c2749dM9554U1, null), 3);
                } else {
                    bh4[] bh4VarArr4 = ReviewActivityUnscrambleFragment.f32209F0;
                    reviewActivityUnscrambleFragment.m9552S0().f40701a.setText(str2);
                }
            }
            reviewActivityUnscrambleFragment.m9552S0().f40702b.m9665d(vk9.m23376L0(lessonTranslationSentence.f19296e).toString(), false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$2$1(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32223b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$2$1(this.f32223b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32222a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32223b;
            C3540rl c3540rl = new C3540rl(reviewActivityUnscrambleFragment.m9554U0().f32358j, 5);
            C27211 c27211 = new C27211(reviewActivityUnscrambleFragment, null);
            this.f32222a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c27211, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
