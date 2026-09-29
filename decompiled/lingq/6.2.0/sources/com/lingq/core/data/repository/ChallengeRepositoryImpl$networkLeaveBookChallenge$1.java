package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {283, 284}, m4293m = "networkLeaveBookChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$networkLeaveBookChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14847a;

    /* JADX INFO: renamed from: b */
    public String f14848b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1288d f14850d;

    /* JADX INFO: renamed from: e */
    public int f14851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkLeaveBookChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14850d = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14849c = obj;
        this.f14851e |= Integer.MIN_VALUE;
        return this.f14850d.m7144k(null, null, this);
    }
}
