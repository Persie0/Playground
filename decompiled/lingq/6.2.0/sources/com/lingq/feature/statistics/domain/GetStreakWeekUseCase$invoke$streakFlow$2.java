package com.lingq.feature.statistics.domain;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetStreakWeekUseCase$invoke$streakFlow$2", m4291f = "GetStreakWeekUseCase.kt", m4292l = {18}, m4293m = "invokeSuspend", m4294v = 2)
final class GetStreakWeekUseCase$invoke$streakFlow$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2816c f33424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStreakWeekUseCase$invoke$streakFlow$2(C2816c c2816c, String str, Continuation continuation) {
        super(1, continuation);
        this.f33424b = c2816c;
        this.f33425c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetStreakWeekUseCase$invoke$streakFlow$2(this.f33424b, this.f33425c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetStreakWeekUseCase$invoke$streakFlow$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33423a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            oo4 oo4Var = this.f33424b.f33434b;
            this.f33423a = 1;
            if (((C1294j) oo4Var).m7233g(this.f33425c, this) == coroutineSingletons) {
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
