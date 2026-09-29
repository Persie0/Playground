package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {66, 72}, m4293m = "fetchRelatedPhrases", m4294v = 2)
final class TokenDataRepositoryImpl$fetchRelatedPhrases$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16159a;

    /* JADX INFO: renamed from: b */
    public String f16160b;

    /* JADX INFO: renamed from: c */
    public String f16161c;

    /* JADX INFO: renamed from: d */
    public int f16162d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16163e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1306v f16164f;

    /* JADX INFO: renamed from: g */
    public int f16165g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$fetchRelatedPhrases$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16164f = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16163e = obj;
        this.f16165g |= Integer.MIN_VALUE;
        return this.f16164f.m7378d(0, null, null, null, this);
    }
}
