package com.lingq.core.data.repository;

import com.lingq.core.database.entity.ChallengeRankingEntity;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {95, 97, 100, 103, 107, 108}, m4293m = "leaveChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$leaveChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14791a;

    /* JADX INFO: renamed from: b */
    public String f14792b;

    /* JADX INFO: renamed from: c */
    public Iterator f14793c;

    /* JADX INFO: renamed from: d */
    public ChallengeRankingEntity f14794d;

    /* JADX INFO: renamed from: e */
    public int f14795e;

    /* JADX INFO: renamed from: f */
    public int f14796f;

    /* JADX INFO: renamed from: g */
    public int f14797g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f14798h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1288d f14799i;

    /* JADX INFO: renamed from: j */
    public int f14800j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$leaveChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14799i = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14798h = obj;
        this.f14800j |= Integer.MIN_VALUE;
        return this.f14799i.m7137d(0, null, null, this);
    }
}
