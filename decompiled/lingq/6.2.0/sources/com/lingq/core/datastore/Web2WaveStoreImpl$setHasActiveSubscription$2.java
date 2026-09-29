package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.Web2WaveStoreImpl$setHasActiveSubscription$2", m4291f = "Web2WaveStoreImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class Web2WaveStoreImpl$setHasActiveSubscription$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1372e f18304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveStoreImpl$setHasActiveSubscription$2(C1372e c1372e, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18304b = c1372e;
        this.f18305c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Web2WaveStoreImpl$setHasActiveSubscription$2 web2WaveStoreImpl$setHasActiveSubscription$2 = new Web2WaveStoreImpl$setHasActiveSubscription$2(this.f18304b, this.f18305c, continuation);
        web2WaveStoreImpl$setHasActiveSubscription$2.f18303a = obj;
        return web2WaveStoreImpl$setHasActiveSubscription$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Web2WaveStoreImpl$setHasActiveSubscription$2 web2WaveStoreImpl$setHasActiveSubscription$2 = (Web2WaveStoreImpl$setHasActiveSubscription$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        web2WaveStoreImpl$setHasActiveSubscription$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18303a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18304b.f18593d, Boolean.valueOf(this.f18305c));
        return xfa.f68157a;
    }
}
