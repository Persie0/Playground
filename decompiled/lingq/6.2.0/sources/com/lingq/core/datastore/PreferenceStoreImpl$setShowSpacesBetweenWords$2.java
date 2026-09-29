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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setShowSpacesBetweenWords$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setShowSpacesBetweenWords$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setShowSpacesBetweenWords$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17654b = c1368a;
        this.f17655c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setShowSpacesBetweenWords$2 preferenceStoreImpl$setShowSpacesBetweenWords$2 = new PreferenceStoreImpl$setShowSpacesBetweenWords$2(this.f17654b, this.f17655c, continuation);
        preferenceStoreImpl$setShowSpacesBetweenWords$2.f17653a = obj;
        return preferenceStoreImpl$setShowSpacesBetweenWords$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setShowSpacesBetweenWords$2 preferenceStoreImpl$setShowSpacesBetweenWords$2 = (PreferenceStoreImpl$setShowSpacesBetweenWords$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setShowSpacesBetweenWords$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17653a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17654b.f18343H, Boolean.valueOf(this.f17655c));
        return xfa.f68157a;
    }
}
