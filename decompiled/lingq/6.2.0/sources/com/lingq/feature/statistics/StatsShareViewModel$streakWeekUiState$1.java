package com.lingq.feature.statistics;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fj9;
import p000.jp4;
import p000.rj9;
import p000.sj9;
import p000.tj9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$streakWeekUiState$1", m4291f = "StatsShareViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$streakWeekUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ fj9 f33370a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jp4 f33371b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StatsShareViewModel$streakWeekUiState$1 statsShareViewModel$streakWeekUiState$1 = new StatsShareViewModel$streakWeekUiState$1(3, (Continuation) obj3);
        statsShareViewModel$streakWeekUiState$1.f33370a = (fj9) obj;
        statsShareViewModel$streakWeekUiState$1.f33371b = (jp4) obj2;
        return statsShareViewModel$streakWeekUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fj9 fj9Var = this.f33370a;
        jp4 jp4Var = this.f33371b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (fj9Var == null || jp4Var == null) {
            return sj9.f60941a;
        }
        int i = fj9Var.f39204a;
        return i == 0 ? rj9.f59415a : new tj9(i, fj9Var.f39205b, false, 24);
    }
}
