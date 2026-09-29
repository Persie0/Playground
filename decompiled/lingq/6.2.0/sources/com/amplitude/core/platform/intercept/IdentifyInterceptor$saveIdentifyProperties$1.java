package com.amplitude.core.platform.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", m4291f = "IdentifyInterceptor.kt", m4292l = {114}, m4293m = "saveIdentifyProperties")
final class IdentifyInterceptor$saveIdentifyProperties$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0909b f11126a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0909b f11128c;

    /* JADX INFO: renamed from: d */
    public int f11129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptor$saveIdentifyProperties$1(C0909b c0909b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11128c = c0909b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11127b = obj;
        this.f11129d |= Integer.MIN_VALUE;
        return this.f11128c.m5141b(null, this);
    }
}
