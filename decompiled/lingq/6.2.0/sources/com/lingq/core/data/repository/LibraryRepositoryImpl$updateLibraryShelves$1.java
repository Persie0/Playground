package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {64, 65, 66}, m4293m = "updateLibraryShelves", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryShelves$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15800a;

    /* JADX INFO: renamed from: b */
    public List f15801b;

    /* JADX INFO: renamed from: c */
    public String f15802c;

    /* JADX INFO: renamed from: d */
    public List f15803d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15804e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1296l f15805f;

    /* JADX INFO: renamed from: g */
    public int f15806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryShelves$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15805f = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15804e = obj;
        this.f15806g |= Integer.MIN_VALUE;
        return this.f15805f.m7325t(null, null, this);
    }
}
