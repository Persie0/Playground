package com.lingq.feature.challenges.cup;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$openSignup$1$userLanguages$1", m4291f = "CupViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$openSignup$1$userLanguages$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24654a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CupViewModel$openSignup$1$userLanguages$1 cupViewModel$openSignup$1$userLanguages$1 = new CupViewModel$openSignup$1$userLanguages$1(2, continuation);
        cupViewModel$openSignup$1$userLanguages$1.f24654a = obj;
        return cupViewModel$openSignup$1$userLanguages$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$openSignup$1$userLanguages$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f24654a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(!list.isEmpty());
    }
}
