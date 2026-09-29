package com.lingq.feature.library.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.domain.ManagePromoBannerServiceImpl$special$$inlined$map$1$2", m4291f = "ManagePromoBannerService.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26644a;

    /* JADX INFO: renamed from: b */
    public int f26645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f26646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f26646c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26644a = obj;
        this.f26645b |= Integer.MIN_VALUE;
        return this.f26646c.emit(null, this);
    }
}
