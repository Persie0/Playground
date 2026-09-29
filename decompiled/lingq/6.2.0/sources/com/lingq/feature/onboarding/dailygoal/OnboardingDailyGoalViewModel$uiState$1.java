package com.lingq.feature.onboarding.dailygoal;

import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.LearningLevel;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.cx6;
import p000.fa4;
import p000.xfa;
import p000.ys2;
import p000.zy1;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.dailygoal.OnboardingDailyGoalViewModel$uiState$1", m4291f = "OnboardingDailyGoalViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
public final class OnboardingDailyGoalViewModel$uiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ys2 f27191a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ DailyGoal f27192b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OnboardingDailyGoalViewModel$uiState$1 onboardingDailyGoalViewModel$uiState$1 = new OnboardingDailyGoalViewModel$uiState$1(3, (Continuation) obj3);
        onboardingDailyGoalViewModel$uiState$1.f27191a = (ys2) obj;
        onboardingDailyGoalViewModel$uiState$1.f27192b = (DailyGoal) obj2;
        return onboardingDailyGoalViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        ys2 ys2Var = this.f27191a;
        DailyGoal dailyGoal = this.f27192b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = cx6.f34682a;
        Iterator<E> it = LearningLevel.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((LearningLevel) next).getServerName(), cx6.f34683b));
        LearningLevel learningLevel = (LearningLevel) next;
        if (learningLevel == null) {
            learningLevel = LearningLevel.Beginner1;
        }
        return new zy1(str, learningLevel, ys2Var, dailyGoal);
    }
}
