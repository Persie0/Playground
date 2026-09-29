package com.lingq.feature.onboarding.dailygoal;

import com.lingq.core.achievements.DailyGoal;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ft6;
import p000.gm5;
import p000.gt6;
import p000.sy1;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zy1;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dailygoal.OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1", m4291f = "OnboardingDailyGoalScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zy1 f27186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f27187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f27188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1(zy1 zy1Var, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f27186a = zy1Var;
        this.f27187b = t66Var;
        this.f27188c = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1(this.f27186a, this.f27187b, this.f27188c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1 onboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1 = (OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        onboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        zy1 zy1Var;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Iterator it = gt6.f41300a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            num = null;
            zy1Var = this.f27186a;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            sy1 sy1Var = (sy1) next;
            if (sy1Var.f61579a.contains(zy1Var.f72373a) && sy1Var.f61580b == zy1Var.f72374b) {
                break;
            }
        }
        sy1 sy1Var2 = (sy1) next;
        DailyGoal dailyGoal = zy1Var.f72376d;
        int i = dailyGoal == null ? -1 : ft6.f39626a[dailyGoal.ordinal()];
        if (i != -1) {
            if (i == 1) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61581c : 1500);
            } else if (i == 2) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61582d : 3000);
            } else if (i == 3) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61583e : 6000);
            } else {
                if (i != 4) {
                    gm5.m12750e();
                    return null;
                }
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61584f : 9000);
            }
        }
        if (num != null) {
            int iIntValue = num.intValue();
            t66 t66Var = this.f27187b;
            Integer num2 = (Integer) t66Var.getValue();
            this.f27188c.setValue(Boolean.valueOf(iIntValue > (num2 != null ? num2.intValue() : 0)));
            t66Var.setValue(num);
        }
        return xfa.f68157a;
    }
}
