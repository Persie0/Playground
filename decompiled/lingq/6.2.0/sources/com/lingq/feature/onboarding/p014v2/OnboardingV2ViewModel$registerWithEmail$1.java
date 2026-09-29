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
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ViewModel$registerWithEmail$1", m4291f = "OnboardingV2ViewModel.kt", m4292l = {352}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ViewModel$registerWithEmail$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2216d f27323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27324c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27325d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f27326e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f27327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ViewModel$registerWithEmail$1(C2216d c2216d, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.f27323b = c2216d;
        this.f27324c = str;
        this.f27325d = str2;
        this.f27326e = str3;
        this.f27327f = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ViewModel$registerWithEmail$1(this.f27323b, this.f27324c, this.f27325d, this.f27326e, this.f27327f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ViewModel$registerWithEmail$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM9174a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27322a;
        C2216d c2216d = this.f27323b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = c2216d.f27395t;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C2225f c2225f = c2216d.f27378c;
            String str = cx6.f34682a;
            String str2 = cx6.f34683b;
            String str3 = cx6.f34687f;
            String str4 = cx6.f34688g;
            this.f27322a = 1;
            objM9174a = c2225f.m9174a(this.f27324c, this.f27325d, this.f27326e, this.f27327f, str, str2, str3, str4, this);
            if (objM9174a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM9174a = obj;
        }
        f48 f48Var = (f48) objM9174a;
        C3244l c3244l2 = c2216d.f27395t;
        C3244l c3244l3 = c2216d.f27396u;
        Boolean bool2 = Boolean.FALSE;
        c3244l2.getClass();
        c3244l2.m15572j(null, bool2);
        if (f48Var instanceof e48) {
            fs6 fs6Var = c2216d.f27381f;
            String value = LqAnalyticsValues$RegistrationMethod.Email.getValue();
            fs6Var.getClass();
            value.getClass();
            ((C3509qs) fs6Var.f39590b).m20138l(value);
            C2216d.m9163V2(c2216d);
        } else if (f48Var instanceof c48) {
            tt6 tt6Var = new tt6("Account created! Please log in to continue.");
            c3244l3.getClass();
            c3244l3.m15572j(null, tt6Var);
        } else {
            if (!(f48Var instanceof d48)) {
                gm5.m12750e();
                return null;
            }
            tt6 tt6Var2 = new tt6(((d48) f48Var).f34994a);
            c3244l3.getClass();
            c3244l3.m15572j(null, tt6Var2);
        }
        return xfa.f68157a;
    }
}
