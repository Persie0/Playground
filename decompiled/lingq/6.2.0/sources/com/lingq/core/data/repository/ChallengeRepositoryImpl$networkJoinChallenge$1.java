package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {163, 164}, m4293m = "networkJoinChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$networkJoinChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14842a;

    /* JADX INFO: renamed from: b */
    public String f14843b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14844c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1288d f14845d;

    /* JADX INFO: renamed from: e */
    public int f14846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkJoinChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14845d = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14844c = obj;
        this.f14846e |= Integer.MIN_VALUE;
        return this.f14845d.m7143j(null, null, this);
    }
}
