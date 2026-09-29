package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {798, 802, 815}, m4293m = "fetchCoursePlaylistLessons", m4294v = 2)
final class PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15942a;

    /* JADX INFO: renamed from: b */
    public List f15943b;

    /* JADX INFO: renamed from: c */
    public int f15944c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15945d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1302r f15946e;

    /* JADX INFO: renamed from: f */
    public int f15947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchCoursePlaylistLessons$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15946e = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15945d = obj;
        this.f15947f |= Integer.MIN_VALUE;
        return this.f15946e.m7352l(0, null, this);
    }
}
