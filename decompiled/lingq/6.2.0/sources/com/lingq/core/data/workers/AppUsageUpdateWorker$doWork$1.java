package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.AppUsageUpdateWorker", m4291f = "AppUsageUpdateWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class AppUsageUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppUsageUpdateWorker f16594b;

    /* JADX INFO: renamed from: c */
    public int f16595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageUpdateWorker$doWork$1(AppUsageUpdateWorker appUsageUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16594b = appUsageUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16593a = obj;
        this.f16595c |= Integer.MIN_VALUE;
        return this.f16594b.mo2213d(this);
    }
}
