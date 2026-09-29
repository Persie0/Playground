package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {98, 100, 120}, m4293m = "loadMyCourses", m4294v = 2)
final class CourseRepositoryImpl$loadMyCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15051a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1290f f15053c;

    /* JADX INFO: renamed from: d */
    public int f15054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$loadMyCourses$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15053c = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15052b = obj;
        this.f15054d |= Integer.MIN_VALUE;
        return this.f15053c.m7181e(null, this);
    }
}
