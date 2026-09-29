package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$2", m4291f = "ReviewActivityMatchingFragment.kt", m4292l = {87}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMatchingFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMatchingFragment f31990b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMatchingFragment$onViewCreated$2$2$1", m4291f = "ReviewActivityMatchingFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26561 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReviewActivityMatchingFragment f31991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26561(ReviewActivityMatchingFragment reviewActivityMatchingFragment, Continuation continuation) {
            super(2, continuation);
            this.f31991a = reviewActivityMatchingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C26561(this.f31991a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26561 c26561 = (C26561) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26561.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityMatchingFragment.f31969F0;
            this.f31991a.m9540R0().m9613g3();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingFragment$onViewCreated$2$2(ReviewActivityMatchingFragment reviewActivityMatchingFragment, Continuation continuation) {
        super(2, continuation);
        this.f31990b = reviewActivityMatchingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMatchingFragment$onViewCreated$2$2(this.f31990b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMatchingFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31989a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ReviewActivityMatchingFragment reviewActivityMatchingFragment = this.f31990b;
            du0 du0Var = ((C2747b) reviewActivityMatchingFragment.f31971D0.getValue()).f32327j;
            C26561 c26561 = new C26561(reviewActivityMatchingFragment, null);
            this.f31989a = 1;
            if (AbstractC3224d.m15529h(du0Var, c26561, this) == coroutineSingletons) {
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
