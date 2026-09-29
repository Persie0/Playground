package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.g23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupDailyPrizeViewModel$2", m4291f = "CupDailyPrizeViewModel.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDailyPrizeViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1977d f24594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDailyPrizeViewModel$2(C1977d c1977d, Continuation continuation) {
        super(2, continuation);
        this.f24594b = c1977d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupDailyPrizeViewModel$2(this.f24594b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupDailyPrizeViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24593a;
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
        g23 g23Var = this.f24594b.f24685c;
        this.f24593a = 1;
        Object objM7189b = ((C1291g) g23Var.f40075a).m7189b(this);
        if (objM7189b != coroutineSingletons) {
            objM7189b = xfaVar;
        }
        return objM7189b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
