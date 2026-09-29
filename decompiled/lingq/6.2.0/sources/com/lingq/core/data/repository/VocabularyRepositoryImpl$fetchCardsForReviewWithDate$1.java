package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {402}, m4293m = "fetchCardsForReviewWithDate", m4294v = 2)
final class VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1308x f16349b;

    /* JADX INFO: renamed from: c */
    public int f16350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$fetchCardsForReviewWithDate$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16349b = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16348a = obj;
        this.f16350c |= Integer.MIN_VALUE;
        return this.f16349b.m7413g(null, null, this);
    }
}
