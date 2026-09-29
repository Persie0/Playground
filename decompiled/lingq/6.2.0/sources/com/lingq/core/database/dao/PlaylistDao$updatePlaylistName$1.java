package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.PlaylistDao", m4291f = "PlaylistDao.kt", m4292l = {330, 331}, m4293m = "updatePlaylistName$suspendImpl", m4294v = 2)
final class PlaylistDao$updatePlaylistName$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1322j f16980a;

    /* JADX INFO: renamed from: b */
    public String f16981b;

    /* JADX INFO: renamed from: c */
    public String f16982c;

    /* JADX INFO: renamed from: d */
    public String f16983d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16984e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1322j f16985f;

    /* JADX INFO: renamed from: g */
    public int f16986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDao$updatePlaylistName$1(C1322j c1322j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16985f = c1322j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16984e = obj;
        this.f16986g |= Integer.MIN_VALUE;
        return C1322j.m7513A0(this.f16985f, null, null, null, this);
    }
}
