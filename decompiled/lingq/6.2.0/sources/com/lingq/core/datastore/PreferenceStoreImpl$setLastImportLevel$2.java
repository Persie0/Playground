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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setLastImportLevel$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setLastImportLevel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLastImportLevel$2(C1368a c1368a, String str, Continuation continuation) {
        super(2, continuation);
        this.f17597b = c1368a;
        this.f17598c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setLastImportLevel$2 preferenceStoreImpl$setLastImportLevel$2 = new PreferenceStoreImpl$setLastImportLevel$2(this.f17597b, this.f17598c, continuation);
        preferenceStoreImpl$setLastImportLevel$2.f17596a = obj;
        return preferenceStoreImpl$setLastImportLevel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setLastImportLevel$2 preferenceStoreImpl$setLastImportLevel$2 = (PreferenceStoreImpl$setLastImportLevel$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setLastImportLevel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17596a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17597b.f18442r0, this.f17598c);
        return xfa.f68157a;
    }
}
