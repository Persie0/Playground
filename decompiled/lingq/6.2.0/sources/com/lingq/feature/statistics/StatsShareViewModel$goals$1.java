package com.lingq.feature.statistics;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$goals$1", m4291f = "StatsShareViewModel.kt", m4292l = {90}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$goals$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33360a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33361b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f33362c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StatsShareViewModel$goals$1 statsShareViewModel$goals$1 = new StatsShareViewModel$goals$1(3, (Continuation) obj3);
        statsShareViewModel$goals$1.f33361b = (e83) obj;
        statsShareViewModel$goals$1.f33362c = (Pair) obj2;
        return statsShareViewModel$goals$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33361b;
        Pair pair = this.f33362c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33360a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f33361b = null;
            this.f33362c = null;
            this.f33360a = 1;
            if (e83Var.emit(pair, this) == coroutineSingletons) {
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
