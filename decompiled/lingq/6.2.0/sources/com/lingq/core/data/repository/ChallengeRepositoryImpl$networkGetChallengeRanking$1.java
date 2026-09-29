package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {139, 140, 151}, m4293m = "networkGetChallengeRanking", m4294v = 2)
final class ChallengeRepositoryImpl$networkGetChallengeRanking$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14826a;

    /* JADX INFO: renamed from: b */
    public String f14827b;

    /* JADX INFO: renamed from: c */
    public String f14828c;

    /* JADX INFO: renamed from: d */
    public String f14829d;

    /* JADX INFO: renamed from: e */
    public String f14830e;

    /* JADX INFO: renamed from: f */
    public Set f14831f;

    /* JADX INFO: renamed from: g */
    public Results f14832g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f14833h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1288d f14834i;

    /* JADX INFO: renamed from: j */
    public int f14835j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$networkGetChallengeRanking$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14834i = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14833h = obj;
        this.f14835j |= Integer.MIN_VALUE;
        return this.f14834i.m7141h(null, null, null, null, null, null, this);
    }
}
