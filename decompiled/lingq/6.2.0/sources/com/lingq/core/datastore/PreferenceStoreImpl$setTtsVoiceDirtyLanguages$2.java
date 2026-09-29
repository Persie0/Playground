package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f17708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1368a f17709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2(C1368a c1368a, Set set, Continuation continuation) {
        super(2, continuation);
        this.f17708b = set;
        this.f17709c = c1368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2 preferenceStoreImpl$setTtsVoiceDirtyLanguages$2 = new PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2(this.f17709c, this.f17708b, continuation);
        preferenceStoreImpl$setTtsVoiceDirtyLanguages$2.f17707a = obj;
        return preferenceStoreImpl$setTtsVoiceDirtyLanguages$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2 preferenceStoreImpl$setTtsVoiceDirtyLanguages$2 = (PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTtsVoiceDirtyLanguages$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17707a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Set set = this.f17708b;
        boolean zIsEmpty = set.isEmpty();
        Preferences.Key key = this.f17709c.f18453v;
        if (zIsEmpty) {
            mutablePreferences.remove(key);
        } else {
            mutablePreferences.set(key, set);
        }
        return xfa.f68157a;
    }
}
