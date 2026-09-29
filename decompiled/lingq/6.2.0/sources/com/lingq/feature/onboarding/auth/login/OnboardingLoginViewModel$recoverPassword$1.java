package com.lingq.feature.onboarding.auth.login;

import com.lingq.core.data.profile.C1267a;
import com.lingq.feature.onboarding.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.a57;
import p000.c32;
import p000.dk5;
import p000.un1;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.OnboardingLoginViewModel$recoverPassword$1", m4291f = "OnboardingLoginViewModel.kt", m4292l = {135}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLoginViewModel$recoverPassword$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2177b f27055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLoginViewModel$recoverPassword$1(C2177b c2177b, String str, Continuation continuation) {
        super(2, continuation);
        this.f27055b = c2177b;
        this.f27056c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingLoginViewModel$recoverPassword$1(this.f27055b, this.f27056c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingLoginViewModel$recoverPassword$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f27054a;
        C2177b c2177b = this.f27055b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            dk5 dk5Var = c2177b.f27061e;
            this.f27054a = 1;
            obj = ((C1267a) dk5Var.f35743a).m7085n(this.f27056c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ym5 ym5Var = (ym5) obj;
        C3244l c3244l = c2177b.f27067k;
        do {
            value = c3244l.getValue();
            ((Number) value).intValue();
            if (ym5Var instanceof xm5) {
                i = R$string.support_password_sent;
            } else {
                i = ym5Var instanceof a57 ? R$string.support_email_not_registered : 0;
            }
        } while (!c3244l.m15570h(value, new Integer(i)));
        return xfa.f68157a;
    }
}
