package com.lingq.feature.onboarding.level;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.r75;
import p000.vg6;
import p000.w75;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.level.OnboardingLevelViewModel$levelSelectionUiState$1", m4291f = "OnboardingLevelViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLevelViewModel$levelSelectionUiState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27259a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ r75 f27260b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ vg6 f27261c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        OnboardingLevelViewModel$levelSelectionUiState$1 onboardingLevelViewModel$levelSelectionUiState$1 = new OnboardingLevelViewModel$levelSelectionUiState$1(4, (Continuation) obj4);
        onboardingLevelViewModel$levelSelectionUiState$1.f27259a = (List) obj;
        onboardingLevelViewModel$levelSelectionUiState$1.f27260b = (r75) obj2;
        onboardingLevelViewModel$levelSelectionUiState$1.f27261c = (vg6) obj3;
        return onboardingLevelViewModel$levelSelectionUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27259a;
        r75 r75Var = this.f27260b;
        vg6 vg6Var = this.f27261c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new w75(list, r75Var, vg6Var);
    }
}
