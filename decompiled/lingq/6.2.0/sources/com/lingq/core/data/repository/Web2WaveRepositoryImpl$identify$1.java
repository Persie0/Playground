package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.Web2WaveRepositoryImpl", m4291f = "Web2WaveRepositoryImpl.kt", m4292l = {38}, m4293m = "identify", m4294v = 2)
final class Web2WaveRepositoryImpl$identify$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1309y f16422b;

    /* JADX INFO: renamed from: c */
    public int f16423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveRepositoryImpl$identify$1(C1309y c1309y, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16422b = c1309y;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16421a = obj;
        this.f16423c |= Integer.MIN_VALUE;
        return this.f16422b.m7422c(this);
    }
}
