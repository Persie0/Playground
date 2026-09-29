package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$1$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderVideoComposeViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31282a;

    /* JADX INFO: renamed from: b */
    public int f31283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f31284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$special$$inlined$map$1$2$1(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f31284c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31282a = obj;
        this.f31283b |= Integer.MIN_VALUE;
        return this.f31284c.emit(null, this);
    }
}
