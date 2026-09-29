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
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2", m4291f = "UtilStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18228a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2(C1371d c1371d, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18229b = c1371d;
        this.f18230c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2 utilStoreImpl$setPopularMeaningsLocaleForLanguage$2 = new UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2(this.f18229b, this.f18230c, continuation);
        utilStoreImpl$setPopularMeaningsLocaleForLanguage$2.f18228a = obj;
        return utilStoreImpl$setPopularMeaningsLocaleForLanguage$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2 utilStoreImpl$setPopularMeaningsLocaleForLanguage$2 = (UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        utilStoreImpl$setPopularMeaningsLocaleForLanguage$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18228a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1371d c1371d = this.f18229b;
        Preferences.Key key = c1371d.f18573j;
        df4 df4Var = c1371d.f18564a;
        sk9 sk9Var = sk9.f60959a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(sk9Var, sk9Var), this.f18230c));
        return xfa.f68157a;
    }
}
