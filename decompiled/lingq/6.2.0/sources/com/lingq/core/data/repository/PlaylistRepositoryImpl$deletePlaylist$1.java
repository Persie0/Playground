package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {215}, m4293m = "deletePlaylist", m4294v = 2)
final class PlaylistRepositoryImpl$deletePlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15924a;

    /* JADX INFO: renamed from: b */
    public int f15925b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15926c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1302r f15927d;

    /* JADX INFO: renamed from: e */
    public int f15928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$deletePlaylist$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15927d = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15926c = obj;
        this.f15928e |= Integer.MIN_VALUE;
        return this.f15927d.m7348h(0, null, null, this);
    }
}
