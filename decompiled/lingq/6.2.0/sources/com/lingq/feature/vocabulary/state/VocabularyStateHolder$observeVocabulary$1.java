package com.lingq.feature.vocabulary.state;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e0b;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$observeVocabulary$1", m4291f = "VocabularyStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$observeVocabulary$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$observeVocabulary$1(C2862d c2862d, Continuation continuation) {
        super(2, continuation);
        this.f33761b = c2862d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VocabularyStateHolder$observeVocabulary$1 vocabularyStateHolder$observeVocabulary$1 = new VocabularyStateHolder$observeVocabulary$1(this.f33761b, continuation);
        vocabularyStateHolder$observeVocabulary$1.f33760a = obj;
        return vocabularyStateHolder$observeVocabulary$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyStateHolder$observeVocabulary$1 vocabularyStateHolder$observeVocabulary$1 = (VocabularyStateHolder$observeVocabulary$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyStateHolder$observeVocabulary$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f33760a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayListM22587E0 = u91.m22587E0(list);
        C2862d c2862d = this.f33761b;
        c2862d.f33811q = arrayListM22587E0;
        if (!c2862d.f33816v) {
            c2862d.f33818x = false;
        }
        c2862d.m9773f(new e0b(5));
        return xfa.f68157a;
    }
}
