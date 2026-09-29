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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setCwtMeanings$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setCwtMeanings$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setCwtMeanings$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17561b = c1368a;
        this.f17562c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setCwtMeanings$2 preferenceStoreImpl$setCwtMeanings$2 = new PreferenceStoreImpl$setCwtMeanings$2(this.f17561b, this.f17562c, continuation);
        preferenceStoreImpl$setCwtMeanings$2.f17560a = obj;
        return preferenceStoreImpl$setCwtMeanings$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setCwtMeanings$2 preferenceStoreImpl$setCwtMeanings$2 = (PreferenceStoreImpl$setCwtMeanings$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setCwtMeanings$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17560a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17561b.f18409g0, Boolean.valueOf(this.f17562c));
        return xfa.f68157a;
    }
}
