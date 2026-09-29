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
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$handlePayloadTooLargeResponse$1", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$handlePayloadTooLargeResponse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$handlePayloadTooLargeResponse$1(C0915c c0915c, String str, Continuation continuation) {
        super(2, continuation);
        this.f11229a = c0915c;
        this.f11230b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$handlePayloadTooLargeResponse$1(this.f11229a, this.f11230b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$handlePayloadTooLargeResponse$1 fileResponseHandler$handlePayloadTooLargeResponse$1 = (FileResponseHandler$handlePayloadTooLargeResponse$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$handlePayloadTooLargeResponse$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f11229a.f11264a.m5100e(this.f11230b);
        return xfa.f68157a;
    }
}
