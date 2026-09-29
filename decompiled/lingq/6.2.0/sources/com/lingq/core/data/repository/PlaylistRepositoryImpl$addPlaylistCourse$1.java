package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {144, 161}, m4293m = "addPlaylistCourse", m4294v = 2)
final class PlaylistRepositoryImpl$addPlaylistCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15878a;

    /* JADX INFO: renamed from: b */
    public String f15879b;

    /* JADX INFO: renamed from: c */
    public String f15880c;

    /* JADX INFO: renamed from: d */
    public int f15881d;

    /* JADX INFO: renamed from: e */
    public int f15882e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15883f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f15884g;

    /* JADX INFO: renamed from: h */
    public int f15885h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylistCourse$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15884g = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15883f = obj;
        this.f15885h |= Integer.MIN_VALUE;
        return this.f15884g.m7344d(0, 0, null, null, null, this);
    }
}
