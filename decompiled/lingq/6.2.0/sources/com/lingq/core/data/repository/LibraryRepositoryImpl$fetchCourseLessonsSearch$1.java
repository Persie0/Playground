package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {322, 329}, m4293m = "fetchCourseLessonsSearch", m4294v = 2)
final class LibraryRepositoryImpl$fetchCourseLessonsSearch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Results f15698a;

    /* JADX INFO: renamed from: b */
    public int f15699b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15700c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1296l f15701d;

    /* JADX INFO: renamed from: e */
    public int f15702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$fetchCourseLessonsSearch$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15701d = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15700c = obj;
        this.f15702e |= Integer.MIN_VALUE;
        return this.f15701d.m7309d(null, 0, null, null, this);
    }
}
