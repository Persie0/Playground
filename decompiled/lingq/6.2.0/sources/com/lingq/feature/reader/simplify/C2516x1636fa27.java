package com.lingq.feature.reader.simplify;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$map$2$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$map$2$2", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2516x1636fa27 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30482a;

    /* JADX INFO: renamed from: b */
    public int f30483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f30484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2516x1636fa27(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f30484c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30482a = obj;
        this.f30483b |= Integer.MIN_VALUE;
        return this.f30484c.emit(null, this);
    }
}
