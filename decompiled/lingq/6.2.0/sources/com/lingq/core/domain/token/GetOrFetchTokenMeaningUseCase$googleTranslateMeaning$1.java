package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchTokenMeaningUseCase", m4291f = "GetOrFetchTokenMeaningUseCase.kt", m4292l = {60, 62, 64}, m4293m = "googleTranslateMeaning", m4294v = 2)
final class GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20052a;

    /* JADX INFO: renamed from: b */
    public String f20053b;

    /* JADX INFO: renamed from: c */
    public String f20054c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20055d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1536d f20056e;

    /* JADX INFO: renamed from: f */
    public int f20057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchTokenMeaningUseCase$googleTranslateMeaning$1(C1536d c1536d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20056e = c1536d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20055d = obj;
        this.f20057f |= Integer.MIN_VALUE;
        return this.f20056e.m8219c(null, null, null, this);
    }
}
