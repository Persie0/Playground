package com.lingq.feature.review.activities;

import androidx.lifecycle.AbstractC0708b;
import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.ff3;
import p000.un1;
import p000.wfb;
import p000.xe9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {280}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivitySpeakingFragment f32150b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$1$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27011 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32151a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivitySpeakingFragment f32152b;

        /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$1$1$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {123, 125}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f32153a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReviewActivitySpeakingFragment f32154b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
                super(2, continuation);
                this.f32154b = reviewActivitySpeakingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f32154b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
            
                if (kotlinx.coroutines.AbstractC3208a.m15437d(300, r6) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f32153a;
                ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f32154b;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    this.f32153a = 1;
                    if (AbstractC3208a.m15437d(1200L, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                reviewActivitySpeakingFragment.m9549R0().m9613g3();
                return xfa.f68157a;
                bh4[] bh4VarArr2 = ReviewActivitySpeakingFragment.f32136H0;
                reviewActivitySpeakingFragment.m9549R0().m9608b3();
                this.f32153a = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27011(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
            super(2, continuation);
            this.f32152b = reviewActivitySpeakingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27011 c27011 = new C27011(this.f32152b, continuation);
            c27011.f32151a = obj;
            return c27011;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27011 c27011 = (C27011) create((xe9) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27011.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            xe9 xe9Var = (xe9) this.f32151a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f32152b;
            ((ff3) reviewActivitySpeakingFragment.f32137C0.getValue(reviewActivitySpeakingFragment, ReviewActivitySpeakingFragment.f32136H0[0])).f38994a.m9660p(xe9Var, AbstractC3184kh.m15194A(reviewActivitySpeakingFragment.m9550S0().f32329b.mo4589b2()));
            if (xe9Var.f68138e == SpeechRecognitionState.STOPPED && xe9Var.f68135b > 70) {
                reviewActivitySpeakingFragment.m9549R0().m9616j3();
                reviewActivitySpeakingFragment.m9549R0().m9614h3();
                wfb.m23926u(AbstractC0708b.m2508a(reviewActivitySpeakingFragment.m2112n()), null, null, new AnonymousClass1(reviewActivitySpeakingFragment, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingFragment$onViewCreated$2$1(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
        super(2, continuation);
        this.f32150b = reviewActivitySpeakingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingFragment$onViewCreated$2$1(this.f32150b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32149a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f32150b;
            c18 c18Var = reviewActivitySpeakingFragment.m9550S0().f32344q;
            C27011 c27011 = new C27011(reviewActivitySpeakingFragment, null);
            c18Var.getClass();
            this.f32149a = 1;
            if (AbstractC3224d.m15529h(c18Var, c27011, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
