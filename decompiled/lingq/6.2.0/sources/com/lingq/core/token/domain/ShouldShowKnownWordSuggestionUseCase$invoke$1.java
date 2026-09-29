package com.lingq.core.token.domain;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.ShouldShowKnownWordSuggestionUseCase$invoke$1", m4291f = "ShouldShowKnownWordSuggestionUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ShouldShowKnownWordSuggestionUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23838a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShouldShowKnownWordSuggestionUseCase$invoke$1 shouldShowKnownWordSuggestionUseCase$invoke$1 = new ShouldShowKnownWordSuggestionUseCase$invoke$1(2, continuation);
        shouldShowKnownWordSuggestionUseCase$invoke$1.f23838a = ((Boolean) obj).booleanValue();
        return shouldShowKnownWordSuggestionUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ShouldShowKnownWordSuggestionUseCase$invoke$1) create(bool, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23838a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z);
    }
}
