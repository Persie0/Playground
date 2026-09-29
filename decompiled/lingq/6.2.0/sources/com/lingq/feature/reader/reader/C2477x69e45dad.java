package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeContentReadiness$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeContentReadiness$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2477x69e45dad extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29990a;

    /* JADX INFO: renamed from: b */
    public int f29991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f29992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2477x69e45dad(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f29992c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29990a = obj;
        this.f29991b |= Integer.MIN_VALUE;
        return this.f29992c.emit(null, this);
    }
}
