package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseGiveRoseWorker", m4291f = "CourseGiveRoseWorker.kt", m4292l = {22}, m4293m = "doWork", m4294v = 2)
final class CourseGiveRoseWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseGiveRoseWorker f16634b;

    /* JADX INFO: renamed from: c */
    public int f16635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseGiveRoseWorker$doWork$1(CourseGiveRoseWorker courseGiveRoseWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16634b = courseGiveRoseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16633a = obj;
        this.f16635c |= Integer.MIN_VALUE;
        return this.f16634b.mo2213d(this);
    }
}
