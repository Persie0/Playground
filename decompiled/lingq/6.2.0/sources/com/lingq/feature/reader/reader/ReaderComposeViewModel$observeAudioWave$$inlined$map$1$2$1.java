package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29985a;

    /* JADX INFO: renamed from: b */
    public int f29986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f29987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeAudioWave$$inlined$map$1$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f29987c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29985a = obj;
        this.f29986b |= Integer.MIN_VALUE;
        return this.f29987c.emit(null, this);
    }
}
