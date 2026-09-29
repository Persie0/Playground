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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTapToPage$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTapToPage$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTapToPage$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17672b = c1368a;
        this.f17673c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTapToPage$2 preferenceStoreImpl$setTapToPage$2 = new PreferenceStoreImpl$setTapToPage$2(this.f17672b, this.f17673c, continuation);
        preferenceStoreImpl$setTapToPage$2.f17671a = obj;
        return preferenceStoreImpl$setTapToPage$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTapToPage$2 preferenceStoreImpl$setTapToPage$2 = (PreferenceStoreImpl$setTapToPage$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTapToPage$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17671a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17672b.f18352K, Boolean.valueOf(this.f17673c));
        return xfa.f68157a;
    }
}
