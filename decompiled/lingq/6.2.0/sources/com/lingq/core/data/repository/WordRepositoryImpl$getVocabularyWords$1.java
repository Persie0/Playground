package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.WordRepositoryImpl", m4291f = "WordRepositoryImpl.kt", m4292l = {357}, m4293m = "getVocabularyWords", m4294v = 2)
final class WordRepositoryImpl$getVocabularyWords$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1310z f16425b;

    /* JADX INFO: renamed from: c */
    public int f16426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordRepositoryImpl$getVocabularyWords$1(C1310z c1310z, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16425b = c1310z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16424a = obj;
        this.f16426c |= Integer.MIN_VALUE;
        return this.f16425b.m7424c(null, this);
    }
}
