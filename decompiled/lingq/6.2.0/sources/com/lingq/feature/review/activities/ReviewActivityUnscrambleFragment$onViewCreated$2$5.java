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
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$5", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onViewCreated$2$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32240b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$5$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$5$1", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27261 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f32241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27261(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
            super(2, continuation);
            this.f32241a = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C27261(this.f32241a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27261 c27261 = (C27261) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27261.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            this.f32241a.m9553T0().m9613g3();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$2$5(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32240b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$2$5(this.f32240b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$2$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32239a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32240b;
            du0 du0Var = reviewActivityUnscrambleFragment.m9554U0().f32362n;
            C27261 c27261 = new C27261(reviewActivityUnscrambleFragment, null);
            this.f32239a = 1;
            if (AbstractC3224d.m15529h(du0Var, c27261, this) == coroutineSingletons) {
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
