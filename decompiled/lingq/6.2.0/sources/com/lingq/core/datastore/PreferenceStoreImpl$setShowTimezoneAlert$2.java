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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setShowTimezoneAlert$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setShowTimezoneAlert$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setShowTimezoneAlert$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17660b = c1368a;
        this.f17661c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setShowTimezoneAlert$2 preferenceStoreImpl$setShowTimezoneAlert$2 = new PreferenceStoreImpl$setShowTimezoneAlert$2(this.f17660b, this.f17661c, continuation);
        preferenceStoreImpl$setShowTimezoneAlert$2.f17659a = obj;
        return preferenceStoreImpl$setShowTimezoneAlert$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setShowTimezoneAlert$2 preferenceStoreImpl$setShowTimezoneAlert$2 = (PreferenceStoreImpl$setShowTimezoneAlert$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setShowTimezoneAlert$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17659a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17660b.f18394b0, Boolean.valueOf(this.f17661c));
        return xfa.f68157a;
    }
}
