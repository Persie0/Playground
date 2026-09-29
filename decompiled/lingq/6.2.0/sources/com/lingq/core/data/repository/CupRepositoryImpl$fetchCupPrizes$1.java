package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.eda;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {46, eda.f37086g}, m4293m = "fetchCupPrizes", m4294v = 2)
final class CupRepositoryImpl$fetchCupPrizes$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15079a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1291g f15080b;

    /* JADX INFO: renamed from: c */
    public int f15081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$fetchCupPrizes$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15080b = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15079a = obj;
        this.f15081c |= Integer.MIN_VALUE;
        return this.f15080b.m7189b(this);
    }
}
