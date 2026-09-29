package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.Web2WaveRepositoryImpl", m4291f = "Web2WaveRepositoryImpl.kt", m4292l = {50}, m4293m = "fetchUserProperties", m4294v = 2)
final class Web2WaveRepositoryImpl$fetchUserProperties$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1309y f16419b;

    /* JADX INFO: renamed from: c */
    public int f16420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveRepositoryImpl$fetchUserProperties$1(C1309y c1309y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16419b = c1309y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16418a = obj;
        this.f16420c |= Integer.MIN_VALUE;
        return this.f16419b.m7421b(null, this);
    }
}
