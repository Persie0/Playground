package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.p08;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$2", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityUnscrambleFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f32227b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$2$2 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$2$2$2", m4291f = "ReviewActivityUnscrambleFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27222 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32228a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f32229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27222(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
            super(2, continuation);
            this.f32229b = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27222 c27222 = new C27222(this.f32229b, continuation);
            c27222.f32228a = obj;
            return c27222;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27222 c27222 = (C27222) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27222.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f32228a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            this.f32229b.m9552S0().f40701a.setText(str);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$2$2(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, Continuation continuation) {
        super(2, continuation);
        this.f32227b = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$2$2(this.f32227b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32226a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f32227b;
            p08 p08Var = new p08(reviewActivityUnscrambleFragment.m9554U0().f32360l, 9);
            C27222 c27222 = new C27222(reviewActivityUnscrambleFragment, null);
            this.f32226a = 1;
            if (AbstractC3224d.m15529h(p08Var, c27222, this) == coroutineSingletons) {
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
