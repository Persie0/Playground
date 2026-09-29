package com.lingq.feature.onboarding.auth.login;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bk5;
import p000.c32;
import p000.dj3;
import p000.fi6;
import p000.gi6;
import p000.xfa;
import p000.ym5;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.OnboardingLoginViewModel$loginUiState$1", m4291f = "OnboardingLoginViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLoginViewModel$loginUiState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f27048a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ym5 f27049b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ym5 f27050c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f27051d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f27052e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2177b f27053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLoginViewModel$loginUiState$1(C2177b c2177b, Continuation continuation) {
        super(6, continuation);
        this.f27053f = c2177b;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        OnboardingLoginViewModel$loginUiState$1 onboardingLoginViewModel$loginUiState$1 = new OnboardingLoginViewModel$loginUiState$1(this.f27053f, (Continuation) obj6);
        onboardingLoginViewModel$loginUiState$1.f27048a = zBooleanValue;
        onboardingLoginViewModel$loginUiState$1.f27049b = (ym5) obj2;
        onboardingLoginViewModel$loginUiState$1.f27050c = (ym5) obj3;
        onboardingLoginViewModel$loginUiState$1.f27051d = iIntValue;
        onboardingLoginViewModel$loginUiState$1.f27052e = (String) obj5;
        return onboardingLoginViewModel$loginUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f27048a;
        ym5 ym5Var = this.f27049b;
        ym5 ym5Var2 = this.f27050c;
        int i = this.f27051d;
        String str = this.f27052e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new bk5(z, i, ym5Var, ym5Var2, str, this.f27053f.f27062f.m17896j() ? fi6.f39147b : gi6.f40855a);
    }
}
