package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ChallengeSignupWorker", m4291f = "ChallengeSignupWorker.kt", m4292l = {29}, m4293m = "doWork", m4294v = 2)
final class ChallengeSignupWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeSignupWorker f16626b;

    /* JADX INFO: renamed from: c */
    public int f16627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeSignupWorker$doWork$1(ChallengeSignupWorker challengeSignupWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16626b = challengeSignupWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16625a = obj;
        this.f16627c |= Integer.MIN_VALUE;
        return this.f16626b.mo2213d(this);
    }
}
