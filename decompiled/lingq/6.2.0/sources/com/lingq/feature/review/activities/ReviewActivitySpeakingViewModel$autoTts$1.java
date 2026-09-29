package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xe9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$autoTts$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$autoTts$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f32192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xe9 f32193b;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ReviewActivitySpeakingViewModel$autoTts$1 reviewActivitySpeakingViewModel$autoTts$1 = new ReviewActivitySpeakingViewModel$autoTts$1(4, (Continuation) obj4);
        reviewActivitySpeakingViewModel$autoTts$1.f32192a = zBooleanValue;
        reviewActivitySpeakingViewModel$autoTts$1.f32193b = (xe9) obj2;
        return reviewActivitySpeakingViewModel$autoTts$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f32192a;
        xe9 xe9Var = this.f32193b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z && xe9Var.f68134a);
    }
}
