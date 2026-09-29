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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsFlashCardBackTranslationActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsFlashCardBackTranslationActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsFlashCardBackTranslationActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18034b = c1370c;
        this.f18035c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsFlashCardBackTranslationActive$2 reviewStoreImpl$setIsFlashCardBackTranslationActive$2 = new ReviewStoreImpl$setIsFlashCardBackTranslationActive$2(this.f18034b, this.f18035c, continuation);
        reviewStoreImpl$setIsFlashCardBackTranslationActive$2.f18033a = obj;
        return reviewStoreImpl$setIsFlashCardBackTranslationActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsFlashCardBackTranslationActive$2 reviewStoreImpl$setIsFlashCardBackTranslationActive$2 = (ReviewStoreImpl$setIsFlashCardBackTranslationActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsFlashCardBackTranslationActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18033a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18034b.f18543o, Boolean.valueOf(this.f18035c));
        return xfa.f68157a;
    }
}
