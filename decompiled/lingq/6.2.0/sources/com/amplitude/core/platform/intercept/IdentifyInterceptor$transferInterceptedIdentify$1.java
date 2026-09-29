package com.amplitude.core.platform.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", m4291f = "IdentifyInterceptor.kt", m4292l = {92}, m4293m = "transferInterceptedIdentify")
final class IdentifyInterceptor$transferInterceptedIdentify$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0909b f11132a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0909b f11134c;

    /* JADX INFO: renamed from: d */
    public int f11135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptor$transferInterceptedIdentify$1(C0909b c0909b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11134c = c0909b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11133b = obj;
        this.f11135d |= Integer.MIN_VALUE;
        return this.f11134c.m5142c(this);
    }
}
