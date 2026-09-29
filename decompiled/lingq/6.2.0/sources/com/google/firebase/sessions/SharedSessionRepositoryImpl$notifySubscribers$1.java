package com.google.firebase.sessions;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", m4291f = "SharedSessionRepository.kt", m4292l = {206}, m4293m = "notifySubscribers")
final class SharedSessionRepositoryImpl$notifySubscribers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f13834a;

    /* JADX INFO: renamed from: b */
    public SharedSessionRepositoryImpl$NotificationType f13835b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f13836c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1168d f13837d;

    /* JADX INFO: renamed from: e */
    public int f13838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$notifySubscribers$1(C1168d c1168d, Continuation continuation) {
        super(continuation);
        this.f13837d = c1168d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13836c = obj;
        this.f13838e |= Integer.MIN_VALUE;
        return C1168d.m6756a(this.f13837d, null, null, this);
    }
}
