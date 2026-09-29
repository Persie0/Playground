package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {516}, m4293m = "exportCardsToSkritter", m4294v = 2)
final class VocabularyRepositoryImpl$exportCardsToSkritter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1308x f16343b;

    /* JADX INFO: renamed from: c */
    public int f16344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$exportCardsToSkritter$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16343b = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16342a = obj;
        this.f16344c |= Integer.MIN_VALUE;
        return this.f16343b.m7411e(null, null, this);
    }
}
