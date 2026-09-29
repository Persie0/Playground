package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {230, 233}, m4293m = "updateLibraryPlaylists", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryPlaylists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15785a;

    /* JADX INFO: renamed from: b */
    public String f15786b;

    /* JADX INFO: renamed from: c */
    public String f15787c;

    /* JADX INFO: renamed from: d */
    public List f15788d;

    /* JADX INFO: renamed from: e */
    public int f15789e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15790f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1296l f15791g;

    /* JADX INFO: renamed from: h */
    public int f15792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryPlaylists$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15791g = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15790f = obj;
        this.f15792h |= Integer.MIN_VALUE;
        return this.f15791g.m7324s(0, null, null, null, null, this);
    }
}
