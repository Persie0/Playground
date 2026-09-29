package com.lingq.feature.onboarding.auth.registration;

import com.lingq.core.analytics.data.LqAnalyticsValues$RegistrationMethod;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cl9;
import p000.cx6;
import p000.h48;
import p000.km7;
import p000.ob1;
import p000.t66;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationViewModel$registerFacebook$1", m4291f = "OnboardingRegistrationViewModel.kt", m4292l = {125}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingRegistrationViewModel$registerFacebook$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2196e f27141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingRegistrationViewModel$registerFacebook$1(C2196e c2196e, String str, Continuation continuation) {
        super(2, continuation);
        this.f27141b = c2196e;
        this.f27142c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingRegistrationViewModel$registerFacebook$1(this.f27141b, this.f27142c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingRegistrationViewModel$registerFacebook$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7087p;
        C2196e c2196e = this.f27141b;
        ob1 ob1Var = c2196e.f27158f;
        t66 t66Var = c2196e.f27159g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27140a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c2196e.m9126X2(2);
            String str = cx6.f34682a;
            String strM17893g = cx6.f34687f;
            if (strM17893g == null) {
                strM17893g = ob1Var.m17893g();
            }
            String str2 = strM17893g;
            String strM17893g2 = ob1Var.m17893g();
            ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), true, null, null, 6));
            km7 km7Var = c2196e.f27155c;
            Integer numM4844a0 = cl9.m4844a0(cx6.f34683b);
            Integer num = new Integer(numM4844a0 != null ? numM4844a0.intValue() : 1);
            this.f27140a = 1;
            objM7087p = ((C1267a) km7Var).m7087p(num, this.f27142c, strM17893g2, str2, str, this);
            if (objM7087p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7087p = obj;
        }
        ym5 ym5Var = (ym5) objM7087p;
        ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), false, null, null, 6));
        ym5Var.getClass();
        if (ym5Var instanceof xm5) {
            c2196e.f27157e.m20138l(LqAnalyticsValues$RegistrationMethod.Facebook.getValue());
            c2196e.m9125W2(null);
        }
        ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), false, ym5Var, null, 5));
        return xfa.f68157a;
    }
}
