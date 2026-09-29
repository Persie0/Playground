package com.amplitude.core.platform.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptFileStorageHandler", m4291f = "IdentifyInterceptFileStorageHandler.kt", m4292l = {70}, m4293m = "clearIdentifyIntercepts")
final class IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0908a f11107a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11108b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0908a f11109c;

    /* JADX INFO: renamed from: d */
    public int f11110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptFileStorageHandler$clearIdentifyIntercepts$1(C0908a c0908a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11109c = c0908a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11108b = obj;
        this.f11110d |= Integer.MIN_VALUE;
        return this.f11109c.m5137a(this);
    }
}
