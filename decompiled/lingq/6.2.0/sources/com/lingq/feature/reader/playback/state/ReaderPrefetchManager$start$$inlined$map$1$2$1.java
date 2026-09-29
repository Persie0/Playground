package com.lingq.feature.reader.playback.state;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.state.ReaderPrefetchManager$start$$inlined$map$1$2", m4291f = "ReaderPrefetchManager.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderPrefetchManager$start$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29809a;

    /* JADX INFO: renamed from: b */
    public int f29810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f29811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPrefetchManager$start$$inlined$map$1$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f29811c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29809a = obj;
        this.f29810b |= Integer.MIN_VALUE;
        return this.f29811c.emit(null, this);
    }
}
