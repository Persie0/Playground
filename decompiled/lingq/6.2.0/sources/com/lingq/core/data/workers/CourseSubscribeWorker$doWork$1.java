package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseSubscribeWorker", m4291f = "CourseSubscribeWorker.kt", m4292l = {22}, m4293m = "doWork", m4294v = 2)
final class CourseSubscribeWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseSubscribeWorker f16642b;

    /* JADX INFO: renamed from: c */
    public int f16643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseSubscribeWorker$doWork$1(CourseSubscribeWorker courseSubscribeWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16642b = courseSubscribeWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16641a = obj;
        this.f16643c |= Integer.MIN_VALUE;
        return this.f16642b.mo2213d(this);
    }
}
