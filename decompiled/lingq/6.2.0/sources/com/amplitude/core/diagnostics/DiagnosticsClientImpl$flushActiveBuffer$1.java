package com.amplitude.core.diagnostics;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.od2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsClientImpl$flushActiveBuffer$1", m4291f = "DiagnosticsClientImpl.kt", m4292l = {449}, m4293m = "invokeSuspend")
final class DiagnosticsClientImpl$flushActiveBuffer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0905a f11039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ od2 f11040c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ double f11041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsClientImpl$flushActiveBuffer$1(C0905a c0905a, od2 od2Var, double d, Continuation continuation) {
        super(2, continuation);
        this.f11039b = c0905a;
        this.f11040c = od2Var;
        this.f11041d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticsClientImpl$flushActiveBuffer$1(this.f11039b, this.f11040c, this.f11041d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticsClientImpl$flushActiveBuffer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11038a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f11038a = 1;
            C0905a.m5121d(this.f11039b, this.f11040c, this.f11041d);
            return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
