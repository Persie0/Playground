package com.lingq.feature.onboarding.auth.login;

import com.lingq.core.common.network.C1262a;
import com.lingq.core.domain.model.repo.NetworkErrorType;
import com.lingq.core.domain.model.user.Login;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.dk5;
import p000.pk9;
import p000.um5;
import p000.un1;
import p000.xfa;
import p000.xj5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.OnboardingLoginViewModel$login$1", m4291f = "OnboardingLoginViewModel.kt", m4292l = {114, 122}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingLoginViewModel$login$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2177b f27043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27044c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27045d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f27046e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LoginAuthType f27047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingLoginViewModel$login$1(C2177b c2177b, String str, String str2, String str3, LoginAuthType loginAuthType, Continuation continuation) {
        super(2, continuation);
        this.f27043b = c2177b;
        this.f27044c = str;
        this.f27045d = str2;
        this.f27046e = str3;
        this.f27047f = loginAuthType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingLoginViewModel$login$1(this.f27043b, this.f27044c, this.f27045d, this.f27046e, this.f27047f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingLoginViewModel$login$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r13 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27042a;
        C2177b c2177b = this.f27043b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1262a c1262a = c2177b.f27064h;
            this.f27042a = 1;
            obj = c1262a.m7045a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ym5 ym5Var = (ym5) obj;
        Login login = (Login) pk9.m19381x(ym5Var);
        String str = login != null ? login.f19647b : null;
        if (str != null && str.length() != 0) {
            c2177b.f27063g.getClass();
        }
        C3244l c3244l = c2177b.f27066j;
        do {
            value3 = c3244l.getValue();
            ((Boolean) value3).getClass();
        } while (!c3244l.m15570h(value3, Boolean.FALSE));
        C3244l c3244l2 = c2177b.f27065i;
        do {
            value4 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value4, ym5Var));
        return xfa.f68157a;
        if (((Boolean) obj).booleanValue()) {
            C3244l c3244l3 = c2177b.f27066j;
            do {
                value = c3244l3.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l3.m15570h(value, Boolean.TRUE));
            dk5 dk5Var = c2177b.f27059c;
            this.f27042a = 2;
            obj = dk5Var.m10441a(this.f27044c, this.f27045d, this.f27046e, this.f27047f, this);
        } else {
            C3244l c3244l4 = c2177b.f27065i;
            do {
                value2 = c3244l4.getValue();
            } while (!c3244l4.m15570h(value2, new um5(new xj5(NetworkErrorType.NO_INTERNET_CONNECTION))));
        }
        return xfa.f68157a;
    }
}
