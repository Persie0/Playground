package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl", m4291f = "SearchRepositoryImpl.kt", m4292l = {326, 332}, m4293m = "networkLoadLessons", m4294v = 2)
final class SearchRepositoryImpl$networkLoadLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16136a;

    /* JADX INFO: renamed from: b */
    public List f16137b;

    /* JADX INFO: renamed from: c */
    public Iterator f16138c;

    /* JADX INFO: renamed from: d */
    public int f16139d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16140e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1305u f16141f;

    /* JADX INFO: renamed from: g */
    public int f16142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLessons$1(C1305u c1305u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16141f = c1305u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16140e = obj;
        this.f16142g |= Integer.MIN_VALUE;
        return this.f16141f.m7376g(null, null, this);
    }
}
