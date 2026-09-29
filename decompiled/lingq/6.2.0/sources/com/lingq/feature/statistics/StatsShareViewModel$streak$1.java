package com.lingq.feature.statistics;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e83;
import p000.lda;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$streak$1", m4291f = "StatsShareViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$streak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2821i f33369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$streak$1(C2821i c2821i, Continuation continuation) {
        super(2, continuation);
        this.f33369a = c2821i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsShareViewModel$streak$1(this.f33369a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        StatsShareViewModel$streak$1 statsShareViewModel$streak$1 = (StatsShareViewModel$streak$1) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        statsShareViewModel$streak$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2821i c2821i = this.f33369a;
        AbstractC1263a.m7047b(lda.m16103C(c2821i), c2821i.f33472d, "update streak", new StatsShareViewModel$updateStreak$1(c2821i, null));
        return xfa.f68157a;
    }
}
