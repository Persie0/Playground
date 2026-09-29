package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1447, 1459, 1461}, m4293m = "importUserLessonFile", m4294v = 2)
final class LessonRepositoryImpl$importUserLessonFile$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f15432a;

    /* JADX INFO: renamed from: b */
    public int f15433b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15434c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15435d;

    /* JADX INFO: renamed from: e */
    public int f15436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$importUserLessonFile$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15435d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15434c = obj;
        this.f15436e |= Integer.MIN_VALUE;
        return this.f15435d.m7249G(null, null, null, null, null, 0, null, this);
    }
}
