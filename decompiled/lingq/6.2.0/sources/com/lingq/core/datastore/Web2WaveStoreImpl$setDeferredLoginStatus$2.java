package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.Web2WaveStoreImpl$setDeferredLoginStatus$2", m4291f = "Web2WaveStoreImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class Web2WaveStoreImpl$setDeferredLoginStatus$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1372e f18301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Web2WaveDeferredLoginStatus f18302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveStoreImpl$setDeferredLoginStatus$2(C1372e c1372e, Web2WaveDeferredLoginStatus web2WaveDeferredLoginStatus, Continuation continuation) {
        super(2, continuation);
        this.f18301b = c1372e;
        this.f18302c = web2WaveDeferredLoginStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Web2WaveStoreImpl$setDeferredLoginStatus$2 web2WaveStoreImpl$setDeferredLoginStatus$2 = new Web2WaveStoreImpl$setDeferredLoginStatus$2(this.f18301b, this.f18302c, continuation);
        web2WaveStoreImpl$setDeferredLoginStatus$2.f18300a = obj;
        return web2WaveStoreImpl$setDeferredLoginStatus$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Web2WaveStoreImpl$setDeferredLoginStatus$2 web2WaveStoreImpl$setDeferredLoginStatus$2 = (Web2WaveStoreImpl$setDeferredLoginStatus$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        web2WaveStoreImpl$setDeferredLoginStatus$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18300a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18301b.f18594e, this.f18302c.name());
        return xfa.f68157a;
    }
}
