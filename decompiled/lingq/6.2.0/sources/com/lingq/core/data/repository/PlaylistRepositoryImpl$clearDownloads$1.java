package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {543, 544, 545}, m4293m = "clearDownloads", m4294v = 2)
final class PlaylistRepositoryImpl$clearDownloads$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1302r f15922b;

    /* JADX INFO: renamed from: c */
    public int f15923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$clearDownloads$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15922b = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15921a = obj;
        this.f15923c |= Integer.MIN_VALUE;
        return this.f15922b.m7347g(this);
    }
}
