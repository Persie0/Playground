package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {288}, m4293m = "networkBookChallengeBadges", m4294v = 2)
final class ChallengeRepositoryImpl$networkBookChallengeBadges$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1288d f14802b;

    /* JADX INFO: renamed from: c */
    public int f14803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkBookChallengeBadges$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14802b = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14801a = obj;
        this.f14803c |= Integer.MIN_VALUE;
        return this.f14802b.m7138e(this);
    }
}
