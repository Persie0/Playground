package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {211, 216, 226, 229, 233}, m4293m = "updateMeaning", m4294v = 2)
final class TokenDataRepositoryImpl$updateMeaning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16186a;

    /* JADX INFO: renamed from: b */
    public String f16187b;

    /* JADX INFO: renamed from: c */
    public TokenMeaning f16188c;

    /* JADX INFO: renamed from: d */
    public String f16189d;

    /* JADX INFO: renamed from: e */
    public String f16190e;

    /* JADX INFO: renamed from: f */
    public Integer f16191f;

    /* JADX INFO: renamed from: g */
    public String f16192g;

    /* JADX INFO: renamed from: h */
    public int f16193h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f16194i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1306v f16195j;

    /* JADX INFO: renamed from: k */
    public int f16196k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$updateMeaning$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16195j = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16194i = obj;
        this.f16196k |= Integer.MIN_VALUE;
        return this.f16195j.m7385k(null, null, null, null, null, null, this);
    }
}
