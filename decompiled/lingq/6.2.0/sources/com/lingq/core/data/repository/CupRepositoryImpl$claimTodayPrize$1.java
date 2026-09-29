package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.i88;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {97, 103}, m4293m = "claimTodayPrize", m4294v = 2)
final class CupRepositoryImpl$claimTodayPrize$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public i88 f15075a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1291g f15077c;

    /* JADX INFO: renamed from: d */
    public int f15078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$claimTodayPrize$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15077c = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15076b = obj;
        this.f15078d |= Integer.MIN_VALUE;
        return this.f15077c.m7188a(this);
    }
}
