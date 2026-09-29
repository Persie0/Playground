package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e0b;
import p000.fa4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$observeVocabularySearchQuery$1", m4291f = "VocabularyStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$observeVocabularySearchQuery$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$observeVocabularySearchQuery$1(C2862d c2862d, Continuation continuation) {
        super(2, continuation);
        this.f33763b = c2862d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VocabularyStateHolder$observeVocabularySearchQuery$1 vocabularyStateHolder$observeVocabularySearchQuery$1 = new VocabularyStateHolder$observeVocabularySearchQuery$1(this.f33763b, continuation);
        vocabularyStateHolder$observeVocabularySearchQuery$1.f33762a = obj;
        return vocabularyStateHolder$observeVocabularySearchQuery$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyStateHolder$observeVocabularySearchQuery$1 vocabularyStateHolder$observeVocabularySearchQuery$1 = (VocabularyStateHolder$observeVocabularySearchQuery$1) create((VocabularySearchQuery) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyStateHolder$observeVocabularySearchQuery$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) this.f33762a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2862d c2862d = this.f33763b;
        boolean zM11650l = fa4.m11650l(c2862d.f33814t, vocabularySearchQuery);
        c2862d.f33814t = vocabularySearchQuery;
        if (zM11650l) {
            c2862d.m9773f(new e0b(5));
        } else {
            c2862d.m9773f(new e0b(1));
            c2862d.m9774g(false);
        }
        return xfa.f68157a;
    }
}
