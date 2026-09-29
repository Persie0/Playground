package com.airbnb.lottie.compose;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.gl5;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", m4291f = "LottieAnimatable.kt", m4292l = {}, m4293m = "invokeSuspend")
final class LottieAnimatableImpl$snapTo$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0872b f10668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gl5 f10669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f10670c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f10671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(C0872b c0872b, gl5 gl5Var, float f, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f10668a = c0872b;
        this.f10669b = gl5Var;
        this.f10670c = f;
        this.f10671d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$snapTo$2(this.f10668a, this.f10669b, this.f10670c, this.f10671d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        LottieAnimatableImpl$snapTo$2 lottieAnimatableImpl$snapTo$2 = (LottieAnimatableImpl$snapTo$2) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        lottieAnimatableImpl$snapTo$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0872b c0872b = this.f10668a;
        ((xc9) c0872b.f10724i).setValue(this.f10669b);
        c0872b.m5031h(this.f10670c);
        c0872b.m5030g(1);
        C0872b.m5027d(c0872b, false);
        if (this.f10671d) {
            ((xc9) c0872b.f10727l).setValue(Long.MIN_VALUE);
        }
        return xfa.f68157a;
    }
}
