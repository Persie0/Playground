package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {177, 178}, m4293m = "fetchPopularMeanings", m4294v = 2)
final class TokenDataRepositoryImpl$fetchPopularMeanings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16152a;

    /* JADX INFO: renamed from: b */
    public String f16153b;

    /* JADX INFO: renamed from: c */
    public String f16154c;

    /* JADX INFO: renamed from: d */
    public List f16155d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16156e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1306v f16157f;

    /* JADX INFO: renamed from: g */
    public int f16158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$fetchPopularMeanings$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16157f = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16156e = obj;
        this.f16158g |= Integer.MIN_VALUE;
        return this.f16157f.m7377c(null, null, null, this);
    }
}
