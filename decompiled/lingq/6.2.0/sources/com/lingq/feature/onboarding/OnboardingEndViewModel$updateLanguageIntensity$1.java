package com.lingq.feature.onboarding;

import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lm4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$updateLanguageIntensity$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {138}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$updateLanguageIntensity$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$updateLanguageIntensity$1(C2197b c2197b, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f26973b = c2197b;
        this.f26974c = str;
        this.f26975d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$updateLanguageIntensity$1(this.f26973b, this.f26974c, this.f26975d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$updateLanguageIntensity$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26972a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lm4 lm4Var = this.f26973b.f27168i;
            this.f26972a = 1;
            if (((C1293i) lm4Var).m7221r(this.f26974c, this.f26975d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
