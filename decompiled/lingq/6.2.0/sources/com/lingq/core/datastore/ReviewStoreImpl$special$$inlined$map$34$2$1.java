package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.jg8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$34$2", m4291f = "ReviewStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ReviewStoreImpl$special$$inlined$map$34$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18186a;

    /* JADX INFO: renamed from: b */
    public int f18187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jg8 f18188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$special$$inlined$map$34$2$1(jg8 jg8Var, Continuation continuation) {
        super(continuation);
        this.f18188c = jg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18186a = obj;
        this.f18187b |= Integer.MIN_VALUE;
        return this.f18188c.emit(null, this);
    }
}
