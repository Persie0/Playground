package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$6$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderComposeViewModel$special$$inlined$map$6$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30110a;

    /* JADX INFO: renamed from: b */
    public int f30111b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f30112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$special$$inlined$map$6$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f30112c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30110a = obj;
        this.f30111b |= Integer.MIN_VALUE;
        return this.f30112c.emit(null, this);
    }
}
