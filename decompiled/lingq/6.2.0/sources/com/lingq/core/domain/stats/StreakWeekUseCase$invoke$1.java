package com.lingq.core.domain.stats;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.stats.StreakWeekUseCase$invoke$1", m4291f = "StreakWeekUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class StreakWeekUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ProfileAccount f19975a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Language f19976b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StreakWeekUseCase$invoke$1 streakWeekUseCase$invoke$1 = new StreakWeekUseCase$invoke$1(3, (Continuation) obj3);
        streakWeekUseCase$invoke$1.f19975a = (ProfileAccount) obj;
        streakWeekUseCase$invoke$1.f19976b = (Language) obj2;
        return streakWeekUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileAccount profileAccount = this.f19975a;
        Language language = this.f19976b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(profileAccount, language);
    }
}
