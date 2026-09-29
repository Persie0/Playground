package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {200}, m4293m = "networkMonthlyChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$networkMonthlyChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1288d f14853b;

    /* JADX INFO: renamed from: c */
    public int f14854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkMonthlyChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14853b = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14852a = obj;
        this.f14854c |= Integer.MIN_VALUE;
        return this.f14853b.m7145l(null, null, this);
    }
}
