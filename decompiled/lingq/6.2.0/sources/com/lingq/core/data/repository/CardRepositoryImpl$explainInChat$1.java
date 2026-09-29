package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {618}, m4293m = "explainInChat", m4294v = 2)
final class CardRepositoryImpl$explainInChat$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1287c f14650b;

    /* JADX INFO: renamed from: c */
    public int f14651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$explainInChat$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14650b = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14649a = obj;
        this.f14651c |= Integer.MIN_VALUE;
        return this.f14650b.m7115e(null, 0, 0, 0, 0, 0, null, this);
    }
}
