package com.lingq.feature.karaoke;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel", m4291f = "KaraokeViewModel.kt", m4292l = {272, 274}, m4293m = "enableSentenceMode", m4294v = 2)
final class KaraokeViewModel$enableSentenceMode$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26258b;

    /* JADX INFO: renamed from: c */
    public int f26259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$enableSentenceMode$1(C2118c c2118c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26258b = c2118c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26257a = obj;
        this.f26259c |= Integer.MIN_VALUE;
        return this.f26258b.m9030V2(null, this);
    }
}
