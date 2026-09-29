package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.pm7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$9$2", m4291f = "ProfileStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ProfileStoreImpl$special$$inlined$map$9$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17997a;

    /* JADX INFO: renamed from: b */
    public int f17998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pm7 f17999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$special$$inlined$map$9$2$1(pm7 pm7Var, Continuation continuation) {
        super(continuation);
        this.f17999c = pm7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17997a = obj;
        this.f17998b |= Integer.MIN_VALUE;
        return this.f17999c.emit(null, this);
    }
}
