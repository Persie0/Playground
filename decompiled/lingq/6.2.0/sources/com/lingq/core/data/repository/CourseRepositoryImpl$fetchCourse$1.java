package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLibraryItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CourseRepositoryImpl", m4291f = "CourseRepositoryImpl.kt", m4292l = {84, 87}, m4293m = "fetchCourse", m4294v = 2)
final class CourseRepositoryImpl$fetchCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLibraryItem f15036a;

    /* JADX INFO: renamed from: b */
    public int f15037b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1290f f15039d;

    /* JADX INFO: renamed from: e */
    public int f15040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$fetchCourse$1(C1290f c1290f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15039d = c1290f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15038c = obj;
        this.f15040e |= Integer.MIN_VALUE;
        return this.f15039d.m7179c(0, null, this);
    }
}
