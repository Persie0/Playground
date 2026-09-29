package com.google.firebase.sessions.api;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m4291f = "FirebaseSessionsDependencies.kt", m4292l = {76}, m4293m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Map f13841a;

    /* JADX INFO: renamed from: b */
    public Iterator f13842b;

    /* JADX INFO: renamed from: c */
    public SessionSubscriber$Name f13843c;

    /* JADX INFO: renamed from: d */
    public Map f13844d;

    /* JADX INFO: renamed from: e */
    public Object f13845e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f13846f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1165a f13847g;

    /* JADX INFO: renamed from: h */
    public int f13848h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(C1165a c1165a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13847g = c1165a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13846f = obj;
        this.f13848h |= Integer.MIN_VALUE;
        return this.f13847g.m6753b(this);
    }
}
