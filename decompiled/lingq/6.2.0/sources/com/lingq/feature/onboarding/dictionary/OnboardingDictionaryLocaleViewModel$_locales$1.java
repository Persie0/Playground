package com.lingq.feature.onboarding.dictionary;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.language.DictionaryLocale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cx6;
import p000.dm4;
import p000.fa4;
import p000.il4;
import p000.lt6;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleViewModel$_locales$1", m4291f = "OnboardingDictionaryLocaleViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingDictionaryLocaleViewModel$_locales$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2206a f27207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingDictionaryLocaleViewModel$_locales$1(C2206a c2206a, Continuation continuation) {
        super(2, continuation);
        this.f27207b = c2206a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingDictionaryLocaleViewModel$_locales$1 onboardingDictionaryLocaleViewModel$_locales$1 = new OnboardingDictionaryLocaleViewModel$_locales$1(this.f27207b, continuation);
        onboardingDictionaryLocaleViewModel$_locales$1.f27206a = obj;
        return onboardingDictionaryLocaleViewModel$_locales$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingDictionaryLocaleViewModel$_locales$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f27206a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!fa4.m11650l(((DictionaryLocale) obj2).f19021a, cx6.f34682a)) {
                arrayList.add(obj2);
            }
        }
        int i = 0;
        List listM22614f1 = u91.m22614f1(arrayList, new lt6(this.f27207b, i));
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22614f1, 10));
        Iterator it = listM22614f1.iterator();
        while (it.hasNext()) {
            arrayList2.add(new dm4(new il4(((DictionaryLocale) it.next()).f19021a, true)));
        }
        if (arrayList2.isEmpty()) {
            LanguageLearn[] languageLearnArrValues = LanguageLearn.values();
            arrayList2 = new ArrayList(languageLearnArrValues.length);
            int length = languageLearnArrValues.length;
            while (i < length) {
                arrayList2.add(new dm4(new il4(languageLearnArrValues[i].getCode(), true)));
                i++;
            }
        }
        return arrayList2;
    }
}
