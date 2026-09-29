package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {806, 808}, m4293m = "reviewCard", m4294v = 2)
final class CardRepositoryImpl$reviewCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14717a;

    /* JADX INFO: renamed from: b */
    public String f14718b;

    /* JADX INFO: renamed from: c */
    public int f14719c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14720d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14721e;

    /* JADX INFO: renamed from: f */
    public int f14722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$reviewCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14721e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14720d = obj;
        this.f14722f |= Integer.MIN_VALUE;
        return this.f14721e.m7126p(0, null, null, this);
    }
}
