package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1339, 1365}, m4293m = "updateLessonComplete", m4294v = 2)
final class LessonRepositoryImpl$updateLessonComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15589a;

    /* JADX INFO: renamed from: b */
    public int f15590b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15591c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15592d;

    /* JADX INFO: renamed from: e */
    public int f15593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonComplete$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15592d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15591c = obj;
        this.f15593e |= Integer.MIN_VALUE;
        return this.f15592d.m7272d0(0, null, this);
    }
}
