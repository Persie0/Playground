package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {640, 642}, m4293m = "removePlaylistLesson", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistLesson$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16026a;

    /* JADX INFO: renamed from: b */
    public String f16027b;

    /* JADX INFO: renamed from: c */
    public int f16028c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1302r f16030e;

    /* JADX INFO: renamed from: f */
    public int f16031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$3(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16030e = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16029d = obj;
        this.f16031f |= Integer.MIN_VALUE;
        return this.f16030e.m7362v(0, null, null, this);
    }
}
