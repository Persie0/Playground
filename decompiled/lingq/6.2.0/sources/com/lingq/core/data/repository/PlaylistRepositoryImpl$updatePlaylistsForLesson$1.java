package com.lingq.core.data.repository;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {837, 837, 841, 842, 844, 848}, m4293m = "updatePlaylistsForLesson", m4294v = 2)
final class PlaylistRepositoryImpl$updatePlaylistsForLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16071a;

    /* JADX INFO: renamed from: b */
    public ArrayList f16072b;

    /* JADX INFO: renamed from: c */
    public Iterator f16073c;

    /* JADX INFO: renamed from: d */
    public int f16074d;

    /* JADX INFO: renamed from: e */
    public int f16075e;

    /* JADX INFO: renamed from: f */
    public int f16076f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1302r f16078h;

    /* JADX INFO: renamed from: i */
    public int f16079i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$updatePlaylistsForLesson$1(C1302r c1302r, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16078h = c1302r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16077g = obj;
        this.f16079i |= Integer.MIN_VALUE;
        return this.f16078h.m7342C(0, null, this);
    }
}
