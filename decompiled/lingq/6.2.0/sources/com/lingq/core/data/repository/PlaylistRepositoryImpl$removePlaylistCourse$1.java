package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.bd7;
import p000.c32;
import p000.u85;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {676, 682, 684, 687}, m4293m = "removePlaylistCourse", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16002a;

    /* JADX INFO: renamed from: b */
    public String f16003b;

    /* JADX INFO: renamed from: c */
    public u85 f16004c;

    /* JADX INFO: renamed from: d */
    public bd7 f16005d;

    /* JADX INFO: renamed from: e */
    public int f16006e;

    /* JADX INFO: renamed from: f */
    public int f16007f;

    /* JADX INFO: renamed from: g */
    public int f16008g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16009h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1302r f16010i;

    /* JADX INFO: renamed from: j */
    public int f16011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistCourse$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16010i = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16009h = obj;
        this.f16011j |= Integer.MIN_VALUE;
        return this.f16010i.m7360t(0, 0, null, null, this);
    }
}
