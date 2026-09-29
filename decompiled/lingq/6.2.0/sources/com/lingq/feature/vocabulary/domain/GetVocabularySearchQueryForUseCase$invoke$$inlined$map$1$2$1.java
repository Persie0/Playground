package com.lingq.feature.vocabulary.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cx0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetVocabularySearchQueryForUseCase$invoke$$inlined$map$1$2", m4291f = "GetVocabularySearchQueryForUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetVocabularySearchQueryForUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33557a;

    /* JADX INFO: renamed from: b */
    public int f33558b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cx0 f33559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVocabularySearchQueryForUseCase$invoke$$inlined$map$1$2$1(cx0 cx0Var, Continuation continuation) {
        super(continuation);
        this.f33559c = cx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33557a = obj;
        this.f33558b |= Integer.MIN_VALUE;
        return this.f33559c.emit(null, this);
    }
}
