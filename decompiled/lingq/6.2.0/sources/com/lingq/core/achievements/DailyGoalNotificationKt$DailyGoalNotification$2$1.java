package com.lingq.core.achievements;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.g77;
import p000.i77;
import p000.j77;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.DailyGoalNotificationKt$DailyGoalNotification$2$1", m4291f = "DailyGoalNotification.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DailyGoalNotificationKt$DailyGoalNotification$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g77 f14171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f14172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f14173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalNotificationKt$DailyGoalNotification$2$1(g77 g77Var, ui3 ui3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f14171a = g77Var;
        this.f14172b = ui3Var;
        this.f14173c = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DailyGoalNotificationKt$DailyGoalNotification$2$1(this.f14171a, this.f14172b, this.f14173c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DailyGoalNotificationKt$DailyGoalNotification$2$1 dailyGoalNotificationKt$DailyGoalNotification$2$1 = (DailyGoalNotificationKt$DailyGoalNotification$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dailyGoalNotificationKt$DailyGoalNotification$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        g77 g77Var = this.f14171a;
        j77 j77VarMo12408n = g77Var.mo12408n();
        j77VarMo12408n.getClass();
        i77 i77Var = i77.f43628a;
        this.f14173c.setValue(Boolean.valueOf(!j77VarMo12408n.equals(i77Var)));
        j77 j77VarMo12408n2 = g77Var.mo12408n();
        j77VarMo12408n2.getClass();
        if (j77VarMo12408n2.equals(i77Var)) {
            this.f14172b.mo0a();
        }
        return xfa.f68157a;
    }
}
