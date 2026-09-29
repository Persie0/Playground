package com.lingq.feature.onboarding.dailygoal;

import com.lingq.core.achievements.DailyGoal;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.cx6;
import p000.gm5;
import p000.qy1;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class OnboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str;
        Object value;
        qy1 qy1Var = (qy1) obj;
        qy1Var.getClass();
        OnboardingDailyGoalViewModel onboardingDailyGoalViewModel = (OnboardingDailyGoalViewModel) this.f47704b;
        onboardingDailyGoalViewModel.getClass();
        if (!(qy1Var instanceof qy1)) {
            gm5.m12750e();
            return null;
        }
        DailyGoal dailyGoal = qy1Var.f58368a;
        String str2 = cx6.f34682a;
        int coins = dailyGoal.getCoins();
        if (coins == 50) {
            str = "casual";
        } else if (coins == 100) {
            str = "steady";
        } else if (coins != 200) {
            str = coins != 400 ? "" : "insane";
        } else {
            str = "intense";
        }
        cx6.f34684c = str;
        C3244l c3244l = onboardingDailyGoalViewModel.f27189b;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, dailyGoal));
        return xfa.f68157a;
    }
}
