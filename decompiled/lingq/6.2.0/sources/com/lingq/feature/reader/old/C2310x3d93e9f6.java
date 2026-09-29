package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wv7;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$4$invokeSuspend$$inlined$filterNot$1$2$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$4$invokeSuspend$$inlined$filterNot$1$2", m4291f = "ReaderFragment.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2310x3d93e9f6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28378a;

    /* JADX INFO: renamed from: b */
    public int f28379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wv7 f28380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310x3d93e9f6(wv7 wv7Var, Continuation continuation) {
        super(continuation);
        this.f28380c = wv7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28378a = obj;
        this.f28379b |= Integer.MIN_VALUE;
        return this.f28380c.emit(null, this);
    }
}
