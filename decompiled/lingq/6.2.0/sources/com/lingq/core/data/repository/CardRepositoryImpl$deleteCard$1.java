package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wn0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {417, 420, 424, 429}, m4293m = "deleteCard", m4294v = 2)
final class CardRepositoryImpl$deleteCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14637a;

    /* JADX INFO: renamed from: b */
    public String f14638b;

    /* JADX INFO: renamed from: c */
    public wn0 f14639c;

    /* JADX INFO: renamed from: d */
    public int f14640d;

    /* JADX INFO: renamed from: e */
    public int f14641e;

    /* JADX INFO: renamed from: f */
    public int f14642f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f14643g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1287c f14644h;

    /* JADX INFO: renamed from: i */
    public int f14645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$deleteCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14644h = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14643g = obj;
        this.f14645i |= Integer.MIN_VALUE;
        return this.f14644h.m7113b(0, null, null, this);
    }
}
