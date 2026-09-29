package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wma;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl$special$$inlined$map$2$2", m4291f = "UtilStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class UtilStoreImpl$special$$inlined$map$2$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18276a;

    /* JADX INFO: renamed from: b */
    public int f18277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wma f18278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$special$$inlined$map$2$2$1(wma wmaVar, Continuation continuation) {
        super(continuation);
        this.f18278c = wmaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18276a = obj;
        this.f18277b |= Integer.MIN_VALUE;
        return this.f18278c.emit(null, this);
    }
}
