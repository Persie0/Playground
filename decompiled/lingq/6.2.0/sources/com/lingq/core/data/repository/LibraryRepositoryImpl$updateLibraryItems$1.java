package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.Results;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {121, 126, 159, 181}, m4293m = "updateLibraryItems", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryItems$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15767a;

    /* JADX INFO: renamed from: b */
    public String f15768b;

    /* JADX INFO: renamed from: c */
    public String f15769c;

    /* JADX INFO: renamed from: d */
    public Results f15770d;

    /* JADX INFO: renamed from: e */
    public boolean f15771e;

    /* JADX INFO: renamed from: f */
    public int f15772f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f15773g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1296l f15774h;

    /* JADX INFO: renamed from: i */
    public int f15775i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryItems$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15774h = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15773g = obj;
        this.f15775i |= Integer.MIN_VALUE;
        return this.f15774h.m7323r(null, null, null, false, null, null, null, null, 0, this);
    }
}
