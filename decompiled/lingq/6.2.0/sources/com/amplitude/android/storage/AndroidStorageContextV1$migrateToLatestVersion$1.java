package com.amplitude.android.storage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.storage.AndroidStorageContextV1", m4291f = "AndroidStorageContextV1.kt", m4292l = {120, 126}, m4293m = "migrateToLatestVersion")
final class AndroidStorageContextV1$migrateToLatestVersion$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0897a f10969a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0897a f10971c;

    /* JADX INFO: renamed from: d */
    public int f10972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageContextV1$migrateToLatestVersion$1(C0897a c0897a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10971c = c0897a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10970b = obj;
        this.f10972d |= Integer.MIN_VALUE;
        return this.f10971c.m5095b(this);
    }
}
