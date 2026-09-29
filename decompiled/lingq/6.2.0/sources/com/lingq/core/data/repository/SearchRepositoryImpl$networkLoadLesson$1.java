package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {107, 109}, m4293m = "networkLoadLesson", m4294v = 2)
final class SearchRepositoryImpl$networkLoadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16123a;

    /* JADX INFO: renamed from: b */
    public int f16124b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16125c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1305u f16126d;

    /* JADX INFO: renamed from: e */
    public int f16127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLesson$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16126d = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16125c = obj;
        this.f16127e |= Integer.MIN_VALUE;
        return this.f16126d.m7375f(0, null, this);
    }
}
