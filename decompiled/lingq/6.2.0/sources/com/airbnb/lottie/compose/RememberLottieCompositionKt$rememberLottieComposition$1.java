package com.airbnb.lottie.compose;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", m4291f = "rememberLottieComposition.kt", m4292l = {}, m4293m = "invokeSuspend")
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements aj3 {
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        ((Number) obj).intValue();
        new RememberLottieCompositionKt$rememberLottieComposition$1(3, (Continuation) obj3).invokeSuspend(xfa.f68157a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.FALSE;
    }
}
