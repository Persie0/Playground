package com.lingq.core.domain.library;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetRecommendationsShelfUseCase", m4291f = "GetRecommendationsShelfUseCase.kt", m4292l = {14, 15, 16}, m4293m = "invoke", m4294v = 2)
final class GetRecommendationsShelfUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f18780a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1390e f18782c;

    /* JADX INFO: renamed from: d */
    public int f18783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecommendationsShelfUseCase$invoke$1(C1390e c1390e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18782c = c1390e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18781b = obj;
        this.f18783d |= Integer.MIN_VALUE;
        return this.f18782c.m8009a(null, this);
    }
}
