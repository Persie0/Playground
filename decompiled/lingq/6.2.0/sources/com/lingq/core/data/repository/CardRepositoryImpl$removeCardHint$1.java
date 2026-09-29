package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {558, 566}, m4293m = "removeCardHint", m4294v = 2)
final class CardRepositoryImpl$removeCardHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenMeaning f14706a;

    /* JADX INFO: renamed from: b */
    public int f14707b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14708c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1287c f14709d;

    /* JADX INFO: renamed from: e */
    public int f14710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$removeCardHint$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14709d = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14708c = obj;
        this.f14710e |= Integer.MIN_VALUE;
        return this.f14709d.m7124n(null, null, null, 0, this);
    }
}
