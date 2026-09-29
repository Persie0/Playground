package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {170, 178, 180}, m4293m = "addPlaylist", m4294v = 2)
final class PlaylistRepositoryImpl$addPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15871a;

    /* JADX INFO: renamed from: b */
    public String f15872b;

    /* JADX INFO: renamed from: c */
    public Integer f15873c;

    /* JADX INFO: renamed from: d */
    public String f15874d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15875e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1302r f15876f;

    /* JADX INFO: renamed from: g */
    public int f15877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylist$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15876f = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15875e = obj;
        this.f15877g |= Integer.MIN_VALUE;
        return this.f15876f.m7343c(null, null, null, null, this);
    }
}
