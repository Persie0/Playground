package com.lingq.feature.reader.video.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$special$$inlined$map$2$2", m4291f = "VideoContentStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class VideoContentStateHolder$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31502a;

    /* JADX INFO: renamed from: b */
    public int f31503b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f31504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$special$$inlined$map$2$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f31504c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31502a = obj;
        this.f31503b |= Integer.MIN_VALUE;
        return this.f31504c.emit(null, this);
    }
}
