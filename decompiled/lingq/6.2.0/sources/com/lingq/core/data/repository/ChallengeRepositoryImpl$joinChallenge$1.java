package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {84, 86, 89}, m4293m = "joinChallenge", m4294v = 2)
final class ChallengeRepositoryImpl$joinChallenge$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14781a;

    /* JADX INFO: renamed from: b */
    public String f14782b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14783c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1288d f14784d;

    /* JADX INFO: renamed from: e */
    public int f14785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$joinChallenge$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14784d = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14783c = obj;
        this.f14785e |= Integer.MIN_VALUE;
        return this.f14784d.m7135b(null, null, null, null, this);
    }
}
