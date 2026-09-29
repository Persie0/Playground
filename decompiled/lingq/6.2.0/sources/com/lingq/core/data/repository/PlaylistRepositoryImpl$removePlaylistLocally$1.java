package com.lingq.core.data.repository;

import com.lingq.core.database.entity.PlaylistEntity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {228, 230, 231, 233, 236, 237}, m4293m = "removePlaylistLocally", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistLocally$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16039a;

    /* JADX INFO: renamed from: b */
    public String f16040b;

    /* JADX INFO: renamed from: c */
    public PlaylistEntity f16041c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16042d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1302r f16043e;

    /* JADX INFO: renamed from: f */
    public int f16044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLocally$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16043e = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16042d = obj;
        this.f16044f |= Integer.MIN_VALUE;
        return this.f16043e.m7364x(null, null, this);
    }
}
