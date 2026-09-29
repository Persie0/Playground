package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.server.ServerEnvironment;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setServerEnvironment$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setServerEnvironment$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServerEnvironment f17649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setServerEnvironment$2(C1368a c1368a, ServerEnvironment serverEnvironment, Continuation continuation) {
        super(2, continuation);
        this.f17648b = c1368a;
        this.f17649c = serverEnvironment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setServerEnvironment$2 preferenceStoreImpl$setServerEnvironment$2 = new PreferenceStoreImpl$setServerEnvironment$2(this.f17648b, this.f17649c, continuation);
        preferenceStoreImpl$setServerEnvironment$2.f17647a = obj;
        return preferenceStoreImpl$setServerEnvironment$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setServerEnvironment$2 preferenceStoreImpl$setServerEnvironment$2 = (PreferenceStoreImpl$setServerEnvironment$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setServerEnvironment$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17647a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17648b.f18451u0, this.f17649c.getBaseUrl());
        return xfa.f68157a;
    }
}
