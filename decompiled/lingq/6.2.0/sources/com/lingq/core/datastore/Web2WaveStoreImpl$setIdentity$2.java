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
@c32(m4290c = "com.lingq.core.datastore.Web2WaveStoreImpl$setIdentity$2", m4291f = "Web2WaveStoreImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class Web2WaveStoreImpl$setIdentity$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1372e f18307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveStoreImpl$setIdentity$2(C1372e c1372e, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f18307b = c1372e;
        this.f18308c = str;
        this.f18309d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Web2WaveStoreImpl$setIdentity$2 web2WaveStoreImpl$setIdentity$2 = new Web2WaveStoreImpl$setIdentity$2(this.f18307b, this.f18308c, this.f18309d, continuation);
        web2WaveStoreImpl$setIdentity$2.f18306a = obj;
        return web2WaveStoreImpl$setIdentity$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Web2WaveStoreImpl$setIdentity$2 web2WaveStoreImpl$setIdentity$2 = (Web2WaveStoreImpl$setIdentity$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        web2WaveStoreImpl$setIdentity$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18306a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1372e c1372e = this.f18307b;
        mutablePreferences.set(c1372e.f18591b, this.f18308c);
        mutablePreferences.set(c1372e.f18592c, this.f18309d);
        return xfa.f68157a;
    }
}
