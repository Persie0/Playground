package com.lingq.feature.onboarding;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.onboarding.p014v2.C2216d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3575si;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingStartFragment$observeNavigation$1", m4291f = "OnboardingStartFragment.kt", m4292l = {91}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingStartFragment$observeNavigation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnboardingStartFragment f26990b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.OnboardingStartFragment$observeNavigation$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.OnboardingStartFragment$observeNavigation$1$1", m4291f = "OnboardingStartFragment.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21731 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26991a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnboardingStartFragment f26992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21731(OnboardingStartFragment onboardingStartFragment, Continuation continuation) {
            super(2, continuation);
            this.f26992b = onboardingStartFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21731(this.f26992b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21731) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26991a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                OnboardingStartFragment onboardingStartFragment = this.f26992b;
                C3244l c3244l = ((C2216d) onboardingStartFragment.f26984E0.getValue()).f27373K;
                C3575si c3575si = new C3575si(onboardingStartFragment, 3);
                this.f26991a = 1;
                if (c3244l.collect(c3575si, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C3386nv.m17631r();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingStartFragment$observeNavigation$1(OnboardingStartFragment onboardingStartFragment, Continuation continuation) {
        super(2, continuation);
        this.f26990b = onboardingStartFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingStartFragment$observeNavigation$1(this.f26990b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingStartFragment$observeNavigation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26989a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            OnboardingStartFragment onboardingStartFragment = this.f26990b;
            lg3 lg3VarM2112n = onboardingStartFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.STARTED;
            C21731 c21731 = new C21731(onboardingStartFragment, null);
            this.f26989a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c21731, this) == coroutineSingletons) {
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
