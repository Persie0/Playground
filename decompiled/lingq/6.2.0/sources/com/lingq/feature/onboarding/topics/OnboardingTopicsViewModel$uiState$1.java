package com.lingq.feature.onboarding.topics;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.ai6;
import p000.c32;
import p000.cx6;
import p000.m7a;
import p000.w7a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.topics.OnboardingTopicsViewModel$uiState$1", m4291f = "OnboardingTopicsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
public final class OnboardingTopicsViewModel$uiState$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27287a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingTopicsViewModel$uiState$1 onboardingTopicsViewModel$uiState$1 = new OnboardingTopicsViewModel$uiState$1(2, continuation);
        onboardingTopicsViewModel$uiState$1.f27287a = obj;
        return onboardingTopicsViewModel$uiState$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingTopicsViewModel$uiState$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f27287a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((m7a) it.next()).f50737b) {
                    z = true;
                    break;
                }
            }
        }
        String str = cx6.f34682a;
        return new w7a(list, z, AbstractC3423or.m18284x(cx6.f34682a) ? ai6.f694a : ai6.f698e);
    }
}
