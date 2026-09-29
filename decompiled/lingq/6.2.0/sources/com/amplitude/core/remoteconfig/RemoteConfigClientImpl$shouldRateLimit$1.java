package com.amplitude.core.remoteconfig;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.remoteconfig.RemoteConfigClientImpl", m4291f = "RemoteConfigClient.kt", m4292l = {209}, m4293m = "shouldRateLimit")
final class RemoteConfigClientImpl$shouldRateLimit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11164a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0912a f11165b;

    /* JADX INFO: renamed from: c */
    public int f11166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClientImpl$shouldRateLimit$1(C0912a c0912a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11165b = c0912a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11164a = obj;
        this.f11166c |= Integer.MIN_VALUE;
        return C0912a.m5148b(this.f11165b, this);
    }
}
