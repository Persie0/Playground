package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.util.LinkedHashMap;
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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setTransliterationScripts$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setTransliterationScripts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18102a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashMap f18104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setTransliterationScripts$2(C1370c c1370c, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f18103b = c1370c;
        this.f18104c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setTransliterationScripts$2 reviewStoreImpl$setTransliterationScripts$2 = new ReviewStoreImpl$setTransliterationScripts$2(this.f18103b, this.f18104c, continuation);
        reviewStoreImpl$setTransliterationScripts$2.f18102a = obj;
        return reviewStoreImpl$setTransliterationScripts$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setTransliterationScripts$2 reviewStoreImpl$setTransliterationScripts$2 = (ReviewStoreImpl$setTransliterationScripts$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setTransliterationScripts$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18102a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1370c c1370c = this.f18103b;
        Preferences.Key key = c1370c.f18494F;
        df4 df4Var = c1370c.f18515a;
        sk9 sk9Var = sk9.f60959a;
        mutablePreferences.set(key, df4Var.m10322b(new je5(sk9Var, sk9Var), this.f18104c));
        return xfa.f68157a;
    }
}
