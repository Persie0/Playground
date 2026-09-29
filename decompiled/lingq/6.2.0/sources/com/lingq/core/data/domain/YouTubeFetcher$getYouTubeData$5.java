package com.lingq.core.data.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.domain.YouTubeFetcher", m4291f = "YoutubeSubtitlesFetcher.kt", m4292l = {95}, m4293m = "getYouTubeData", m4294v = 2)
final class YouTubeFetcher$getYouTubeData$5 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14417a;

    /* JADX INFO: renamed from: b */
    public boolean f14418b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14419c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1266a f14420d;

    /* JADX INFO: renamed from: e */
    public int f14421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeFetcher$getYouTubeData$5(C1266a c1266a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14420d = c1266a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14419c = obj;
        this.f14421e |= Integer.MIN_VALUE;
        return this.f14420d.m7057e(null, false, null, this);
    }
}
