package com.lingq.feature.reader.video.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2", m4291f = "VideoContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31468a;

    /* JADX INFO: renamed from: b */
    public int f31469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f31470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$observeSentenceTokens$$inlined$map$1$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f31470c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31468a = obj;
        this.f31469b |= Integer.MIN_VALUE;
        return this.f31470c.emit(null, this);
    }
}
