package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.id3;
import p000.mbd;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$7", m4291f = "ReviewActivityResultFragment.kt", m4292l = {470}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityResultFragment$onViewCreated$2$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f32122b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$7$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$7$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26901 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityResultFragment f32124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26901(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
            super(2, continuation);
            this.f32124b = reviewActivityResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26901 c26901 = new C26901(this.f32124b, continuation);
            c26901.f32123a = obj;
            return c26901;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26901 c26901 = (C26901) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26901.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f32123a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32124b;
            id3 id3VarM2089Q = reviewActivityResultFragment.m2089Q();
            b34.m3244j(reviewActivityResultFragment);
            mbd.m16755c(id3VarM2089Q, str, null, 26);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$2$7(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
        super(2, continuation);
        this.f32122b = reviewActivityResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityResultFragment$onViewCreated$2$7(this.f32122b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityResultFragment$onViewCreated$2$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32121a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32122b;
            du0 du0Var = reviewActivityResultFragment.m9548U0().f32365C;
            C26901 c26901 = new C26901(reviewActivityResultFragment, null);
            this.f32121a = 1;
            if (AbstractC3224d.m15529h(du0Var, c26901, this) == coroutineSingletons) {
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
