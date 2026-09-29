package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.t2b;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.Web2WaveStoreImpl$special$$inlined$map$3$2", m4291f = "Web2WaveStoreImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class Web2WaveStoreImpl$special$$inlined$map$3$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18316a;

    /* JADX INFO: renamed from: b */
    public int f18317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t2b f18318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveStoreImpl$special$$inlined$map$3$2$1(t2b t2bVar, Continuation continuation) {
        super(continuation);
        this.f18318c = t2bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18316a = obj;
        this.f18317b |= Integer.MIN_VALUE;
        return this.f18318c.emit(null, this);
    }
}
