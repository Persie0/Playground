package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetTokenTypeForTermUseCase", m4291f = "GetTokenTypeForTermUseCase.kt", m4292l = {15}, m4293m = "invoke", m4294v = 2)
final class GetTokenTypeForTermUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1537e f20071b;

    /* JADX INFO: renamed from: c */
    public int f20072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenTypeForTermUseCase$invoke$1(C1537e c1537e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20071b = c1537e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20070a = obj;
        this.f20072c |= Integer.MIN_VALUE;
        return this.f20071b.m8223b(null, null, this);
    }
}
