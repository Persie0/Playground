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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setDownloadOnMobile$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setDownloadOnMobile$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setDownloadOnMobile$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17573b = c1368a;
        this.f17574c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setDownloadOnMobile$2 preferenceStoreImpl$setDownloadOnMobile$2 = new PreferenceStoreImpl$setDownloadOnMobile$2(this.f17573b, this.f17574c, continuation);
        preferenceStoreImpl$setDownloadOnMobile$2.f17572a = obj;
        return preferenceStoreImpl$setDownloadOnMobile$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setDownloadOnMobile$2 preferenceStoreImpl$setDownloadOnMobile$2 = (PreferenceStoreImpl$setDownloadOnMobile$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setDownloadOnMobile$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17572a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17573b.f18432o, Boolean.valueOf(this.f17574c));
        return xfa.f68157a;
    }
}
