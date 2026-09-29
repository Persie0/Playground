package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {612, 621}, m4293m = "removePlaylistLesson", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16012a;

    /* JADX INFO: renamed from: b */
    public String f16013b;

    /* JADX INFO: renamed from: c */
    public String f16014c;

    /* JADX INFO: renamed from: d */
    public Integer f16015d;

    /* JADX INFO: renamed from: e */
    public int f16016e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16017f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f16018g;

    /* JADX INFO: renamed from: h */
    public int f16019h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16018g = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16017f = obj;
        this.f16019h |= Integer.MIN_VALUE;
        return this.f16018g.m7363w(null, null, null, 0, null, this);
    }
}
