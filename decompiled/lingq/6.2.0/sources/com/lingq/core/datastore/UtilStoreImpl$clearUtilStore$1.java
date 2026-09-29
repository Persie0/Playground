package com.lingq.core.datastore;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.UtilStoreImpl", m4291f = "UtilStore.kt", m4292l = {176, 177, 178, 179, 180, 181, 182, 183, 184}, m4293m = "clearUtilStore", m4294v = 2)
final class UtilStoreImpl$clearUtilStore$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1371d f18211b;

    /* JADX INFO: renamed from: c */
    public int f18212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$clearUtilStore$1(C1371d c1371d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18211b = c1371d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18210a = obj;
        this.f18212c |= Integer.MIN_VALUE;
        return this.f18211b.m7961a(this);
    }
}
