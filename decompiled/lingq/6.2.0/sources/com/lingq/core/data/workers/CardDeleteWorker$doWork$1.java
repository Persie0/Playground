package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CardDeleteWorker", m4291f = "CardDeleteWorker.kt", m4292l = {34}, m4293m = "doWork", m4294v = 2)
final class CardDeleteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CardDeleteWorker f16610b;

    /* JADX INFO: renamed from: c */
    public int f16611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeleteWorker$doWork$1(CardDeleteWorker cardDeleteWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16610b = cardDeleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16609a = obj;
        this.f16611c |= Integer.MIN_VALUE;
        return this.f16610b.mo2213d(this);
    }
}
