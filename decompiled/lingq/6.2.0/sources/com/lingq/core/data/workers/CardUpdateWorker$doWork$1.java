package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CardUpdateWorker", m4291f = "CardUpdateWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class CardUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CardUpdateWorker f16618b;

    /* JADX INFO: renamed from: c */
    public int f16619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardUpdateWorker$doWork$1(CardUpdateWorker cardUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16618b = cardUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16617a = obj;
        this.f16619c |= Integer.MIN_VALUE;
        return this.f16618b.mo2213d(this);
    }
}
