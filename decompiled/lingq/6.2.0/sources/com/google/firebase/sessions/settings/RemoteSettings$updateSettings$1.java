package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c76;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.RemoteSettings", m4291f = "RemoteSettings.kt", m4292l = {165, 78, 95}, m4293m = "updateSettings")
final class RemoteSettings$updateSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public c76 f13869a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1169a f13871c;

    /* JADX INFO: renamed from: d */
    public int f13872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$1(C1169a c1169a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13871c = c1169a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13870b = obj;
        this.f13872d |= Integer.MIN_VALUE;
        return this.f13871c.mo6764d(this);
    }
}
