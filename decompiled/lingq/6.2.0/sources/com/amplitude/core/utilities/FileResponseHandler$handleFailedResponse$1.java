package com.amplitude.core.utilities;

import com.amplitude.android.storage.C0898b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$handleFailedResponse$1", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$handleFailedResponse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$handleFailedResponse$1(C0915c c0915c, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f11227a = c0915c;
        this.f11228b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$handleFailedResponse$1(this.f11227a, this.f11228b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$handleFailedResponse$1 fileResponseHandler$handleFailedResponse$1 = (FileResponseHandler$handleFailedResponse$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$handleFailedResponse$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0898b c0898b = this.f11227a.f11264a;
        Object obj2 = this.f11228b;
        obj2.getClass();
        c0898b.m5098c((String) obj2);
        return xfa.f68157a;
    }
}
