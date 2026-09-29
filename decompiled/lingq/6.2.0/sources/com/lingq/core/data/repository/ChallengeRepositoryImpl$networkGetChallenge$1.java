package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultChallenge;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {175, 176}, m4293m = "networkGetChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$networkGetChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14820a;

    /* JADX INFO: renamed from: b */
    public String f14821b;

    /* JADX INFO: renamed from: c */
    public ResultChallenge f14822c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14823d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1288d f14824e;

    /* JADX INFO: renamed from: f */
    public int f14825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkGetChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14824e = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14823d = obj;
        this.f14825f |= Integer.MIN_VALUE;
        return this.f14824e.m7140g(null, null, this);
    }
}
