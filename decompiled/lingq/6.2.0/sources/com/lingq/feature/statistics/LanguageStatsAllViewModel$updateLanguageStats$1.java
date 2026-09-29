package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
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
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsAllViewModel$updateLanguageStats$1", m4291f = "LanguageStatsAllViewModel.kt", m4292l = {188}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsAllViewModel$updateLanguageStats$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2810a f33146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressPeriod f33147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsAllViewModel$updateLanguageStats$1(C2810a c2810a, LanguageProgressPeriod languageProgressPeriod, Continuation continuation) {
        super(1, continuation);
        this.f33146b = c2810a;
        this.f33147c = languageProgressPeriod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageStatsAllViewModel$updateLanguageStats$1(this.f33146b, this.f33147c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageStatsAllViewModel$updateLanguageStats$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33145a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2810a c2810a = this.f33146b;
                oo4 oo4Var = c2810a.f33378c;
                String strMo4589b2 = c2810a.f33377b.mo4589b2();
                LanguageProgressPeriod languageProgressPeriod = this.f33147c;
                this.f33145a = 1;
                if (((C1294j) oo4Var).m7230d(strMo4589b2, languageProgressPeriod, this) == coroutineSingletons) {
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
