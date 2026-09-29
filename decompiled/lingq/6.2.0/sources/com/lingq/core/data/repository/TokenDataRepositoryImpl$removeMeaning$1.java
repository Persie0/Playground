package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TokenDataRepositoryImpl", m4291f = "TokenDataRepositoryImpl.kt", m4292l = {251, 255}, m4293m = "removeMeaning", m4294v = 2)
final class TokenDataRepositoryImpl$removeMeaning$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenMeaning f16182a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1306v f16184c;

    /* JADX INFO: renamed from: d */
    public int f16185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDataRepositoryImpl$removeMeaning$1(C1306v c1306v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16184c = c1306v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16183b = obj;
        this.f16185d |= Integer.MIN_VALUE;
        return this.f16184c.m7384j(null, null, null, null, this);
    }
}
