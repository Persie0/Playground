package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Timeline", m4291f = "Timeline.kt", m4292l = {150, 153}, m4293m = "startNewSessionIfNeeded")
final class Timeline$startNewSessionIfNeeded$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f10782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0882d f10783b;

    /* JADX INFO: renamed from: c */
    public int f10784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$startNewSessionIfNeeded$1(C0882d c0882d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10783b = c0882d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10782a = obj;
        this.f10784c |= Integer.MIN_VALUE;
        return this.f10783b.m5070V(0L, this);
    }
}
