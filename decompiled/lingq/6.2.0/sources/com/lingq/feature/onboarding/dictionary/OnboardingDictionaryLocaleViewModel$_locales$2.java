package com.lingq.feature.onboarding.dictionary;

import com.lingq.core.data.repository.C1297m;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleViewModel$_locales$2", m4291f = "OnboardingDictionaryLocaleViewModel.kt", m4292l = {52}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingDictionaryLocaleViewModel$_locales$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2206a f27209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingDictionaryLocaleViewModel$_locales$2(C2206a c2206a, Continuation continuation) {
        super(2, continuation);
        this.f27209b = c2206a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingDictionaryLocaleViewModel$_locales$2(this.f27209b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingDictionaryLocaleViewModel$_locales$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27208a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1297m c1297m = this.f27209b.f27214b;
            this.f27208a = 1;
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
        return xfa.f68157a;
    }
}
