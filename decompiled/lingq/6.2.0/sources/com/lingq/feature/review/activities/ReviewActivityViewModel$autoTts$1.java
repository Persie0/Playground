package com.lingq.feature.review.activities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.fa4;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$autoTts$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$autoTts$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f32280a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Boolean f32281b;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ReviewActivityViewModel$autoTts$1 reviewActivityViewModel$autoTts$1 = new ReviewActivityViewModel$autoTts$1(4, (Continuation) obj4);
        reviewActivityViewModel$autoTts$1.f32280a = zBooleanValue;
        reviewActivityViewModel$autoTts$1.f32281b = (Boolean) obj2;
        return reviewActivityViewModel$autoTts$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f32280a;
        Boolean bool = this.f32281b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z && fa4.m11650l(bool, Boolean.TRUE));
    }
}
