package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o3a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {287, 294, 303}, m4293m = "fetchTokenCwt", m4294v = 2)
final class TokenDataRepositoryImpl$fetchTokenCwt$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public o3a f16166a;

    /* JADX INFO: renamed from: b */
    public int f16167b;

    /* JADX INFO: renamed from: c */
    public int f16168c;

    /* JADX INFO: renamed from: d */
    public int f16169d;

    /* JADX INFO: renamed from: e */
    public int f16170e;

    /* JADX INFO: renamed from: f */
    public boolean f16171f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16172g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1306v f16173h;

    /* JADX INFO: renamed from: i */
    public int f16174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$fetchTokenCwt$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16173h = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16172g = obj;
        this.f16174i |= Integer.MIN_VALUE;
        return this.f16173h.m7379e(null, 0, 0, 0, false, 0, this);
    }
}
