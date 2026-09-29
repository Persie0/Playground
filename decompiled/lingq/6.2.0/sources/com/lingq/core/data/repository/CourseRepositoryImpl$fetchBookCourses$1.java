package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {227}, m4293m = "fetchBookCourses", m4294v = 2)
final class CourseRepositoryImpl$fetchBookCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1290f f15028b;

    /* JADX INFO: renamed from: c */
    public int f15029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$fetchBookCourses$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15028b = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15027a = obj;
        this.f15029c |= Integer.MIN_VALUE;
        return this.f15028b.m7177a(null, null, null, this);
    }
}
