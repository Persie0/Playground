package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.om7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.datastore.ProfileStoreImpl$special$$inlined$map$6$2", m4291f = "ProfileStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class ProfileStoreImpl$special$$inlined$map$6$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17991a;

    /* JADX INFO: renamed from: b */
    public int f17992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ om7 f17993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$special$$inlined$map$6$2$1(om7 om7Var, Continuation continuation) {
        super(continuation);
        this.f17993c = om7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17991a = obj;
        this.f17992b |= Integer.MIN_VALUE;
        return this.f17993c.emit(null, this);
    }
}
