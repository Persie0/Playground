package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {984}, m4293m = "dispatchUpdatePlaylistWorker", m4294v = 2)
final class PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15936a;

    /* JADX INFO: renamed from: b */
    public String f15937b;

    /* JADX INFO: renamed from: c */
    public String f15938c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15939d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1302r f15940e;

    /* JADX INFO: renamed from: f */
    public int f15941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$dispatchUpdatePlaylistWorker$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15940e = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15939d = obj;
        this.f15941f |= Integer.MIN_VALUE;
        return this.f15940e.m7351k(null, null, null, this);
    }
}
