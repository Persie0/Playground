package com.lingq.core.domain.util;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2", m4291f = "FlowExtensions.kt", m4292l = {167}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20147a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20148b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2 flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2 = new FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2(2, continuation);
        flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2.f20148b = obj;
        return flowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f20148b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20147a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f20148b = null;
            this.f20147a = 1;
            if (e83Var.emit(-1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
