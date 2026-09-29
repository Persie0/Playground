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
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2", m4291f = "ReviewStore.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1370c f18085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f18086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2(C1370c c1370c, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f18085b = c1370c;
        this.f18086c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2 reviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2 = new ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2(this.f18085b, this.f18086c, continuation);
        reviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2.f18084a = obj;
        return reviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2 reviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2 = (ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        reviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f18084a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f18085b.f18556v, Boolean.valueOf(this.f18086c));
        return xfa.f68157a;
    }
}
