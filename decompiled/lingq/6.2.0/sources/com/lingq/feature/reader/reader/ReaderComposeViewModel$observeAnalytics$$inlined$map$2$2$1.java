package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29976a;

    /* JADX INFO: renamed from: b */
    public int f29977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f29978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeAnalytics$$inlined$map$2$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f29978c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29976a = obj;
        this.f29977b |= Integer.MIN_VALUE;
        return this.f29978c.emit(null, this);
    }
}
