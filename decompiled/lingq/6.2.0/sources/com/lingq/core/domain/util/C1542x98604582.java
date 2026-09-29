package com.lingq.core.domain.util;

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

/* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1$result$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1$1$result$1", m4291f = "FlowExtensions.kt", m4292l = {163}, m4293m = "invokeSuspend", m4294v = 2)
final class C1542x98604582 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f20146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542x98604582(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f20146b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1542x98604582(this.f20146b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1542x98604582) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20145a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f20145a = 1;
            Object objInvoke = this.f20146b.invoke(this);
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
