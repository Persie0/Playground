package com.lingq.feature.onboarding;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1$1$1$3", m4291f = "OnboardingEndViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$initLibrary$1$1$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f26960a;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        OnboardingEndViewModel$initLibrary$1$1$1$3 onboardingEndViewModel$initLibrary$1$1$1$3 = new OnboardingEndViewModel$initLibrary$1$1$1$3(3, (Continuation) obj3);
        onboardingEndViewModel$initLibrary$1$1$1$3.f26960a = (Throwable) obj2;
        xfa xfaVar = xfa.f68157a;
        onboardingEndViewModel$initLibrary$1$1$1$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.f26960a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        th.printStackTrace();
        return xfa.f68157a;
    }
}
