package com.amplitude.core.platform.intercept;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler$removeFile$1", m4291f = "IdentifyInterceptFileStorageHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class IdentifyInterceptFileStorageHandler$removeFile$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0908a f11119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptFileStorageHandler$removeFile$1(C0908a c0908a, String str, Continuation continuation) {
        super(2, continuation);
        this.f11119a = c0908a;
        this.f11120b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdentifyInterceptFileStorageHandler$removeFile$1(this.f11119a, this.f11120b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        IdentifyInterceptFileStorageHandler$removeFile$1 identifyInterceptFileStorageHandler$removeFile$1 = (IdentifyInterceptFileStorageHandler$removeFile$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        identifyInterceptFileStorageHandler$removeFile$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f11119a.f11136a.f10992d.m5160h(this.f11120b);
        return xfa.f68157a;
    }
}
