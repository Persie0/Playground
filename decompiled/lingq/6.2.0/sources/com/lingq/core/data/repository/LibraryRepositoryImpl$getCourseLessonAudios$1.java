package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {446}, m4293m = "getCourseLessonAudios", m4294v = 2)
final class LibraryRepositoryImpl$getCourseLessonAudios$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15740a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1296l f15741b;

    /* JADX INFO: renamed from: c */
    public int f15742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$getCourseLessonAudios$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15741b = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15740a = obj;
        this.f15742c |= Integer.MIN_VALUE;
        return this.f15741b.m7312g(0, this);
    }
}
