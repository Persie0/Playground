package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultPlaylistFolder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {262, 266, 269}, m4293m = "syncAddPlaylist", m4294v = 2)
final class PlaylistRepositoryImpl$syncAddPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16048a;

    /* JADX INFO: renamed from: b */
    public Integer f16049b;

    /* JADX INFO: renamed from: c */
    public String f16050c;

    /* JADX INFO: renamed from: d */
    public ResultPlaylistFolder f16051d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16052e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1302r f16053f;

    /* JADX INFO: renamed from: g */
    public int f16054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$syncAddPlaylist$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16053f = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16052e = obj;
        this.f16054g |= Integer.MIN_VALUE;
        return this.f16053f.m7366z(null, null, null, null, null, this);
    }
}
