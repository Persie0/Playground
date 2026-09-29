package com.lingq.core.data.repository;

import com.lingq.core.database.entity.PlaylistEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {328, 337, 339, 341, 342, 344, 347, 358, 360}, m4293m = "fetchPlaylists", m4294v = 2)
final class PlaylistRepositoryImpl$fetchPlaylists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15980a;

    /* JADX INFO: renamed from: b */
    public List f15981b;

    /* JADX INFO: renamed from: c */
    public Iterator f15982c;

    /* JADX INFO: renamed from: d */
    public Iterator f15983d;

    /* JADX INFO: renamed from: e */
    public PlaylistEntity f15984e;

    /* JADX INFO: renamed from: f */
    public PlaylistEntity f15985f;

    /* JADX INFO: renamed from: g */
    public int f15986g;

    /* JADX INFO: renamed from: h */
    public int f15987h;

    /* JADX INFO: renamed from: i */
    public int f15988i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f15989j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1302r f15990k;

    /* JADX INFO: renamed from: l */
    public int f15991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchPlaylists$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15990k = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15989j = obj;
        this.f15991l |= Integer.MIN_VALUE;
        return this.f15990k.m7354n(null, this);
    }
}
