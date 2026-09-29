package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m4291f = "RemoteSettings.kt", m4292l = {}, m4293m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13876a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, continuation);
        remoteSettings$updateSettings$2$2.f13876a = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = (RemoteSettings$updateSettings$2$2) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        remoteSettings$updateSettings$2$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f13876a));
        return xfa.f68157a;
    }
}
