package com.amplitude.core.platform.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b90;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", m4291f = "IdentifyInterceptor.kt", m4292l = {52, 59, 65, 70, 81}, m4293m = "intercept")
final class IdentifyInterceptor$intercept$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f11121a;

    /* JADX INFO: renamed from: b */
    public b90 f11122b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f11123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0909b f11124d;

    /* JADX INFO: renamed from: e */
    public int f11125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyInterceptor$intercept$1(C0909b c0909b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11124d = c0909b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11123c = obj;
        this.f11125e |= Integer.MIN_VALUE;
        return this.f11124d.m5140a(null, this);
    }
}
