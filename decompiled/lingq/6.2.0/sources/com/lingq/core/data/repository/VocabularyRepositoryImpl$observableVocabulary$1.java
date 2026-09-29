package com.lingq.core.data.repository;

import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {116, 120, 122}, m4293m = "observableVocabulary", m4294v = 2)
final class VocabularyRepositoryImpl$observableVocabulary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16369a;

    /* JADX INFO: renamed from: b */
    public String f16370b;

    /* JADX INFO: renamed from: c */
    public String f16371c;

    /* JADX INFO: renamed from: d */
    public VocabularySearchQuery f16372d;

    /* JADX INFO: renamed from: e */
    public int f16373e;

    /* JADX INFO: renamed from: f */
    public int f16374f;

    /* JADX INFO: renamed from: g */
    public boolean f16375g;

    /* JADX INFO: renamed from: h */
    public boolean f16376h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f16377i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1308x f16378j;

    /* JADX INFO: renamed from: k */
    public int f16379k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$observableVocabulary$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16378j = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16377i = obj;
        this.f16379k |= Integer.MIN_VALUE;
        return this.f16378j.m7417k(null, 0, null, false, false, null, 0, this);
    }
}
