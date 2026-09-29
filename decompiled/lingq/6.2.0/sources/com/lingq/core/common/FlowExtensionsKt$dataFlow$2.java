package com.lingq.core.common;

import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$dataFlow$2", m4291f = "FlowExtensions.kt", m4292l = {101}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$dataFlow$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f14345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f14346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f14347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$dataFlow$2(vi3 vi3Var, vi3 vi3Var2, Continuation continuation) {
        super(1, continuation);
        this.f14346b = vi3Var;
        this.f14347c = vi3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowExtensionsKt$dataFlow$2(this.f14346b, this.f14347c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FlowExtensionsKt$dataFlow$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14345a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vi3 vi3Var = this.f14347c;
                this.f14345a = 1;
                if (vi3Var.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            failure = xfaVar;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable thM15355a = Result.m15355a(failure);
        if (thM15355a != null) {
            this.f14346b.invoke(thM15355a);
        }
        return xfaVar;
    }
}
