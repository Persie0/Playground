package com.lingq.feature.statistics.domain;

import com.lingq.core.domain.model.challenge.Challenge;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.at0;
import p000.c32;
import p000.cl9;
import p000.ct0;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetChallengesStatsUseCase$invoke$3", m4291f = "GetChallengesStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChallengesStatsUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33412a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetChallengesStatsUseCase$invoke$3 getChallengesStatsUseCase$invoke$3 = new GetChallengesStatsUseCase$invoke$3(2, continuation);
        getChallengesStatsUseCase$invoke$3.f33412a = obj;
        return getChallengesStatsUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChallengesStatsUseCase$invoke$3) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f33412a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!cl9.m4842Y(((Challenge) obj2).f18854b, "language_cup_", false)) {
                arrayList.add(obj2);
            }
        }
        return arrayList.isEmpty() ? at0.f7452a : new ct0(u91.m22615g1(arrayList, 3));
    }
}
