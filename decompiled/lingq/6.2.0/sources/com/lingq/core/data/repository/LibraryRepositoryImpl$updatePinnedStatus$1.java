package com.lingq.core.data.repository;

import com.lingq.core.domain.model.library.LibraryShelf;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {514, 516, 517, 518, 521, 522, 523}, m4293m = "updatePinnedStatus", m4294v = 2)
final class LibraryRepositoryImpl$updatePinnedStatus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15813a;

    /* JADX INFO: renamed from: b */
    public String f15814b;

    /* JADX INFO: renamed from: c */
    public LibraryShelf f15815c;

    /* JADX INFO: renamed from: d */
    public int f15816d;

    /* JADX INFO: renamed from: e */
    public int f15817e;

    /* JADX INFO: renamed from: f */
    public int f15818f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f15819g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1296l f15820h;

    /* JADX INFO: renamed from: i */
    public int f15821i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updatePinnedStatus$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15820h = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15819g = obj;
        this.f15821i |= Integer.MIN_VALUE;
        return this.f15820h.m7326u(null, null, this);
    }
}
