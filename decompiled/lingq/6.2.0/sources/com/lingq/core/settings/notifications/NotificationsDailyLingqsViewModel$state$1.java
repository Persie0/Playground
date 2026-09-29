package com.lingq.core.settings.notifications;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.az1;
import p000.c32;
import p000.xfa;
import p000.xu8;
import p000.yn6;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsDailyLingqsViewModel$state$1", m4291f = "NotificationsDailyLingqsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsDailyLingqsViewModel$state$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ az1 f23000a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xu8 f23001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1876b f23002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDailyLingqsViewModel$state$1(C1876b c1876b, Continuation continuation) {
        super(3, continuation);
        this.f23002c = c1876b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NotificationsDailyLingqsViewModel$state$1 notificationsDailyLingqsViewModel$state$1 = new NotificationsDailyLingqsViewModel$state$1(this.f23002c, (Continuation) obj3);
        notificationsDailyLingqsViewModel$state$1.f23000a = (az1) obj;
        notificationsDailyLingqsViewModel$state$1.f23001b = (xu8) obj2;
        return notificationsDailyLingqsViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        az1 az1Var = this.f23000a;
        xu8 xu8Var = this.f23001b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new yn6(this.f23002c.f23016h, az1Var != null ? new Integer(az1Var.f7682a) : null, az1Var != null ? az1Var.f7683b : false, az1Var != null ? az1Var.f7684c : false, xu8Var);
    }
}
