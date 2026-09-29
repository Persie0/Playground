package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {128, 131}, m4293m = "fetchVocabularyCourses", m4294v = 2)
final class CourseRepositoryImpl$fetchVocabularyCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15041a;

    /* JADX INFO: renamed from: b */
    public Results f15042b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15043c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1290f f15044d;

    /* JADX INFO: renamed from: e */
    public int f15045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$fetchVocabularyCourses$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15044d = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15043c = obj;
        this.f15045e |= Integer.MIN_VALUE;
        return this.f15044d.m7180d(null, this);
    }
}
