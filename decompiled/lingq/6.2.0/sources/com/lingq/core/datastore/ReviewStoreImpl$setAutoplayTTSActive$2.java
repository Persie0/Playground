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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setAutoplayTTSActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setAutoplayTTSActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f18005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setAutoplayTTSActive$2(C1370c c1370c, Map map, Continuation continuation) {
        super(2, continuation);
        this.f18004b = c1370c;
        this.f18005c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setAutoplayTTSActive$2 reviewStoreImpl$setAutoplayTTSActive$2 = new ReviewStoreImpl$setAutoplayTTSActive$2(this.f18004b, this.f18005c, continuation);
        reviewStoreImpl$setAutoplayTTSActive$2.f18003a = obj;
        return reviewStoreImpl$setAutoplayTTSActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setAutoplayTTSActive$2 reviewStoreImpl$setAutoplayTTSActive$2 = (ReviewStoreImpl$setAutoplayTTSActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setAutoplayTTSActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18003a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1370c c1370c = this.f18004b;
        mutablePreferences.set(c1370c.f18498J, c1370c.f18515a.m10322b(new je5(sk9.f60959a, lf0.f49579a), this.f18005c));
        return xfa.f68157a;
    }
}
