package com.lingq.feature.onboarding.languages;

import com.lingq.core.data.repository.C1297m;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.languages.OnboardingLanguageViewModel$1", m4291f = "OnboardingLanguageViewModel.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLanguageViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2208a f27239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLanguageViewModel$1(C2208a c2208a, Continuation continuation) {
        super(2, continuation);
        this.f27239b = c2208a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingLanguageViewModel$1(this.f27239b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingLanguageViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27238a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1297m c1297m = this.f27239b.f27242b;
                this.f27238a = 1;
                if (c1297m.m7328b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
