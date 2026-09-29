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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setDisableDownloadsPlaylist$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setDisableDownloadsPlaylist$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f17568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setDisableDownloadsPlaylist$2(C1368a c1368a, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f17567b = c1368a;
        this.f17568c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setDisableDownloadsPlaylist$2 preferenceStoreImpl$setDisableDownloadsPlaylist$2 = new PreferenceStoreImpl$setDisableDownloadsPlaylist$2(this.f17567b, this.f17568c, continuation);
        preferenceStoreImpl$setDisableDownloadsPlaylist$2.f17566a = obj;
        return preferenceStoreImpl$setDisableDownloadsPlaylist$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setDisableDownloadsPlaylist$2 preferenceStoreImpl$setDisableDownloadsPlaylist$2 = (PreferenceStoreImpl$setDisableDownloadsPlaylist$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setDisableDownloadsPlaylist$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17566a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17567b.f18346I, Boolean.valueOf(this.f17568c));
        return xfa.f68157a;
    }
}
