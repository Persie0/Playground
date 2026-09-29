package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLessonInfo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {772, 773, 774}, m4293m = "fetchLessonInfo", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonInfo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLessonInfo f15342a;

    /* JADX INFO: renamed from: b */
    public int f15343b;

    /* JADX INFO: renamed from: c */
    public boolean f15344c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15345d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15346e;

    /* JADX INFO: renamed from: f */
    public int f15347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonInfo$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15346e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15345d = obj;
        this.f15347f |= Integer.MIN_VALUE;
        return this.f15346e.m7294p(null, 0, false, this);
    }
}
