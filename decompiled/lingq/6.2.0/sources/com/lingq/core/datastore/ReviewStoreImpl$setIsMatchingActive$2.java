package com.lingq.core.datastore;

import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsMatchingActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsMatchingActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsMatchingActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18088b = c1370c;
        this.f18089c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsMatchingActive$2 reviewStoreImpl$setIsMatchingActive$2 = new ReviewStoreImpl$setIsMatchingActive$2(this.f18088b, this.f18089c, continuation);
        reviewStoreImpl$setIsMatchingActive$2.f18087a = obj;
        return reviewStoreImpl$setIsMatchingActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsMatchingActive$2 reviewStoreImpl$setIsMatchingActive$2 = (ReviewStoreImpl$setIsMatchingActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsMatchingActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18087a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18088b.f18497I, Boolean.valueOf(this.f18089c));
        return xfa.f68157a;
    }
}
