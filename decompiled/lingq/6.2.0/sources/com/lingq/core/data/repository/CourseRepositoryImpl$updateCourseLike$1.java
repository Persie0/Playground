package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {148, 151, 159}, m4293m = "updateCourseLike", m4294v = 2)
final class CourseRepositoryImpl$updateCourseLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15065a;

    /* JADX INFO: renamed from: b */
    public String f15066b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1290f f15068d;

    /* JADX INFO: renamed from: e */
    public int f15069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$updateCourseLike$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15068d = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15067c = obj;
        this.f15069e |= Integer.MIN_VALUE;
        return this.f15068d.m7186j(0, null, this);
    }
}
