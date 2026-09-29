package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.JoinedChallengeStats;
import com.lingq.core.network.api.result.ResultChallenge;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {299, 317, 374, 426, 441}, m4293m = "insertChallengeStat", m4294v = 2)
final class ChallengeRepositoryImpl$insertChallengeStat$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14773a;

    /* JADX INFO: renamed from: b */
    public ResultChallenge f14774b;

    /* JADX INFO: renamed from: c */
    public JoinedChallengeStats f14775c;

    /* JADX INFO: renamed from: d */
    public Iterator f14776d;

    /* JADX INFO: renamed from: e */
    public int f14777e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f14778f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1288d f14779g;

    /* JADX INFO: renamed from: h */
    public int f14780h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$insertChallengeStat$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14779g = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14778f = obj;
        this.f14780h |= Integer.MIN_VALUE;
        return this.f14779g.m7134a(null, null, null, this);
    }
}
