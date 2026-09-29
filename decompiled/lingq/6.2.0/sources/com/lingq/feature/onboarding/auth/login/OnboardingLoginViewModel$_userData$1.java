package com.lingq.feature.onboarding.auth.login;

import com.lingq.core.domain.model.user.Login;
import com.lingq.feature.onboarding.domain.C2207a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.pk9;
import p000.wm5;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.OnboardingLoginViewModel$_userData$1", m4291f = "OnboardingLoginViewModel.kt", m4292l = {59}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLoginViewModel$_userData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27039a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2177b f27041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLoginViewModel$_userData$1(C2177b c2177b, Continuation continuation) {
        super(2, continuation);
        this.f27041c = c2177b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingLoginViewModel$_userData$1 onboardingLoginViewModel$_userData$1 = new OnboardingLoginViewModel$_userData$1(this.f27041c, continuation);
        onboardingLoginViewModel$_userData$1.f27040b = obj;
        return onboardingLoginViewModel$_userData$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingLoginViewModel$_userData$1) create((ym5) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        C2177b c2177b = this.f27041c;
        C3244l c3244l = c2177b.f27066j;
        ym5 ym5Var = (ym5) this.f27040b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27039a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Login login = (Login) pk9.m19381x(ym5Var);
            String str = login != null ? login.f19647b : null;
            if (str == null || str.length() == 0) {
                return wm5.f67054a;
            }
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.TRUE));
            C2207a c2207a = c2177b.f27060d;
            this.f27040b = null;
            this.f27039a = 1;
            obj = c2207a.m9136a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ym5 ym5Var2 = (ym5) obj;
        do {
            value2 = c3244l.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l.m15570h(value2, Boolean.FALSE));
        return ym5Var2;
    }
}
