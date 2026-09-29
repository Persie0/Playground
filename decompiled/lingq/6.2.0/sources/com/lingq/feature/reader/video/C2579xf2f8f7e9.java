package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoPosition$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoPosition$$inlined$map$1$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2579xf2f8f7e9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31241a;

    /* JADX INFO: renamed from: b */
    public int f31242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f31243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579xf2f8f7e9(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f31243c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31241a = obj;
        this.f31242b |= Integer.MIN_VALUE;
        return this.f31243c.emit(null, this);
    }
}
