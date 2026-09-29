package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1423, 1425, 1427}, m4293m = "importUserLesson", m4294v = 2)
final class LessonRepositoryImpl$importUserLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f15426a;

    /* JADX INFO: renamed from: b */
    public boolean f15427b;

    /* JADX INFO: renamed from: c */
    public int f15428c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15429d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15430e;

    /* JADX INFO: renamed from: f */
    public int f15431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$importUserLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15430e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15429d = obj;
        this.f15431f |= Integer.MIN_VALUE;
        return this.f15430e.m7248F(null, null, null, null, false, 0, null, null, this);
    }
}
