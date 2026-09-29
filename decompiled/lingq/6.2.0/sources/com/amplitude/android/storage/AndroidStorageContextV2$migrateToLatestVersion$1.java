package com.amplitude.android.storage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.storage.AndroidStorageContextV2", m4291f = "AndroidStorageContextV2.kt", m4292l = {121, 127}, m4293m = "migrateToLatestVersion")
final class AndroidStorageContextV2$migrateToLatestVersion$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0897a f10973a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0897a f10975c;

    /* JADX INFO: renamed from: d */
    public int f10976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidStorageContextV2$migrateToLatestVersion$1(C0897a c0897a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10975c = c0897a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10974b = obj;
        this.f10976d |= Integer.MIN_VALUE;
        return this.f10975c.m5095b(this);
    }
}
