package com.airbnb.lottie.compose;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gl5;
import p000.ho2;
import p000.t66;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", m4291f = "animateLottieCompositionAsState.kt", m4292l = {73, 78}, m4293m = "invokeSuspend")
final class C0869x2383193e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0872b f10644b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gl5 f10645c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f10646d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LottieCancellationBehavior f10647e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f10648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0869x2383193e(C0872b c0872b, gl5 gl5Var, float f, LottieCancellationBehavior lottieCancellationBehavior, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f10644b = c0872b;
        this.f10645c = gl5Var;
        this.f10646d = f;
        this.f10647e = lottieCancellationBehavior;
        this.f10648f = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0869x2383193e(this.f10644b, this.f10645c, this.f10646d, this.f10647e, this.f10648f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0869x2383193e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10643a;
        C0872b c0872b = this.f10644b;
        t66 t66Var = this.f10648f;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!((Boolean) t66Var.getValue()).booleanValue()) {
                this.f10643a = 1;
                gl5 gl5Var = (gl5) ((xc9) c0872b.f10724i).getValue();
                if (((xc9) c0872b.f10720e).getValue() != null) {
                    ho2.m13383c();
                    return null;
                }
                float fFloatValue = ((Number) ((xc9) c0872b.f10721f).getValue()).floatValue();
                float f = 0.0f;
                if ((fFloatValue < 0.0f && gl5Var == null) || (gl5Var != null && fFloatValue < 0.0f)) {
                    f = 1.0f;
                }
                float f2 = f;
                Object objM1026b = c0872b.f10715I.m1026b(MutatePriority.Default, new LottieAnimatableImpl$snapTo$2(c0872b, (gl5) ((xc9) c0872b.f10724i).getValue(), f2, !(f2 == ((Number) ((xc9) c0872b.f10726k).getValue()).floatValue()), null), this);
                if (objM1026b != coroutineSingletons) {
                    objM1026b = xfaVar;
                }
                if (objM1026b != coroutineSingletons) {
                    objM1026b = xfaVar;
                }
                if (objM1026b != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        t66Var.setValue(Boolean.TRUE);
        float fFloatValue2 = ((Number) ((xc9) c0872b.f10726k).getValue()).floatValue();
        this.f10643a = 2;
        Object objM1026b2 = c0872b.f10715I.m1026b(MutatePriority.Default, new LottieAnimatableImpl$animate$2(c0872b, c0872b.m5029f(), this.f10646d, this.f10645c, fFloatValue2, this.f10647e, null), this);
        if (objM1026b2 != coroutineSingletons) {
            objM1026b2 = xfaVar;
        }
        return objM1026b2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
