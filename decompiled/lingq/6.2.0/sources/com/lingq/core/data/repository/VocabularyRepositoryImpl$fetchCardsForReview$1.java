package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {391}, m4293m = "fetchCardsForReview", m4294v = 2)
final class VocabularyRepositoryImpl$fetchCardsForReview$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1308x f16346b;

    /* JADX INFO: renamed from: c */
    public int f16347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$fetchCardsForReview$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16346b = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16345a = obj;
        this.f16347c |= Integer.MIN_VALUE;
        return this.f16346b.m7412f(null, null, this);
    }
}
