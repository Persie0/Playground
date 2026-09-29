package com.lingq.core.data.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.domain.YouTubeFetcher", m4291f = "YoutubeSubtitlesFetcher.kt", m4292l = {46, 59, 68}, m4293m = "getYouTubeData", m4294v = 2)
final class YouTubeFetcher$getYouTubeData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14408a;

    /* JADX INFO: renamed from: b */
    public String f14409b;

    /* JADX INFO: renamed from: c */
    public String f14410c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14411d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1266a f14412e;

    /* JADX INFO: renamed from: f */
    public int f14413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeFetcher$getYouTubeData$1(C1266a c1266a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14412e = c1266a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14411d = obj;
        this.f14413f |= Integer.MIN_VALUE;
        return this.f14412e.m7056d(null, null, null, this);
    }
}
