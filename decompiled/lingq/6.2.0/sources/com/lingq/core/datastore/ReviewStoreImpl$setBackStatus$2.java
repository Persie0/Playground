package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Map;
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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setBackStatus$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setBackStatus$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setBackStatus$2(C1370c c1370c, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18007b = c1370c;
        this.f18008c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setBackStatus$2 reviewStoreImpl$setBackStatus$2 = new ReviewStoreImpl$setBackStatus$2(this.f18007b, this.f18008c, continuation);
        reviewStoreImpl$setBackStatus$2.f18006a = obj;
        return reviewStoreImpl$setBackStatus$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setBackStatus$2 reviewStoreImpl$setBackStatus$2 = (ReviewStoreImpl$setBackStatus$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setBackStatus$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18006a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1370c c1370c = this.f18007b;
        mutablePreferences.set(c1370c.f18499K, c1370c.f18515a.m10322b(new je5(sk9.f60959a, lf0.f49579a), this.f18008c));
        return xfa.f68157a;
    }
}
