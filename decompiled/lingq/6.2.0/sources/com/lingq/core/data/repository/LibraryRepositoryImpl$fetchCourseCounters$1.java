package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {292, 296}, m4293m = "fetchCourseCounters", m4294v = 2)
final class LibraryRepositoryImpl$fetchCourseCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1296l f15696b;

    /* JADX INFO: renamed from: c */
    public int f15697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchCourseCounters$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15696b = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15695a = obj;
        this.f15697c |= Integer.MIN_VALUE;
        return this.f15696b.m7308c(null, null, this);
    }
}
