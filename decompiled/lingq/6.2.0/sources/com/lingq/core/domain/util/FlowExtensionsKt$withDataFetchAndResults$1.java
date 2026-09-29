package com.lingq.core.domain.util;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.p02;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$1", m4291f = "FlowExtensions.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetchAndResults$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ p02 f20136a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ vi3 f20137b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowExtensionsKt$withDataFetchAndResults$1 flowExtensionsKt$withDataFetchAndResults$1 = new FlowExtensionsKt$withDataFetchAndResults$1(3, (Continuation) obj3);
        flowExtensionsKt$withDataFetchAndResults$1.f20136a = (p02) obj;
        flowExtensionsKt$withDataFetchAndResults$1.f20137b = (vi3) obj2;
        return flowExtensionsKt$withDataFetchAndResults$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        p02 p02Var = this.f20136a;
        vi3 vi3Var = this.f20137b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return vi3Var.invoke(p02Var);
    }
}
