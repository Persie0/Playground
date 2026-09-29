package com.amplitude.core.remoteconfig;

import com.amplitude.core.Storage$Constants;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.remoteconfig.RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1", m4291f = "RemoteConfigClient.kt", m4292l = {}, m4293m = "invokeSuspend")
final class RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0912a f11167a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1(C0912a c0912a, Continuation continuation) {
        super(2, continuation);
        this.f11167a = c0912a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1(this.f11167a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteConfigClientImpl$shouldRateLimit$lastTsStr$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return this.f11167a.f11183f.m5096a(Storage$Constants.REMOTE_CONFIG_TIMESTAMP);
    }
}
