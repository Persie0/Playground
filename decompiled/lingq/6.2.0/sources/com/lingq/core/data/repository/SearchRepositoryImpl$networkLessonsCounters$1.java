package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {96, 100}, m4293m = "networkLessonsCounters", m4294v = 2)
final class SearchRepositoryImpl$networkLessonsCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1305u f16114b;

    /* JADX INFO: renamed from: c */
    public int f16115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLessonsCounters$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16114b = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16113a = obj;
        this.f16115c |= Integer.MIN_VALUE;
        return this.f16114b.m7373d(null, null, this);
    }
}
