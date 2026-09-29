package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {403, 412}, m4293m = "fetchPlaylistLessons", m4294v = 2)
final class PlaylistRepositoryImpl$fetchPlaylistLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15957a;

    /* JADX INFO: renamed from: b */
    public String f15958b;

    /* JADX INFO: renamed from: c */
    public List f15959c;

    /* JADX INFO: renamed from: d */
    public int f15960d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15961e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1302r f15962f;

    /* JADX INFO: renamed from: g */
    public int f15963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchPlaylistLessons$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15962f = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15961e = obj;
        this.f15963g |= Integer.MIN_VALUE;
        return this.f15962f.m7353m(0, null, null, this);
    }
}
