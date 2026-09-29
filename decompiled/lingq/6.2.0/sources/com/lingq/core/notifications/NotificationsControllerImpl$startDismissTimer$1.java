package com.lingq.core.notifications;

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
import p000.h24;
import p000.iy5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.notifications.NotificationsControllerImpl$startDismissTimer$1", m4291f = "NotificationsController.kt", m4292l = {167}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsControllerImpl$startDismissTimer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f21868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1799a f21869c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h24 f21870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$startDismissTimer$1(int i, C1799a c1799a, h24 h24Var, Continuation continuation) {
        super(2, continuation);
        this.f21868b = i;
        this.f21869c = c1799a;
        this.f21870d = h24Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsControllerImpl$startDismissTimer$1(this.f21868b, this.f21869c, this.f21870d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsControllerImpl$startDismissTimer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21867a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            iy5 iy5Var = cn2.f10315b;
            long jM17117e0 = AbstractC3352my.m17117e0(this.f21868b, DurationUnit.SECONDS);
            this.f21867a = 1;
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
        this.f21869c.mo7005P1(this.f21870d);
        return xfa.f68157a;
    }
}
