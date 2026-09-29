package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {106, 123}, m4293m = "addPlaylistLesson", m4294v = 2)
final class PlaylistRepositoryImpl$addPlaylistLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15886a;

    /* JADX INFO: renamed from: b */
    public String f15887b;

    /* JADX INFO: renamed from: c */
    public String f15888c;

    /* JADX INFO: renamed from: d */
    public int f15889d;

    /* JADX INFO: renamed from: e */
    public int f15890e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15891f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f15892g;

    /* JADX INFO: renamed from: h */
    public int f15893h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylistLesson$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15892g = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15891f = obj;
        this.f15893h |= Integer.MIN_VALUE;
        return this.f15892g.m7345e(0, 0, null, null, null, this);
    }
}
