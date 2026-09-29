package com.lingq.feature.reader.video;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.o08;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$special$$inlined$map$5$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderVideoComposeViewModel$special$$inlined$map$5$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31297a;

    /* JADX INFO: renamed from: b */
    public int f31298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o08 f31299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$special$$inlined$map$5$2$1(o08 o08Var, Continuation continuation) {
        super(continuation);
        this.f31299c = o08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31297a = obj;
        this.f31298b |= Integer.MIN_VALUE;
        return this.f31299c.emit(null, this);
    }
}
