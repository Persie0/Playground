package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wma;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$1$2", m4291f = "UtilStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class UtilStoreImpl$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18255a;

    /* JADX INFO: renamed from: b */
    public int f18256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wma f18257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$special$$inlined$map$1$2$1(wma wmaVar, Continuation continuation) {
        super(continuation);
        this.f18257c = wmaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18255a = obj;
        this.f18256b |= Integer.MIN_VALUE;
        return this.f18257c.emit(null, this);
    }
}
