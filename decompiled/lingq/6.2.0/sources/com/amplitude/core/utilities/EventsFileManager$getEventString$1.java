package com.amplitude.core.utilities;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c76;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.utilities.EventsFileManager", m4291f = "EventsFileManager.kt", m4292l = {417}, m4293m = "getEventString")
final class EventsFileManager$getEventString$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0913a f11191a;

    /* JADX INFO: renamed from: b */
    public String f11192b;

    /* JADX INFO: renamed from: c */
    public c76 f11193c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f11194d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0913a f11195e;

    /* JADX INFO: renamed from: f */
    public int f11196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsFileManager$getEventString$1(C0913a c0913a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11195e = c0913a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11194d = obj;
        this.f11196f |= Integer.MIN_VALUE;
        return this.f11195e.m5157e(null, this);
    }
}
