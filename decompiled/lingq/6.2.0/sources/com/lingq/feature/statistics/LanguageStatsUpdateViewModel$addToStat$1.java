package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.p33;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$addToStat$1", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {203}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsUpdateViewModel$addToStat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2817e f33243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LanguageProgressInterval f33244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LanguageProgressMetric f33245d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ double f33246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$addToStat$1(C2817e c2817e, LanguageProgressInterval languageProgressInterval, LanguageProgressMetric languageProgressMetric, double d, Continuation continuation) {
        super(2, continuation);
        this.f33243b = c2817e;
        this.f33244c = languageProgressInterval;
        this.f33245d = languageProgressMetric;
        this.f33246e = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsUpdateViewModel$addToStat$1(this.f33243b, this.f33244c, this.f33245d, this.f33246e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsUpdateViewModel$addToStat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33242a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2817e c2817e = this.f33243b;
            p33 p33Var = c2817e.f33450p;
            String strMo4589b2 = c2817e.f33436b.mo4589b2();
            this.f33242a = 1;
            if (p33Var.m18873Q(strMo4589b2, this.f33244c, this.f33245d, this.f33246e, this) == coroutineSingletons) {
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
