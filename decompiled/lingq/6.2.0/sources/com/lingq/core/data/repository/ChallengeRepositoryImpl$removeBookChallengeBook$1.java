package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChallengeRepositoryImpl", m4291f = "ChallengeRepositoryImpl.kt", m4292l = {270, 273}, m4293m = "removeBookChallengeBook", m4294v = 2)
final class ChallengeRepositoryImpl$removeBookChallengeBook$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14855a;

    /* JADX INFO: renamed from: b */
    public String f14856b;

    /* JADX INFO: renamed from: c */
    public int f14857c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14858d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1288d f14859e;

    /* JADX INFO: renamed from: f */
    public int f14860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeRepositoryImpl$removeBookChallengeBook$1(C1288d c1288d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14859e = c1288d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14858d = obj;
        this.f14860f |= Integer.MIN_VALUE;
        return this.f14859e.m7147n(0, null, null, this);
    }
}
