package com.lingq.feature.statistics;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$shareStats$1", m4291f = "StatsShareViewModel.kt", m4292l = {203}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareViewModel$shareStats$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2821i f33364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$shareStats$1(C2821i c2821i, Continuation continuation) {
        super(2, continuation);
        this.f33364b = c2821i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsShareViewModel$shareStats$1(this.f33364b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StatsShareViewModel$shareStats$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33363a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2821i c2821i = this.f33364b;
            C3211a c3211a = c2821i.f33474f;
            String strMo4589b2 = c2821i.f33470b.mo4589b2();
            this.f33363a = 1;
            if (c3211a.mo4678m(strMo4589b2, this) == coroutineSingletons) {
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
