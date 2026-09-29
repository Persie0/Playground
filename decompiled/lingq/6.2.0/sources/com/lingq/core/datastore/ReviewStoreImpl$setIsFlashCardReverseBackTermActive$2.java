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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18067b = c1370c;
        this.f18068c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2 reviewStoreImpl$setIsFlashCardReverseBackTermActive$2 = new ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2(this.f18067b, this.f18068c, continuation);
        reviewStoreImpl$setIsFlashCardReverseBackTermActive$2.f18066a = obj;
        return reviewStoreImpl$setIsFlashCardReverseBackTermActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2 reviewStoreImpl$setIsFlashCardReverseBackTermActive$2 = (ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsFlashCardReverseBackTermActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18066a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18067b.f18559y, Boolean.valueOf(this.f18068c));
        return xfa.f68157a;
    }
}
