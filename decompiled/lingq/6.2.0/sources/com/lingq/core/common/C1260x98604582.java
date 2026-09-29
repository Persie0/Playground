package com.lingq.core.common;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.common.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1$result$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1$result$1", m4291f = "FlowExtensions.kt", m4292l = {214}, m4293m = "invokeSuspend", m4294v = 2)
final class C1260x98604582 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f14382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260x98604582(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f14382b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1260x98604582(this.f14382b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1260x98604582) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14381a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f14381a = 1;
            Object objInvoke = this.f14382b.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
