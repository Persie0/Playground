package com.lingq.feature.challenges.cup;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.ft1;
import p000.xfa;
import p000.zw1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$contributorsData$1", m4291f = "CupViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$contributorsData$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ft1 f24649a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ft1 f24650b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CupViewModel$contributorsData$1 cupViewModel$contributorsData$1 = new CupViewModel$contributorsData$1(3, (Continuation) obj3);
        cupViewModel$contributorsData$1.f24649a = (ft1) obj;
        cupViewModel$contributorsData$1.f24650b = (ft1) obj2;
        return cupViewModel$contributorsData$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ft1 ft1Var = this.f24649a;
        ft1 ft1Var2 = this.f24650b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new zw1(ft1Var, ft1Var2);
    }
}
