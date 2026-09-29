package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseDeleteRoseWorker", m4291f = "CourseDeleteRoseWorker.kt", m4292l = {22}, m4293m = "doWork", m4294v = 2)
final class CourseDeleteRoseWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseDeleteRoseWorker f16630b;

    /* JADX INFO: renamed from: c */
    public int f16631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseDeleteRoseWorker$doWork$1(CourseDeleteRoseWorker courseDeleteRoseWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16630b = courseDeleteRoseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16629a = obj;
        this.f16631c |= Integer.MIN_VALUE;
        return this.f16630b.mo2213d(this);
    }
}
