package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$2", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {280}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivitySpeakingFragment f32156b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingFragment$onViewCreated$2$2$1", m4291f = "ReviewActivitySpeakingFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27021 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f32157a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivitySpeakingFragment f32158b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27021(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
            super(2, continuation);
            this.f32158b = reviewActivitySpeakingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27021 c27021 = new C27021(this.f32158b, continuation);
            c27021.f32157a = ((Boolean) obj).booleanValue();
            return c27021;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C27021 c27021 = (C27021) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27021.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f32157a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
                C2748c c2748cM9550S0 = this.f32158b.m9550S0();
                c2748cM9550S0.getClass();
                wfb.m23926u(lda.m16103C(c2748cM9550S0), null, null, new ReviewActivitySpeakingViewModel$speakSentence$1(c2748cM9550S0, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingFragment$onViewCreated$2$2(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, Continuation continuation) {
        super(2, continuation);
        this.f32156b = reviewActivitySpeakingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingFragment$onViewCreated$2$2(this.f32156b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32155a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivitySpeakingFragment.f32136H0;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f32156b;
            c18 c18Var = reviewActivitySpeakingFragment.m9550S0().f32346s;
            C27021 c27021 = new C27021(reviewActivitySpeakingFragment, null);
            c18Var.getClass();
            this.f32155a = 1;
            if (AbstractC3224d.m15529h(c18Var, c27021, this) == coroutineSingletons) {
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
