package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {814, 816, 819}, m4293m = "syncReviewCard", m4294v = 2)
final class CardRepositoryImpl$syncReviewCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14729a;

    /* JADX INFO: renamed from: b */
    public String f14730b;

    /* JADX INFO: renamed from: c */
    public String f14731c;

    /* JADX INFO: renamed from: d */
    public int f14732d;

    /* JADX INFO: renamed from: e */
    public int f14733e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f14734f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1287c f14735g;

    /* JADX INFO: renamed from: h */
    public int f14736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$syncReviewCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14735g = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14734f = obj;
        this.f14736h |= Integer.MIN_VALUE;
        return this.f14735g.m7128r(0, null, null, this);
    }
}
