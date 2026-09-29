package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {791, 794, 795}, m4293m = "fetchLessonInfoUrl", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonInfoUrl$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f15348a;

    /* JADX INFO: renamed from: b */
    public int f15349b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15350c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15351d;

    /* JADX INFO: renamed from: e */
    public int f15352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonInfoUrl$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15351d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15350c = obj;
        this.f15352e |= Integer.MIN_VALUE;
        return this.f15351d.m7296q(0, null, this);
    }
}
