package com.lingq.feature.onboarding.auth.registration;

import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.h48;
import p000.i48;
import p000.k48;
import p000.km7;
import p000.pk9;
import p000.t66;
import p000.um5;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationViewModel$validateFields$1", m4291f = "OnboardingRegistrationViewModel.kt", m4292l = {190, 191}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingRegistrationViewModel$validateFields$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2196e f27147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27148c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f27149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingRegistrationViewModel$validateFields$1(C2196e c2196e, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f27147b = c2196e;
        this.f27148c = str;
        this.f27149d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingRegistrationViewModel$validateFields$1(this.f27147b, this.f27148c, this.f27149d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingRegistrationViewModel$validateFields$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r9 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2196e c2196e = this.f27147b;
        t66 t66Var = c2196e.f27159g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27146a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f27146a = 1;
            if (AbstractC3208a.m15437d(500L, this) != coroutineSingletons) {
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
        ym5Var.getClass();
        boolean z = ym5Var instanceof xm5;
        xfa xfaVar = xfa.f68157a;
        if (z) {
            ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), false, null, new xm5(xfaVar), 3));
            return xfaVar;
        }
        k48 k48Var = (k48) pk9.m19373k(ym5Var);
        if (k48Var instanceof i48) {
            ((xc9) t66Var).setValue(h48.m13043a(c2196e.m9124V2(), false, null, new um5(k48Var), 3));
        }
        return xfaVar;
        km7 km7Var = c2196e.f27155c;
        this.f27146a = 2;
        obj = ((C1267a) km7Var).m7089r(this.f27148c, this.f27149d, this);
    }
}
