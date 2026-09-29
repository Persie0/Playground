package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observePlaybackInterval$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observePlaybackInterval$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2483xb4c39f3e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30022a;

    /* JADX INFO: renamed from: b */
    public int f30023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f30024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2483xb4c39f3e(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f30024c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30022a = obj;
        this.f30023b |= Integer.MIN_VALUE;
        return this.f30024c.emit(null, this);
    }
}
