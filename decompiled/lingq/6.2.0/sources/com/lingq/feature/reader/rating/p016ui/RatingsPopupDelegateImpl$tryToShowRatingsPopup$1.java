package com.lingq.feature.reader.rating.p016ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.rating.ui.RatingsPopupDelegateImpl", m4291f = "RatingsPopupDelegate.kt", m4292l = {98, 101, 106, 115, 120, 125}, m4293m = "tryToShowRatingsPopup", m4294v = 2)
final class RatingsPopupDelegateImpl$tryToShowRatingsPopup$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2475b f29931b;

    /* JADX INFO: renamed from: c */
    public int f29932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsPopupDelegateImpl$tryToShowRatingsPopup$1(C2475b c2475b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29931b = c2475b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29930a = obj;
        this.f29932c |= Integer.MIN_VALUE;
        return this.f29931b.mo3012w1(this);
    }
}
