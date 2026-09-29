package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchTokenMeaningUseCase", m4291f = "GetOrFetchTokenMeaningUseCase.kt", m4292l = {74}, m4293m = "cachedTranslation", m4294v = 2)
final class GetOrFetchTokenMeaningUseCase$cachedTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20049a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1536d f20050b;

    /* JADX INFO: renamed from: c */
    public int f20051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchTokenMeaningUseCase$cachedTranslation$1(C1536d c1536d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20050b = c1536d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20049a = obj;
        this.f20051c |= Integer.MIN_VALUE;
        return this.f20050b.m8218b(null, null, null, this);
    }
}
