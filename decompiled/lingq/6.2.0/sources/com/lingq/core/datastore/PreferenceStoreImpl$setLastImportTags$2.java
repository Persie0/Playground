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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setLastImportTags$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setLastImportTags$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f17601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLastImportTags$2(C1368a c1368a, Set set, Continuation continuation) {
        super(2, continuation);
        this.f17600b = c1368a;
        this.f17601c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setLastImportTags$2 preferenceStoreImpl$setLastImportTags$2 = new PreferenceStoreImpl$setLastImportTags$2(this.f17600b, this.f17601c, continuation);
        preferenceStoreImpl$setLastImportTags$2.f17599a = obj;
        return preferenceStoreImpl$setLastImportTags$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setLastImportTags$2 preferenceStoreImpl$setLastImportTags$2 = (PreferenceStoreImpl$setLastImportTags$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setLastImportTags$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17599a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17600b.f18445s0, this.f17601c);
        return xfa.f68157a;
    }
}
