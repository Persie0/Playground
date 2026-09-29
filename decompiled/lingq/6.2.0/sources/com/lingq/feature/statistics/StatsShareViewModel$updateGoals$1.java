package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
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
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$updateGoals$1", m4291f = "StatsShareViewModel.kt", m4292l = {178}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$updateGoals$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2821i f33373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressInterval f33374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$updateGoals$1(C2821i c2821i, LanguageProgressInterval languageProgressInterval, Continuation continuation) {
        super(1, continuation);
        this.f33373b = c2821i;
        this.f33374c = languageProgressInterval;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StatsShareViewModel$updateGoals$1(this.f33373b, this.f33374c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((StatsShareViewModel$updateGoals$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33372a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2821i c2821i = this.f33373b;
                oo4 oo4Var = c2821i.f33471c;
                String strMo4589b2 = c2821i.f33470b.mo4589b2();
                LanguageProgressInterval languageProgressInterval = this.f33374c;
                this.f33372a = 1;
                if (((C1294j) oo4Var).m7228b(strMo4589b2, languageProgressInterval, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
