package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1392, 1394, 1396}, m4293m = "importLesson", m4294v = 2)
final class LessonRepositoryImpl$importLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f15422a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15424c;

    /* JADX INFO: renamed from: d */
    public int f15425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$importLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15424c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15423b = obj;
        this.f15425d |= Integer.MIN_VALUE;
        return this.f15424c.m7247E(null, null, null, this);
    }
}
