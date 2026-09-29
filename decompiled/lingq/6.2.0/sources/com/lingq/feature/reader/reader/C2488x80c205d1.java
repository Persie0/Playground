package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.iv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2488x80c205d1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30044a;

    /* JADX INFO: renamed from: b */
    public int f30045b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iv7 f30046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488x80c205d1(iv7 iv7Var, Continuation continuation) {
        super(continuation);
        this.f30046c = iv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30044a = obj;
        this.f30045b |= Integer.MIN_VALUE;
        return this.f30046c.emit(null, this);
    }
}
