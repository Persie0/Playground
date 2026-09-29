package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.iz3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.Amplitude", m4291f = "Amplitude.kt", m4292l = {108}, m4293m = "buildInternal$suspendImpl")
final class Amplitude$buildInternal$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0879a f10751a;

    /* JADX INFO: renamed from: b */
    public iz3 f10752b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10753c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0879a f10754d;

    /* JADX INFO: renamed from: e */
    public int f10755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Amplitude$buildInternal$1(C0879a c0879a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10754d = c0879a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10753c = obj;
        this.f10755e |= Integer.MIN_VALUE;
        return C0879a.m5059m(this.f10754d, null, this);
    }
}
