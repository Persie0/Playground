package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityFlashcardFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityFlashcardFragment f31929b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityFlashcardFragment$onViewCreated$2$1$1", m4291f = "ReviewActivityFlashcardFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26381 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReviewActivityFlashcardFragment f31930a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26381(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
            super(2, continuation);
            this.f31930a = reviewActivityFlashcardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C26381(this.f31930a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26381 c26381 = (C26381) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26381.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            C3211a c3211a = this.f31930a.m9537S0().f32484C;
            xfa xfaVar = xfa.f68157a;
            c3211a.mo4677k(xfaVar);
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityFlashcardFragment$onViewCreated$2$1(ReviewActivityFlashcardFragment reviewActivityFlashcardFragment, Continuation continuation) {
        super(2, continuation);
        this.f31929b = reviewActivityFlashcardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityFlashcardFragment$onViewCreated$2$1(this.f31929b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityFlashcardFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31928a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityFlashcardFragment.f31913H0;
            ReviewActivityFlashcardFragment reviewActivityFlashcardFragment = this.f31929b;
            du0 du0Var = reviewActivityFlashcardFragment.m9539U0().f32388u;
            C26381 c26381 = new C26381(reviewActivityFlashcardFragment, null);
            this.f31928a = 1;
            if (AbstractC3224d.m15529h(du0Var, c26381, this) == coroutineSingletons) {
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
