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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTokenLatinScript$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTokenLatinScript$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17693b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTokenLatinScript$2(C1368a c1368a, String str, Continuation continuation) {
        super(2, continuation);
        this.f17693b = c1368a;
        this.f17694c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTokenLatinScript$2 preferenceStoreImpl$setTokenLatinScript$2 = new PreferenceStoreImpl$setTokenLatinScript$2(this.f17693b, this.f17694c, continuation);
        preferenceStoreImpl$setTokenLatinScript$2.f17692a = obj;
        return preferenceStoreImpl$setTokenLatinScript$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTokenLatinScript$2 preferenceStoreImpl$setTokenLatinScript$2 = (PreferenceStoreImpl$setTokenLatinScript$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTokenLatinScript$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17692a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17693b.f18386Y, this.f17694c);
        return xfa.f68157a;
    }
}
