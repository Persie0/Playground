package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {163, 166}, m4293m = "networkCourse", m4294v = 2)
final class SearchRepositoryImpl$networkCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f16092a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1305u f16094c;

    /* JADX INFO: renamed from: d */
    public int f16095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkCourse$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16094c = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16093b = obj;
        this.f16095d |= Integer.MIN_VALUE;
        return this.f16094c.m7370a(0, null, this);
    }
}
