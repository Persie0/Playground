package com.lingq.feature.onboarding.languages;

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
@c32(m4290c = "com.lingq.feature.onboarding.languages.OnboardingLanguageViewModel$languagesListUiState$1", m4291f = "OnboardingLanguageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLanguageViewModel$languagesListUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27240a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f27241b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnboardingLanguageViewModel$languagesListUiState$1 onboardingLanguageViewModel$languagesListUiState$1 = new OnboardingLanguageViewModel$languagesListUiState$1(3, (Continuation) obj3);
        onboardingLanguageViewModel$languagesListUiState$1.f27240a = (List) obj;
        onboardingLanguageViewModel$languagesListUiState$1.f27241b = (String) obj2;
        return onboardingLanguageViewModel$languagesListUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27240a;
        String str = this.f27241b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new lp4(list, str);
    }
}
