package com.lingq.core.premium.delegate;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.delegate.PromoBannerDelegateImpl", m4291f = "PromoBannerDelegate.kt", m4292l = {103, 105}, m4293m = "hidePromoBanner", m4294v = 2)
final class PromoBannerDelegateImpl$hidePromoBanner$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22428a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1844a f22430c;

    /* JADX INFO: renamed from: d */
    public int f22431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoBannerDelegateImpl$hidePromoBanner$1(C1844a c1844a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22430c = c1844a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22429b = obj;
        this.f22431d |= Integer.MIN_VALUE;
        return this.f22430c.mo8578p2(this);
    }
}
