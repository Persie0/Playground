package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.jg8;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$35$2", m4291f = "ReviewStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ReviewStoreImpl$special$$inlined$map$35$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18189a;

    /* JADX INFO: renamed from: b */
    public int f18190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jg8 f18191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$special$$inlined$map$35$2$1(jg8 jg8Var, Continuation continuation) {
        super(continuation);
        this.f18191c = jg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18189a = obj;
        this.f18190b |= Integer.MIN_VALUE;
        return this.f18191c.emit(null, this);
    }
}
