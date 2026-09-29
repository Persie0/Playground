package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTtsVoicesMigratedToApi$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTtsVoicesMigratedToApi$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17717b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTtsVoicesMigratedToApi$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17717b = c1368a;
        this.f17718c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTtsVoicesMigratedToApi$2 preferenceStoreImpl$setTtsVoicesMigratedToApi$2 = new PreferenceStoreImpl$setTtsVoicesMigratedToApi$2(this.f17717b, this.f17718c, continuation);
        preferenceStoreImpl$setTtsVoicesMigratedToApi$2.f17716a = obj;
        return preferenceStoreImpl$setTtsVoicesMigratedToApi$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTtsVoicesMigratedToApi$2 preferenceStoreImpl$setTtsVoicesMigratedToApi$2 = (PreferenceStoreImpl$setTtsVoicesMigratedToApi$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTtsVoicesMigratedToApi$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17716a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17717b.f18450u, Boolean.valueOf(this.f17718c));
        return xfa.f68157a;
    }
}
