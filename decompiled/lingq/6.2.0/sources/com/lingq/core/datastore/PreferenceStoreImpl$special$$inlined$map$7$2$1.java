package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.xi7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$7$2", m4291f = "PreferenceStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class PreferenceStoreImpl$special$$inlined$map$7$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17926a;

    /* JADX INFO: renamed from: b */
    public int f17927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xi7 f17928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$special$$inlined$map$7$2$1(xi7 xi7Var, Continuation continuation) {
        super(continuation);
        this.f17928c = xi7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17926a = obj;
        this.f17927b |= Integer.MIN_VALUE;
        return this.f17928c.emit(null, this);
    }
}
