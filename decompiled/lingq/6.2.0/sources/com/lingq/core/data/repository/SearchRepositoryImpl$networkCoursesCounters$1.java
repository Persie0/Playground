package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {171, 175}, m4293m = "networkCoursesCounters", m4294v = 2)
final class SearchRepositoryImpl$networkCoursesCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1305u f16097b;

    /* JADX INFO: renamed from: c */
    public int f16098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkCoursesCounters$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16097b = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16096a = obj;
        this.f16098c |= Integer.MIN_VALUE;
        return this.f16097b.m7371b(null, null, this);
    }
}
