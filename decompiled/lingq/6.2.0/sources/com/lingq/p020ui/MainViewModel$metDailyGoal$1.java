package com.lingq.p020ui;

import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.GoalMetType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.go3;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$metDailyGoal$1", m4291f = "MainViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$metDailyGoal$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2889e f34132a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DailyGoalMet f34133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$metDailyGoal$1(C2889e c2889e, DailyGoalMet dailyGoalMet, Continuation continuation) {
        super(2, continuation);
        this.f34132a = c2889e;
        this.f34133b = dailyGoalMet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$metDailyGoal$1(this.f34132a, this.f34133b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MainViewModel$metDailyGoal$1 mainViewModel$metDailyGoal$1 = (MainViewModel$metDailyGoal$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        mainViewModel$metDailyGoal$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        DailyGoalMet dailyGoalMet = this.f34133b;
        String str = dailyGoalMet.f19519f;
        C2889e c2889e = this.f34132a;
        wfb.m23926u(lda.m16103C(c2889e), c2889e.f34219u, null, new MainViewModel$meetMilestone$1(c2889e, str, null), 2);
        c2889e.f34210l.mo7016z1(new go3(dailyGoalMet.f19520g > 0 ? GoalMetType.StreakMilestone : GoalMetType.DailyGoal, dailyGoalMet));
        return xfa.f68157a;
    }
}
