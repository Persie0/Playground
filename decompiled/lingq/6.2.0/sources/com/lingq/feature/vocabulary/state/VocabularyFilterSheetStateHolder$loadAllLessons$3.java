package com.lingq.feature.vocabulary.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadAllLessons$3", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadAllLessons$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2860b f33713a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadAllLessons$3(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33713a = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadAllLessons$3(this.f33713a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyFilterSheetStateHolder$loadAllLessons$3 vocabularyFilterSheetStateHolder$loadAllLessons$3 = (VocabularyFilterSheetStateHolder$loadAllLessons$3) create((e83) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyFilterSheetStateHolder$loadAllLessons$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2860b.m9763b(this.f33713a, true);
        return xfa.f68157a;
    }
}
