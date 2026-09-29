package com.lingq.feature.onboarding;

import com.lingq.core.achievements.DailyGoal;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cl9;
import p000.cx6;
import p000.fs6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$seedLynxMemory$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {333}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$seedLynxMemory$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$seedLynxMemory$1(C2197b c2197b, Continuation continuation) {
        super(2, continuation);
        this.f26969b = c2197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$seedLynxMemory$1(this.f26969b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$seedLynxMemory$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26968a;
        Object obj2 = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            fs6 fs6Var = this.f26969b.f27166g;
            String str = cx6.f34682a;
            String str2 = cx6.f34683b;
            Set set = cx6.f34685d;
            for (Object obj3 : DailyGoal.getEntries()) {
                if (cl9.m4834Q(((DailyGoal) obj3).name(), cx6.f34684c, true)) {
                    obj2 = obj3;
                    break;
                }
            }
            DailyGoal dailyGoal = (DailyGoal) obj2;
            OnboardingSelections onboardingSelections = new OnboardingSelections(str, str2, set, dailyGoal != null ? dailyGoal.getMins() : 0, 130486);
            this.f26968a = 1;
            if (fs6Var.m12088A(str, onboardingSelections, this) == coroutineSingletons) {
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
