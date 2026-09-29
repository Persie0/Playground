package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {202, 204, 207}, m4293m = "updateCourseSubscription", m4294v = 2)
final class CourseRepositoryImpl$updateCourseSubscription$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15070a;

    /* JADX INFO: renamed from: b */
    public String f15071b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15072c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1290f f15073d;

    /* JADX INFO: renamed from: e */
    public int f15074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$updateCourseSubscription$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15073d = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15072c = obj;
        this.f15074e |= Integer.MIN_VALUE;
        return this.f15073d.m7187k(0, null, this);
    }
}
