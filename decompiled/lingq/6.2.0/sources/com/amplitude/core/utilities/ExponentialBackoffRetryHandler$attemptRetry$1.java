package com.amplitude.core.utilities;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.ExponentialBackoffRetryHandler", m4291f = "ExponentialBackoffRetryHandler.kt", m4292l = {51}, m4293m = "attemptRetry")
final class ExponentialBackoffRetryHandler$attemptRetry$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0914b f11214a;

    /* JADX INFO: renamed from: b */
    public Object f11215b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f11216c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0914b f11217d;

    /* JADX INFO: renamed from: e */
    public int f11218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExponentialBackoffRetryHandler$attemptRetry$1(C0914b c0914b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11217d = c0914b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11216c = obj;
        this.f11218e |= Integer.MIN_VALUE;
        return this.f11217d.m5167a(null, this);
    }
}
