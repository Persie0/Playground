package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {508, 518}, m4293m = "updateCardHint", m4294v = 2)
final class CardRepositoryImpl$updateCardHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenMeaning f14746a;

    /* JADX INFO: renamed from: b */
    public String f14747b;

    /* JADX INFO: renamed from: c */
    public int f14748c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14749d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14750e;

    /* JADX INFO: renamed from: f */
    public int f14751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardHint$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14750e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14749d = obj;
        this.f14751f |= Integer.MIN_VALUE;
        return this.f14750e.m7130t(null, null, null, null, this);
    }
}
