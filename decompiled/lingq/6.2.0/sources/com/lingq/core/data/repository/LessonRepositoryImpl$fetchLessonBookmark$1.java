package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1028, 1029}, m4293m = "fetchLessonBookmark", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonBookmark$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15338a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15340c;

    /* JADX INFO: renamed from: d */
    public int f15341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonBookmark$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15340c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15339b = obj;
        this.f15341d |= Integer.MIN_VALUE;
        return this.f15340c.m7292o(0, null, this);
    }
}
