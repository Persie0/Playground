package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.aj3;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImplKt", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {1082}, m4293m = "fetchAllPlaylistLessonPages", m4294v = 2)
final class PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public aj3 f16080a;

    /* JADX INFO: renamed from: b */
    public List f16081b;

    /* JADX INFO: renamed from: c */
    public int f16082c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16083d;

    /* JADX INFO: renamed from: e */
    public int f16084e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16083d = obj;
        this.f16084e |= Integer.MIN_VALUE;
        return AbstractC1303s.m7367a(null, this);
    }
}
