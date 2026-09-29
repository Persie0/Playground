package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoProgressForSaving$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeVideoProgressForSaving$$inlined$map$1$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2581xb7adad0e extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31252a;

    /* JADX INFO: renamed from: b */
    public int f31253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f31254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2581xb7adad0e(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f31254c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31252a = obj;
        this.f31253b |= Integer.MIN_VALUE;
        return this.f31254c.emit(null, this);
    }
}
