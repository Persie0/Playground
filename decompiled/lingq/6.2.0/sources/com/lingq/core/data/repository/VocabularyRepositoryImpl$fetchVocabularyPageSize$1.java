package com.lingq.core.data.repository;

import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {82, 86, 88}, m4293m = "fetchVocabularyPageSize", m4294v = 2)
final class VocabularyRepositoryImpl$fetchVocabularyPageSize$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16354a;

    /* JADX INFO: renamed from: b */
    public String f16355b;

    /* JADX INFO: renamed from: c */
    public String f16356c;

    /* JADX INFO: renamed from: d */
    public VocabularySearchQuery f16357d;

    /* JADX INFO: renamed from: e */
    public boolean f16358e;

    /* JADX INFO: renamed from: f */
    public boolean f16359f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16360g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1308x f16361h;

    /* JADX INFO: renamed from: i */
    public int f16362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$fetchVocabularyPageSize$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16361h = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16360g = obj;
        this.f16362i |= Integer.MIN_VALUE;
        return this.f16361h.m7415i(null, null, false, false, null, this);
    }
}
