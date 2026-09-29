package com.lingq.feature.review.activities;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.te8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$6", m4291f = "ReviewActivityResultFragment.kt", m4292l = {486}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityResultFragment$onViewCreated$2$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityResultFragment f32118b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$6$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityResultFragment$onViewCreated$2$6$1", m4291f = "ReviewActivityResultFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26891 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityResultFragment f32120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26891(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
            super(2, continuation);
            this.f32120b = reviewActivityResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26891 c26891 = new C26891(this.f32120b, continuation);
            c26891.f32119a = obj;
            return c26891;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26891 c26891 = (C26891) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26891.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f32119a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            te8 te8Var = this.f32120b.f32071F0;
            if (te8Var != null) {
                te8Var.m21309l(list);
                return xfa.f68157a;
            }
            fa4.m11636J("tagsAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$2$6(ReviewActivityResultFragment reviewActivityResultFragment, Continuation continuation) {
        super(2, continuation);
        this.f32118b = reviewActivityResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityResultFragment$onViewCreated$2$6(this.f32118b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityResultFragment$onViewCreated$2$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32117a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityResultFragment.f32067H0;
            ReviewActivityResultFragment reviewActivityResultFragment = this.f32118b;
            c18 c18Var = reviewActivityResultFragment.m9548U0().f32368F;
            C26891 c26891 = new C26891(reviewActivityResultFragment, null);
            c18Var.getClass();
            this.f32117a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26891, this) == coroutineSingletons) {
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
