package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {237, 238}, m4293m = "networkJoinBookChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$networkJoinBookChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14836a;

    /* JADX INFO: renamed from: b */
    public String f14837b;

    /* JADX INFO: renamed from: c */
    public int f14838c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14839d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1288d f14840e;

    /* JADX INFO: renamed from: f */
    public int f14841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkJoinBookChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14840e = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14839d = obj;
        this.f14841f |= Integer.MIN_VALUE;
        return this.f14840e.m7142i(0, null, null, this);
    }
}
