package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1638, 1641}, m4293m = "fetchLessonTags", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonTags$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Results f15362a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15363b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15364c;

    /* JADX INFO: renamed from: d */
    public int f15365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonTags$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15364c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15363b = obj;
        this.f15365d |= Integer.MIN_VALUE;
        return this.f15364c.m7301u(null, this);
    }
}
