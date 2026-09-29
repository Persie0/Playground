package com.lingq.feature.onboarding.auth.registration;

import com.lingq.core.analytics.data.LqAnalyticsValues$RegistrationMethod;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx6;
import p000.h48;
import p000.km7;
import p000.ob1;
import p000.t66;
import p000.un1;
import p000.vk9;
import p000.xc9;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationViewModel$register$1", m4291f = "OnboardingRegistrationViewModel.kt", m4292l = {83}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingRegistrationViewModel$register$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2196e f27134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27135c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27136d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f27137e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f27138f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingRegistrationViewModel$register$1(C2196e c2196e, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.f27134b = c2196e;
        this.f27135c = str;
        this.f27136d = str2;
        this.f27137e = str3;
        this.f27138f = str4;
        this.f27139g = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingRegistrationViewModel$register$1(this.f27134b, this.f27135c, this.f27136d, this.f27137e, this.f27138f, this.f27139g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingRegistrationViewModel$register$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i;
        Object objM7086o;
        C2196e c2196e;
        C2196e c2196e2 = this.f27134b;
        t66 t66Var = c2196e2.f27159g;
        ob1 ob1Var = c2196e2.f27158f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f27133a;
        String str2 = this.f27135c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c2196e2.m9126X2(1);
            String str3 = cx6.f34682a;
            String strM17893g = cx6.f34687f;
            if (strM17893g == null) {
                strM17893g = ob1Var.m17893g();
            }
            String str4 = strM17893g;
            String strM17894h = ob1Var.m17894h();
            String strM17890c = ob1Var.m17890c();
            String str5 = strM17890c.equals("Canada") ? "BC" : null;
            String str6 = cx6.f34683b;
            String string = str2 != null ? vk9.m23376L0(str2).toString() : null;
            String str7 = cx6.f34688g;
            cx6.f34686e = string == null ? "" : string;
            ((xc9) t66Var).setValue(h48.m13043a(c2196e2.m9124V2(), true, null, null, 6));
            km7 km7Var = c2196e2.f27155c;
            Integer num = new Integer(Integer.parseInt(str6));
            this.f27133a = 1;
            str = str2;
            i = 6;
            objM7086o = ((C1267a) km7Var).m7086o(this.f27136d, this.f27137e, this.f27138f, this.f27139g, strM17890c, str5, num, strM17894h, str4, str3, string, str7, this);
            if (objM7086o == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7086o = obj;
            str = str2;
            i = 6;
        }
        ym5 ym5Var = (ym5) objM7086o;
        ((xc9) t66Var).setValue(h48.m13043a(c2196e2.m9124V2(), false, null, null, i));
        ym5Var.getClass();
        if (ym5Var instanceof xm5) {
            c2196e = c2196e2;
            c2196e.f27157e.m20138l(LqAnalyticsValues$RegistrationMethod.Email.getValue());
            c2196e.m9125W2(str);
        } else {
            c2196e = c2196e2;
        }
        ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), false, ym5Var, null, 5));
        return xfa.f68157a;
    }
}
