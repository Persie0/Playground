package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ui7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.PreferenceStoreImpl$special$$inlined$map$10$2", m4291f = "PreferenceStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class PreferenceStoreImpl$special$$inlined$map$10$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17731a;

    /* JADX INFO: renamed from: b */
    public int f17732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui7 f17733c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceStoreImpl$special$$inlined$map$10$2$1(ui7 ui7Var, Continuation continuation) {
        super(continuation);
        this.f17733c = ui7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17731a = obj;
        this.f17732b |= Integer.MIN_VALUE;
        return this.f17733c.emit(null, this);
    }
}
