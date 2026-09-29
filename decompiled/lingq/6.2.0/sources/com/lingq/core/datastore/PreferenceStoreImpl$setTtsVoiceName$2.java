package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.df4;
import p000.je5;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setTtsVoiceName$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setTtsVoiceName$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17711b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f17712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setTtsVoiceName$2(C1368a c1368a, Map map, Continuation continuation) {
        super(2, continuation);
        this.f17711b = c1368a;
        this.f17712c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setTtsVoiceName$2 preferenceStoreImpl$setTtsVoiceName$2 = new PreferenceStoreImpl$setTtsVoiceName$2(this.f17711b, this.f17712c, continuation);
        preferenceStoreImpl$setTtsVoiceName$2.f17710a = obj;
        return preferenceStoreImpl$setTtsVoiceName$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setTtsVoiceName$2 preferenceStoreImpl$setTtsVoiceName$2 = (PreferenceStoreImpl$setTtsVoiceName$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setTtsVoiceName$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17710a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1368a c1368a = this.f17711b;
        Preferences.Key key = c1368a.f18447t;
        df4 df4Var = c1368a.f18390a;
        sk9 sk9Var = sk9.f60959a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(sk9Var, sk9Var), this.f17712c));
        mutablePreferences.remove(c1368a.f18444s);
        return xfa.f68157a;
    }
}
