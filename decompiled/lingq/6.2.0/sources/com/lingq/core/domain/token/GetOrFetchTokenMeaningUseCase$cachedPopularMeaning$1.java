package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchTokenMeaningUseCase", m4291f = "GetOrFetchTokenMeaningUseCase.kt", m4292l = {51}, m4293m = "cachedPopularMeaning", m4294v = 2)
final class GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1536d f20047b;

    /* JADX INFO: renamed from: c */
    public int f20048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchTokenMeaningUseCase$cachedPopularMeaning$1(C1536d c1536d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20047b = c1536d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20046a = obj;
        this.f20048c |= Integer.MIN_VALUE;
        return this.f20047b.m8217a(null, null, null, this);
    }
}
