package com.lingq.feature.onboarding;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Login;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.dk5;
import p000.pk9;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$login$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {113, 119}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$login$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26963a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26964b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f26965c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26966d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f26967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$login$1(C2197b c2197b, boolean z, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f26964b = c2197b;
        this.f26965c = z;
        this.f26966d = str;
        this.f26967e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$login$1(this.f26964b, this.f26965c, this.f26966d, this.f26967e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$login$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r13 == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r13 == r3) goto L25;
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
        C2197b c2197b = this.f26964b;
        C3244l c3244l = c2197b.f27174o;
        C3244l c3244l2 = c2197b.f27175p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26963a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l2.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l2.m15570h(value, Boolean.TRUE));
            if (this.f26965c) {
                qm7 qm7Var = ((C1369b) c2197b.f27163d).f18482o;
                this.f26963a = 1;
                obj = AbstractC3224d.m15542u(qm7Var, this);
            } else {
                dk5 dk5Var = c2197b.f27164e;
                LoginAuthType loginAuthType = LoginAuthType.EMAIL;
                this.f26963a = 2;
                obj = dk5Var.m10441a(this.f26966d, this.f26967e, "", loginAuthType, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            Login login = (Login) obj;
            if (login != null) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, new xm5(login)));
            }
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            ym5 ym5Var = (ym5) obj;
            Login login2 = (Login) pk9.m19381x(ym5Var);
            String str = login2 != null ? login2.f19647b : null;
            if (str != null && str.length() != 0) {
                c2197b.f27172m.getClass();
            }
            do {
                value4 = c3244l.getValue();
            } while (!c3244l.m15570h(value4, ym5Var));
        }
        do {
            value3 = c3244l2.getValue();
            ((Boolean) value3).getClass();
        } while (!c3244l2.m15570h(value3, Boolean.FALSE));
        return xfa.f68157a;
    }
}
