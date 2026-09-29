package com.lingq.core.common;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.q02;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetchAndResults$1", m4291f = "FlowExtensions.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetchAndResults$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ q02 f14372a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ vi3 f14373b;

    public FlowExtensionsKt$withDataFetchAndResults$1() {
        super(3, null);
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowExtensionsKt$withDataFetchAndResults$1 flowExtensionsKt$withDataFetchAndResults$1 = new FlowExtensionsKt$withDataFetchAndResults$1(3, (Continuation) obj3);
        flowExtensionsKt$withDataFetchAndResults$1.f14372a = (q02) obj;
        flowExtensionsKt$withDataFetchAndResults$1.f14373b = (vi3) obj2;
        return flowExtensionsKt$withDataFetchAndResults$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        q02 q02Var = this.f14372a;
        vi3 vi3Var = this.f14373b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return vi3Var.invoke(q02Var);
    }
}
