package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ChallengeLeaveWorker", m4291f = "ChallengeLeaveWorker.kt", m4292l = {25}, m4293m = "doWork", m4294v = 2)
final class ChallengeLeaveWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeLeaveWorker f16622b;

    /* JADX INFO: renamed from: c */
    public int f16623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeLeaveWorker$doWork$1(ChallengeLeaveWorker challengeLeaveWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16622b = challengeLeaveWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16621a = obj;
        this.f16623c |= Integer.MIN_VALUE;
        return this.f16622b.mo2213d(this);
    }
}
