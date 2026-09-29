package com.lingq.feature.onboarding.dictionary;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.lp4;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleViewModel$languagesListUiState$1", m4291f = "OnboardingDictionaryLocaleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingDictionaryLocaleViewModel$languagesListUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27212a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f27213b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnboardingDictionaryLocaleViewModel$languagesListUiState$1 onboardingDictionaryLocaleViewModel$languagesListUiState$1 = new OnboardingDictionaryLocaleViewModel$languagesListUiState$1(3, (Continuation) obj3);
        onboardingDictionaryLocaleViewModel$languagesListUiState$1.f27212a = (List) obj;
        onboardingDictionaryLocaleViewModel$languagesListUiState$1.f27213b = (String) obj2;
        return onboardingDictionaryLocaleViewModel$languagesListUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27212a;
        String str = this.f27213b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new lp4(list, str);
    }
}
