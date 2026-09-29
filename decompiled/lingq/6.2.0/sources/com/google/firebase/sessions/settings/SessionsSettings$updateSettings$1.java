package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.SessionsSettings", m4291f = "SessionsSettings.kt", m4292l = {98, 99}, m4293m = "updateSettings")
final class SessionsSettings$updateSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1170b f13883b;

    /* JADX INFO: renamed from: c */
    public int f13884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionsSettings$updateSettings$1(C1170b c1170b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13883b = c1170b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13882a = obj;
        this.f13884c |= Integer.MIN_VALUE;
        return this.f13883b.m6766b(this);
    }
}
