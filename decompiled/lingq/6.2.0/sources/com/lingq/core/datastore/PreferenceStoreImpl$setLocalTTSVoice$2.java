package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setLocalTTSVoice$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setLocalTTSVoice$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashMap f17607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setLocalTTSVoice$2(C1368a c1368a, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f17606b = c1368a;
        this.f17607c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setLocalTTSVoice$2 preferenceStoreImpl$setLocalTTSVoice$2 = new PreferenceStoreImpl$setLocalTTSVoice$2(this.f17606b, this.f17607c, continuation);
        preferenceStoreImpl$setLocalTTSVoice$2.f17605a = obj;
        return preferenceStoreImpl$setLocalTTSVoice$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setLocalTTSVoice$2 preferenceStoreImpl$setLocalTTSVoice$2 = (PreferenceStoreImpl$setLocalTTSVoice$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setLocalTTSVoice$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17605a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1368a c1368a = this.f17606b;
        mutablePreferences.set(c1368a.f18456w, c1368a.f18390a.m10322b(new je5(sk9.f60959a, LocalTextToSpeechVoice.Companion.serializer()), this.f17607c));
        return xfa.f68157a;
    }
}
