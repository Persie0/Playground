package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.BlacklistClearWorker", m4291f = "BlacklistClearWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class BlacklistClearWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BlacklistClearWorker f16598b;

    /* JADX INFO: renamed from: c */
    public int f16599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistClearWorker$doWork$1(BlacklistClearWorker blacklistClearWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16598b = blacklistClearWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16597a = obj;
        this.f16599c |= Integer.MIN_VALUE;
        return this.f16598b.mo2213d(this);
    }
}
