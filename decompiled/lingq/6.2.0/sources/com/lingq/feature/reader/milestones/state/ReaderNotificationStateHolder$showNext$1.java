package com.lingq.feature.reader.milestones.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC3208a;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.cn2;
import p000.iy5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.state.ReaderNotificationStateHolder$showNext$1", m4291f = "ReaderNotificationStateHolder.kt", m4292l = {67}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderNotificationStateHolder$showNext$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f28210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2272a f28211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderNotificationStateHolder$showNext$1(int i, C2272a c2272a, Continuation continuation) {
        super(2, continuation);
        this.f28210b = i;
        this.f28211c = c2272a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderNotificationStateHolder$showNext$1(this.f28210b, this.f28211c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderNotificationStateHolder$showNext$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28209a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            iy5 iy5Var = cn2.f10315b;
            long jM17117e0 = AbstractC3352my.m17117e0(this.f28210b, DurationUnit.SECONDS);
            this.f28209a = 1;
            if (AbstractC3208a.m15438e(jM17117e0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f28211c.m9283a();
        return xfa.f68157a;
    }
}
