package com.lingq.feature.vocabulary.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetVocabularySearchQueryForUseCase", m4291f = "GetVocabularySearchQueryForUseCase.kt", m4292l = {24, 25}, m4293m = "current", m4294v = 2)
final class GetVocabularySearchQueryForUseCase$current$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f33549a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2826b f33551c;

    /* JADX INFO: renamed from: d */
    public int f33552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVocabularySearchQueryForUseCase$current$1(C2826b c2826b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33551c = c2826b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33550b = obj;
        this.f33552d |= Integer.MIN_VALUE;
        return this.f33551c.m9747a(null, this);
    }
}
