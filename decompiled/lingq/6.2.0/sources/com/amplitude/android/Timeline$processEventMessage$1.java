package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Timeline", m4291f = "Timeline.kt", m4292l = {88, 90, 93, 97}, m4293m = "processEventMessage")
final class Timeline$processEventMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0882d f10767a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0882d f10769c;

    /* JADX INFO: renamed from: d */
    public int f10770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$processEventMessage$1(C0882d c0882d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10769c = c0882d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10768b = obj;
        this.f10770d |= Integer.MIN_VALUE;
        return C0882d.m5063O(this.f10769c, null, this);
    }
}
