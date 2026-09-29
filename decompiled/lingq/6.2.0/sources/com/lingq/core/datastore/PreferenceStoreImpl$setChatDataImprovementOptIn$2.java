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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setChatDataImprovementOptIn$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setChatDataImprovementOptIn$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setChatDataImprovementOptIn$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17539b = c1368a;
        this.f17540c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setChatDataImprovementOptIn$2 preferenceStoreImpl$setChatDataImprovementOptIn$2 = new PreferenceStoreImpl$setChatDataImprovementOptIn$2(this.f17539b, this.f17540c, continuation);
        preferenceStoreImpl$setChatDataImprovementOptIn$2.f17538a = obj;
        return preferenceStoreImpl$setChatDataImprovementOptIn$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setChatDataImprovementOptIn$2 preferenceStoreImpl$setChatDataImprovementOptIn$2 = (PreferenceStoreImpl$setChatDataImprovementOptIn$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setChatDataImprovementOptIn$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17538a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17539b.f18424l0, Boolean.valueOf(this.f17540c));
        return xfa.f68157a;
    }
}
