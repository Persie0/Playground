package com.lingq.feature.statistics.domain;

import com.lingq.core.data.repository.C1288d;
import com.lingq.core.p012ui.challenges.ChallengeType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.or0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetChallengesStatsUseCase$invoke$2", m4291f = "GetChallengesStatsUseCase.kt", m4292l = {17}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChallengesStatsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2815b f33410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChallengesStatsUseCase$invoke$2(C2815b c2815b, String str, Continuation continuation) {
        super(1, continuation);
        this.f33410b = c2815b;
        this.f33411c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetChallengesStatsUseCase$invoke$2(this.f33410b, this.f33411c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetChallengesStatsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33409a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            or0 or0Var = this.f33410b.f33432a;
            String value = ChallengeType.BookChallenge.getValue();
            this.f33409a = 1;
            if (((C1288d) or0Var).m7139f(this.f33411c, value, this) == coroutineSingletons) {
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
