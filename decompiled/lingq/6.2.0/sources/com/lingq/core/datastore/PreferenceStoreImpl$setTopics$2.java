package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTopics$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTopics$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17699b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f17700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTopics$2(C1368a c1368a, Set set, Continuation continuation) {
        super(2, continuation);
        this.f17699b = c1368a;
        this.f17700c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTopics$2 preferenceStoreImpl$setTopics$2 = new PreferenceStoreImpl$setTopics$2(this.f17699b, this.f17700c, continuation);
        preferenceStoreImpl$setTopics$2.f17698a = obj;
        return preferenceStoreImpl$setTopics$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTopics$2 preferenceStoreImpl$setTopics$2 = (PreferenceStoreImpl$setTopics$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTopics$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17698a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17699b.f18358M, this.f17700c);
        return xfa.f68157a;
    }
}
