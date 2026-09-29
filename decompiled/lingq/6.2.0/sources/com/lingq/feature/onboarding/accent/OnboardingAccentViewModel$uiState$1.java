package com.lingq.feature.onboarding.accent;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3633u2;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.accent.OnboardingAccentViewModel$uiState$1", m4291f = "OnboardingAccentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
public final class OnboardingAccentViewModel$uiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27014a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f27015b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnboardingAccentViewModel$uiState$1 onboardingAccentViewModel$uiState$1 = new OnboardingAccentViewModel$uiState$1(3, (Continuation) obj3);
        onboardingAccentViewModel$uiState$1.f27014a = (List) obj;
        onboardingAccentViewModel$uiState$1.f27015b = (String) obj2;
        return onboardingAccentViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27014a;
        String str = this.f27015b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new C3633u2(list, str);
    }
}
