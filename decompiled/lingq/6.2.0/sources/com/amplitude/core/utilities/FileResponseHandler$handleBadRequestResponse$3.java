package com.amplitude.core.utilities;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$3", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$handleBadRequestResponse$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11221a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$handleBadRequestResponse$3(C0915c c0915c, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f11221a = c0915c;
        this.f11222b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$handleBadRequestResponse$3(this.f11221a, this.f11222b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$handleBadRequestResponse$3 fileResponseHandler$handleBadRequestResponse$3 = (FileResponseHandler$handleBadRequestResponse$3) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$handleBadRequestResponse$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f11221a.f11264a.m5098c((String) this.f11222b);
        return xfa.f68157a;
    }
}
