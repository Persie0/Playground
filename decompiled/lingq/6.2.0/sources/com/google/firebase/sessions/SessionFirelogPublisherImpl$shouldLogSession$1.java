package com.google.firebase.sessions;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m4291f = "SessionFirelogPublisher.kt", m4292l = {98, 104}, m4293m = "shouldLogSession")
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1167c f13817b;

    /* JADX INFO: renamed from: c */
    public int f13818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$shouldLogSession$1(C1167c c1167c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13817b = c1167c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13816a = obj;
        this.f13818c |= Integer.MIN_VALUE;
        return C1167c.m6755a(this.f13817b, this);
    }
}
