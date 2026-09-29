package com.lingq.core.domain.util;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2", m4291f = "FlowExtensions.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20130a;

    /* JADX INFO: renamed from: b */
    public int f20131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f20132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f20132c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20130a = obj;
        this.f20131b |= Integer.MIN_VALUE;
        return this.f20132c.emit(null, this);
    }
}
