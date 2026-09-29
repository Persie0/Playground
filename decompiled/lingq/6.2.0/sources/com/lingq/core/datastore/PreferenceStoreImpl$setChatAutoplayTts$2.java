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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setChatAutoplayTts$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setChatAutoplayTts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setChatAutoplayTts$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17536b = c1368a;
        this.f17537c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setChatAutoplayTts$2 preferenceStoreImpl$setChatAutoplayTts$2 = new PreferenceStoreImpl$setChatAutoplayTts$2(this.f17536b, this.f17537c, continuation);
        preferenceStoreImpl$setChatAutoplayTts$2.f17535a = obj;
        return preferenceStoreImpl$setChatAutoplayTts$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setChatAutoplayTts$2 preferenceStoreImpl$setChatAutoplayTts$2 = (PreferenceStoreImpl$setChatAutoplayTts$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setChatAutoplayTts$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17535a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17536b.f18418j0, Boolean.valueOf(this.f17537c));
        return xfa.f68157a;
    }
}
