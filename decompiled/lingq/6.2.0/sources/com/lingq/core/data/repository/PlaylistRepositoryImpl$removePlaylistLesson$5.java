package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {658, 660}, m4293m = "removePlaylistLesson", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistLesson$5 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16032a;

    /* JADX INFO: renamed from: b */
    public String f16033b;

    /* JADX INFO: renamed from: c */
    public int f16034c;

    /* JADX INFO: renamed from: d */
    public int f16035d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16036e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1302r f16037f;

    /* JADX INFO: renamed from: g */
    public int f16038g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$5(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16037f = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16036e = obj;
        this.f16038g |= Integer.MIN_VALUE;
        return this.f16037f.m7361u(0, 0, null, null, this);
    }
}
