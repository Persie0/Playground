package com.amplitude.core.diagnostics;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.ju0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.diagnostics.DiagnosticsClientImpl$actorJob$1$result$1", m4291f = "DiagnosticsClientImpl.kt", m4292l = {168}, m4293m = "invokeSuspend")
final class DiagnosticsClientImpl$actorJob$1$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0905a f11037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsClientImpl$actorJob$1$result$1(C0905a c0905a, Continuation continuation) {
        super(2, continuation);
        this.f11037b = c0905a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticsClientImpl$actorJob$1$result$1(this.f11037b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticsClientImpl$actorJob$1$result$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15449J;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11036a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3211a c3211a = this.f11037b.f11068r;
            this.f11036a = 1;
            c3211a.getClass();
            objM15449J = C3211a.m15449J(c3211a, this);
            if (objM15449J == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM15449J = ((ju0) obj).f46151a;
        }
        return new ju0(objM15449J);
    }
}
