package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl", m4291f = "CupRepositoryImpl.kt", m4292l = {78, 80, 84}, m4293m = "fetchTopContributors", m4294v = 2)
final class CupRepositoryImpl$fetchTopContributors$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15085a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1291g f15087c;

    /* JADX INFO: renamed from: d */
    public int f15088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupRepositoryImpl$fetchTopContributors$1(C1291g c1291g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15087c = c1291g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15086b = obj;
        this.f15088d |= Integer.MIN_VALUE;
        return this.f15087c.m7191d(null, this);
    }
}
