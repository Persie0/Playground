package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.Web2WaveRepositoryImpl", m4291f = "Web2WaveRepositoryImpl.kt", m4292l = {22}, m4293m = "fetchSubscriptionStatus", m4294v = 2)
final class Web2WaveRepositoryImpl$fetchSubscriptionStatus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1309y f16416b;

    /* JADX INFO: renamed from: c */
    public int f16417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveRepositoryImpl$fetchSubscriptionStatus$1(C1309y c1309y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16416b = c1309y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16415a = obj;
        this.f16417c |= Integer.MIN_VALUE;
        return this.f16416b.m7420a(null, this);
    }
}
