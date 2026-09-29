package com.lingq.feature.onboarding.p014v2;

import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gm5;
import p000.st6;
import p000.tt6;
import p000.ui3;
import p000.un1;
import p000.ut6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ScreenKt$ShowErrorSnackbar$1$1", m4291f = "OnboardingV2Screen.kt", m4292l = {571}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ScreenKt$ShowErrorSnackbar$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ui3 f27306a;

    /* JADX INFO: renamed from: b */
    public int f27307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ut6 f27308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0232g0 f27309d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f27310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ScreenKt$ShowErrorSnackbar$1$1(ut6 ut6Var, C0232g0 c0232g0, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f27308c = ut6Var;
        this.f27309d = c0232g0;
        this.f27310e = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ScreenKt$ShowErrorSnackbar$1$1(this.f27308c, this.f27309d, this.f27310e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ScreenKt$ShowErrorSnackbar$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM22306a;
        ui3 ui3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27307b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ut6 ut6Var = this.f27308c;
            if (ut6Var != null) {
                if (ut6Var instanceof tt6) {
                    strM22306a = ((tt6) ut6Var).m22306a();
                } else {
                    if (!(ut6Var instanceof st6)) {
                        gm5.m12750e();
                        return null;
                    }
                    strM22306a = "Couldn't load your profile. Please try logging in instead.";
                }
                String str = strM22306a;
                SnackbarDuration snackbarDuration = SnackbarDuration.Long;
                ui3 ui3Var2 = this.f27310e;
                this.f27306a = ui3Var2;
                this.f27307b = 1;
                if (C0232g0.m1155b(this.f27309d, str, null, snackbarDuration, this, 6) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ui3Var = ui3Var2;
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ui3Var = this.f27306a;
        AbstractC3193b.m15359b(obj);
        ui3Var.mo0a();
        return xfa.f68157a;
    }
}
