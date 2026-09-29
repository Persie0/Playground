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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setPlaybackSpeed$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setPlaybackSpeed$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f17616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setPlaybackSpeed$2(C1368a c1368a, float f, Continuation continuation) {
        super(2, continuation);
        this.f17615b = c1368a;
        this.f17616c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setPlaybackSpeed$2 preferenceStoreImpl$setPlaybackSpeed$2 = new PreferenceStoreImpl$setPlaybackSpeed$2(this.f17615b, this.f17616c, continuation);
        preferenceStoreImpl$setPlaybackSpeed$2.f17614a = obj;
        return preferenceStoreImpl$setPlaybackSpeed$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setPlaybackSpeed$2 preferenceStoreImpl$setPlaybackSpeed$2 = (PreferenceStoreImpl$setPlaybackSpeed$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setPlaybackSpeed$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17614a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17615b.f18367P, new Float(this.f17616c));
        return xfa.f68157a;
    }
}
