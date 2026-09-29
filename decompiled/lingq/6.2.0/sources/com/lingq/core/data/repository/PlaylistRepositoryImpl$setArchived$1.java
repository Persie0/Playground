package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {76, 78}, m4293m = "setArchived", m4294v = 2)
final class PlaylistRepositoryImpl$setArchived$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1302r f16046b;

    /* JADX INFO: renamed from: c */
    public int f16047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$setArchived$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16046b = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16045a = obj;
        this.f16047c |= Integer.MIN_VALUE;
        return this.f16046b.m7365y(null, 0, false, this);
    }
}
