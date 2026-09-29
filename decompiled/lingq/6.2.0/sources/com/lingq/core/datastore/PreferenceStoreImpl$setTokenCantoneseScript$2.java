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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTokenCantoneseScript$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTokenCantoneseScript$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTokenCantoneseScript$2(C1368a c1368a, String str, Continuation continuation) {
        super(2, continuation);
        this.f17684b = c1368a;
        this.f17685c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTokenCantoneseScript$2 preferenceStoreImpl$setTokenCantoneseScript$2 = new PreferenceStoreImpl$setTokenCantoneseScript$2(this.f17684b, this.f17685c, continuation);
        preferenceStoreImpl$setTokenCantoneseScript$2.f17683a = obj;
        return preferenceStoreImpl$setTokenCantoneseScript$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTokenCantoneseScript$2 preferenceStoreImpl$setTokenCantoneseScript$2 = (PreferenceStoreImpl$setTokenCantoneseScript$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTokenCantoneseScript$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17683a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17684b.f18384X, this.f17685c);
        return xfa.f68157a;
    }
}
