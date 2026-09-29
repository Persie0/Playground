package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.b90;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Timeline", m4291f = "Timeline.kt", m4292l = {107, 108, 117, 118, 124}, m4293m = "processEvent")
final class Timeline$processEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0882d f10761a;

    /* JADX INFO: renamed from: b */
    public b90 f10762b;

    /* JADX INFO: renamed from: c */
    public long f10763c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f10764d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0882d f10765e;

    /* JADX INFO: renamed from: f */
    public int f10766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$processEvent$1(C0882d c0882d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10765e = c0882d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10764d = obj;
        this.f10766f |= Integer.MIN_VALUE;
        return this.f10765e.m5066R(null, this);
    }
}
