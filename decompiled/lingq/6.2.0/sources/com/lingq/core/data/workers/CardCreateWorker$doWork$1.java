package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CardCreateWorker", m4291f = "CardCreateWorker.kt", m4292l = {29}, m4293m = "doWork", m4294v = 2)
final class CardCreateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CardCreateWorker f16606b;

    /* JADX INFO: renamed from: c */
    public int f16607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardCreateWorker$doWork$1(CardCreateWorker cardCreateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16606b = cardCreateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16605a = obj;
        this.f16607c |= Integer.MIN_VALUE;
        return this.f16606b.mo2213d(this);
    }
}
