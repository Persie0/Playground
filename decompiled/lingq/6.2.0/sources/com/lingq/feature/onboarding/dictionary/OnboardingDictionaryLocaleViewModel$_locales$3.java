package com.lingq.feature.onboarding.dictionary;

import com.lingq.core.domain.model.LanguageLearn;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.dm4;
import p000.e83;
import p000.il4;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleViewModel$_locales$3", m4291f = "OnboardingDictionaryLocaleViewModel.kt", m4292l = {54}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingDictionaryLocaleViewModel$_locales$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27210a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27211b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnboardingDictionaryLocaleViewModel$_locales$3 onboardingDictionaryLocaleViewModel$_locales$3 = new OnboardingDictionaryLocaleViewModel$_locales$3(3, (Continuation) obj3);
        onboardingDictionaryLocaleViewModel$_locales$3.f27211b = (e83) obj;
        return onboardingDictionaryLocaleViewModel$_locales$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f27211b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27210a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LanguageLearn[] languageLearnArrValues = LanguageLearn.values();
            ArrayList arrayList = new ArrayList(languageLearnArrValues.length);
            for (LanguageLearn languageLearn : languageLearnArrValues) {
                arrayList.add(new dm4(new il4(languageLearn.getCode(), true)));
            }
            this.f27211b = null;
            this.f27210a = 1;
            if (e83Var.emit(arrayList, this) == coroutineSingletons) {
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
