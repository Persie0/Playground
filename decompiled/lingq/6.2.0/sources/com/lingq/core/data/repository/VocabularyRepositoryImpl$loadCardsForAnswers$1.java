package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.VocabularyRepositoryImpl", m4291f = "VocabularyRepositoryImpl.kt", m4292l = {436, 440, 442, 450, 478, 483}, m4293m = "loadCardsForAnswers", m4294v = 2)
final class VocabularyRepositoryImpl$loadCardsForAnswers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16363a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f16364b;

    /* JADX INFO: renamed from: c */
    public Ref$ObjectRef f16365c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16366d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1308x f16367e;

    /* JADX INFO: renamed from: f */
    public int f16368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$loadCardsForAnswers$1(C1308x c1308x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16367e = c1308x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16366d = obj;
        this.f16368f |= Integer.MIN_VALUE;
        return this.f16367e.m7416j(null, this);
    }
}
