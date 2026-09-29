package com.lingq.feature.vocabulary.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.ExportVocabularyCardsUseCase", m4291f = "ExportVocabularyCardsUseCase.kt", m4292l = {51}, m4293m = "toSkritter", m4294v = 2)
final class ExportVocabularyCardsUseCase$toSkritter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2825a f33535b;

    /* JADX INFO: renamed from: c */
    public int f33536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportVocabularyCardsUseCase$toSkritter$1(C2825a c2825a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33535b = c2825a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33534a = obj;
        this.f33536c |= Integer.MIN_VALUE;
        return this.f33535b.m9746b(null, null, this);
    }
}
