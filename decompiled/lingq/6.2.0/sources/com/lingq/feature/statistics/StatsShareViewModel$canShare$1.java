package com.lingq.feature.statistics;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fj9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$canShare$1", m4291f = "StatsShareViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$canShare$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fj9 f33354a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Pair f33355b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StatsShareViewModel$canShare$1 statsShareViewModel$canShare$1 = new StatsShareViewModel$canShare$1(3, (Continuation) obj3);
        statsShareViewModel$canShare$1.f33354a = (fj9) obj;
        statsShareViewModel$canShare$1.f33355b = (Pair) obj2;
        return statsShareViewModel$canShare$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fj9 fj9Var = this.f33354a;
        Pair pair = this.f33355b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf((fj9Var == null || ((Boolean) pair.f47624b).booleanValue()) ? false : true);
    }
}
