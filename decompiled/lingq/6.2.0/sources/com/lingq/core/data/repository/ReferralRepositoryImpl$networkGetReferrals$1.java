package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ReferralRepositoryImpl", m4291f = "ReferralRepositoryImpl.kt", m4292l = {25, 28}, m4293m = "networkGetReferrals", m4294v = 2)
final class ReferralRepositoryImpl$networkGetReferrals$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1304t f16090b;

    /* JADX INFO: renamed from: c */
    public int f16091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralRepositoryImpl$networkGetReferrals$1(C1304t c1304t, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16090b = c1304t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16089a = obj;
        this.f16091c |= Integer.MIN_VALUE;
        return this.f16090b.m7369b(this);
    }
}
