package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1298n;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vqb;
import p000.xfa;
import p000.xy5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$1", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {172}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsUpdateViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33236a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2817e f33238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$1(C2817e c2817e, Continuation continuation) {
        super(2, continuation);
        this.f33238c = c2817e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LanguageStatsUpdateViewModel$1 languageStatsUpdateViewModel$1 = new LanguageStatsUpdateViewModel$1(this.f33238c, continuation);
        languageStatsUpdateViewModel$1.f33237b = obj;
        return languageStatsUpdateViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsUpdateViewModel$1) create((String) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f33237b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33236a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        vqb vqbVar = this.f33238c.f33445k;
        this.f33237b = null;
        this.f33236a = 1;
        Object objM7331b = ((C1298n) ((xy5) vqbVar.f65802b)).m7331b(str, this);
        if (objM7331b != coroutineSingletons) {
            objM7331b = xfaVar;
        }
        return objM7331b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
