package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1809, 1813, 1820}, m4293m = "updateLessonCounterLike", m4294v = 2)
final class LessonRepositoryImpl$updateLessonCounterLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15599a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15600b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15601c;

    /* JADX INFO: renamed from: d */
    public int f15602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonCounterLike$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15601c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15600b = obj;
        this.f15602d |= Integer.MIN_VALUE;
        return this.f15601c.m7275f0(0, this);
    }
}
