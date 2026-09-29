package com.lingq.feature.review;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$handleContinue$2", m4291f = "ReviewComposeViewModel.kt", m4292l = {386}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$handleContinue$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$handleContinue$2(C2751b c2751b, Continuation continuation) {
        super(2, continuation);
        this.f31695b = c2751b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$handleContinue$2(this.f31695b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$handleContinue$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31694a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f31694a = 1;
            if (this.f31695b.m9568Z2(this) == coroutineSingletons) {
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
