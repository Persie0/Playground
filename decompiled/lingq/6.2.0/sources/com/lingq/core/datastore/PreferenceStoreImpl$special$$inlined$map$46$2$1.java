package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ti7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$46$2", m4291f = "PreferenceStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class PreferenceStoreImpl$special$$inlined$map$46$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17848a;

    /* JADX INFO: renamed from: b */
    public int f17849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ti7 f17850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$special$$inlined$map$46$2$1(ti7 ti7Var, Continuation continuation) {
        super(continuation);
        this.f17850c = ti7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17848a = obj;
        this.f17849b |= Integer.MIN_VALUE;
        return this.f17850c.emit(null, this);
    }
}
