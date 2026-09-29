package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.iv7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$map$3$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ReaderComposeViewModel$special$$inlined$map$3$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30101a;

    /* JADX INFO: renamed from: b */
    public int f30102b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iv7 f30103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$special$$inlined$map$3$2$1(iv7 iv7Var, Continuation continuation) {
        super(continuation);
        this.f30103c = iv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30101a = obj;
        this.f30102b |= Integer.MIN_VALUE;
        return this.f30103c.emit(null, this);
    }
}
