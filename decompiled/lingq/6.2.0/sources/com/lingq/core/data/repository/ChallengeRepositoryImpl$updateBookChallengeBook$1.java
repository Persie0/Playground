package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {255, 262}, m4293m = "updateBookChallengeBook", m4294v = 2)
final class ChallengeRepositoryImpl$updateBookChallengeBook$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14868a;

    /* JADX INFO: renamed from: b */
    public String f14869b;

    /* JADX INFO: renamed from: c */
    public int f14870c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14871d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1288d f14872e;

    /* JADX INFO: renamed from: f */
    public int f14873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$updateBookChallengeBook$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14872e = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14871d = obj;
        this.f14873f |= Integer.MIN_VALUE;
        return this.f14872e.m7149p(null, null, 0, null, this);
    }
}
