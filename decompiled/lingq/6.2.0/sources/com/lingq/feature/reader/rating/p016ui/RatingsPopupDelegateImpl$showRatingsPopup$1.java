package com.lingq.feature.reader.rating.p016ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.rating.ui.RatingsPopupDelegateImpl", m4291f = "RatingsPopupDelegate.kt", m4292l = {86, 92}, m4293m = "showRatingsPopup", m4294v = 2)
final class RatingsPopupDelegateImpl$showRatingsPopup$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f29923a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2475b f29925c;

    /* JADX INFO: renamed from: d */
    public int f29926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsPopupDelegateImpl$showRatingsPopup$1(C2475b c2475b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29925c = c2475b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29924b = obj;
        this.f29926d |= Integer.MIN_VALUE;
        return this.f29925c.m9387a(false, this);
    }
}
