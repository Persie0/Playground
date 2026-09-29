package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {743, 749, 755, 761}, m4293m = "updatePlaylistLessonPosition", m4294v = 2)
final class PlaylistRepositoryImpl$updatePlaylistLessonPosition$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16063a;

    /* JADX INFO: renamed from: b */
    public int f16064b;

    /* JADX INFO: renamed from: c */
    public int f16065c;

    /* JADX INFO: renamed from: d */
    public int f16066d;

    /* JADX INFO: renamed from: e */
    public boolean f16067e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16068f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f16069g;

    /* JADX INFO: renamed from: h */
    public int f16070h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$updatePlaylistLessonPosition$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16069g = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16068f = obj;
        this.f16070h |= Integer.MIN_VALUE;
        return C1302r.m7339b(this.f16069g, null, 0, false, 0, 0, this);
    }
}
