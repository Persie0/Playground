package com.amplitude.android;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Timeline", m4291f = "Timeline.kt", m4292l = {176, 177}, m4293m = "startNewSession")
final class Timeline$startNewSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0882d f10775a;

    /* JADX INFO: renamed from: b */
    public List f10776b;

    /* JADX INFO: renamed from: c */
    public long f10777c;

    /* JADX INFO: renamed from: d */
    public boolean f10778d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f10779e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0882d f10780f;

    /* JADX INFO: renamed from: g */
    public int f10781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$startNewSession$1(C0882d c0882d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10780f = c0882d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10779e = obj;
        this.f10781g |= Integer.MIN_VALUE;
        return this.f10780f.m5069U(0L, this);
    }
}
