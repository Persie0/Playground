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
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$4", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {368}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityMultiAndClozeFragment$onViewCreated$1$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32047b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$4$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$1$4$1", m4291f = "ReviewActivityMultiAndClozeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26721 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f32048a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f32049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26721(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
            super(2, continuation);
            this.f32049b = reviewActivityMultiAndClozeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26721 c26721 = new C26721(this.f32049b, continuation);
            c26721.f32048a = ((Boolean) obj).booleanValue();
            return c26721;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C26721 c26721 = (C26721) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26721.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f32048a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32049b;
                jfa.m14425h(reviewActivityMultiAndClozeFragment.m9541R0().f35557i);
                reviewActivityMultiAndClozeFragment.m9541R0().f35558j.m6163e();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMultiAndClozeFragment$onViewCreated$1$4(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, Continuation continuation) {
        super(2, continuation);
        this.f32047b = reviewActivityMultiAndClozeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$1$4(this.f32047b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$1$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32046a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReviewActivityMultiAndClozeFragment.f32016I0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f32047b;
            c18 c18Var = reviewActivityMultiAndClozeFragment.m9543T0().f32386s;
            C26721 c26721 = new C26721(reviewActivityMultiAndClozeFragment, null);
            c18Var.getClass();
            this.f32046a = 1;
            if (AbstractC3224d.m15529h(c18Var, c26721, this) == coroutineSingletons) {
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
