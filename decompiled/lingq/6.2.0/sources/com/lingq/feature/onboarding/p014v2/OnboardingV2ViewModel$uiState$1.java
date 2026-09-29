package com.lingq.feature.onboarding.p014v2;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.px6;
import p000.ut6;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$uiState$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$uiState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f27340a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ OnboardingSelections f27341b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f27342c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ut6 f27343d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f27344e;

    public OnboardingV2ViewModel$uiState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        OnboardingV2ViewModel$uiState$1 onboardingV2ViewModel$uiState$1 = new OnboardingV2ViewModel$uiState$1((Continuation) obj6);
        onboardingV2ViewModel$uiState$1.f27340a = iIntValue;
        onboardingV2ViewModel$uiState$1.f27341b = (OnboardingSelections) obj2;
        onboardingV2ViewModel$uiState$1.f27342c = zBooleanValue;
        onboardingV2ViewModel$uiState$1.f27343d = (ut6) obj4;
        onboardingV2ViewModel$uiState$1.f27344e = (List) obj5;
        return onboardingV2ViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f27340a;
        OnboardingSelections onboardingSelections = this.f27341b;
        boolean z = this.f27342c;
        ut6 ut6Var = this.f27343d;
        List list = this.f27344e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new px6(i, onboardingSelections, z, ut6Var, list);
    }
}
