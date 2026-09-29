package com.lingq.core.common.util;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bm6;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.common.util.CoroutineJobManagerKt$cancellableLaunchIn$1", m4291f = "CoroutineJobManager.kt", m4292l = {109}, m4293m = "invokeSuspend", m4294v = 2)
final class CoroutineJobManagerKt$cancellableLaunchIn$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f14396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineJobManagerKt$cancellableLaunchIn$1(c83 c83Var, Continuation continuation) {
        super(2, continuation);
        this.f14396b = c83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineJobManagerKt$cancellableLaunchIn$1(this.f14396b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineJobManagerKt$cancellableLaunchIn$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14395a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f14395a = 1;
            Object objCollect = this.f14396b.collect(bm6.f8690a, this);
            if (objCollect != coroutineSingletons) {
                objCollect = xfaVar;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
