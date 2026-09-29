package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {593}, m4293m = "explain", m4294v = 2)
final class CardRepositoryImpl$explain$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1287c f14647b;

    /* JADX INFO: renamed from: c */
    public int f14648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$explain$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14647b = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14646a = obj;
        this.f14648c |= Integer.MIN_VALUE;
        return this.f14647b.m7114d(0, 0, 0, 0, null, null, this);
    }
}
