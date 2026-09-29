package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3602t8;
import p000.c32;
import p000.c83;
import p000.oo4;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$getGoals$1", m4291f = "StatsShareViewModel.kt", m4292l = {159}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$getGoals$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2821i f33357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33358c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressInterval f33359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$getGoals$1(C2821i c2821i, String str, LanguageProgressInterval languageProgressInterval, Continuation continuation) {
        super(1, continuation);
        this.f33357b = c2821i;
        this.f33358c = str;
        this.f33359d = languageProgressInterval;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StatsShareViewModel$getGoals$1(this.f33357b, this.f33358c, this.f33359d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((StatsShareViewModel$getGoals$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33356a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2821i c2821i = this.f33357b;
            oo4 oo4Var = c2821i.f33471c;
            String str = this.f33358c;
            LanguageProgressInterval languageProgressInterval = this.f33359d;
            c83 c83VarM7234h = ((C1294j) oo4Var).m7234h(str, languageProgressInterval);
            C3602t8 c3602t8 = new C3602t8(14, languageProgressInterval, c2821i);
            this.f33356a = 1;
            if (c83VarM7234h.collect(c3602t8, this) == coroutineSingletons) {
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
