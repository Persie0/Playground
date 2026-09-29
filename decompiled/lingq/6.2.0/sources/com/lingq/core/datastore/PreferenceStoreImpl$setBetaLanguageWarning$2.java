package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.je5;
import p000.lf0;
import p000.sk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$setBetaLanguageWarning$2", m4291f = "PreferenceStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PreferenceStoreImpl$setBetaLanguageWarning$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1368a f17527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashMap f17528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$setBetaLanguageWarning$2(C1368a c1368a, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f17527b = c1368a;
        this.f17528c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferenceStoreImpl$setBetaLanguageWarning$2 preferenceStoreImpl$setBetaLanguageWarning$2 = new PreferenceStoreImpl$setBetaLanguageWarning$2(this.f17527b, this.f17528c, continuation);
        preferenceStoreImpl$setBetaLanguageWarning$2.f17526a = obj;
        return preferenceStoreImpl$setBetaLanguageWarning$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PreferenceStoreImpl$setBetaLanguageWarning$2 preferenceStoreImpl$setBetaLanguageWarning$2 = (PreferenceStoreImpl$setBetaLanguageWarning$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        preferenceStoreImpl$setBetaLanguageWarning$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f17526a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1368a c1368a = this.f17527b;
        mutablePreferences.set(c1368a.f18397c0, c1368a.f18390a.m10322b(new je5(sk9.f60959a, lf0.f49579a), this.f17528c));
        return xfa.f68157a;
    }
}
