package com.lingq.feature.review;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$cardsForAnswers$1", m4291f = "ReviewViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$cardsForAnswers$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31868a;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        ReviewViewModel$cardsForAnswers$1 reviewViewModel$cardsForAnswers$1 = new ReviewViewModel$cardsForAnswers$1(3, (Continuation) obj3);
        reviewViewModel$cardsForAnswers$1.f31868a = (List) obj;
        return reviewViewModel$cardsForAnswers$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f31868a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return list;
    }
}
