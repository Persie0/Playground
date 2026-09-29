package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultTranslationGoogle;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {101, 112}, m4293m = "fetchTokenTranslations", m4294v = 2)
final class TokenDataRepositoryImpl$fetchTokenTranslations$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16175a;

    /* JADX INFO: renamed from: b */
    public String f16176b;

    /* JADX INFO: renamed from: c */
    public String f16177c;

    /* JADX INFO: renamed from: d */
    public ResultTranslationGoogle f16178d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16179e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1306v f16180f;

    /* JADX INFO: renamed from: g */
    public int f16181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$fetchTokenTranslations$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16180f = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16179e = obj;
        this.f16181g |= Integer.MIN_VALUE;
        return this.f16180f.m7380f(null, null, null, null, this);
    }
}
