package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.xma;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$9$2", m4291f = "UtilStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class UtilStoreImpl$special$$inlined$map$9$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18294a;

    /* JADX INFO: renamed from: b */
    public int f18295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xma f18296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$special$$inlined$map$9$2$1(xma xmaVar, Continuation continuation) {
        super(continuation);
        this.f18296c = xmaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18294a = obj;
        this.f18295b |= Integer.MIN_VALUE;
        return this.f18296c.emit(null, this);
    }
}
