package com.lingq.feature.onboarding.p014v2;

import com.lingq.core.analytics.data.LqAnalyticsValues$RegistrationMethod;
import com.lingq.feature.onboarding.p014v2.domain.C2225f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3509qs;
import p000.c32;
import p000.c48;
import p000.cx6;
import p000.d48;
import p000.e48;
import p000.f48;
import p000.fs6;
import p000.gm5;
import p000.tt6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$registerWithFacebook$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {427}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$registerWithFacebook$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2216d f27329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$registerWithFacebook$1(C2216d c2216d, String str, Continuation continuation) {
        super(2, continuation);
        this.f27329b = c2216d;
        this.f27330c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$registerWithFacebook$1(this.f27329b, this.f27330c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$registerWithFacebook$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27328a;
        C2216d c2216d = this.f27329b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = c2216d.f27395t;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C2225f c2225f = c2216d.f27379d;
            String str = cx6.f34682a;
            String str2 = cx6.f34683b;
            String str3 = cx6.f34687f;
            this.f27328a = 1;
            obj = c2225f.m9177d(this.f27330c, str, str2, str3, this);
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
        f48 f48Var = (f48) obj;
        C3244l c3244l2 = c2216d.f27395t;
        C3244l c3244l3 = c2216d.f27396u;
        Boolean bool2 = Boolean.FALSE;
        c3244l2.getClass();
        c3244l2.m15572j(null, bool2);
        if (f48Var instanceof e48) {
            fs6 fs6Var = c2216d.f27381f;
            String value = LqAnalyticsValues$RegistrationMethod.Facebook.getValue();
            fs6Var.getClass();
            value.getClass();
            ((C3509qs) fs6Var.f39590b).m20138l(value);
            C2216d.m9163V2(c2216d);
        } else if (f48Var instanceof d48) {
            tt6 tt6Var = new tt6(((d48) f48Var).f34994a);
            c3244l3.getClass();
            c3244l3.m15572j(null, tt6Var);
        } else {
            if (!(f48Var instanceof c48)) {
                gm5.m12750e();
                return null;
            }
            tt6 tt6Var2 = new tt6("Facebook sign-in failed. Please try again.");
            c3244l3.getClass();
            c3244l3.m15572j(null, tt6Var2);
        }
        return xfa.f68157a;
    }
}
