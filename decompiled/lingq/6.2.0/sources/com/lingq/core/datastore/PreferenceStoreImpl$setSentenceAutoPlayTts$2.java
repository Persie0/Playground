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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setSentenceAutoPlayTts$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setSentenceAutoPlayTts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setSentenceAutoPlayTts$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17639b = c1368a;
        this.f17640c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setSentenceAutoPlayTts$2 preferenceStoreImpl$setSentenceAutoPlayTts$2 = new PreferenceStoreImpl$setSentenceAutoPlayTts$2(this.f17639b, this.f17640c, continuation);
        preferenceStoreImpl$setSentenceAutoPlayTts$2.f17638a = obj;
        return preferenceStoreImpl$setSentenceAutoPlayTts$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setSentenceAutoPlayTts$2 preferenceStoreImpl$setSentenceAutoPlayTts$2 = (PreferenceStoreImpl$setSentenceAutoPlayTts$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setSentenceAutoPlayTts$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17638a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17639b.f18454v0, Boolean.valueOf(this.f17640c));
        return xfa.f68157a;
    }
}
