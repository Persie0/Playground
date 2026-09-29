package com.lingq.feature.statistics.domain;

import com.lingq.core.data.repository.C1285a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b80;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetBadgesStatsUseCase$invoke$2", m4291f = "GetBadgesStatsUseCase.kt", m4292l = {17}, m4293m = "invokeSuspend", m4294v = 2)
final class GetBadgesStatsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2814a f33406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBadgesStatsUseCase$invoke$2(C2814a c2814a, String str, Continuation continuation) {
        super(1, continuation);
        this.f33406b = c2814a;
        this.f33407c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetBadgesStatsUseCase$invoke$2(this.f33406b, this.f33407c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetBadgesStatsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33405a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            b80 b80Var = (b80) this.f33406b.f33431a;
            this.f33405a = 1;
            if (((C1285a) b80Var).m7097a(this.f33407c, this) == coroutineSingletons) {
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
