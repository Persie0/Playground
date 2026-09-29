package com.lingq.feature.challenges.cup;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.hu1;
import p000.rt1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupDailyPrizeViewModel$uiFlags$1", m4291f = "CupDailyPrizeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDailyPrizeViewModel$uiFlags$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f24601a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ hu1 f24602b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        CupDailyPrizeViewModel$uiFlags$1 cupDailyPrizeViewModel$uiFlags$1 = new CupDailyPrizeViewModel$uiFlags$1(3, (Continuation) obj3);
        cupDailyPrizeViewModel$uiFlags$1.f24601a = zBooleanValue;
        cupDailyPrizeViewModel$uiFlags$1.f24602b = (hu1) obj2;
        return cupDailyPrizeViewModel$uiFlags$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f24601a;
        hu1 hu1Var = this.f24602b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new rt1(z, hu1Var);
    }
}
