package com.lingq.feature.vocabulary.state;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e0b;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$observeHasCreatedLingqs$1", m4291f = "VocabularyStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$observeHasCreatedLingqs$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f33758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$observeHasCreatedLingqs$1(C2862d c2862d, Continuation continuation) {
        super(2, continuation);
        this.f33759b = c2862d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VocabularyStateHolder$observeHasCreatedLingqs$1 vocabularyStateHolder$observeHasCreatedLingqs$1 = new VocabularyStateHolder$observeHasCreatedLingqs$1(this.f33759b, continuation);
        vocabularyStateHolder$observeHasCreatedLingqs$1.f33758a = ((Boolean) obj).booleanValue();
        return vocabularyStateHolder$observeHasCreatedLingqs$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        VocabularyStateHolder$observeHasCreatedLingqs$1 vocabularyStateHolder$observeHasCreatedLingqs$1 = (VocabularyStateHolder$observeHasCreatedLingqs$1) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyStateHolder$observeHasCreatedLingqs$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f33758a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2862d c2862d = this.f33759b;
        c2862d.f33813s = z;
        c2862d.m9773f(new e0b(5));
        return xfa.f68157a;
    }
}
