package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.CourseUpdateBlacklistWorker", m4291f = "CourseUpdateBlacklistWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class CourseUpdateBlacklistWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CourseUpdateBlacklistWorker f16650b;

    /* JADX INFO: renamed from: c */
    public int f16651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseUpdateBlacklistWorker$doWork$1(CourseUpdateBlacklistWorker courseUpdateBlacklistWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16650b = courseUpdateBlacklistWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16649a = obj;
        this.f16651c |= Integer.MIN_VALUE;
        return this.f16650b.mo2213d(this);
    }
}
