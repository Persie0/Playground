package com.lingq.core.data.repository;

import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {362, 369}, m4293m = "fetchCoursePageLessonsSearch", m4294v = 2)
final class LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Sort f15713a;

    /* JADX INFO: renamed from: b */
    public Results f15714b;

    /* JADX INFO: renamed from: c */
    public int f15715c;

    /* JADX INFO: renamed from: d */
    public int f15716d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1296l f15718f;

    /* JADX INFO: renamed from: g */
    public int f15719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchCoursePageLessonsSearch$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15718f = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15717e = obj;
        this.f15719g |= Integer.MIN_VALUE;
        return this.f15718f.m7310e(null, 0, null, null, 0, this);
    }
}
