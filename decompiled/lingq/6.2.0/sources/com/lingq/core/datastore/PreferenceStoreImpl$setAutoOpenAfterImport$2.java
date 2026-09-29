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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setAutoOpenAfterImport$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setAutoOpenAfterImport$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setAutoOpenAfterImport$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17521b = c1368a;
        this.f17522c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setAutoOpenAfterImport$2 preferenceStoreImpl$setAutoOpenAfterImport$2 = new PreferenceStoreImpl$setAutoOpenAfterImport$2(this.f17521b, this.f17522c, continuation);
        preferenceStoreImpl$setAutoOpenAfterImport$2.f17520a = obj;
        return preferenceStoreImpl$setAutoOpenAfterImport$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setAutoOpenAfterImport$2 preferenceStoreImpl$setAutoOpenAfterImport$2 = (PreferenceStoreImpl$setAutoOpenAfterImport$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setAutoOpenAfterImport$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17520a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17521b.f18448t0, Boolean.valueOf(this.f17522c));
        return xfa.f68157a;
    }
}
