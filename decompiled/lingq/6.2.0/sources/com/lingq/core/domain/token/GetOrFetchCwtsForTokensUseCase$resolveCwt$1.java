package com.lingq.core.domain.token;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.sm3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetOrFetchCwtsForTokensUseCase", m4291f = "GetOrFetchCwtsForTokensUseCase.kt", m4292l = {80, 83, 97}, m4293m = "resolveCwt", m4294v = 2)
final class GetOrFetchCwtsForTokensUseCase$resolveCwt$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f20038a;

    /* JADX INFO: renamed from: b */
    public String f20039b;

    /* JADX INFO: renamed from: c */
    public String f20040c;

    /* JADX INFO: renamed from: d */
    public sm3 f20041d;

    /* JADX INFO: renamed from: e */
    public int f20042e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20043f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1535c f20044g;

    /* JADX INFO: renamed from: h */
    public int f20045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrFetchCwtsForTokensUseCase$resolveCwt$1(C1535c c1535c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20044g = c1535c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20043f = obj;
        this.f20045h |= Integer.MIN_VALUE;
        return this.f20044g.m8216c(null, null, 0, null, null, this);
    }
}
