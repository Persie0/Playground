package com.lingq.feature.statistics;

import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$2", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsUpdateViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2817e f33239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$2(C2817e c2817e, Continuation continuation) {
        super(2, continuation);
        this.f33239a = c2817e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsUpdateViewModel$2(this.f33239a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LanguageStatsUpdateViewModel$2 languageStatsUpdateViewModel$2 = (LanguageStatsUpdateViewModel$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        languageStatsUpdateViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1808b c1808b = this.f33239a.f33437c;
        if (((PlayingFrom) c1808b.f21953f.mo9214t2().getValue()) == PlayingFrom.Lesson) {
            c1808b.m8447J();
        }
        return xfa.f68157a;
    }
}
