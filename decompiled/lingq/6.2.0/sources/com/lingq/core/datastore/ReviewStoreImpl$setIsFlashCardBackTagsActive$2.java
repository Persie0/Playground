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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsFlashCardBackTagsActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsFlashCardBackTagsActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsFlashCardBackTagsActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18028b = c1370c;
        this.f18029c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsFlashCardBackTagsActive$2 reviewStoreImpl$setIsFlashCardBackTagsActive$2 = new ReviewStoreImpl$setIsFlashCardBackTagsActive$2(this.f18028b, this.f18029c, continuation);
        reviewStoreImpl$setIsFlashCardBackTagsActive$2.f18027a = obj;
        return reviewStoreImpl$setIsFlashCardBackTagsActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsFlashCardBackTagsActive$2 reviewStoreImpl$setIsFlashCardBackTagsActive$2 = (ReviewStoreImpl$setIsFlashCardBackTagsActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsFlashCardBackTagsActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18027a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18028b.f18555u, Boolean.valueOf(this.f18029c));
        return xfa.f68157a;
    }
}
