package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.kv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$lambda$1$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeReadingUsageAgainstPlayback$lambda$1$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2489xbd776d4d extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30052a;

    /* JADX INFO: renamed from: b */
    public int f30053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kv7 f30054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489xbd776d4d(kv7 kv7Var, Continuation continuation) {
        super(continuation);
        this.f30054c = kv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30052a = obj;
        this.f30053b |= Integer.MIN_VALUE;
        return this.f30054c.emit(null, this);
    }
}
