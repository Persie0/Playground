package com.lingq.core.common.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.common.network.ConnectivityManagerNetworkMonitor", m4291f = "ConnectivityManagerNetworkMonitor.kt", m4292l = {84}, m4293m = "isOnline", m4294v = 2)
final class ConnectivityManagerNetworkMonitor$isOnline$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1262a f14389b;

    /* JADX INFO: renamed from: c */
    public int f14390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityManagerNetworkMonitor$isOnline$2(C1262a c1262a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14389b = c1262a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14388a = obj;
        this.f14390c |= Integer.MIN_VALUE;
        return this.f14389b.m7045a(this);
    }
}
