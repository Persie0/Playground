package com.amplitude.core.utilities;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c76;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.utilities.EventsFileManager", m4291f = "EventsFileManager.kt", m4292l = {417}, m4293m = "handleV1Files")
final class EventsFileManager$handleV1Files$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0913a f11197a;

    /* JADX INFO: renamed from: b */
    public c76 f11198b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f11199c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0913a f11200d;

    /* JADX INFO: renamed from: e */
    public int f11201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsFileManager$handleV1Files$1(C0913a c0913a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f11200d = c0913a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11199c = obj;
        this.f11201e |= Integer.MIN_VALUE;
        return C0913a.m5153a(this.f11200d, this);
    }
}
