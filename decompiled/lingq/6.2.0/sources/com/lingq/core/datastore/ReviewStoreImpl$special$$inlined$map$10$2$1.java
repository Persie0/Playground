package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.kg8;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.ReviewStoreImpl$special$$inlined$map$10$2", m4291f = "ReviewStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ReviewStoreImpl$special$$inlined$map$10$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18108a;

    /* JADX INFO: renamed from: b */
    public int f18109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kg8 f18110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStoreImpl$special$$inlined$map$10$2$1(kg8 kg8Var, Continuation continuation) {
        super(continuation);
        this.f18110c = kg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18108a = obj;
        this.f18109b |= Integer.MIN_VALUE;
        return this.f18110c.emit(null, this);
    }
}
