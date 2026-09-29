package com.lingq.feature.reader.video.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$observeTimestamps$$inlined$map$1$2", m4291f = "VideoContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31473a;

    /* JADX INFO: renamed from: b */
    public int f31474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f31475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$observeTimestamps$$inlined$map$1$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f31475c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31473a = obj;
        this.f31474b |= Integer.MIN_VALUE;
        return this.f31475c.emit(null, this);
    }
}
