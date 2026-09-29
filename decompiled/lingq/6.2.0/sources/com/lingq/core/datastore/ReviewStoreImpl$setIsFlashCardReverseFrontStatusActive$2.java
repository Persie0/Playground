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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18075a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18076b = c1370c;
        this.f18077c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2 reviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2 = new ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2(this.f18076b, this.f18077c, continuation);
        reviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2.f18075a = obj;
        return reviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2 reviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2 = (ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18075a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18076b.f18558x, Boolean.valueOf(this.f18077c));
        return xfa.f68157a;
    }
}
