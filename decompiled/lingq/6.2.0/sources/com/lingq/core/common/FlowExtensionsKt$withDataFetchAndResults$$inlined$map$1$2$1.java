package com.lingq.core.common;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2", m4291f = "FlowExtensions.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14366a;

    /* JADX INFO: renamed from: b */
    public int f14367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f14368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f14368c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14366a = obj;
        this.f14367b |= Integer.MIN_VALUE;
        return this.f14368c.emit(null, this);
    }
}
