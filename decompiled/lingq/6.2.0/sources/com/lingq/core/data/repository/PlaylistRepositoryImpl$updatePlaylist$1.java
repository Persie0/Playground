package com.lingq.core.data.repository;

import com.lingq.core.database.entity.PlaylistEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {199, 201, 206}, m4293m = "updatePlaylist", m4294v = 2)
final class PlaylistRepositoryImpl$updatePlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16055a;

    /* JADX INFO: renamed from: b */
    public String f16056b;

    /* JADX INFO: renamed from: c */
    public String f16057c;

    /* JADX INFO: renamed from: d */
    public PlaylistEntity f16058d;

    /* JADX INFO: renamed from: e */
    public int f16059e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16060f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f16061g;

    /* JADX INFO: renamed from: h */
    public int f16062h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$updatePlaylist$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16061g = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16060f = obj;
        this.f16062h |= Integer.MIN_VALUE;
        return this.f16061g.m7341B(null, null, null, this);
    }
}
