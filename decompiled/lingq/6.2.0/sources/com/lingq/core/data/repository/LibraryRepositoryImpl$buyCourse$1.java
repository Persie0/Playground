package com.lingq.core.data.repository;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl", m4291f = "LibraryRepositoryImpl.kt", m4292l = {466, 468, 470, 477, 478, 479}, m4293m = "buyCourse", m4294v = 2)
final class LibraryRepositoryImpl$buyCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15690a;

    /* JADX INFO: renamed from: b */
    public ArrayList f15691b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1296l f15693d;

    /* JADX INFO: renamed from: e */
    public int f15694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$buyCourse$1(C1296l c1296l, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15693d = c1296l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15692c = obj;
        this.f15694e |= Integer.MIN_VALUE;
        return this.f15693d.m7307b(0, null, this);
    }
}
