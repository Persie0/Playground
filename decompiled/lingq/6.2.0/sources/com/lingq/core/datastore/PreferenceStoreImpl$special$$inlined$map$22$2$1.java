package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ti7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$22$2", m4291f = "PreferenceStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class PreferenceStoreImpl$special$$inlined$map$22$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17770a;

    /* JADX INFO: renamed from: b */
    public int f17771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ti7 f17772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$special$$inlined$map$22$2$1(ti7 ti7Var, Continuation continuation) {
        super(continuation);
        this.f17772c = ti7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17770a = obj;
        this.f17771b |= Integer.MIN_VALUE;
        return this.f17772c.emit(null, this);
    }
}
