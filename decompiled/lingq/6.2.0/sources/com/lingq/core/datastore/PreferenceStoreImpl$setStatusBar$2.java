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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setStatusBar$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setStatusBar$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17666b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setStatusBar$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17666b = c1368a;
        this.f17667c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setStatusBar$2 preferenceStoreImpl$setStatusBar$2 = new PreferenceStoreImpl$setStatusBar$2(this.f17666b, this.f17667c, continuation);
        preferenceStoreImpl$setStatusBar$2.f17665a = obj;
        return preferenceStoreImpl$setStatusBar$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setStatusBar$2 preferenceStoreImpl$setStatusBar$2 = (PreferenceStoreImpl$setStatusBar$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setStatusBar$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17665a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17666b.f18462y, Boolean.valueOf(this.f17667c));
        return xfa.f68157a;
    }
}
