package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {57, 59}, m4293m = "setArchived", m4294v = 2)
final class CourseRepositoryImpl$setArchived$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1290f f15063b;

    /* JADX INFO: renamed from: c */
    public int f15064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$setArchived$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15063b = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15062a = obj;
        this.f15064c |= Integer.MIN_VALUE;
        return this.f15063b.m7185i(null, 0, false, this);
    }
}
