package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {950}, m4293m = "dispatchAddPlaylistWorker", m4294v = 2)
final class PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15929a;

    /* JADX INFO: renamed from: b */
    public String f15930b;

    /* JADX INFO: renamed from: c */
    public Integer f15931c;

    /* JADX INFO: renamed from: d */
    public String f15932d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15933e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1302r f15934f;

    /* JADX INFO: renamed from: g */
    public int f15935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$dispatchAddPlaylistWorker$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15934f = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15933e = obj;
        this.f15935g |= Integer.MIN_VALUE;
        return this.f15934f.m7349i(null, null, null, null, this);
    }
}
