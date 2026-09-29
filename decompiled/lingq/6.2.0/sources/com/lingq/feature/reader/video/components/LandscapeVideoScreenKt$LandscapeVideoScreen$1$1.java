package com.lingq.feature.reader.video.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cd4;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.components.LandscapeVideoScreenKt$LandscapeVideoScreen$1$1", m4291f = "LandscapeVideoScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LandscapeVideoScreenKt$LandscapeVideoScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f31415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f31416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f31417c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f31418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeVideoScreenKt$LandscapeVideoScreen$1$1(t66 t66Var, un1 un1Var, t66 t66Var2, t66 t66Var3, Continuation continuation) {
        super(2, continuation);
        this.f31415a = t66Var;
        this.f31416b = un1Var;
        this.f31417c = t66Var2;
        this.f31418d = t66Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LandscapeVideoScreenKt$LandscapeVideoScreen$1$1(this.f31415a, this.f31416b, this.f31417c, this.f31418d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LandscapeVideoScreenKt$LandscapeVideoScreen$1$1 landscapeVideoScreenKt$LandscapeVideoScreen$1$1 = (LandscapeVideoScreenKt$LandscapeVideoScreen$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        landscapeVideoScreenKt$LandscapeVideoScreen$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f31415a;
        boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
        t66 t66Var2 = this.f31418d;
        t66 t66Var3 = this.f31417c;
        if (zBooleanValue) {
            AbstractC2587a.m9514b(this.f31416b, t66Var3, t66Var, t66Var2);
        } else {
            cd4 cd4Var = (cd4) t66Var3.getValue();
            if (cd4Var != null) {
                cd4Var.mo4537a(null);
            }
            t66Var2.setValue(Boolean.TRUE);
        }
        return xfa.f68157a;
    }
}
