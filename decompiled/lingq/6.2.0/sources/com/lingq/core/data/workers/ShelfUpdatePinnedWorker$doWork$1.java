package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.ShelfUpdatePinnedWorker", m4291f = "ShelfUpdatePinnedWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class ShelfUpdatePinnedWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShelfUpdatePinnedWorker f16807b;

    /* JADX INFO: renamed from: c */
    public int f16808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShelfUpdatePinnedWorker$doWork$1(ShelfUpdatePinnedWorker shelfUpdatePinnedWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16807b = shelfUpdatePinnedWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16806a = obj;
        this.f16808c |= Integer.MIN_VALUE;
        return this.f16807b.mo2213d(this);
    }
}
