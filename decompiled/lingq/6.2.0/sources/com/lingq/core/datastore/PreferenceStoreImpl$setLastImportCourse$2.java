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
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setLastImportCourse$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setLastImportCourse$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17591b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLastImportCourse$2(C1368a c1368a, String str, Continuation continuation) {
        super(2, continuation);
        this.f17591b = c1368a;
        this.f17592c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setLastImportCourse$2 preferenceStoreImpl$setLastImportCourse$2 = new PreferenceStoreImpl$setLastImportCourse$2(this.f17591b, this.f17592c, continuation);
        preferenceStoreImpl$setLastImportCourse$2.f17590a = obj;
        return preferenceStoreImpl$setLastImportCourse$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setLastImportCourse$2 preferenceStoreImpl$setLastImportCourse$2 = (PreferenceStoreImpl$setLastImportCourse$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setLastImportCourse$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17590a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f17591b.f18439q0, this.f17592c);
        return xfa.f68157a;
    }
}
