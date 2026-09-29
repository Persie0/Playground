package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ng8;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$8$2", m4291f = "ReviewStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ReviewStoreImpl$special$$inlined$map$8$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18204a;

    /* JADX INFO: renamed from: b */
    public int f18205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ng8 f18206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$special$$inlined$map$8$2$1(ng8 ng8Var, Continuation continuation) {
        super(continuation);
        this.f18206c = ng8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18204a = obj;
        this.f18205b |= Integer.MIN_VALUE;
        return this.f18206c.emit(null, this);
    }
}
